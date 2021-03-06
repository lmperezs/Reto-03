package co.com.choucair.formacion.reto3.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/simulacion.feature",
        tags = "@Esquema1",
        glue = "co.com.choucair.formacion.reto3.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {

}