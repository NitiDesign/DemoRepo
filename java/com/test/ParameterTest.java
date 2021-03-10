package com.test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	WebDriver driver;
	
	@Test
	@Parameters({"url","username","password1"})
	public void RediffmailLogin(String url,String username,String password1) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp p077tx\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password1);	
	}
	
//	@Test(groups="Search")
//	@Parameters("username")
//	public void GiveUserName(String username) {
//		driver.findElement(By.id("login1")).sendKeys(username);
//	}
//	
//	@Test(groups="Search")
//	@Parameters("password1")
//	public void GivePassword(String password1) {
//		driver.findElement(By.id("password")).sendKeys(password1);	
//	}
//	
//	@Test(groups="Search")
//	public void ClickOnSignButton() {
//		driver.findElement(By.name("proceed")).click();
//	}
//	
//	@Test(groups="Search")
//	public void SearchNewthings() {
//		
//		driver.navigate().refresh();
//		driver.findElement(By.name("q")).sendKeys("New Things");	
//	}
//	
//	@Test
//	public void TearDown() {
//		
//		driver.close();
//	}

}
