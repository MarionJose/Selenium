package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\91949\\OneDrive - ALB\\Desktop\\Chromefile\\Chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("remote-allow-origins=*");
				WebDriver driver = new ChromeDriver(options);//runtime polymorphism
			
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				
				WebElement emailType =driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
				emailType.sendKeys("Marion");
				
				WebElement passwordType =driver.findElement(By.xpath("//input[@aria-label='Password']"));
				passwordType.sendKeys("^&*((");
				
				
	}

}
