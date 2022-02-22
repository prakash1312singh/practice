package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ganerics.AutoConstant;
import ganerics.BasePage;

public class OrangeHRMHomePage extends BasePage implements AutoConstant
{
	WebDriver driver;
	
	@FindBy(id = "welcome")
	private WebElement welcomeLink;
	
	@FindBy(xpath = "//a[.='Logout']")
	private WebElement logoutLink;
	
	public OrangeHRMHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logoutMethod()
	{
		//alertdismiss(driver);
		welcomeLink.click();
		logoutLink.click();
	}

}
