package TestClasses.API;

import Pojo.AuthReq;
import Pojo.Specs;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static Properties.ApiProperties.*;
import static io.restassured.RestAssured.given;

public class Authorization extends DataGenerate {

    @Test(description = "Authorization user with null username", priority = 1)
    public void authorizationWithNullUsername(){
        Specs.installSpec(Specs.requestSpec(URI), Specs.responseSpec(BadRequest));
        AuthReq authReq = new AuthReq("", generatePassword(TwoLowerLetters, TwoUpperLetters, TwoNumbers, TwoSymbols));

        given()
        .when()
            .body(authReq)
            .post(EndPointAuthorized)
        .then()
            .body(Code, Matchers.equalTo(Value1200))
            .body(Message, Matchers.equalTo(Decoding1200));
    }

    @Test(description = "Authorization user with null password", priority = 2)
    public void authorizationWithNullPassword(){
        Specs.installSpec(Specs.requestSpec(URI), Specs.responseSpec(BadRequest));
        AuthReq authReq = new AuthReq(userName, generatePassword(ZeroLowerLetters, ZeroUpperLetters, ZeroNumbers, ZeroSymbols));

        given()
        .when()
            .body(authReq)
            .post(EndPointAuthorized)
        .then()
            .body(Code, Matchers.equalTo(Value1200))
            .body(Message, Matchers.equalTo(Decoding1200));
    }

    @Test(description = "Authorization non-exist user", priority = 3)
    public void authorizationNonExistUser(){
        Specs.installSpec(Specs.requestSpec(URI), Specs.responseSpec(NotFound));
        AuthReq authReq = new AuthReq(userName, generatePassword(TwoLowerLetters, TwoUpperLetters, TwoNumbers, TwoSymbols));

        given()
        .when()
            .body(authReq)
            .post(EndPointAuthorized)
        .then()
            .body(Code, Matchers.equalTo(Value1207))
            .body(Message, Matchers.equalTo(Decoding1207));
    }
}
