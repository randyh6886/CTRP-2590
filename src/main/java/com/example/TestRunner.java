package com.example;
// As an abstractor, I shall be able to search for Active Persons in PA
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin= {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        features={"src/test/resources/features/browseToURL.feature", "src/test/resources/features/activePersons.feature"},
        glue={"com.example.Steps"}
)
public class TestRunner extends AbstractTestNGCucumberTests{
}
