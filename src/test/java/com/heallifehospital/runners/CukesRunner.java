package com.heallifehospital.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"pretty",
                "html:target/cucumber-reports.html",
                "json:target/json-report/cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml",
                "rerun:target/failed_scenarios.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "json:target/allure-results/cucumber.json",

        },
        glue = "com/heallifehospital/step_definitions",
        features = "src/test/resources/features",
        publish = true,
        monochrome = true,
        dryRun = false,
        tags = "@prod"
)
public class CukesRunner {
}