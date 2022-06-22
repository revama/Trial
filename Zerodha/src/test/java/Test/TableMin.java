package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableMin {
	public static void main(String[] args) {
		double max=0; 
		double min=0;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\software\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();//upcasting Chrome driver class to WebDriver
			driver.get("https://demo.guru99.com/test/web-table-element.php");
			
			List<WebElement> column = driver.findElements(By.xpath("//table//thead//tr//th"));
	//	int columnsize=column.size();
			
			List<WebElement> row = driver.findElements(By.xpath("//table//tbody//tr"));
		//  int rowsize = row.size();
	
		List<WebElement> currentprice = driver.findElements(By.xpath("//table//tbody//tr//td[4]"));
		
		for(int i=0; i<currentprice.size(); i++)
		{
			WebElement c=currentprice.get(i); 
			String d=c.getText(); 
			double baseprice=Double.parseDouble(d); 
			if (max<baseprice)
			{
				max=baseprice; 
				min=baseprice;
			
			}
		}
			
			System.out.println(max);
			for(int k=0;k<currentprice.size();k++)
			{
				WebElement a=currentprice.get(k); 
				String b=a.getText(); 
				double value=Double.parseDouble(b);
				if(value<min) {
					min=value;
				
			}

}
			  System.out.println(min);

		
	}
	}



