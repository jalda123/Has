package com.Mav.MAA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenScripts { 
	
	@Test
	
	public void setupt() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.softwaretestingmaterial.com/selenium-interview-questions/");
	}

}
