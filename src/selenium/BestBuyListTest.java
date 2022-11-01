package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BestBuyListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//shop - size and text
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.bestbuy.ca/en-ca");
		
		driver.findElement(By.xpath("//li[@data-automation='shop']/button")).click();
		List<WebElement> alllinks = driver.findElements(By.xpath("//div[@class='menu_3LP5u menuActive_3neTn']/div[1]/a"));
		System.out.println(alllinks.size());
		
		for(int i=0;i<alllinks.size();i++) {
			System.out.println(alllinks.get(i).getText());
		}
	}

}
