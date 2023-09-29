package com.basic;


import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91949\\OneDrive - ALB\\Desktop\\Chromefile\\Chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);//runtime polymorphism
	
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		WebElement bttn=driver.findElement(By.xpath("//input[@id='file-upload']"));
//		bttn.sendKeys("C:\\Users\\91949\\OneDrive - ALB\\Desktop\\test\\Book.xlsx");
		String path="C:\\Users\\91949\\OneDrive - ALB\\Desktop\\test2";
		File file=new File(path);
		bttn.sendKeys(file.getAbsolutePath());

}
}