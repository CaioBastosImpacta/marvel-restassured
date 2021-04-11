package br.com.fit.marvel.restassured.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "br.com.fit.marvel.restassured.step",
        tags = "@Caracteristicas")
public class RunnerCucumber {

}
