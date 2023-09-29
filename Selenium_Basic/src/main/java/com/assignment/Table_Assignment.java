package com.assignment;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Table_Assignment {

	public static void main(String[] args) throws AWTException{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\91949\\OneDrive - ALB\\Desktop\\Chromefile\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);//runtime polymorphism
	    driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		driver.manage().window().maximize();
		
		WebElement strt_date=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[6]//td[5]"));
		String s=strt_date.getText();
		System.out.println(s);
		
		WebElement offic=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[8]//td[3]"));
		String o=offic.getText();
		System.out.println(o);
		
		
		List<WebElement> sal=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[6]"));
		for(WebElement i:sal) {
			String j=i.getText();
			System.out.println(j);;
		}
		
		
	}

}
