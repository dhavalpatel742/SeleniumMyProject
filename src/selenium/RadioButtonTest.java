package selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RadioButtonTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		Thread.sleep(2000);
		List<WebElement> alllinks = driver.findElements(By.xpath("//td[@class='table5']/input[@name='group1']"));
		System.out.println(alllinks.size());
		
		for (int i=0;i<alllinks.size();i++) {
			
			System.out.println(alllinks.get(i).getAttribute("value")+"---------"+alllinks.get(i).isSelected());
			//alllinks.get(i).click();//not working
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		
		System.out.println("-------------------------------------------");
		for (int i=0;i<alllinks.size();i++) {
			
			System.out.println(alllinks.get(i).getAttribute("value")+"---------"+alllinks.get(i).isSelected());
			//alllinks.get(i).click();//not working
		}

	}

}
