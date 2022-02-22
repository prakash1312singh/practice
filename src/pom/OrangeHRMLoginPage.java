package pom;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ganerics.AutoConstant;
import ganerics.ExcelLibrary;

public class OrangeHRMLoginPage implements AutoConstant
{
	WebDriver driver;
	
	@FindBy(id="txtUsername")
	private WebElement usernameTextfield;
	
	@FindBy(id = "txtPassword")
	private WebElement passwordTextfield;
	
	@FindBy(id="btnLogin")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[.='Forgot your password?']")
	private WebElement forgotpwdLink;
	
	public OrangeHRMLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws IOException
	{
		usernameTextfield.sendKeys(ExcelLibrary.getStringCellValue(sheet_name, 1, 0));
		passwordTextfield.sendKeys(ExcelLibrary.getStringCellValue(sheet_name, 1, 1));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", loginButton);
	}
	
	public void forgotpwdMethod()
	{
		forgotpwdLink.click();
	}

}
