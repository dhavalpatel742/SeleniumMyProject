package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWaitTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		
		//implicit wait only applies to webelement when finding element
		//max time //when available went to next line // max 20sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[contains(@id,'u_0_')]")).click();
		
		
		//Thread.sleep(3000); // fix time
		
		//enter lastname
		driver.findElement(By.xpath("//input[contains(@id,'u_2_')]")).sendKeys("abcxyz");
		driver.findElement(By.xpath("//input[contains(@id,'u_2_d')]")).sendKeys("patel");
		//enter 10 digit number
		driver.findElement(By.xpath("//input[contains(@id,'u_2_g')]")).sendKeys("1234567890");
		//enter pass
		driver.findElement(By.id("password_step_input")).sendKeys("dhavalpatel");
		
		
		//select july
		WebElement box = driver.findElement(By.id("month"));
		Select s = new Select(box);
		s.selectByValue("7");
		
		//select 20
		WebElement date = driver.findElement(By.id("day"));
		Select d = new Select(date);
		d.selectByValue("20");
		
		
		//select 2000
		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByValue("2000");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		//click on signup button
		driver.findElement(By.xpath("//button[contains(@id,'u_2_s')]")).click();

	
	}

}
