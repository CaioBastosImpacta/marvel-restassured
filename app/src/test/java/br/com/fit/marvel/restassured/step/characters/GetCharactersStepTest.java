package br.com.fit.marvel.restassured.step.characters;

import br.com.fit.marvel.restassured.matchers.characters.GetCharactersMatchers;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GetCharactersStepTest {

    private RequestSpecification requestSpecification;
    private ValidatableResponse validatableResponse;
    private JsonPath jsonPath;

    @BeforeEach
    public void setUp() {
        RestAssured.baseURI = "https://gateway.marvel.com:443/v1";
        requestSpecification = RestAssured.given()
                .queryParam("ts", "1")
                .queryParam("apikey", "90176a73844b0060d5b7824d6959bd01")
                .queryParam("hash", "f4fa8f0b2c1c0ba0d71c293d6c1c7555");
    }

    @Test
    public void testValidateIntegrationCharactersOk() {
        validatableResponse = requestSpecification.get("/public/characters").then().statusCode(200);
        jsonPath = new JsonPath(this.validatableResponse.extract().body().asString());
        GetCharactersMatchers.verifyAllCharactersSuccess(jsonPath);
    }

    @Test
    public void testValidateIntegrationCharactersIdOk() {
        var ulr = new StringBuilder()
                .append("/public/characters/")
                .append("1016823").toString();

        validatableResponse = requestSpecification.get(ulr).then().statusCode(200);
        jsonPath = new JsonPath(this.validatableResponse.extract().body().asString());
        GetCharactersMatchers.verifyIdCharacterSuccess(jsonPath);
    }

    @Test
    public void testValidateIntegrationCharactersIdONotFound() {
        var url = new StringBuilder()
                .append("/public/characters/")
                .append("10").toString();

        validatableResponse = requestSpecification.get(url).then().statusCode(404);
        jsonPath = new JsonPath(this.validatableResponse.extract().body().asString());
        GetCharactersMatchers.verifyIdCharacterNotFound(jsonPath);
    }
}