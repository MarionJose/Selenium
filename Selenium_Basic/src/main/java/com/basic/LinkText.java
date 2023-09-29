package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91949\\OneDrive - ALB\\Desktop\\Chromefile\\Chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);//runtime polymorphism
	
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
//		WebElement forgottenPassword = driver.findElement(By.linkText("Forgotten password?"));
//		WebElement forgottenPassword = driver.findElement(By.partialLinkText("password?"));
//		forgottenPassword.click();

		WebElement searchField =driver.findElement(By.xpath("//input[@name='field-keywords']"));
		searchField.sendKeys("Bag");
		searchField.click();
				}

}
