package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunnerAll {

	@CucumberOptions(features = "C:\\Users\\oyadavx\\git\\Intel_ISVC_R4C\\Intel_ISVC_R4C\\src\\test\\java\\FeaturesWeb\\Web_TechnicalExchange_CaseCreation.feature",

			glue = "StepDefination",
			monochrome = true, 
			dryRun = false, 	
			plugin = { "pretty",
					"html:target/cucumber-reports.html", "junit:target/cucumber.xml", "rerun:target/faildrerun.txt",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
	public class CucumberTest extends AbstractTestNGCucumberTests {
}

}
			
