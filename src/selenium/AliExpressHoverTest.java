package selenium;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class AliExpressHoverTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
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
		
		Thread.sleep(3000);
		WebElement account = driver.findElement(By.linkText("Women's Fashion"));
		Actions builder = new Actions(driver);
		
		builder.moveToElement(account).build().perform();
		
		Thread.sleep(2000);
		List<WebElement> alllinks = driver.findElements(By.xpath("(//div[@class='sub-cate-content']/div[1])/dl[1]/dd[1]/a"));
		System.out.println(alllinks.size());
		
		for (int i=0;i<alllinks.size();i++) {
			
			System.out.println(alllinks.get(i).getText());
			//alllinks.get(i).click();//not working
		}

	}
}
