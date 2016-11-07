package firstPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DiffBrowsers {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "D://Sagar//JARS//IEDriverServer.exe");
		
		WebDriver  myDriver = new InternetExplorerDriver();
		
		myDriver.get("http://www.flipkart.com");
		

	}

}
