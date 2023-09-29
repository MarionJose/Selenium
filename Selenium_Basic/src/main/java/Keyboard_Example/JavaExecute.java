package Keyboard_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaExecute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91949\\OneDrive - ALB\\Desktop\\Chromefile\\Chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);//runtime polymorphism
	
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;//explicit type conversion
//		js.executeScript("alert('marion')");//alert message
		js.executeScript("window.scrollBy(0,200)");//scroll down up and down method (x,y)
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(100,200)");
		
		WebElement cart=driver.findElement(By.xpath("//span[text()='Cart']"));
		js.executeScript("arguments[0].click();",cart);

	}

}
