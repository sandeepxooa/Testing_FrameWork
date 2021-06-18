package pom_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OTP_and_Update_Login_validation
{
WebDriver driver;
	
	
	@FindBy(xpath="//div[@role='dialog']//button[@class='close']")
	private WebElement Update_iFrame_close_button;
	

	@FindBy(xpath="(//div[@role='dialog']//div[@class=\"modal-content\"])[2]//button[text()='Yes']")
	private WebElement Update_iFrame_yes_button;
	
	
	
	
	public OTP_and_Update_Login_validation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void Skip_to_update_mobileNo_Massege() throws InterruptedException 
	{  
//		WebDriverWait wait = new WebDriverWait(driver,20);
//		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='dialog']//button[@class='close']")));
		
		 //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 Thread.sleep(15000);
		boolean result= Update_iFrame_close_button.isDisplayed();
		if(result=true) 
		{
		Update_iFrame_close_button.click();
		Thread.sleep(2000);
		Update_iFrame_yes_button.click();
		Thread.sleep(2000);
		}
		
		
	}

	
	
	
	
	
}
