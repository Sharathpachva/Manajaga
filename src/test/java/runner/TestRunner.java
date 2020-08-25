package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(//dryRun = true,
		            features="features",
                    glue="manajaga.stepdef",
                    tags = {"@chrome","@PPOSF"}, 
                    monochrome = true,
                    strict = true,
                    plugin = {"html:target/cucumber-html-report", 
                              "pretty:target/cucumber-pretty.text",
                              "pretty", "html:target/site/cucuber-pretty",
                              "json:target/site/cucumber.json",
                              }
                ) 
public class TestRunner {

}