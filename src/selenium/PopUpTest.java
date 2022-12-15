package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Aliexpress close popup
		//type computer in search box
		//if don't get popup directly type computer

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");
		
		Thread.sleep(3000);
		
		List<WebElement> popup = driver.findElements(By.className("_24EHh"));
		System.out.println(popup.size());
		
		if(popup.size()>0) {
			driver.findElement(By.className("_24EHh")).click();
			//System.out.println("Element present");
		}
		/*else {
			
		System.out.println("Element not present");
		}*/
		
		driver.findElement(By.id("search-key")).sendKeys("computer");
		

	}

}
