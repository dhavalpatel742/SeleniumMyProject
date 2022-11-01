package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		
		
		
		//email
		
		//classname - Not Working - space in classname - Compound class names not permitted
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("sddhywguyudwygycfgy");
		
		//css.selector - need to learn syntax for CSS
		//driver.findElement(By.cssSelector("")).sendKeys("hdgjhsjjhvj");
		
		//id
		//driver.findElement(By.id("email")).sendKeys("sxhdgcdgcygehg");
		
		//linktext - only for links
		//driver.findElement(By.linkText("")).sendKeys("");
		
		//name
		driver.findElement(By.name("email")).sendKeys("ugeyucgwjcgb");
	
		//partialLinkText - only for links
		//driver.findElement(By.partialLinkText("")).sendKeys("");
	
		//tagname - starts from the top to search for that tag. Must be unique.
		//driver.findElement(By.tagName("input")).sendKeys("djgsjgjgjcsd");
		
		//xpath - need to learn syntax for xpath . Most powerful in terms of execution speed.
		//driver.findElement(By.xpath("")).sendKeys("");
	
		
		
		
		
		
		//password
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("sddhywguyudwygycfgy");
		
		//css.selector - need to learn syntax for CSS
		//driver.findElement(By.cssSelector("")).sendKeys("hdgjhsjjhvj");
		
		//id
		driver.findElement(By.id("pass")).sendKeys("sxhdgcdgcygehg");
		
		//linktext - only for links
		//driver.findElement(By.linkText("")).sendKeys("");
	
		//name
		//driver.findElement(By.name("pass")).sendKeys("ugeyucgwjcgb");
	
		//partialLinkText - only for links
		//driver.findElement(By.partialLinkText("")).sendKeys("");
			
		//tagname - starts from the top to search for that tag. Must be unique.
		//driver.findElement(By.tagName("input")).sendKeys("djgsjgjgjcsd");
				
		//xpath - need to learn syntax for xpath . Most powerful in terms of execution speed.
		//driver.findElement(By.xpath("")).sendKeys("");
		
		
		
		
		
		
		//Login button
		
		//id - last two digits are changing 
		//driver.findElement(By.name("login")).click();
		
		//tagname
		driver.findElement(By.tagName("button")).click();
	}

}
