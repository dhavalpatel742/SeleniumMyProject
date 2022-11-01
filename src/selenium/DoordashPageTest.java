package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoordashPageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://identity.doordash.com/auth?client_id=1666519390426295040&layout=consumer_web&prompt=none&redirect_uri=https%3A%2F%2Fwww.doordash.com%2F&response_type=code&scope=%2A&state=none");
		
		driver.findElement(By.id("FieldWrapper-2")).sendKeys("dwgcwjgcwbmcbsjbjwcb");
		driver.findElement(By.id("FieldWrapper-3")).sendKeys("swgc321w64");
		driver.findElement(By.id("login-submit-button")).click();

	}

}
