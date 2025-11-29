package runnerfile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"C:\\Users\\anish\\Documents\\workspace-spring-tools-for-eclipse-4.32.2.RELEASE\\PentaLife\\featurepenta\\search.feature"},
		glue= {"stepdefiniton"},
		dryRun=false
		
		
		)
public class SearchDemo extends AbstractTestNGCucumberTests {

}
