package com.taco.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",
                //"me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber.json"},
        features = "src/test/resources/features/Taco.feature",
        glue = "com/taco/step_definitions",
        dryRun = false,
        tags = "@wip"
)
public class CukesRunner {


}
