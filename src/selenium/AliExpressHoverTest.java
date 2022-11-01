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
		
		List<WebElement> popup = driver.findElements(By.className("btn-close"));
		System.out.println(popup.size());
		
		if(popup.size()>0) {
			driver.findElement(By.className("btn-close")).click();
			//System.out.println("Element present");
		}
		WebElement account = driver.findElement(By.linkText("Women's Fashion"));
		Actions builder = new Actions(driver);
		
		builder.moveToElement(account).build().perform();
		

		List<WebElement> alllinks = driver.findElements(By.xpath("(//div[@class='sub-cate-row'])/dl[1]//a"));
		System.out.println(alllinks.size());
		
		for (int i=0;i<alllinks.size();i++) {
			
			System.out.println(alllinks.get(i).getText());
			//alllinks.get(i).click();//not working
		}

	}
}
