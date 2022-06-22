package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser2;
import POM.ZerodhaLoginPage;
import Utility.Parameterization;

public class LoginPageTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void Browser()
	{
		
		driver=Browser2.openBrowser();
	}
	
	@Test
	
	public void loginwithvalidcredentialsTest() throws EncryptedDocumentException, IOException
	{
		ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
		String userName=Parameterization.getdata(0, 1);
		String password1=Parameterization.getdata(1, 1);
		
		zerodhaLoginPage.enterUserID(userName);
		zerodhaLoginPage.enterPassword(password1);
		zerodhaLoginPage.Clickonlogin();
		
	}
	
	@Test
public void forgotpasswordLinkTest()
	{
		ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
		zerodhaLoginPage.ForgotuserID();
	}
	
	@Test
	public void signuplinktest()
{
	ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
	zerodhaLoginPage.clickInSignUP();
}
}
	
	
	
