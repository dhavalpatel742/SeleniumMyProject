package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MississaugaTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//our organization 7
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.mississauga.ca/");
		
		//type Canada in search box
		driver.findElement(By.xpath("//button[contains(text(),'Our organization')]")).click();
		Thread.sleep(3000);
		//get size 10
		//print text for all this options
		List<WebElement> alllinks = driver.findElements(By.xpath("//ul[@class='dropdown-menu nav-dropdown-menu show']/li"));
		System.out.println(alllinks.size());
		
		/*for (int i=0;i<alllinks.size();i++) {
			
			String a = alllinks.get(i).getText();
			
			/*if(a == "Jobs and volunteer"){
				
				System.out.println(alllinks.get(i).getText());
				
				break;
			}
			else
			{
				System.out.println(alllinks.get(i).getText());
			}
			//alllinks.get(i).click();//not working
		}*/
		
		for(WebElement a : alllinks) {
			System.out.println(a.getText());
			if(a.getText().equals("Jobs and volunteer"));
			{
				a.click();
				Thread.sleep(3000);
				System.out.println(driver.getTitle());
				break;
			}
		}
	}


}


