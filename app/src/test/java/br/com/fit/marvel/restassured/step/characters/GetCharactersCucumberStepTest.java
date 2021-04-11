package br.com.fit.marvel.restassured.step.characters;

import br.com.fit.marvel.restassured.matchers.characters.GetCharactersMatchers;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetCharactersCucumberStepTest {

    private RequestSpecification requestSpecification;
    private ValidatableResponse validatableResponse;
    private JsonPath jsonPath;

    @Dado("que informo o path da busca das caracteristicas")
    public void informPathBaseUriWithQuery() {
        RestAssured.baseURI = "https://gateway.marvel.com:443/v1";
        requestSpecification = RestAssured.given()
                .queryParam("ts", "1")
                .queryParam("apikey", "90176a73844b0060d5b7824d6959bd01")
                .queryParam("hash", "f4fa8f0b2c1c0ba0d71c293d6c1c7555");
    }

    @Quando("desejo visualizar as caracteristicas dos personagens comicos da marvel")
    public void getAllCharactersAndStatusCodeOk() {
        validatableResponse = requestSpecification.get("/public/characters").then().statusCode(200);
        jsonPath = new JsonPath(this.validatableResponse.extract().body().asString());
    }

    @Entao("devera ser exibido status de sucesso com as caracteristicas")
    public void verifyAllCharactersOk() {
        GetCharactersMatchers.verifyAllCharactersSuccess(jsonPath);
    }

    @Dado("que informo o path incorreto da busca das caracteristicas")
    public void informPathIncorrectBaseUriWithQuery() {
        RestAssured.baseURI = "https://gateway.marvel.com:443/v1";
        requestSpecification = RestAssured.given()
                .queryParam("ts", "1")
                .queryParam("hash", "f4fa8f0b2c1c0ba0d71c293d6c1c7555");
    }

    @Quando("nao informo o query param da apikey")
    public void getAllCharactersAndStatusCodeConflict() {
        validatableResponse = requestSpecification.get("/public/characters").then().statusCode(409);
        jsonPath = new JsonPath(this.validatableResponse.extract().body().asString());
    }

    @Entao("devera ser exibido status de conflito")
    public void verifyAllCharactersConflict() {
        GetCharactersMatchers.verifyIdCharacterConflict(jsonPath);
    }
}
