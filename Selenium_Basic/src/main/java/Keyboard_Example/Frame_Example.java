package Keyboard_Example;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frame_Example {

	public static void main(String[] args) throws AWTException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91949\\OneDrive - ALB\\Desktop\\Chromefile\\Chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);//runtime polymorphism
	    driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		driver.switchTo().frame("frame-middle");
		WebElement midd_ele=driver.findElement(By.xpath("//div[text()='MIDDLE'][1]"));
		String s=midd_ele.getText();
		System.out.println(s);
	}

}
