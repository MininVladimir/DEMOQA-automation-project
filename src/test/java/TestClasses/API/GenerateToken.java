package TestClasses.API;

import Pojo.AuthReq;
import Pojo.Specs;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static Properties.ApiProperties.*;
import static io.restassured.RestAssured.given;

public class GenerateToken extends DataGenerate {

    @Test(description = "Generate token with null username", priority = 4)
    public void generateTokenWithNullUsername(){
        Specs.installSpec(Specs.requestSpec(URI), Specs.responseSpec(BadRequest));
        AuthReq authReq = new AuthReq("", generatePassword(TwoLowerLetters, TwoUpperLetters, TwoNumbers, TwoSymbols));

        given()
        .when()
            .body(authReq)
            .post(EndPointGenerateToken)
        .then()
            .body(Code, Matchers.equalTo(Value1200))
            .body(Message, Matchers.equalTo(Decoding1200));
    }

    @Test(description = "Generate token with null password", priority = 5)
    public void generateTokenWithNullPassword(){
        Specs.installSpec(Specs.requestSpec(URI), Specs.responseSpec(BadRequest));
        AuthReq authReq = new AuthReq(userName, generatePassword(ZeroLowerLetters, ZeroUpperLetters, ZeroNumbers, ZeroSymbols));

        given()
        .when()
            .body(authReq)
            .post(EndPointGenerateToken)
        .then()
            .body(Code, Matchers.equalTo(Value1200))
            .body(Message, Matchers.equalTo(Decoding1200));
    }

    @Test(description = "Generate token non-exist user", priority = 6)
    public void generateTokenNonExistUser(){
        Specs.installSpec(Specs.requestSpec(URI), Specs.responseSpec(OK));
        AuthReq authReq = new AuthReq(userName, generatePassword(TwoLowerLetters, TwoUpperLetters, TwoNumbers, TwoSymbols));

        given()
        .when()
            .body(authReq)
            .post(EndPointGenerateToken)
        .then()
            .body(Token, Matchers.equalTo(null))
            .body(Expires, Matchers.equalTo(null))
            .body(Status, Matchers.equalTo(StatusFailed))
            .body(Result, Matchers.equalTo(ResultFailed));
    }
}
