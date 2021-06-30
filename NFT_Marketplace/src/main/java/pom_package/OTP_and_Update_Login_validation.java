package pom_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OTP_and_Update_Login_validation
{
WebDriver driver;
	
//div[@role='dialog']
	@FindBy(xpath="//div[@role='dialog']//button[@class='close']")
	private WebElement Update_iFrame_close_button;
	
	//(//div[@role='dialog']//div[@class='modal-content'])[2]
	@FindBy(xpath="(//div[@role='dialog']//div[@class='modal-content'])[2]//button[text()='Yes']")
	private WebElement Update_iFrame_yes_button;
	
	
	
	
	public OTP_and_Update_Login_validation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	public void Skip_to_update_mobileNo_Massege() throws InterruptedException 
	{  
		
		Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='dialog']//button[@class='close']")));
//		
		 //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		boolean result= Update_iFrame_close_button.isDisplayed();
		if(result=true) 
		{
		Update_iFrame_close_button.click();
		Thread.sleep(2000);
//		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Yes']")));
		Update_iFrame_yes_button.click();
		Thread.sleep(2000);
		}
		
		
	}

	
	
	
	
	
}
