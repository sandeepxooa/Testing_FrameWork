package POM_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Buy_Token_From_MarketPlace {
	WebDriver driver;

			@FindBy(xpath="//div[@id='root']//div/button[@class='d-md-down-none p-0 navbar-toggler']")
			private WebElement NavigationButton;
			
			
			@FindBy(xpath="//div[@id='root']//span[text()='General Market']/parent::a")
			private WebElement General_Market;

	
	
	
	public Buy_Token_From_MarketPlace(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	
	
	
			public void Click_on_Navigation_Button()
			{
				NavigationButton.click();
			}
	        
			
			
			public void Click_on_GeneralMarket_Button() throws InterruptedException
			{
				Thread.sleep(10000);

				
				 General_Market.click();
				
				Thread.sleep(10000);
			}
			
		  
			public void Buy_Token_of_single_Edition() throws InterruptedException
			{
				
					
					Mint_Token_Through_Marketplace tokenName=new Mint_Token_Through_Marketplace(driver);
					String MintedTokenName=tokenName.Token_Name;
					//System.out.println(MintedTokenName);
					
					Thread.sleep(5000);
					
					String BuyOption="//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']/p[text()='"+MintedTokenName+"']//parent::div/following-sibling::button/div/button[text()='Buy']";
					//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']/p[text()='Test_Token_Thu Jun 03 15:56:10 GMT 2021']//parent::div/following-sibling::button/div/button[text()='Buy']
				
					WebDriverWait wait1 = new WebDriverWait(driver,20);
					 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BuyOption)));
					
					Actions token=new Actions(driver);
					token.moveToElement(driver.findElement(By.xpath(BuyOption)));
					
					WebElement BuyTokenButton= driver.findElement(By.xpath(BuyOption));
					
						boolean a= BuyTokenButton.isDisplayed();
						if(a=true)
						{
						System.out.println("Token with Provided name is available to buy on Marketplace");
						}
						
						BuyTokenButton.click();
						
						Thread.sleep(3000);
						
						WebElement Buy= driver.findElement(By.xpath("//div[@class='modal fade show']//button[text()='Buy']"));
						Buy.click();
						
						Thread.sleep(3000);
						
//						WebElement SellValue= driver.findElement(By.xpath("(//div[@class='modal-content']//div[@ref='element'])[3]/child::div/input"));
//						SellValue.sendKeys("50");
						
						
						WebDriverWait wait = new WebDriverWait(driver,20);
						 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='modal-content'])[2]//input[@id='name']")));
						
						
						WebElement BuyerName_onPaymentModal= driver.findElement(By.xpath("(//div[@class='modal-content'])[2]//input[@id='name']"));
						Thread.sleep(1000);
						BuyerName_onPaymentModal.clear();
						BuyerName_onPaymentModal.sendKeys("Demo.xooa");	
						
						WebElement BuyerEmail_onPaymentModal= driver.findElement(By.xpath("(//div[@class='modal-content'])[2]//input[@id='email']"));
						Thread.sleep(1000);
						BuyerEmail_onPaymentModal.clear();
						BuyerEmail_onPaymentModal.sendKeys("demo.xooa@gmail.com");	
						
								
						WebElement BuyerNumber_onPaymentModal= driver.findElement(By.xpath("(//div[@class='modal-content'])[2]//input[@id='phone']"));
						BuyerNumber_onPaymentModal.clear();
						Thread.sleep(1000);
						BuyerNumber_onPaymentModal.sendKeys("9999999999");	
						
						
//						
////						//Switching to iframe
//						WebElement iframe= driver.findElement(By.xpath("//div[@class='modal-content']//iframe[@name='__privateStripeFrame78026']"));
//						driver.switchTo().frame(iframe)	;
////						
////						WebElement CardNumber= driver.findElement(By.xpath("((//div[@class='modal-content'])[2]//input)[4]"));
////						CardNumber.sendKeys("4242424242424242");
////						Thread.sleep(2000);
////						
////						CardNumber.sendKeys("4242424242424242");
//						
////						WebElement ExpiryDate= driver.findElement(By.xpath("//*[@id="root"]/form/div/div[2]"));
////						ExpiryDate.sendKeys("0424");	
////						
//						WebElement Cv= driver.findElement(By.xpath("(//div[@class='CardField-input-wrapper is-ready-to-slide']//input)[3]"));
//						Cv.sendKeys("4242424242424242");	
////						
////						WebElement Zipcode= driver.findElement(By.xpath("(//div[@class='CardField-input-wrapper is-ready-to-slide']//input)[4]"));
////						Zipcode.sendKeys("42424");	
////						
//						Thread.sleep(2000);
//						
//     					WebElement Authorize_Charge= driver.findElement(By.xpath("//button[text()=' Authorize Charge']"));
//     					Authorize_Charge.click();
						
						//driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/div/div/div[2]/div/div/iframe")));
						//div[@class='CardField-input-wrapper is-ready-to-slide']//div//input
//						WebElement creditcardNumber = driver.findElement(By.className("InputElement is-empty Input Input--empty"));
//						creditcardNumber.sendKeys("4242424242424242");
						
						Thread.sleep(2000);
						
//						WebElement CardNumber1= driver.findElement(By.tagName("iframe"));					
//						System.out.println("iframe "+CardNumber1.isDisplayed());
						
						
						//get iframe count
						int size = driver.findElements(By.tagName("iframe")).size();
						System.out.println("iframes available on page are "+size);
						
						
						//Switching to iframe
						int requiredIndexOfFrame= size-1;
						Thread.sleep(1000);
						driver.switchTo().frame(requiredIndexOfFrame);
						Thread.sleep(1000);
						
						WebElement CardNumber= driver.findElement(By.xpath("//*[@placeholder='Card number']"));	
						System.out.println("CardNumber Element is " + CardNumber.isDisplayed());
						
						CardNumber.sendKeys("4242424242424242");
						
