package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathTestFBLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		//Absolute xpath or Position xpath
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("scbuwgducgwuegcugwuegu");
		
		
		//Relative xpath or Attribute xpath
		//Syntax - //tagName[@Attributename='AttributeValue']
		// Can use 'and' - 'or' between two or more attributes
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("djbci32qsdw");
		driver.findElement(By.xpath("//button[@data-testid='royal_login_button' and @name='login']")).click();
		//driver.findElement(By.xpath("//button[contains(@id,'u_0_h_')]")).click();
		
	}

}
