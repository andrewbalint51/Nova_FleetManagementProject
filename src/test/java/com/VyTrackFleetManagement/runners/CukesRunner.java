package com.VyTrackFleetManagement.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features",
        glue = "com/VyTrackFleetManagement/step_definitions",
        dryRun = false,


        tags = "@B29G35-230",


        publish = true //generating a report with public link
)
public class CukesRunner {
}
