package com.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigationCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91949\\OneDrive - ALB\\Desktop\\Chromefile\\Chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);// runtime polymorphism

		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();	
		driver.navigate().forward();
		}
	
	

}
