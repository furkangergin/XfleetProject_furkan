package com.xfleet.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "junit:target/junit/junit-report.xml",
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features",
        glue = "com/xfleet/step_definitions",
        dryRun = false,
        tags = "@FLTAP-900",
        publish = false

)
public class CukesRunner {
}
