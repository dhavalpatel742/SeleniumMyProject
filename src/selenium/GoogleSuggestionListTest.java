package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//type Canada in search box
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Canada");
		Thread.sleep(3000);
		//get size 10
		//print text for all this options
		List<WebElement> alllinks = driver.findElements(By.xpath("//ul[@class='erkvQe']//div[@class='OBMEnb']//ul[@class='G43f7e']/li"));
		System.out.println(alllinks.size());
		
		/*for (int i=0;i<alllinks.size();i++) {
			
			System.out.println(alllinks.get(i).getText());
			//alllinks.get(i).click();//not working
		}*/
		
		for(WebElement a : alllinks) {
			System.out.println(a.getText());
		}

	}
		
	}


