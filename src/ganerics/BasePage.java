package ganerics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class BasePage 
{
	public void alertdismiss(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();
	}

}
