package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTestNg {
	
	WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp p077tx\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		}
	
	@Test(priority=4,groups="Title")
	public void GoogleTestTest() {
		
		String s1 = driver.getTitle();
		System.out.println(s1);	
		Assert.assertEquals(s1,"Google");
	}
	
	@Test(priority=3,groups="Search")
	public void SeachWords() {
		
		driver.navigate().refresh();
		driver.findElement(By.name("q")).sendKeys("why so serious");	
	}
	
	@Test(priority=2,groups="Search")
	public void searchsomephrases() {
		
		driver.navigate().refresh();
		driver.findElement(By.name("q")).sendKeys("phrases");	
	}
	
	@Test(priority=1,groups="Search")
	public void SearchNewthings() {
		
		driver.navigate().refresh();
		driver.findElement(By.name("q")).sendKeys("New Things");	
	}
	
	@AfterMethod
	public void TearDown() {
		
		driver.close();
	}

}
