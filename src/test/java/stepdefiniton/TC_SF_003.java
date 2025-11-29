package stepdefiniton;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagespenta.LoginPage;
import pagespenta.RegistrationPage;
import pagespenta.searchPage;

public class TC_SF_003 {
	public static WebDriver driver;
	 searchPage sp;
	 
	 JavascriptExecutor js;
	 RegistrationPage RP;
	 LoginPage lp;
	
	@Given("User should be Logged in to account")
	public void user_should_be_logged_in_to_account() throws InterruptedException {
	    driver=new ChromeDriver();
	    Hooks.driver = driver;
	    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    sp=new searchPage(driver);
	     
	     js=(JavascriptExecutor) driver;
	      RP=new RegistrationPage(driver);
	      lp=new LoginPage(driver);
	}

	@When("User logsin to account")
	public void user_logsin_to_account() throws InterruptedException {
	 lp.emailid();
	 lp.pass();
	 Thread.sleep(5000);
	 lp.loginbutton1();
	 Thread.sleep(4000);

	}

	@And("User should search the product")
	public void user_should_search_the_product() throws InterruptedException {
	   sp.search();
		 Thread.sleep(5000);

	}

	@And("User should click on the login button")
	public void user_should_click_on_the_login_button() throws InterruptedException {
	   sp.searchbtn();
		 Thread.sleep(5000);

	}

	@Then("Product page appears in the screen")
	public void product_page_appears_in_the_screen() throws InterruptedException {
		js.executeScript("window.scrollBy(0,500)");
		
	 Assert.assertEquals(driver.getTitle(), "Search - macbook");   
	 Thread.sleep(5000);

	 driver.quit();
	}

}
