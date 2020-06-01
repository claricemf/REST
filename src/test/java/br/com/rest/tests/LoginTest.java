package br.com.rest.tests;

import br.com.rest.core.BaseTest;
import static io.restassured.RestAssured.given;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class LoginTest extends BaseTest {
    @Test
    public void login(){
        Map<String, String> login  = new HashMap<>();
        login.put("username", "ana.maia");
        login.put("password", "1234");

                given()
                    .log().all()
                    .queryParams(login)
                .when()
                    .get("/user/login")
                .then()
                    .log().all()
                    .statusCode(200)
                    .extract().response();
    }
}


