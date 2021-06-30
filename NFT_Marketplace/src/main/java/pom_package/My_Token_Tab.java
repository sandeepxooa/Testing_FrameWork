package pom_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class My_Token_Tab
{
WebDriver driver;
	
	public static String Actualmsg;
	public static String expectedMsg ;
	
	
	
//	@FindBy(xpath="(//div[@id='root']//a[@class='nav-link nav-link'])[1]")
//	private WebElement My_Token_navigation_button;
	
	@FindBy(xpath="(//div[@class='container-fluid']//div[@class='row'])[1]")
	private WebElement MyToken_container;
	
	@FindBy(xpath="//div[@id='root']//div[@class='col']//div[@class='mb-2 mt-0 wrapword alert alert-success alert-dismissible fade show']")
	private WebElement MassageDiv;
	
	@FindBy(xpath="(//div[@id='root']//span[text()='NFT Wallet']/parent::a)[1]")
	private WebElement My_Token_navigation_button;
	
	
	
//	@FindBy(xpath=name)
//	private WebElement tempToken ;
	
	//WebElement token1= driver.findElement(By.name(Tname));
	
	//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']/p[text()='Test_Token_Wed Jun 02 18:24:30 GMT 2021']
	
	
	public My_Token_Tab(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	public void Validate_Success_massage_on_minting() throws InterruptedException 
	{    
		Thread.sleep(10000);
		WebDriverWait wait1 = new WebDriverWait(driver,20);
		 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='root']//div[@class='col']//div[@class='mb-2 mt-0 wrapword alert alert-success alert-dismissible fade show']")));
		
	 
		 
		boolean a = MassageDiv.isDisplayed();
		Thread.sleep(2000);
		
		if (a=true)
		{
				System.out.println("massage "+a);
				String massage=MassageDiv.getText();
				
			System.out.println(massage);
				
			String newmassage=massage.substring(0, 44);
			String newmassage1=newmassage.replaceAll("\\s", "");
			
			Actualmsg=newmassage1;
			expectedMsg ="×TokenMintedSuccessfully.TransactionID:";
					
					if(newmassage1.equals(expectedMsg))
					{
						System.out.println("Succesfull massage has generated and Token minting TestCase is Passed");
					}
					else
					{
						System.out.println("Token minting test case is failed");
					}
					Thread.sleep(2000);
		}

	}
	
	
	
	
	public void ValidateTokenInMyToken() throws InterruptedException
	{       Thread.sleep(3000);
	WebDriverWait wait = new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='root']//span[text()='NFT Wallet']/parent::a)[1]")));
	Actions act1 =  new Actions(driver);
	act1.moveToElement(driver.findElement(By.xpath("(//div[@id='root']//span[text()='NFT Wallet']/parent::a)[1]"))).click().perform();
		
      	My_Token_navigation_button.click();
      	
			Mint_Token_Through_Marketplace tokenName=new Mint_Token_Through_Marketplace(driver);
			String MintedTokenName=tokenName.Token_Name;
			System.out.println(MintedTokenName);
			
			Thread.sleep(7000);
			
			
			
			String Tname="//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']//p/span[text()='"+MintedTokenName+"']";

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Tname)));
			
			WebElement token1= driver.findElement(By.xpath(Tname));
			
			 
			Actions token=new Actions(driver);
			token.moveToElement(driver.findElement(By.xpath(Tname)));
			
			
				boolean a= token1.isDisplayed();
				if(a=true)
				{
				System.out.println("Token with Provided name is available");
				}
				
	}
	
	
}
