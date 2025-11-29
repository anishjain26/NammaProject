package stepdefiniton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagespenta.LoginPage;
import pagespenta.RegistrationPage;

public class TC_LF_002 {

public static WebDriver driver;
	LoginPage lp;
	RegistrationPage RP;

	@Given("User launches the browser and Application")
public void user_launches_the_browser_and_application() throws InterruptedException {
	driver=new ChromeDriver();
	Hooks.driver = driver;
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	lp=new LoginPage(driver);
	 RP=new RegistrationPage(driver);
}

@When("User enters validd emailid")
public void user_enters_validd_emailid() {
	lp.emailid();
}

@And("User enter Password")
public void user_enter_password() {
	 lp.pass();
}

@And("User clicks on login button")
public void user_clicks_on_login_button() {
	 lp.loginbutton1();
}

@Then("user will be redirected to homepage")
public void user_will_be_redirected_to_homepage() {
    Assert.assertEquals(driver.getTitle(),"My Account");
    driver.quit();
}

}






