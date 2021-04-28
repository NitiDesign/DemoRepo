package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Headless {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Niti Bharti\\Downloads\\chromedriver_new\\chromedriver.exe");
//		ChromeOptions co = new ChromeOptions();
//		//co.addArguments("--headless");
//		co.addArguments("--incognito");
		
//		WebDriver driver = new ChromeDriver(co);
//		driver.get("https://www.google.com");
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Niti Bharti\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");

		FirefoxOptions fo =  new FirefoxOptions();
		//fo.addArguments("--headless");
		fo.addArguments("--incognito");
		WebDriver driver = new FirefoxDriver(fo);
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
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
