package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91949\\OneDrive - ALB\\Desktop\\Chromefile\\Chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);//runtime polymorphism
	
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		
		WebElement checkBox1=driver.findElement(By.xpath("//form[@id='checkboxes']//input[1]"));
		WebElement checkBox2=driver.findElement(By.xpath("//form[@id='checkboxes']//input[2]"));
		boolean s= checkBox1.isSelected();
		System.out.println(s);
		boolean s1=checkBox2.isSelected();
		System.out.println(s1);
		if(s==false) {
			checkBox1.click();
		}
		if(s1==false) {
			checkBox2.click();
		}
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement bttn=driver.findElement(By.xpath("(//input[@value='Male'])[1]"));
		
//		boolean b=bttn.isSelected();
//		System.out.println(b);
		
//		boolean b=bttn.isDisplayed();
//		System.out.println(b);
		
		boolean b=bttn.isEnabled();
		System.out.println(b);
		}
	
	
	}


