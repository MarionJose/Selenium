package com.elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UsingIdLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91949\\OneDrive - ALB\\Desktop\\Chromefile\\Chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);//runtime polymorphism
	
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement productSearchField= driver.findElement(By.cssSelector("#twotabsearchtextbox"));	
		productSearchField.sendKeys("Bag");
		
//		WebElement productSearchField = driver.findElement(By.id("twotabsearchtextbox"));
//		productSearchField.click();
//		productSearchField.sendKeys("Bag");
//		
//		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
//		searchButton.click();

	}

}
