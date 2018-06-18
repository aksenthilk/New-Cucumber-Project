package TestRunn;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "G:\\SeleniumCucumberWorkSpace\\NewSeleniumCucumber\\src\\main\\java\\FeaturesFile\\Login.feature",
                 glue = {"Steps"},
                 dryRun = false)
                 
                 

public class RunTest {

}
