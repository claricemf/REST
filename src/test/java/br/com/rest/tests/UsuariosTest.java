package br.com.rest.tests;

import br.com.rest.core.BaseTest;
import io.restassured.RestAssured;
import org.junit.Test;


public class UsuariosTest extends BaseTest {
    @Test
    public void cadastraListaDeUsuariosComSucesso (){
        RestAssured.
                given()
                    .log().all()
                    .body("[\n" +
                            "    {\n" +
                            "        \"id\": 0,\n" +
                            "            \"username\": \"ana.maia\",\n" +
                            "            \"firstName\": \"Ana\",\n" +
                            "            \"lastName\": \"Maia\",\n" +
                            "            \"email\": \"ana@email\",\n" +
                            "            \"password\": \"1234\",\n" +
                            "            \"phone\": \"99999999\",\n" +
                            "            \"userStatus\": 0\n" +
                            "    }\n" +
                            "]\n" +
                            "[\n" +
                            "    {\n" +
                            "        \"id\": 0,\n" +
                            "            \"username\": \"rodrigo.mendes\",\n" +
                            "            \"firstName\": \"Rodrigo\",\n" +
                            "            \"lastName\": \"Mendes\",\n" +
                            "            \"email\": \"rodrigo@email\",\n" +
                            "            \"password\": \"1234\",\n" +
                            "            \"phone\": \"99999999\",\n" +
                            "            \"userStatus\": 0\n" +
                            "    }\n" +
                            "]\n" +
                            "[\n" +
                            "    {\n" +
                            "        \"id\": 0,\n" +
                            "            \"username\": \"tatiana.vasconcelos\",\n" +
                            "            \"firstName\": \"Tatiana\",\n" +
                            "            \"lastName\": \"Vasconcelos\",\n" +
                            "            \"email\": \"tatiana@email\",\n" +
                            "            \"password\": \"1234\",\n" +
                            "            \"phone\": \"99999999\",\n" +
                            "            \"userStatus\": 0\n" +
                            "    }\n" +
                            "]")
                .when()
                    .post("/user/createWithList")
                .then()
                    .log().all()
                    .statusCode(200);
    }
}


