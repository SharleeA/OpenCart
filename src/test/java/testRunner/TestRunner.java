package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"features"},
        glue = {"steps"},
        plugin = {"pretty", "html:target/reports/report.html"},
        dryRun = false,
        stepNotifications =  true
        //tags = "@register"


)
public class TestRunner {
}
