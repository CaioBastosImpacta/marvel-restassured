package br.com.fit.marvel.restassured.step.comics;

import br.com.fit.marvel.restassured.matchers.comics.GetComicsMatchers;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

public class GetComicsStepTest {

    private RequestSpecification requestSpecification;
    private ValidatableResponse validatableResponse;
    private JsonPath jsonPath;

    @Test
    public void testValidateIntegrationComicsOk() {
        RestAssured.baseURI = "https://gateway.marvel.com:443/v1";
        requestSpecification = RestAssured.given()
                .queryParam("ts", "1")
                .queryParam("apikey", "90176a73844b0060d5b7824d6959bd01")
                .queryParam("hash", "f4fa8f0b2c1c0ba0d71c293d6c1c7555");

        validatableResponse = requestSpecification.get("/public/comics").then().statusCode(200);
        jsonPath = new JsonPath(this.validatableResponse.extract().body().asString());
        GetComicsMatchers.verifyAllComicsSuccess(jsonPath);
    }

    @Test
    public void testValidateIntegrationComicsConflict() {
        RestAssured.baseURI = "https://gateway.marvel.com:443/v1";
        requestSpecification = RestAssured.given()
                .queryParam("ts", "1")
                .queryParam("hash", "f4fa8f0b2c1c0ba0d71c293d6c1c7555");

        validatableResponse = requestSpecification.get("/public/comics").then().statusCode(409);
        jsonPath = new JsonPath(this.validatableResponse.extract().body().asString());
        GetComicsMatchers.verifyAllComicsConflict(jsonPath);
    }

    @Test
    public void testValidateIntegrationComicsIdOk() {
        RestAssured.baseURI = "https://gateway.marvel.com:443/v1";
        requestSpecification = RestAssured.given()
                .queryParam("ts", "1")
                .queryParam("apikey", "90176a73844b0060d5b7824d6959bd01")
                .queryParam("hash", "f4fa8f0b2c1c0ba0d71c293d6c1c7555");

        validatableResponse = requestSpecification.get("/public/comics/1158").then().statusCode(200);
        jsonPath = new JsonPath(this.validatableResponse.extract().body().asString());
        GetComicsMatchers.verifyAllComicsIdSuccess(jsonPath);
    }

    @Test
    public void testValidateIntegrationComicsIdNotFound() {
        RestAssured.baseURI = "https://gateway.marvel.com:443/v1";
        requestSpecification = RestAssured.given()
                .queryParam("ts", "1")
                .queryParam("apikey", "90176a73844b0060d5b7824d6959bd01")
                .queryParam("hash", "f4fa8f0b2c1c0ba0d71c293d6c1c7555");

        validatableResponse = requestSpecification.get("/public/comics/1").then().statusCode(404);
        jsonPath = new JsonPath(this.validatableResponse.extract().body().asString());
        GetComicsMatchers.verifyAllComicsIdNotFound(jsonPath);
    }
}
