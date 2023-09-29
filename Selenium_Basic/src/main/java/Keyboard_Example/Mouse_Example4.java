package Keyboard_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91949\\OneDrive - ALB\\Desktop\\Chromefile\\Chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);//runtime polymorphism
	
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement src_element=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement des_element=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(src_element, des_element).build().perform();
	}

}
