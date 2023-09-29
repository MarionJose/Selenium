package Keyboard_Example;

import java.awt.AWTException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwitchToWindow_Example {

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
			System.out.println(Window.size());
			
			Iterator<String> iterate=Window.iterator();
			while(iterate.hasNext())
					{
				String child_window=iterate.next();
				if(parentwindow.equals(child_window))
				{
					System.out.println("no need to switch");
				}
					else {
			
						System.out.println("need to switch");
						driver.switchTo().window(child_window);
					
					}
				
					}
				WebElement new_win=driver.findElement(By.xpath("//h3[text()='New Window']"));
				
				String s=new_win.getText();
				System.out.println(s);
//				new_win.click();
				driver.close();
					
		
					
					}
}

			