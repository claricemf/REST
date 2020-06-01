package br.com.rest.core;

import io.restassured.http.ContentType;

public interface Constantes {

    String APP_BASE_URL = "https://petstore.swagger.io/v2";
    Integer PORTA = 443;
    ContentType APP_CONTENT_TYPE = ContentType.JSON;
}
