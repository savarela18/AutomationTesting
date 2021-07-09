package com.demoqa.test.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/registerForm.feature",
glue = "com.demoqa.test.stepdefinitions",
snippets = SnippetType.CAMELCASE,
tags = "@Excel or @Config or @Faker")

public class RegisterFormRunner {
}
