package pagespenta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		
	}
	
	By email=By.xpath("//i[@class='fa fa-search']");
	By btn=By.xpath("//input[@value='Login']");
	By lgbtn=By.xpath("//input[@value='Login']");
	

	
	
	public void emailid() {
		driver.findElement(email).sendKeys("Anima0lee@gmail.com");
	}
	
	public void pass() {
		driver.findElement(btn).sendKeys("Anish@1907");
	}
	
	public void loginbutton1() {
		driver.findElement(lgbtn).click();
	}

}
