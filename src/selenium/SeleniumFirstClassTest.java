package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		//Classname objname = new Classname();
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("sjhgvdjhswagdggf"); //find email box and enter wrong email
		driver.findElement(By.id("pass")).sendKeys("dhgfewgw");//find password box and enter wrong password
		driver.findElement(By.name("login")).click();//click on the login button

	}

}
