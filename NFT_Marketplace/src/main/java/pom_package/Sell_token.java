package pom_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sell_token 
{

	WebDriver driver;
	public static  String ActualMsg;
	public static  String expectedMsg;
	
	
	 Mint_Token_Through_Marketplace  getTokenName = new Mint_Token_Through_Marketplace(driver);
	String MintedTokenName=getTokenName.Token_Name;
	
	@FindBy(xpath="//div[@id='root']//div[2]//div//nav")
	private WebElement sidebar;
	

	
	@FindBy(xpath="//div[@id='root']//div/button[@class='d-md-down-none p-0 navbar-toggler']")
	private WebElement NavigationButton;
	
	
	@FindBy(xpath="//div[@id='root']//span[text()='Marketplace']/parent::a")
	private WebElement marketplace;
	
	
	
	 String ab= "//div[@id='root']//p[@class='MuiTypography-root mb-1 monitor-card-heading MuiTypography-body2 MuiTypography-colorTextSecondary' and text()='"+MintedTokenName+"']";

	
	@FindBy(xpath="//div[@id='root']//button[text()='Back']")
	private WebElement CloseButton_on_viewToken;
	
	
	@FindBy(xpath="//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']/p[text()='Test_Token_Wed Jun 02 18:24:30 GMT 2021']//parent::div/following-sibling::button/div/div/button[text()='More']")
	private WebElement MoreButton;
	
	
	
	@FindBy(xpath="//div[@id='root']//div[@class='col']//div[@class='mb-2 mt-0 wrapword alert alert-success alert-dismissible fade show']")
	private WebElement MassageDiv;
	
	
	
	
//	@FindBy()
//	private WebElement abc;
//	@FindBy()
//	private WebElement abc;
	
	public Sell_token(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
//	public static void main(String[] args) {
//		
//		Buy_token abc= new Buy_token(null);
//		String n = abc.a;
//		System.out.println(n);
//	}
	
	public void ViewToken() throws InterruptedException
	{       Thread.sleep(3000);
			
			Mint_Token_Through_Marketplace tokenName=new Mint_Token_Through_Marketplace(driver);
			String MintedTokenName=tokenName.Token_Name;
			//System.out.println(MintedTokenName);
			
			Thread.sleep(5000);
			
			String ViewToken="//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']/p[text()='"+MintedTokenName+"']//parent::div/following-sibling::button/div/button[text()='View Token']";
			//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']/p[text()='Test_Token_Wed Jun 02 18:24:30 GMT 2021']//parent::div/following-sibling::button/div/button[text()='View Token']
		
			Actions token=new Actions(driver);
			token.moveToElement(driver.findElement(By.xpath(ViewToken)));
			
			WebElement ViewTokenButton= driver.findElement(By.xpath(ViewToken));
			
				boolean a= ViewTokenButton.isDisplayed();
				if(a=true)
				{
				System.out.println("Token with Provided name is available to buy");
				}
				
				ViewTokenButton.click();
				Thread.sleep(7000);
				
				WebDriverWait wait1 = new WebDriverWait(driver,20);
				 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='root']//button[text()='Back']")));
				
				CloseButton_on_viewToken.click();
				
				
	}
	
	public void Sell_Single_Edition_Token() throws InterruptedException 
	{
		Thread.sleep(5000);
		
		//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']/p[text()='Test_Token_Wed Jun 02 18:24:30 GMT 2021']//parent::div/following-sibling::button/div/div/button[text()='More']
				String MoreOption="//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']/p[text()='"+MintedTokenName+"']//parent::div/following-sibling::button/div/div/button[text()='More']";
				
				
				WebDriverWait wait1 = new WebDriverWait(driver,20);
				 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(MoreOption)));
				

				WebElement MoreButton= driver.findElement(By.xpath(MoreOption));
				
				MoreButton.click();
				
				Thread.sleep(3000);
				
				//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']/p[text()='Test_Token_Wed Jun 02 18:24:30 GMT 2021']//parent::div/following-sibling::button/div/div//div/button[text()='Sell Token']
				String SellOption="//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']/p[text()='"+MintedTokenName+"']//parent::div/following-sibling::button/div/div//div/button[text()='Sell Token']";
				WebElement SellTokenButton= driver.findElement(By.xpath(SellOption));
				SellTokenButton.click();
				Thread.sleep(3000);
	
				
				WebElement SellValueinput= driver.findElement(By.xpath("//div[@class='modal-content']//div[@class='input-group']/input"));
				SellValueinput.sendKeys("50");
				Thread.sleep(1500);
				
	}
	public void Click_on_submit_Button()
	{
				
				WebElement SubmitButton_ForSell= driver.findElement(By.xpath("//div[@class='modal-content']//button[text()='List']"));
				SubmitButton_ForSell.click();
				
	}
	
	public void Validate_Trasaction_massage() throws InterruptedException
	{
	
				
				 //Trasaction massage.................................
				 
				Thread.sleep(5000);
				WebDriverWait wait3 = new WebDriverWait(driver,20);
				 wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='root']//div[@class='col']//div[@class='mb-2 mt-0 wrapword alert alert-success alert-dismissible fade show']")));
				
				boolean a = MassageDiv.isDisplayed();
				Thread.sleep(4000);
