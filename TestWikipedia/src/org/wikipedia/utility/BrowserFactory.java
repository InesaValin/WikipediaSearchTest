package org.wikipedia.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

	public static WebDriver startApplication(WebDriver driver, String browserName, String appURL) {

		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe"); 					// reikalingas chrome drive
			driver = new ChromeDriver(); 														// sukuria driveri
		}
		else if (browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} 
		else {
			System.out.println("We do not suport this browser");
		}

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);						// sioki toki laukima
		driver.manage().window().maximize(); 													// padaryti dideli langa
		driver.get(appURL); 																	// pasiimti url reikiama
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); 						// sioki toki laukima
		
		return driver;
	}
	
	public static void quitBrowser(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
