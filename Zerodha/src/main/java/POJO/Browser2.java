package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser2 {
	

	public static WebDriver openBrowser() {
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);//upcasting Chrome driver class to WebDriver
		driver.get("https://kite.zerodha.com/");//method of WebDriver interface
		 driver.manage().window().maximize(); 
		 return driver;

	}

}
