package pom_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
		Actions act1 =  new Actions(driver);
		act1.moveToElement(driver.findElement(By.xpath("//*[@class='runtime-app-logo navbar-brand']"))).click().perform();
			
	}

}
