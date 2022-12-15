package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooHeaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/?p=us");
		
		//Can use ----> "//div[@id='pageFooterChildren']//li" <------for any indirect li elements inside div.
		List<WebElement> alllinks = driver.findElements(By.xpath("//ul[@class='_yb_1ojt6 _yb_y77zm']/li"));
		System.out.println(alllinks.size());
		
		for (int i=0;i<alllinks.size();i++) {
			
			System.out.println(alllinks.get(i).getText());
			//alllinks.get(i).click();//not working
		}
	}

}
