package org.wikipedia.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWikipedia {
	
	//test without any framework

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 			//reikalingas chrome drive
		WebDriver driver = new ChromeDriver(); 						//sukuria driveri
		driver.get("http://www.wikipedia.org");						//nukreipia reikiamu adresu
		
		
		
		WebElement link;											//kuriam su kokiu elementu (mygtuku) dirbsim
		link = driver.findElement(By.id("js-link-box-en"));			//sukuriam pagal ka atpazins mygtuka
		link.click();												//kad paspaudimas ivyks
		Thread.sleep(5000);											//kiek milisekundziu lauks
		
		
		WebElement searchBox;										//sukuriam kitą elemeta, su kuriuo dirbsim
		searchBox = driver.findElement(By.id("searchInput"));		//randa norima elementa pagal ID
		searchBox.sendKeys("Software"); 							//nurodo irasyti reiksme
		searchBox.submit(); 										//padaro veikianti, kad aktyvuotu (enter)
		Thread.sleep(5000); 										//vel palaukimas
		driver.quit(); 												//iseina is narsykles
	}

}
