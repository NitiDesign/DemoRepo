package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementsconcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubString browser="firefox";
		WebDriver driver = null;
		String browser="chrome";
		
		System.out.println("hello i am the change");
		
		 if(browser.equalsIgnoreCase("chrome"))
		 {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Niti Bharti\\Downloads\\chromedriver_new\\chromedriver.exe");
				driver = new ChromeDriver();
		 }
		 else if(browser.equalsIgnoreCase("firefox"))
		 {
			 	System.setProperty("webdriver.gecko.driver","C:\\Users\\Niti Bharti\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
				driver = new FirefoxDriver();			
		 }			
		 else 
		 {
			 	System.out.println("wrong browser");
		 }
		 
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		
		 driver.findElement(By.id("login1")).sendKeys("niti.kakkar@rediffmail.com");
		 Thread.sleep(3000);
		 driver.findElement(By.id("password")).sendKeys("Test@1234");
		 Thread.sleep(3000);
		 driver.findElement(By.name("proceed")).click();
		 Thread.sleep(5000);
		 driver.quit();

		 
		 
		
	}

}
