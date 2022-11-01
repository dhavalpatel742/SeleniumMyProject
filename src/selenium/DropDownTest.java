package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(alllinks.size());
		
		for (int i=0;i<alllinks.size();i++) {
			
			System.out.println(alllinks.get(i).getText() +"------"+alllinks.get(i).isSelected());
			//alllinks.get(i).click();//not working
		}
		
		WebElement box = driver.findElement(By.id("gh-cat"));
		Select s = new Select(box);
		
		s.selectByIndex(1); //select Antiques
		Thread.sleep(2000);
		
		s.selectByValue("2984"); //select baby
		
		Thread.sleep(2000);
		
		s.selectByVisibleText("Books"); //select books
		
		System.out.println("-------------------------------------------------------");
		
		for (int i=0;i<alllinks.size();i++) {
			
			System.out.println(alllinks.get(i).getText() +"------"+alllinks.get(i).isSelected());
			//alllinks.get(i).click();//not working
		}
		
		//print only selected items
		System.out.println("------------------------------------------------------------");
		for (int i=0;i<alllinks.size();i++) {
			
			if(alllinks.get(i).isSelected()){
			System.out.println(alllinks.get(i).getText() +"------"+alllinks.get(i).isSelected());
		
			//alllinks.get(i).click();//not working
		
			}
		}
			

	}

}
