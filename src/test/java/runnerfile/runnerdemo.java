package runnerfile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"C:\\Users\\anish\\Documents\\workspace-spring-tools-for-eclipse-4.32.2.RELEASE\\PentaLife\\featurepenta\\Registration.feature",
//				"C:\\Users\\anish\\Documents\\workspace-spring-tools-for-eclipse-4.32.2.RELEASE\\PentaLife\\featurepenta\\login.feature",
//				"C:\\Users\\anish\\Documents\\workspace-spring-tools-for-eclipse-4.32.2.RELEASE\\PentaLife\\featurepenta\\search.feature"
				},
		glue= {"stepdefiniton"},
		dryRun=false,
		 monochrome = true,
		    plugin = {
		        "pretty",
		        "html:reports/cucumber-html-report.html",
		        "json:reports/cucumber.json",
		        "junit:reports/cucumber.xml"
		    }
		  
		
		)
public class runnerdemo extends AbstractTestNGCucumberTests{

}
