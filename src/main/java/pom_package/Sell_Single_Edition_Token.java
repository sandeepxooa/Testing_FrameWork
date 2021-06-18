package pom_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sell_Single_Edition_Token 
{
WebDriver driver;
	
	@FindBy(xpath="//div[@id='root']//div[2]//div//nav")
	private WebElement sidebar;
   
	@FindBy(xpath="//div[@id='root']//a[@class='nav-link nav-link active']")
    private WebElement MytokenNavigationButton;
	

}
