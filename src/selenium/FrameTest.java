package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);

		List<WebElement> element = driver.findElements(By.linkText("Sortable"));
		System.out.println(element.size());
		
		if(element.size()>0) {
			System.out.println("Element present");
		}else {
			
		System.out.println("Element not present");
		}
		

		List<WebElement> drag = driver.findElements(By.id("draggable"));
		System.out.println(drag.size());
		
		if(drag.size()>0) {
			System.out.println("Element present");
		}else {
			
		System.out.println("Element not present");
		}
		
		System.out.println("-------after switching frame--------");
		
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("");//cannot have id or name
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		element = driver.findElements(By.linkText("Sortable"));
		System.out.println(element.size());
		
		if(element.size()>0) {
			System.out.println("Element present");
		}else {
			
		System.out.println("Element not present");
		}
		

		drag = driver.findElements(By.id("draggable"));
		System.out.println(drag.size());
		
		if(drag.size()>0) {
			System.out.println("Element present");
		}else {
			
		System.out.println("Element not present");
		}
		
		
		
		System.out.println("----------switch back to main page--------");
		driver.switchTo().defaultContent();
		element = driver.findElements(By.linkText("Sortable"));
		System.out.println(element.size());
		
		if(element.size()>0) {
			System.out.println("Element present");
		}else {
			
		System.out.println("Element not present");
		}
		

		drag = driver.findElements(By.id("draggable"));
		System.out.println(drag.size());
		
		if(drag.size()>0) {
			System.out.println("Element present");
		}else {
			
		System.out.println("Element not present");
		}
		
	}

}
