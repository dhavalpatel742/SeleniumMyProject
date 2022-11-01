package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkTextTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.linkText("About")).click();
		//driver.findElement(By.partialLinkText("Abo")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));

		String s = "Google - About Google, Our Culture & Company News";
		String expectedUrl = "https://about.google/?fg=1&utm_source=google-CA&utm_medium=referral&utm_campaign=hp-header";
		
		wait.until(ExpectedConditions.urlContains("https://about.google/?fg=1&utm_source=google-CA&utm_medium=referral&utm_campaign=hp-header"));

		
		String t = driver.getTitle();
		String actualUrl = driver.getCurrentUrl();
		System.out.println(t);
		System.out.println(actualUrl);
		
		if(s.equals(t) && expectedUrl.equals(actualUrl)) {
			
			System.out.println("Test Pass for Title");
		}
		
		else {
			System.out.println("Test Fail for Title");
		}
		
		
		
		/*if(expectedUrl.equals(actualUrl)) {
			
			System.out.println("Test Pass for URL");
		}
		else {
			System.out.println("Test Fail for URL");
		}*/

	}

}
