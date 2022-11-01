package selenium;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import selenium.Xls_Reader;

public class MultipleBrowserTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = null;
		
		//String browser = "Firefox";
		
		Xls_Reader d = new Xls_Reader("C:\\Testing\\MultipleBrowserTest.xlsx");
		System.out.println(d.getCellData("Sheet1", 0, 2));
		System.out.println(d.getCellData("Sheet1", 0, 3));
		
		String browser = d.getCellData("Sheet1", 0, 3);

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
