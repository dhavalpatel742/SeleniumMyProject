package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdidasLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en/account-login");
		
		//login and verify error msg
		driver.findElement(By.id("login-email")).sendKeys("sdhjugfjuewlkjkljhik");
		driver.findElement(By.id("login-password")).sendKeys("dfsgjhik");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String expectederror = "The email address is invalid.";
		String actualerr = driver.findElement(By.xpath("//div[@class='gl-form-hint gl-form-hint--error']")).getText();
		
		System.out.println(actualerr);
		
		if (expectederror.equals(actualerr)) {
			System.out.println("pass");
		}
		else {
			System.out.println("Fail");
		}

	}

}
