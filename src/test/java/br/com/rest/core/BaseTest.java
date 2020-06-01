package br.com.rest.core;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import org.junit.BeforeClass;

public class BaseTest implements Constantes {

    @BeforeClass
    public static void setup(){

        RestAssured.baseURI = APP_BASE_URL;
        RestAssured.port = PORTA;

        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setContentType(APP_CONTENT_TYPE);
        RestAssured.requestSpecification = requestSpecBuilder.build();

        RestAssured.requestSpecification.header("api_key", "special-key");
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();

    }
}
