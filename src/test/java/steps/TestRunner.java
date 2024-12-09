package steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue= {"steps"},//name of folder 
plugin= {"pretty", "html:target/reports/HTMLReport.html",
"json:target/reports/JSONReport.json",
"junit:target/reports/JUnitReport.xml"}
)
public class TestRunner {
}