//						boolean g= CardNumber.isDisplayed();
//						System.out.println("iFrame"+g);
//						Thread.sleep(1000);
						
						WebElement ExpiryDate= driver.findElement(By.xpath("//*[@name='exp-date']"));
   				    	ExpiryDate.sendKeys("0424");	
   				    	
   				    	WebElement cvc= driver.findElement(By.xpath("//*[@name='cvc']"));
   				    	cvc.sendKeys("42442424");
//						
//						WebElement Zipcode= driver.findElement(By.xpath("//*[@name='cvc']"));
//						Zipcode.sendKeys("42424");	
						
//						Thread.sleep(2000);
						driver.switchTo().defaultContent();

						

     					WebElement Authorize_Charge_Button= driver.findElement(By.xpath("//*//button[text()=' Authorize Charge']"));
     					Authorize_Charge_Button.click();
						
						
     					
						
						
			}
			
			
			
			
	public void Buy_Token_of_Multiple_Edition() throws InterruptedException
		{
				
					
					Mint_Token_Through_Marketplace tokenName=new Mint_Token_Through_Marketplace(driver);
					String MintedTokenName=tokenName.Token_Name;
					//System.out.println(MintedTokenName);
					
					Thread.sleep(5000);
					
					String BuyOption="//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']/p[text()='"+MintedTokenName+"']//parent::div/following-sibling::button/div/button[text()='Buy Edition']";
					//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']/p[text()='Test_Token_Thu Jun 10 14:45:14 GMT 2021']//parent::div/following-sibling::button/div/button[text()='Buy Edition']
				
					WebDriverWait wait1 = new WebDriverWait(driver,20);
					 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BuyOption)));
					
					Actions token=new Actions(driver);
					token.moveToElement(driver.findElement(By.xpath(BuyOption)));
					
					WebElement BuyTokenButton= driver.findElement(By.xpath(BuyOption));
					
						boolean a= BuyTokenButton.isDisplayed();
						if(a=true)
						{
						System.out.println("Token with Provided name is available to buy on Marketplace");
						}
						
						BuyTokenButton.click();
						
						Thread.sleep(5000);
						WebDriverWait wait = new WebDriverWait(driver,20);
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal fade show']//div[@ref='react-e5idt2t']//div[text()='1']/parent::div//parent::div//button")));

						
						WebElement Buyedition= driver.findElement(By.xpath("//div[@class='modal fade show']//div[@ref='react-e5idt2t']//div[text()='1']/parent::div//parent::div//button"));
						Buyedition.click();
						
						Thread.sleep(2000);
						
						WebElement Buy= driver.findElement(By.xpath("//div[@class='modal fade show']//div[@class='modal-footer']//button[text()='Buy']"));
						Buy.click();
						
						Thread.sleep(2000);
						
//						WebElement SellValue= driver.findElement(By.xpath("(//div[@class='modal-content']//div[@ref='element'])[3]/child::div/input"));
//						SellValue.sendKeys("50");
						
						
						WebDriverWait wait2 = new WebDriverWait(driver,20);
						 wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='modal-content'])[2]//input[@id='name']")));
						
						
						WebElement BuyerName_onPaymentModal= driver.findElement(By.xpath("(//div[@class='modal-content'])[2]//input[@id='name']"));
						BuyerName_onPaymentModal.clear();
						BuyerName_onPaymentModal.sendKeys("Demo.xooa");	
						
						WebElement BuyerEmail_onPaymentModal= driver.findElement(By.xpath("(//div[@class='modal-content'])[2]//input[@id='email']"));
						BuyerEmail_onPaymentModal.clear();
						BuyerEmail_onPaymentModal.sendKeys("demo.xooa@gmail.com");	
						
								
						WebElement BuyerNumber_onPaymentModal= driver.findElement(By.xpath("(//div[@class='modal-content'])[2]//input[@id='phone']"));
						BuyerNumber_onPaymentModal.clear();
						BuyerNumber_onPaymentModal.sendKeys("9999999999");	
						
						
						
//						//Switching to iframe
//						WebElement iframe= driver.findElement(By.xpath("//iframe[@name='__privateStripeMetricsController8620']"));
//						driver.switchTo().frame(iframe)	;
						
						WebElement CardNumber= driver.findElement(By.xpath("((//div[@class='modal-content'])[2]//input)[4]"));
						CardNumber.sendKeys("4242424242424242");
						Thread.sleep(2000);
						
						CardNumber.sendKeys("4242424242424242");
						
//						WebElement ExpiryDate= driver.findElement(By.xpath("//*[@id="root"]/form/div/div[2]"));
//						ExpiryDate.sendKeys("0424");	
//						
						WebElement Cv= driver.findElement(By.xpath("(//div[@class='CardField-input-wrapper is-ready-to-slide']//input)[3]"));
						Cv.sendKeys("4242424242424242");	
//						
//						WebElement Zipcode= driver.findElement(By.xpath("(//div[@class='CardField-input-wrapper is-ready-to-slide']//input)[4]"));
//						Zipcode.sendKeys("42424");	
//						
						Thread.sleep(2000);
						
     					WebElement Authorize_Charge= driver.findElement(By.xpath("//button[text()=' Authorize Charge']"));
     					Authorize_Charge.click();
						
		}
	
	
	
	
	
}
