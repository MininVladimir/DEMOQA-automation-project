package TestClasses.API;

import Pojo.AuthReq;
import Pojo.Specs;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static Properties.ApiProperties.*;
import static io.restassured.RestAssured.given;

public class Registration extends DataGenerate {

    @Test(description = "Registration new user with null username", priority = 7)
    public void registrationWithNullUsername(){
        Specs.installSpec(Specs.requestSpec(URI), Specs.responseSpec(BadRequest));
        AuthReq authReq = new AuthReq("", generatePassword(TwoLowerLetters, TwoUpperLetters, TwoNumbers, TwoSymbols));

        given()
        .when()
            .body(authReq)
            .post(EndPointUser)
        .then()
            .body(Code, Matchers.equalTo(Value1200))
            .body(Message, Matchers.equalTo(Decoding1200));
    }

    @Test(description = "Registration new user with null password", priority = 8)
    public void registrationWithNullPassword(){
        Specs.installSpec(Specs.requestSpec(URI), Specs.responseSpec(BadRequest));
        AuthReq authReq = new AuthReq(userName, generatePassword(ZeroLowerLetters, ZeroUpperLetters, ZeroNumbers, ZeroSymbols));

        given()
        .when()
            .body(authReq)
            .post(EndPointUser)
        .then()
            .body(Code, Matchers.equalTo(Value1200))
            .body(Message, Matchers.equalTo(Decoding1200));
    }

    @Test(description = "Registration new user with incorrect password", priority = 9)
    public void registrationWithIncorrectPassword(){
        Specs.installSpec(Specs.requestSpec(URI), Specs.responseSpec(BadRequest));
        AuthReq authReq = new AuthReq(userName, generatePassword(OneLowerLetters, OneUpperLetters, OneNumbers, OneSymbols));

        given()
        .when()
            .body(authReq)
            .post(EndPointUser)
        .then()
            .body(Code, Matchers.equalTo(Value1300))
            .body(Message, Matchers.equalTo(Decoding1300));
    }
}
