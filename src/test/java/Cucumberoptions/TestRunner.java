package Cucumberoptions;

import io.cucumber.testng.*;


@CucumberOptions(
		features="src/test/java/features",
		glue="stepDefination",
		plugin= {"pretty","html:target/cucumber.html"}
		
		)


public class TestRunner extends AbstractTestNGCucumberTests {

}
