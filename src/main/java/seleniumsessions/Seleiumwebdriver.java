package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleiumwebdriver {

	public static void main(String[] args) {		

		String browser="firefox";
		WebDriver driver = null;
		
		if (browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Niti Bharti\\Downloads\\chromedriver_new\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Niti Bharti\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		}
		
		else 
		{
			System.out.println("wrong browser");
		}
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		String str = driver.getCurrentUrl();
		System.out.println(str);
		
		String s= driver.getTitle();
		System.out.println(s);
		if(s.equals("Google")) {
			System.out.println("title is correct");
		}
		else {
			System.out.println("title is wrong");
		}
		
		driver.quit();
		
		
		
		
	}

}
