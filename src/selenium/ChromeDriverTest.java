package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("sjhgvdjhswagdggf"); //find email box and enter wrong email
		driver.findElement(By.id("pass")).sendKeys("dhgfewgw");//find password box and enter wrong password
		driver.findElement(By.name("login")).click();//click on the login button

	}

}
