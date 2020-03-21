 package com.learning.selenium;

import org.eclipse.jetty.util.PathWatcher.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

/**
 * Unit test for simple App.
 */
public class HelloWorldTest extends Config {
	
	
@BeforeSuite


	
@Test
	public static void Login (){
		
		//System.out.println("SUMAN SHARMA ");
		System.setProperty("webdriver.chrome.driver", driverpath");
		WebDriver driver = new ChromeDriver();
		//String url = "www.facebook.com ";
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = null;
		driver.get("https://www.facebook.com");
		actualTitle = driver.getTitle();
		if(actualTitle.equals(expectedTitle)){
			System.out.println("Test Passed");
			System.out.println("expectedTitleis "+expectedTitle + "actual title is "+actualTitle );
		}
		else{
			System.out.println("Test Failed hai");
			System.out.println("expectedTitleis "+expectedTitle);
			System.out.println("actual title is "+actualTitle);
		
		}
		
		
		driver.close();
	}
	

}
