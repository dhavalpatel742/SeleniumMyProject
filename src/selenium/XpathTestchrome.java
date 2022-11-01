package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTestchrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.id("email")).sendKeys("sjhgvdjhswagdggf"); //find email box and enter wrong email
		//driver.findElement(By.id("pass")).sendKeys("dhgfewgw");//find password box and enter wrong password
		
		//Use of Mix xpath
		driver.findElement(By.xpath("(//div[@class='_6lux'])[1]/input")).sendKeys("shjsvwgxj");
		driver.findElement(By.xpath("(//div[@class='_6lux'])[2]/div/input")).sendKeys("rjghkr13e4f64");
		
		//Login button id is changing
		//use of regular expression xpath
		//driver.findElement(By.xpath("//button[starts-with(@id,'u_0_')]")).click();
		driver.findElement(By.xpath("//button[contains(@id,'u_0_')]")).click();
	}

}
