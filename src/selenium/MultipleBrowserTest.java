package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowserTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		FileInputStream f = new FileInputStream("C:\\Testing\\prop.properties");
		Properties prop = new Properties();
		
		prop.load(f);
		String browser = prop.getProperty("browser");
		
		
		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if(browser.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("ugeyucgwjcgb");
		driver.findElement(By.id("pass")).sendKeys("sxhdgcdgcygehg");
		driver.findElement(By.tagName("button")).click();
		
		
	}
	
}
