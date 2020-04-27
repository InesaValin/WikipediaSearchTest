package org.wikipedia.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.wikipedia.pages.FirstPage;
import org.wikipedia.pages.SearchPage;
import org.wikipedia.utility.BrowserFactory;

public class WikipediaTest { 

	WebDriver driver;

	@Test
	public void wikipediaApp()  {

		driver = BrowserFactory.startApplication(driver, "Chrome", "http://www.wikipedia.org");
		
		FirstPage firstPage = PageFactory.initElements(driver, FirstPage.class);
		firstPage.language();
		
		SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);	
		searchPage.search("Software");
		 
		BrowserFactory.quitBrowser(driver);
	}

}
