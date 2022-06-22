package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	
	public static void main(String[] args) 
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\software\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();//upcasting Chrome driver class to WebDriver
	    driver.get("https://demo.guru99.com/test/web-table-element.php");//method of WebDriver interface
	    //WebElement Stock =  driver.findElement(By.xpath("//table//tbody//tr[14]//td[4]"));
	    WebElement stock= driver.findElement(By.xpath("//table//tbody//tr[2]//td[4]"));
		String name = stock.getText();
		System.out.println(name); 		
		
	}
}

