package org.wikipedia.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {

	
	WebDriver driver;
	
	public SearchPage(WebDriver sdriver) {

		this.driver = sdriver;
	}
	
	@FindBy (id ="searchInput") WebElement searchBox;
	
	public void search(String words) {
		
		searchBox.sendKeys(words);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		searchBox.submit();
	}
}
