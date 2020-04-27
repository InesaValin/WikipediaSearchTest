package org.wikipedia.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstPage {

	WebDriver driver;

	public FirstPage(WebDriver fdriver) {

		this.driver = fdriver;
	}

	@FindBy(id = "js-link-box-en")
	WebElement link;

	public void language() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		link.click();
	}
}
