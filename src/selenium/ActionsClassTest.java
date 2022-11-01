package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		WebElement electronics = driver.findElement(By.linkText("Electronics"));
		Actions builder = new Actions(driver);
		
		builder.moveToElement(electronics).build().perform();
		Thread.sleep(2000);
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//body[@class='desktop gh-flex']/div[@id='mainContent']/div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[6]/div[2]/div[1]/nav[1]/ul[1]/li"));
		System.out.println(alllinks.size());
		
		for (int i=0;i<alllinks.size();i++) {
			
			System.out.println(alllinks.get(i).getText());
			//alllinks.get(i).click();//not working
		}

	}

}
