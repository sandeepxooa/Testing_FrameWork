package pom_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_out 
{
	 WebDriver driver;

		@FindBy(xpath="//div[@id='root']//div[@class='custom-header']//a[@class='nav-link']")
		private WebElement ProfileLink;
		
		@FindBy(xpath="//div[@id='root']//div[@class='custom-header']//button[text()='Sign out']")
		private WebElement SignoutButtonFromDropdown;
		
		
		public Log_out(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			this.driver=driver;
		}
		
		
		public void Click_on_ProfileLink() throws InterruptedException
		{Thread.sleep(5000);
		Actions act =  new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//div[@id='root']//div[@class='custom-header']//a)[4]"))).click().perform();	
		}
		
		public void Click_on_SignOutButton() throws InterruptedException
		{
			Thread.sleep(1000);
			Actions act =  new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//div[@id='root']//div[@class='custom-header']//button[text()='Sign out']"))).click().perform();
				
		}
}
