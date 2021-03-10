package com.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProvider {
	
	WebDriver driver;
	@BeforeMethod
	public void Setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp p077tx\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/login.html");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		}
	
	@org.testng.annotations.DataProvider
	public void  getTestData() {
		
	}
	
	
	
	
	@Test
	public void dataproviderTest(String username, String password) {
		
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(username);
		
		driver.findElement(By.id("passwd")).clear();
		driver.findElement(By.id("passwd")).sendKeys(password);
		
		driver.findElement(By.xpath("//i[@class=\"icon-lock left\"]")).click();
	}
	@AfterMethod
	public void TearDown() {
		
		driver.close();
	}

}
