package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		Thread.sleep(2000);
		//driver.switchTo().defaultContent();
		WebElement drop = driver.findElement(By.id("droppable"));
		
		System.out.println(drop.getText());
		Actions builder = new Actions(driver);
		builder.dragAndDrop(drag, drop).build().perform();
		System.out.println(drop.getText());
	}

}
