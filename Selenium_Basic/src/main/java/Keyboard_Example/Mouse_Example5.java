package Keyboard_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Example5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91949\\OneDrive - ALB\\Desktop\\Chromefile\\Chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);//runtime polymorphism
	
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		
		WebElement enter_text =driver.findElement(By.xpath("//input[@id='single-input-field']"));
		Actions actions = new Actions(driver);
//		actions.sendKeys(enter_text, "Marion").build().perform();
		actions.clickAndHold(enter_text).build().perform();
		Thread.sleep(3000);
		actions.release(enter_text).build().perform();
		
		}

}
