package pagespenta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
	WebDriver driver;
	
	public RegistrationPage(WebDriver driver){
		this.driver=driver;
		
	}
	//locators
	By fname=By.id("input-firstname");
	By lname=By.id("input-lastname");
	By eid=By.id("input-email");
	By tlpn=By.id("input-telephone");
	By ip=By.id("input-password");
	By ic=By.id("input-confirm");
	By rb=By.xpath("//input[@value='0']");
	By pp=By.xpath("//input[@name='agree']");
	By btn=By.xpath("//input[@value='Continue']");
	
	//action method
	public void Firstname() {
		driver.findElement(fname).sendKeys("Anish");
	}
	
	public void Lastname() {
		driver.findElement(lname).sendKeys("Jain");
	}
	
	public void Email() {
		driver.findElement(eid).sendKeys("Anima0lee@gmail.com");
	}
	
	public void Telephone() {
		driver.findElement(tlpn).sendKeys("8523697412");
	}
	
	public void Password() {
		driver.findElement(ip).sendKeys("Anish@1907");
	}
	
	public void Confirmpassword() {
		driver.findElement(ic).sendKeys("Anish@1907");
	}
	
	public void Radiobutton() {
		driver.findElement(rb).click();
	}
	
	public void Checkbox() {
		driver.findElement(pp).click();
	}
	
	public void Continuebutton() {
		driver.findElement(btn).click();
	}
	
	

}
