package pom_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Delist_Token {


	WebDriver driver;
	
	
	Mint_Token_Through_Marketplace  getTokenName = new Mint_Token_Through_Marketplace(driver);
	String MintedTokenName=getTokenName.Token_Name;
	
	
	@FindBy(xpath="(//div[@class='container-fluid']//div[@class='row'])[1]")
	private WebElement MyToken_container;
	
	@FindBy(xpath="(//div[@id='root']//span[text()='NFT Wallet']/parent::a)[1]")
	private WebElement My_Token_navigation_button;
	
	@FindBy(xpath="//div[@id='root']//div[@class='col']//div[@class='mb-2 mt-0 wrapword alert alert-success alert-dismissible fade show']")
	private WebElement MassageDiv;
	
	
	
	
	public Delist_Token(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	
	
	public void Click_on_MyToken_Naviagtion()
	{
//		WebDriverWait wait1 = new WebDriverWait(driver,20);
//		 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='container-fluid']//div[@class='row'])[1]")));
//		MyToken_container.click();
		
		
		WebDriverWait wait2 = new WebDriverWait(driver,20);
		 wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='root']//span[text()='NFT Wallet']/parent::a)[1]")));
		My_Token_navigation_button.click();
		
	}
	
	
	public void Delist_Token() throws InterruptedException
	{
		
		
     Thread.sleep(7000);
		
		//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']//p/span[text()='Test_Token_Wed Jun 02 18:24:30 GMT 2021']//ancestor::div/following-sibling::button/div/div/button[text()='More']
				String MoreOption="//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']//p/span[text()='"+MintedTokenName+"']//ancestor::div/following-sibling::button/div/div/button[text()='More']";
				
				
				WebDriverWait wait1 = new WebDriverWait(driver,20);
				 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(MoreOption)));
				

				WebElement MoreButton= driver.findElement(By.xpath(MoreOption));
				
				MoreButton.click();
				
				
        Thread.sleep(5000);
		
      //div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']//p/span[text()='Test_Token_Thu Jun 10 18:00:13 GMT 2021']//ancestor::div/following-sibling::button/div/div//div/button[text()='Delist Token']
				String Delist="//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']//p/span[text()='"+MintedTokenName+"']//ancestor::div/following-sibling::button/div/div//div/button[text()='Delist Token']";
				
				
				WebDriverWait wait2 = new WebDriverWait(driver,20);
				 wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Delist)));
				

				
				
				
				//String DelistBI="(//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']/p[text()='"+MintedTokenName+"']//parent::div/following-sibling::button/div/div/button)[1]";

				
				
				Actions act =  new Actions(driver);
				act.moveToElement(driver.findElement(By.xpath(Delist))).click().perform();
					
				//DelistTokenBI.click();
				
				Thread.sleep(3000);
				

				WebElement DelistToken= driver.findElement(By.xpath("//div[@class='modal-content']//button[text()='Delist']"));
				
				DelistToken.click();
				
				
				
				
				
				Thread.sleep(5000);
				WebDriverWait wait3 = new WebDriverWait(driver,20);
				 wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='root']//div[@class='col']//div[@class='mb-2 mt-0 wrapword alert alert-success alert-dismissible fade show']")));
				
			 
				 
				boolean a = MassageDiv.isDisplayed();
				Thread.sleep(2000);
				
				if (a=true)
				{
						System.out.println("massage "+a);
						String massage=MassageDiv.getText();
						
					System.out.println(massage);
						
					String newmassage=massage.substring(0, 57);
					
					System.out.println(newmassage);
					String newmassage1=newmassage.replaceAll("\\s", "");
					
					String expectedMsg ="×SuccessfullyDelistedFromMarketplace.TransactionID:";
							
							if(newmassage1.equals(expectedMsg))
							{
								System.out.println("Token Dilisted succesfully");
							}
							else
							{
								System.out.println("Token Dilisting test case is failed");
							}
							Thread.sleep(2000);
				}
	}



	
	
	
	public void Delist_AllEditions() throws InterruptedException
	{
		
		
     Thread.sleep(7000);
		
		//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']//p/span[text()='Test_Token_Wed Jun 02 18:24:30 GMT 2021']//ancestor::div/following-sibling::button/div/div/button[text()='More']
				String MoreOption="//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']//p/span[text()='"+MintedTokenName+"']//ancestor::div/following-sibling::button/div/div/button[text()='More']";
				
				
				WebDriverWait wait1 = new WebDriverWait(driver,20);
				 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(MoreOption)));
				

				WebElement MoreButton= driver.findElement(By.xpath(MoreOption));
				
				MoreButton.click();
				
				
        Thread.sleep(5000);
		
      //div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']//p/span[text()='Test_Token_Tue Jun 29 22:14:14 GMT 2021']//ancestor::div/following-sibling::button/div/div//div/button[text()='Delist All Editions']
				String Delist="//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']//p/span[text()='"+MintedTokenName+"']//ancestor::div/following-sibling::button/div/div//div/button[text()='Delist All Editions']";
				
				
				WebDriverWait wait2 = new WebDriverWait(driver,20);
				 wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Delist)));
				

				
				
				
				//String DelistBI="(//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']/p[text()='"+MintedTokenName+"']//parent::div/following-sibling::button/div/div/button)[1]";

				
				
				Actions act =  new Actions(driver);
				act.moveToElement(driver.findElement(By.xpath(Delist))).click().perform();
					
				//DelistTokenBI.click();
				
				Thread.sleep(3000);
				

				WebElement DelistToken= driver.findElement(By.xpath("//div[@class='modal-content']//button[text()='Delist']"));
				
				DelistToken.click();
				
				
				
				
				
				Thread.sleep(5000);
				WebDriverWait wait3 = new WebDriverWait(driver,20);
				 wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='root']//div[@class='col']//div[@class='mb-2 mt-0 wrapword alert alert-success alert-dismissible fade show']")));
				
			 
				 
				boolean a = MassageDiv.isDisplayed();
				Thread.sleep(2000);
				
				if (a=true)
				{
						System.out.println("massage "+a);
						String massage=MassageDiv.getText();
						
					System.out.println(massage);
						
					String newmassage=massage.substring(0, 57);
					
					System.out.println(newmassage);
					String newmassage1=newmassage.replaceAll("\\s", "");
					
					String expectedMsg ="×SuccessfullyDelistedFromMarketplace.TransactionID:";
							
							if(newmassage1.equals(expectedMsg))
							{
								System.out.println("Token Dilisted succesfully");
							}
							else
							{
								System.out.println("Token Dilisting test case is failed");
							}
							Thread.sleep(2000);
				}
	}
}
