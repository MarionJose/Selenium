package Keyboard_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaExecute2 {

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91949\\OneDrive - ALB\\Desktop\\Chromefile\\Chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(options);//runtime polymorphism
		
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			
			JavascriptExecutor js=(JavascriptExecutor) driver;//explicit type conversion
			WebElement abt=driver.findElement(By.xpath("//a[text()='About Us']"));
			js.executeScript("arguments[0].scrollIntoView();",abt);
			js.executeScript("document.body.style.zoom='1.5'");


			
	}

}
