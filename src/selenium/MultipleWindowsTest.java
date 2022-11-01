package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2Fb%2F1%2FAddMailService&followup=https%3A%2F%2Faccounts.google.com%2Fb%2F1%2FAddMailService&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows.size());
		
		Iterator<String> itr=allwindows.iterator();
		String mainwindow = itr.next();
		String childwindow = itr.next();
		//driver.switchTo().window(null); //handle for the window
		System.out.println(mainwindow);
		System.out.println(childwindow);
		
		driver.switchTo().window(childwindow);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.close();//close current window
		
		driver.switchTo().window(mainwindow);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.quit(); // close everything
	}

}
