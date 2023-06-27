package Properties;

import java.util.Collections;
import java.util.List;

public class ApiProperties {

    public static final String URI = "https://demoqa.com";

//    GeneratePassword
    public static final int ZeroLowerLetters = 0;
    public static final int ZeroUpperLetters = 0;
    public static final int ZeroNumbers = 0;
    public static final int ZeroSymbols = 0;

    public static final int OneLowerLetters = 1;
    public static final int OneUpperLetters = 1;
    public static final int OneNumbers = 1;
    public static final int OneSymbols = 1;

    public static final int TwoLowerLetters = 2;
    public static final int TwoUpperLetters = 2;
    public static final int TwoNumbers = 2;
    public static final int TwoSymbols = 2;

//    EndPoints
    public static final String EndPointAuthorized = "/Account/v1/Authorized";
    public static final String EndPointGenerateToken = "/Account/v1/GenerateToken";
    public static final String EndPointUser = "/Account/v1/User/";
    public static final String EndPointBooks = "/BookStore/v1/Books/";
    public static final String EndPointBook = "/BookStore/v1/Book/";

//    StatusCodes
    public static final int OK = 200;
    public static final int Created = 201;
    public static final int NoContent = 204;
    public static final int BadRequest = 400;
    public static final int NotFound = 404;

//    ResponseBodyFields
    public static final String UserId = "userId";
    public static final String UserName = "username";
    public static final String Books = "books";
    public static final String Status = "status";
    public static final String Result = "result";
    public static final String Token = "token";
    public static final String Expires = "expires";
    public static final String Code = "code";
    public static final String Message = "message";
    public static final String Isbn = "isbn";
    public static final String CollectionOfIsbns = "collectionOfIsbns";
    public static final String CollectionOfBookPathIsbn = "books.isbn";
    public static final String CollectionOfBookPathTitle = "books.title";
    public static final String CollectionOfBookPathSubTitle = "books.subTitle";
    public static final String CollectionOfBookPathAuthor = "books.author";
    public static final String CollectionOfBookPathPublishDate = "books.publish_date";
    public static final String CollectionOfBookPathPublisher = "books.publisher";
    public static final String CollectionOfBookPathPages = "books.pages";
    public static final String CollectionOfBookPathDescription = "books.description";
    public static final String CollectionOfBookPathWebsite = "books.website";

//    ResponseBodyFieldsValues
    public static final String Value1200 = "1200";
    public static final String Value1207 = "1207";
    public static final String Value1300 = "1300";
    public static final String Decoding1200 = "UserName and Password required.";
    public static final String Decoding1207 = "User not found!";
    public static final String Decoding1300 = "Passwords must have at least one non alphanumeric character, one digit ('0'-'9'), one uppercase ('A'-'Z'), one lowercase ('a'-'z'), one special character and Password must be eight characters or longer.";
    public static final String StatusSuccess = "Success";
    public static final String StatusFailed = "Failed";
    public static final String ResultSuccess = "User authorized successfully.";
    public static final String ResultFailed = "User authorization failed.";
    public static final List<String> CollectionOfBookPathIsbnFirstBookValue = Collections.singletonList("9781449331818");
    public static final List<String> CollectionOfBookPathIsbnSecondBookValue = Collections.singletonList("9781449365035");
    public static final List<String> CollectionOfBookPathTitleValue = Collections.singletonList("Speaking JavaScript");
    public static final List<String> CollectionOfBookPathSubTitleValue = Collections.singletonList("An In-Depth Guide for Programmers");
    public static final List<String> CollectionOfBookPathAuthorValue = Collections.singletonList("Axel Rauschmayer");
    public static final List<String> CollectionOfBookPathPublishDateValue = Collections.singletonList("2014-02-01T00:00:00.000Z");
    public static final List<String> CollectionOfBookPathPublisherValue = Collections.singletonList("O'Reilly Media");
    public static final List<Integer> CollectionOfBookPathPagesValue = Collections.singletonList(460);
    public static final List<String> CollectionOfBookPathDescriptionValue = Collections.singletonList("Like it or not, JavaScript is everywhere these days-from browser to server to mobile-and now you, too, need to learn the language or dive deeper than you have. This concise book guides you into and through JavaScript, written by a veteran programmer who o");
    public static final List<String> CollectionOfBookPathWebsiteValue = Collections.singletonList("http://speakingjs.com/");


}
