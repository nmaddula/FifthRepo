package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Firefox {

	public static void main(String[] args) throws InterruptedException {
		
		
//		System.setProperty("webdriver.ie.driver","C:\\Users\\QEDGE\\Desktop\\IEDriverServer.exe");
//		
//		Thread.sleep(3000);
//		WebDriver driver=new InternetExplorerDriver();
//		driver.get("https://www.facebook.com");
		
		Thread.sleep(3000);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QEDGE\\Desktop\\chromedriver.exe");
		
		Thread.sleep(3000);
	WebDriver driver=new ChromeDriver();
	Thread.sleep(3000);
		driver.get("https://www.facebook.com");
	}
}
