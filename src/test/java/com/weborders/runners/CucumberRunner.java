package com.weborders.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/weborders/step_definitions",
     plugin="json:target/default-cucumber-report",
     //   tags = "@view_all_orders",
        dryRun = false
)
public class CucumberRunner {
}
