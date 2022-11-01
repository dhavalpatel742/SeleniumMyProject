package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DynamicTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement scroll = driver.findElement(By.xpath("//td[contains(text(),'Ernst Handel')]"));
		
		System.out.println(scroll.getLocation());
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("window.scrollBy(268,440)");

		//HTML TABLE
		WebElement mytable = driver.findElement(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']/table[1]/tbody[1]"));
		List<WebElement>  rowtable= mytable.findElements(By.tagName("tr"));
		int rowcount = rowtable.size();
		System.out.println("Number of row is " + rowcount);
		System.out.println("--------------------------------------------------");
		
		
		for(int row=1;row<rowcount;row++) {
			
			List<WebElement>  coltable = rowtable.get(row).findElements(By.tagName("td"));
			int colcount = coltable.size();
			System.out.println("row " + row);
			for(int col=0;col<colcount;col++) {
				
				String data = coltable.get(col).getText();
				
				System.out.println(data);
			}
			
			System.out.println("--------------------------------------------------");
		}
	}

}
