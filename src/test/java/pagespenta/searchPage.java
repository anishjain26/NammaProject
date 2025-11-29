package pagespenta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class searchPage {
	WebDriver driver;
	
	public  searchPage(WebDriver driver){
		this.driver=driver;
	}
	
	By ss=By.xpath("//input[@placeholder='Search']");
	By clk=By.xpath("//i[@class='fa fa-search']");
	
	public void search() {
		driver.findElement(ss).sendKeys("macbook");
	}
	public void searchbtn() {
		driver.findElement(clk).click();
	}

}
