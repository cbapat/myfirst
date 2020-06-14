package Runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith( Cucumber.class)

@CucumberOptions (features="Features", glue="StepDefinition", plugin= {"html:target/cucumber-html-report"})
											  
@Test
public class TestRunner extends AbstractTestNGCucumberTests{

	

}


// Cucumber Plugin:  https://cucumber.github.com/cucumber-eclipse/update-site