package Keyboard_Example;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TableXpath_example {
	public static void main(String[] args) throws AWTException{

	System.setProperty("webdriver.chrome.driver","C:\\Users\\91949\\OneDrive - ALB\\Desktop\\Chromefile\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);//runtime polymorphism
    driver.get("https://selenium.obsqurazone.com/table-pagination.php");
	driver.manage().window().maximize();
	
	WebElement head_office=driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]//th[3]"));
	System.out.println(head_office.getText());
	
	List<WebElement> heading = driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]//th"));
	/* Using normal for loop
	for(int i=0; i<heading.size();i++) {
		 String s = heading.get(i).getText();
		 System.out.println(s);	 
	}
*/	
	// Using enhanced for loop
	for(WebElement i :heading ) {
		 String s = i.getText();
		 System.out.println(s);	 
	}
	
	WebElement data=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[6]//td[4]"));
	System.out.println(data.getText());
	
	List<WebElement> colm_list = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
	for(WebElement i :colm_list ) {
		 String col = i.getText();
		 System.out.println(col);
		 
		 
		 List<WebElement> row_list = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[7]//td"));
			for(WebElement j :row_list ) {
				 String ro = j.getText();
				 System.out.println(ro);
	
	}
	}
}
}
