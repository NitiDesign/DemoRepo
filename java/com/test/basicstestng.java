package com.test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basicstestng {
	
	@BeforeSuite
	public void LaunchBrowser()
	{		
		System.out.println("BeforeSuite------------>>");
		System.out.println("BeforeSuite------------>>");
		System.out.println("BeforeSuite------------>>");
	}
	
	@BeforeTest
	public void URLLogin()
	{
		System.out.println("BeforeTest------------>>");
	}
	
	@BeforeClass
	public void GetTile()
	{
		System.out.println("BeforeClass------------>>");
	}
	
	@BeforeMethod
	public void GetNow()
	{
		System.out.println("BeforeMethod------------>>");
	}
	
	@Test(priority=1,groups="logo")
	public void GetTitleOfPage()
	{
		System.out.println("Test1------------>>");
	}
	
	@Test(priority=3,groups="search")
	public void SearchWords()
	{
		System.out.println("Test2------------>>");
	}
	
	@Test(priority=2,groups="logo")
	public void createcase()
	{
		System.out.println("Test3------------>>");
	}
	
	@Test(priority=4,groups="logo")
	public void createcontact()
	{
		System.out.println("Test4------------>>");
	}
	
	@Test(priority=5,groups="search")
	public void addmessage()
	{
		System.out.println("Test5------------>>");
	}
	
	@AfterMethod
	public void GetLaterAfterMethod()
	{
		System.out.println("AfterMethod------------>>");	
	}
	
	@AfterClass
	public void GetLaterAfterClass()
	{
		System.out.println("AfterClass------------>>");	

	}
	
	@AfterTest
	public void GetLaterAfterTest()
	{
		System.out.println("AfterTest------------>>");	

	}
	
	@AfterSuite
	public void TearDownAfterSuite()
	{
		System.out.println("AfterSuite------------>>");	
	
	}
	
}
