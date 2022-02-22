package ganerics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pom.OrangeHRMHomePage;
import pom.OrangeHRMLoginPage;

public class BaseTest implements AutoConstant
{
	public WebDriver driver;
	
	@BeforeClass
	public void openbrowser() 
	{
		System.setProperty(chrome_key, chrom_value);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@AfterClass
	public void closebrowser()
	{
		//driver.close();
	}
	
	@BeforeMethod
	public void loginapp() throws IOException
	{
		OrangeHRMLoginPage login=new OrangeHRMLoginPage(driver);
		login.loginMethod();
	}
	
	@AfterMethod
	public void logoutapp()
	{
		OrangeHRMHomePage home=new OrangeHRMHomePage(driver);
		home.logoutMethod();
	}
	

}
