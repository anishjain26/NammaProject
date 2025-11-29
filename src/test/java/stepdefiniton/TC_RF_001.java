package stepdefiniton;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagespenta.RegistrationPage;

public class TC_RF_001 {
 public	static WebDriver driver;
	 RegistrationPage rp;
	
	@Given("User has opened the browser and launched the application")
	public void user_has_opened_the_browser_and_launched_the_application() throws InterruptedException {
	   driver=new ChromeDriver();
	   Hooks.driver = driver;
	   driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   Thread.sleep(5000);
	   rp=new RegistrationPage(driver);
	   
	}

	@When("User enters valid First name")
	public void user_enters_valid_first_name() {
	   
	    rp.Firstname();
	    
	}

	@And("User enters valid Last name")
	public void user_enters_valid_last_name() {
	    rp.Lastname();
	}

	@And("User enters valid Email ID")
	public void user_enters_valid_email_id() {
	    rp.Email();
	}

	@And("User enters valid Telephone")
	public void user_enters_valid_telephone() {
	    rp.Telephone();
	}

	@And("User enters valid Password")
	public void user_enters_valid_password() {
	   rp.Password();
	}

	@And("User enters valid Confirm Password")
	public void user_enters_valid_confirm_password() {
	   rp.Confirmpassword();
	}

	@And("User clicks on radion button no")
	public void user_clicks_on_radion_button_no() {
	   rp.Radiobutton();
	}

	@And("User clicks on privacy policy checkbox")
	public void user_clicks_on_privacy_policy_checkbox() {
	    rp.Checkbox();
	}

	@And("User cliks on continue button")
	public void user_cliks_on_continue_button() {
	   rp.Continuebutton();
	}

	@Then("User should be Registered")
	public void user_should_be_registered() {
	    Assert.assertEquals(driver.getTitle(), "Your Account Has Been Created!");
	    driver.quit();
	    
	}


}
