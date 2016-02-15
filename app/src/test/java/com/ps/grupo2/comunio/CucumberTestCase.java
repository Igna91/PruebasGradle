package com.ps.grupo2.comunio;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        //this code will only look into "features/" folder for features
        features={"features"},
        glue = { "com.ps.grupo2.comunio.features.step_definitions", "com.mycompany.cucumber.hooks" },
        format = { "com.mycompany.cucumber.formatter.RuntimeInfoCatcher", "json:target/cucumber.json" },
        tags = { "@working" }
)
public class CucumberTestCase {
        // No further code needed
}