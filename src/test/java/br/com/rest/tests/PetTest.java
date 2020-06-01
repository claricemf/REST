package br.com.rest.tests;

import br.com.rest.core.BaseTest;
import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.is;
import org.junit.Test;

public class PetTest extends BaseTest {

    private static Integer idPetSnoopy;
    private static Integer idPetBichento;
    private static Integer idPetPerry;
    private static  Integer idOrdemCompraSnoopy;
    private static  Integer idOrdemCompraBichento;
    private static  Integer idOrdemCompraPerry;



    @Test
    public void cadastraPetCachorroComSucesso(){
        idPetSnoopy =  given()
                    .log().all()
                    .body("{\n" +
                            "        \"id\": 0,\n" +
                            "        \"category\": {\n" +
                            "        \"id\": 0,\n" +
                            "        \"name\": \"dog\"\n" +
                            "        },\n" +
                            "        \"name\": \"Snoopy\",\n" +
                            "        \"photoUrls\": [\n" +
                            "        \"src/test/resources/imagem.pets/dog.jpg\"\n" +
                            "        ],\n" +
                            "        \"tags\": [\n" +
                            "        {\n" +
                            "        \"id\": 0,\n" +
                            "        \"name\": \"filhote\"\n" +
                            "        }\n" +
                            "        ],\n" +
                            "        \"status\": \"available\"\n" +
                            "}")
                .when()
                    .post("/pet")
                .then()
                    .log().all()
                    .statusCode(200)
                .body("name", is("Snoopy"))
                .body("category.name", is("dog"))
                .extract().path("id");
    }

    @Test
    public void cadastraPetGatoComSucesso(){
        idPetBichento = given()
                .log().all()
                .body("{\n" +
                        "        \"id\": 0,\n" +
                        "        \"category\": {\n" +
                        "        \"id\": 0,\n" +
                        "        \"name\": \"cat\"\n" +
                        "        },\n" +
                        "        \"name\": \"Bichento\",\n" +
                        "        \"photoUrls\": [\n" +
                        "        \"src/test/resources/imagem.pets/cat.jpg\"\n" +
                        "        ],\n" +
                        "        \"tags\": [\n" +
                        "        {\n" +
                        "        \"id\": 0,\n" +
                        "        \"name\": \"filhote\"\n" +
                        "        }\n" +
                        "        ],\n" +
                        "        \"status\": \"available\"\n" +
                        "}")
                .when()
                .post("/pet")
                .then()
                .log().all()
                .statusCode(200)
                .body("name", is("Bichento"))
                .body("category.name", is("cat"))
                .extract().path("id");
    }

    @Test
    public void cadastraPetOrnitorrincoComSucesso(){
        idPetPerry = given()
                .log().all()
                .body("{\n" +
                        "        \"id\": 0,\n" +
                        "        \"category\": {\n" +
                        "        \"id\": 0,\n" +
                        "        \"name\": \"ornitorrinco\"\n" +
                        "        },\n" +
                        "        \"name\": \"Perry\",\n" +
                        "        \"photoUrls\": [\n" +
                        "        \"src/test/resources/imagem.pets/ornitorrinco.jpg\"\n" +
                        "        ],\n" +
                        "        \"tags\": [\n" +
                        "        {\n" +
                        "        \"id\": 0,\n" +
                        "        \"name\": \"filhote\"\n" +
                        "        }\n" +
                        "        ],\n" +
                        "        \"status\": \"available\"\n" +
                        "}")
                .when()
                .post("/pet")
                .then()
                .log().all()
                .statusCode(200)
                .body("name", is("Bichento"))
                .body("category.name", is("cat"))
                .extract().path("id");
    }




}