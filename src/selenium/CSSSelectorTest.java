package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//tagname[attributename='attributevalue']
		//*[attributename='attributevalue'] - any tagname
		//tagname[attributename='attributevalue'][attributename='attributevalue'] - multiple attributes
		//tagname[attributename*='attributevalue'] - * means contains
		//tagname[attributename^='attributevalue'] - ^ means starts with
		//tagname[attributename$='attributevalue'] - $ means ends with
		//div[class='eijn']>input - mix xpath
		//for id - #id
		//for class - .class
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("hfwqwiicwhy");
		driver.findElement(By.cssSelector("#pass")).sendKeys("ywgdbwjgugwdqug");
		driver.findElement(By.cssSelector("button[id*='u_0_']")).click();
	}

}
