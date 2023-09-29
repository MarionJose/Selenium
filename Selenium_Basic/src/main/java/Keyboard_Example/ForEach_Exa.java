package Keyboard_Example;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ForEach_Exa {

	public static void main(String[] args) throws AWTException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91949\\OneDrive - ALB\\Desktop\\Chromefile\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);//runtime polymorphism
	    driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		WebElement cl_here=driver.findElement(By.xpath("//a[text()='Click Here']"));
		cl_here.click();
	
		
		String parentwindow=driver.getWindowHandle();//get tab code,tempory id
		System.out.println();
		Set<String>Window=driver.getWindowHandles();
		for(String windowid:Window) {
			if(!parentwindow.equals(windowid){
				
			}
			
		}
		

	}

}
