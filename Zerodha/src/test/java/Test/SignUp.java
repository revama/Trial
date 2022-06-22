package Test;
import java.io.IOException;
import java.util.Set;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import POM.ZerodhaSignUp;

import POJO.Browser2;
import Utility.Parameterization;

public class SignUp {
	
WebDriver driver;
	
	@BeforeMethod
	public void Browser()
	{
		driver = Browser2.openBrowser();
	}
	
	@Test 
	public void ZerodhaSignUp() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhaSignUp zerodhaSignUp = new ZerodhaSignUp(driver);
		zerodhaSignUp.clickInSignUP();
		
		Set<String> set = driver.getWindowHandles();
		
		java.util.Iterator<String> window = set.iterator();
		 
		 while(window.hasNext()) {
			 String obj=window.next();
			 driver.switchTo().window(obj);
			 
			 if(driver.getCurrentUrl().equals("https://zerodha.com/open-account?c=RAINMT&utm_source=kite&utm_medium=web&utm_campaign=account")){
				
				 driver.findElement(By.xpath("//input[@type='text']"));
				 Thread.sleep(1000);
				 
	    String MN=Parameterization.getdata(3, 1);
		zerodhaSignUp.EnterMobNo(MN);
		zerodhaSignUp.clickOnContinue();
		//zerodhaSignUp.clickOnNRI();
		
		System.out.println("Hi");
		
}
		 }
	}
}


