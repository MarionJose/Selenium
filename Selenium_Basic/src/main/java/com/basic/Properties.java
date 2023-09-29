package com.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Properties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91949\\OneDrive - ALB\\Desktop\\Chromefile\\Chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);//runtime polymorphism
	
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.xpath("//ul[@class='navbar-nav']//li[8]//a"));
		String s=table.getText();
		System.out.println(s);
		
		List<WebElement> header=driver.findElements(By.xpath("//ul[@class='navbar-nav']//li//a"));
		int s2=header.size();
		System.out.println(s2);
		System.out.println(header.get(7).getText());
		
		for(int i=0;i<header.size();i++) {
			String hlist=header.get(i).getText();
			System.out.println(hlist);
		}
		
	}

}
