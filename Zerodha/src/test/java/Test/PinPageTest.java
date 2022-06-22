package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import POJO.Browser2;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.Parameterization;

public class PinPageTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver=Browser2.openBrowser();
	}
	
@Test
	
	public void loginwithvalidcredentialsTest() throws EncryptedDocumentException, IOException, InterruptedException
	{
		ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
		String userName=Parameterization.getdata(0, 1);
		String password1=Parameterization.getdata(1, 1);
		
		zerodhaLoginPage.enterUserID(userName);
		zerodhaLoginPage.enterPassword(password1);
		zerodhaLoginPage.Clickonlogin();
		
		Thread.sleep(5000);

		//ZerodhaLoginPage zerodapinpage=new ZerodhaLoginPage(driver);
		String pin=Parameterization.getdata(2, 1);
		System.out.println(pin);
		
		ZerodhaPinPage zerodaPinPage=new ZerodhaPinPage(driver);
		System.out.println(pin);
		zerodaPinPage.enterPin(pin);
		zerodaPinPage.clickOnContinue();
		System.out.println("Revati Mahajan");
	
		



}
}
