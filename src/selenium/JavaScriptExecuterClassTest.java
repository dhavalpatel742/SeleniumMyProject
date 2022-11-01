package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuterClassTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.adidas.ca/en");
		Thread.sleep(5000);
		WebElement careers = driver.findElement(By.linkText("Careers"));
		
		//option 1 - using x and y coordinate
		System.out.println(careers.getLocation());
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		/*jse.executeScript("window.scrollBy(0,5000)");
		careers.click();
		*/
		
		/*//option 2
		jse.executeScript("arguments[0].scrollIntoView(true);", careers);
		careers.click();
		*/
		
		//option 3
		jse.executeScript("arguments[0].click();", careers);

	}

}
