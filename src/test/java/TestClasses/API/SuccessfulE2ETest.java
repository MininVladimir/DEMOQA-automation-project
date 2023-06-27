package TestClasses.API;

import Pojo.*;
import io.qameta.allure.Allure;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

import static Properties.ApiProperties.*;
import static io.restassured.RestAssured.given;

public class SuccessfulE2ETest extends DataGenerate {

    @Test(description = "Successful e2e test", priority = 10)
    public void successfulEndToEnd(){


//        Registration new user and get new user ID
        Specs.installSpec(Specs.requestSpec(URI), Specs.responseSpec());
        AuthReq authReq = new AuthReq(userName, generatePassword(TwoLowerLetters, TwoUpperLetters, TwoNumbers, TwoSymbols));

        RegistrationRes userID = given()
            .when()
                .body(authReq)
                .post(EndPointUser)
            .then()
                .statusCode(Created)
                .body(UserName, Matchers.equalTo(userName))
                .body(Books, Matchers.equalTo(Collections.emptyList()))
                .extract().response().as(RegistrationRes.class);
                Assert.assertNotNull(userID);
        Allure.step("Registration new user and get new user ID");


//        Generate token
        AuthRes token = given()
            .when()
                .body(authReq)
                .post(EndPointGenerateToken)
            .then()
                .statusCode(OK)
                .body(Status, Matchers.equalTo(StatusSuccess))
                .body(Result, Matchers.equalTo(ResultSuccess))
                .extract().response().as(AuthRes.class);
                Assert.assertNotNull(token);
        Allure.step("Generate token");


//        Check new user in database
        given()
            .auth().oauth2(token.getToken())
        .when()
            .get(EndPointUser + userID.getUserID())
        .then()
            .statusCode(OK)
            .body(UserId, Matchers.equalTo(userID.getUserID()))
            .body(UserName, Matchers.equalTo(userName))
            .body(Books, Matchers.equalTo(Collections.emptyList()));
        Allure.step("Check new user");



//        Get isbn-list of books with partial string 'javascript' in title and with isbn values isn't null
        List<BookstoreRes> books = given()
            .when()
                .get(EndPointBooks)
            .then()
                .statusCode(OK)
                .extract().response().jsonPath().getList(Books, BookstoreRes.class);

        List<BookstoreRes> myBooks = books.stream().filter(x -> x.getTitle().toLowerCase().contains("javascript")).toList();
        List<BookstoreRes> isbnNotNull = myBooks.stream().filter(x -> x.getIsbn() != null).toList();
        List<String> isbn = isbnNotNull.stream().map(BookstoreRes::getIsbn).toList();



//        Create request body by hashmap for create my book collection
        String ID = userID.getUserID();
        String firstBook = isbn.get(0);

        Map<String, String> myCollection = new LinkedHashMap<>();
        myCollection.put(Isbn, firstBook);
        ArrayList<Map.Entry<String, String>> myBook1 = new ArrayList<>(myCollection.entrySet());

        Map<String, Object> createCollectionWith1Book = new LinkedHashMap<>();
        createCollectionWith1Book.put(UserId, ID);
        createCollectionWith1Book.put(CollectionOfIsbns, myBook1);

//        Create my book collection with 1 book
        given()
            .auth().oauth2(token.getToken())
        .when()
            .body(createCollectionWith1Book)
            .post(EndPointBooks)
        .then()
            .statusCode(Created)
            .body(CollectionOfBookPathIsbn, Matchers.equalTo(CollectionOfBookPathIsbnFirstBookValue));
        Allure.step("Create my book collection with 1 book");



//        Create request body by hashmap for manipulation with my collection
        String secondBook = isbn.get(1);

        Map<String, String> manipulationWithBook = new LinkedHashMap<>();
        manipulationWithBook.put(UserId, ID);
        manipulationWithBook.put(Isbn, secondBook);


//        Book replacement into my collection
        given()
            .auth().oauth2(token.getToken())
        .when()
            .body(manipulationWithBook)
            .put(EndPointBooks + firstBook)
        .then()
            .statusCode(OK)
            .body(CollectionOfBookPathIsbn, Matchers.equalTo(CollectionOfBookPathIsbnSecondBookValue))
            .body(CollectionOfBookPathTitle, Matchers.equalTo(CollectionOfBookPathTitleValue))
            .body(CollectionOfBookPathSubTitle, Matchers.equalTo(CollectionOfBookPathSubTitleValue))
            .body(CollectionOfBookPathAuthor, Matchers.equalTo(CollectionOfBookPathAuthorValue))
            .body(CollectionOfBookPathPublishDate, Matchers.equalTo(CollectionOfBookPathPublishDateValue))
            .body(CollectionOfBookPathPublisher, Matchers.equalTo(CollectionOfBookPathPublisherValue))
            .body(CollectionOfBookPathPages, Matchers.equalTo(CollectionOfBookPathPagesValue))
            .body(CollectionOfBookPathDescription, Matchers.equalTo(CollectionOfBookPathDescriptionValue))
            .body(CollectionOfBookPathWebsite, Matchers.equalTo(CollectionOfBookPathWebsiteValue));
        Allure.step("Book replacement into my collection");


//        Delete book from my collection
        given()
            .auth().oauth2(token.getToken())
        .when()
            .body(manipulationWithBook)
            .delete(EndPointBook)
        .then()
            .statusCode(NoContent);
        Allure.step("Delete book from my collection");


//        Delete user
        given()
            .auth().oauth2(token.getToken())
        .when()
            .delete(EndPointUser + userID.getUserID())
        .then()
            .statusCode(NoContent);
        Allure.step("Delete user");
    }
}