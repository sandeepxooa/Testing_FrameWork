package pom_package;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Xooa_Login {
	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath = "//div//button[@insp-label='Sign in']")
	private WebElement sign_in_button;
	
	@FindBy(xpath = "//div//a[@aria-label='dismiss cookie message']")
	private WebElement Cookies;
	
	
	public Xooa_Login(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void accept_cookies()
	{
		boolean a=Cookies.isDisplayed();
		if (a=true)
			{
			Cookies.click();
			
			}
	}
	
	
	public void SendUsername()
	{
		username.sendKeys("demo.xooa@gmail.com");
	}
	public void Sendpassword()
	{
		password.sendKeys("demo.xooa");
	}
	
	
	
	// 2nd user
	public void SendtestUsername()
	{
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']")));
		 
		username.sendKeys("test4nft@gmail.com");
	}
	
	public void Sendtestpassword()
	{
		password.sendKeys("test4nft");
	}

	
	
	public void ClickOnSigninButton() 
	{
     	
		Actions act =  new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[@class='modal fade show']//button[@insp-label='Sign in']"))).click().perform();
		
		// sign_in_button.click(); 
			
	}
}

