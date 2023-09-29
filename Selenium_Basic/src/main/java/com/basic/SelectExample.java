package com.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91949\\OneDrive - ALB\\Desktop\\Chromefile\\Chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);//runtime polymorphism
	
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement selectdropdown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s=new Select(selectdropdown);
		s.selectByIndex(3);
//		s.selectByValue("search-alias=fashion");
		s.selectByValue("search-alias=appliances");
		
		List<WebElement>li= driver.findElements(By.xpath("//select[@id='searchDropdownBox']//option"));
		for(int i=0;i<li.size();i++) {
			String hlist=li.get(i).getText();
			System.out.println(hlist);
		}
		
		

	}

}
