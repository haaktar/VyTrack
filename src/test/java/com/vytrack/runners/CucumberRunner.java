package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features",
        dryRun = false, glue = "com/vytrack/stepDefinitions",
        tags = "@negativeLogin or @parametrizedTest",
       publish = true,
       plugin = {"html:target/default-cucumber-reports",}


)


public class CucumberRunner {
}
