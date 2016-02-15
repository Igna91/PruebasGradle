package com.ps.grupo2.comunio;


@RunWith(Cucumber.class)
@Cucumber.Options(
        //this code will only look into "features/" folder for features
        features={"classpath:features/"},
        glue = { "com.mycompany.cucumber.stepdefinitions", "com.mycompany.cucumber.hooks" },
        format = { "com.mycompany.cucumber.formatter.RuntimeInfoCatcher", "json:target/cucumber.json" },
        tags = { "@working" }
)
public class CucumberStarterIT {
}