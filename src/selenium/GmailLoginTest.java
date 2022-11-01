package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.id("identifierId")).sendKeys("qsugduwqdnbjqgdyf");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		Thread.sleep(3000);
		
		String expectederror = "Couldn’t find your Google Account";
		String actualerr = driver.findElement(By.className("o6cuMc")).getText();
		
		System.out.println(actualerr);
		
		if (expectederror.equals(actualerr)) {
			System.out.println("pass");
		}
		else {
			System.out.println("Fail");
		}

	}

}
