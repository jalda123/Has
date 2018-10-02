package com.Mav.MAA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class MavenScripts { 
	ExtentHtmlReporter report;
	
	ExtentReports extent;
	
	ExtentTest logger;
	
	@BeforeTest
	
	public void extent() {
		
		 report = new ExtentHtmlReporter("./Reports/learn-automation.html");
		
		 extent = new ExtentReports();
		
		extent.attachReporter(report);
		
		 logger = extent.createTest("LoginTest");
	}
	
	@Test
	
	public void setupt() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.softwaretestingmaterial.com/selenium-interview-questions/");
		
		logger.log(Status.INFO, "Login to Google Application");
		
		logger.log(Status.PASS, "Test case is Passed");
		
		
	}
	
	
	
	@AfterTest()
	
	public void teardown() {
		
		extent.flush();
	}

}
