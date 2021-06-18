package POM_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Click_To_Refresh 
{
	WebDriver driver;
    
	
	
	@FindBy(xpath="//*[@class='runtime-app-logo navbar-brand']")
    private WebElement app_logo;
	
	
	
	public Click_To_Refresh(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	public void Click_on_AppLogo()
	{
		app_logo.click();
	}
}
