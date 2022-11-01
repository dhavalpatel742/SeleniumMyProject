package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScotiabankLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=qjhCJuRZoS4&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoicWpoQ0p1UlpvUzQiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY1NTI1MzYwMywiaWF0IjoxNjU1MjUyNDAzLCJqdGkiOiJiNGJmYjZiZi0xNDNhLTQ5NGUtOTZjZC0yZTFiNjViMTE2MmEiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.ezSbETD4jllYkOSpxiKuJLErWjglianS1MCmfY-a6bchRNiH7sog-s-EfTAAk6gtzhlaKDTJWe6JBGJb7NbX6s4f6hkBC2oaVaC1THwNFqdEUODX_ekYKfGcFnwBVQBwhVLVdSPR4HqTdmx0wwSDk1GWMvKq71eBWZCr-Y9lrkq-rvw2nrT_t4wcM5gQTL5bLXsf1yV8zQrazkNlbJuOOCMyXMlqP-v58gPBfrbcCtN9OD2G2qIgBnBNk4TvVVnBKcDXd4ac9-32eseqK7vpqdo9yqGE_gN2NSOkZsFthvwlcclqnZ-HdtgwD6YX1XBTE-V6VpNUfHz5ooSOaRTTJg&preferred_environment=");
		
		driver.findElement(By.id("usernameInput-input")).sendKeys("dbdjbwihbwcb%$sj");
		driver.findElement(By.id("password-input")).sendKeys("sxfwywjhbxj");
		driver.findElement(By.id("signIn")).click();
		
		Thread.sleep(3000);
		
		String expectederrormsg = "Please enter a username or card number without special characters.";
		String actualerrormsg = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		
		 System.out.println(actualerrormsg);
		
		 if (expectederrormsg.equals(actualerrormsg)) {
			 
			 System.out.println("Test Pass");
		 }
		 else {
			 System.out.println("Test Fail");
		 }
	}

}