//				
//				String fullmassage=MassageDiv.getText();						
//				
//				String massage1=fullmassage.substring(0, 40);					
//				
//				String massage=massage1.replaceAll("\\s", "");
				
//			 ActualMsg=massage;
//			 expectedMsg ="×TransactionProcessed,TransactionID:";
				if (a=true)
				{						
					String fullmassage=MassageDiv.getText();						
						
					String massage1=fullmassage.substring(0, 40);					
					
					String massage=massage1.replaceAll("\\s", "");
					 ActualMsg=massage;
					
					 expectedMsg ="×TransactionProcessed,TransactionID:";
							
							if(massage.equals(expectedMsg))
							{
								System.out.println("Token Sold succesfully");
							}
							else
							{
								System.out.println("Token selling test case is failed");
							}
							Thread.sleep(2000);
			}
				
				
	}
	
	
	public void Sell_Multiple_Edition_Token() throws InterruptedException 
	{
		Thread.sleep(5000);
		
		//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']/p[text()='Test_Token_Wed Jun 02 18:24:30 GMT 2021']//parent::div/following-sibling::button/div/div/button[text()='More']
				String MoreOption="//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']/p[text()='"+MintedTokenName+"']//parent::div/following-sibling::button/div/div/button[text()='More']";
				
				
				WebDriverWait wait1 = new WebDriverWait(driver,20);
				 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(MoreOption)));
				

				WebElement MoreButton= driver.findElement(By.xpath(MoreOption));
				
				MoreButton.click();
				
				Thread.sleep(3000);
				
				//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']/p[text()='Test_Token_Thu Jun 10 13:56:51 GMT 2021']//parent::div/following-sibling::button/div/div//div/button[text()='Sell All Editions']
				String SellOption="//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']/p[text()='"+MintedTokenName+"']//parent::div/following-sibling::button/div/div//div/button[text()='Sell All Editions']";
				WebElement SellTokenButton= driver.findElement(By.xpath(SellOption));
				SellTokenButton.click();
				Thread.sleep(3000);
	
				
				WebElement SellValueinput= driver.findElement(By.xpath("//div[@class='modal-content']//div[@class='input-group']/input"));
				SellValueinput.sendKeys("50");
				Thread.sleep(1500);
				
				WebElement SubmitButton_ForSell= driver.findElement(By.xpath("//div[@class='modal-content']//button[text()='List']"));
				SubmitButton_ForSell.click();
				
				 
				
				
				//Trasaction massage.................................
				
				
				
				Thread.sleep(5000);
				WebDriverWait wait3 = new WebDriverWait(driver,20);
				 wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='root']//div[@class='col']//div[@class='mb-2 mt-0 wrapword alert alert-success alert-dismissible fade show']")));
				
				 
				boolean a = MassageDiv.isDisplayed();
				Thread.sleep(2000);
				if (a=true)
				{
					String fullmassage=MassageDiv.getText();						
					
					String massage1=fullmassage.substring(0, 40);					
					
					String massage=massage1.replaceAll("\\s", "");
					 ActualMsg=massage;
					
					 expectedMsg ="×TransactionProcessed,TransactionID:";
							
							if(massage.equals(expectedMsg))
							{
								System.out.println("Edition Sold succesfully");
							}
							else
							{
								System.out.println("Edition selling test case is failed");
							}
							Thread.sleep(2000);
				}
				
				
	}
}
