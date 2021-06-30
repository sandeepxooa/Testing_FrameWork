package pom_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gift_Token 
{
	WebDriver driver;
	
	Mint_Token_Through_Marketplace  getTokenName = new Mint_Token_Through_Marketplace(driver);
	String MintedTokenName=getTokenName.Token_Name;

	@FindBy(xpath="//div[@id='root']//div[@class='custom-header']//a[@class='nav-link']")
	private WebElement ProfileLink;
	
	@FindBy(xpath="(//div[@id='root']//span[text()='NFT Wallet']/parent::a)[1]")
	private WebElement My_Token_navigation_button;
	
	
	@FindBy(xpath="(//div[@id='root']//span[text()='NFT Wallet']/parent::a)[1]")
	private WebElement WalletAddressInputField;
	
	
	@FindBy(xpath="//div[@class='modal-content']//button[text()='Gift']")
	private WebElement GiftButtonOnModal;
	
	public Gift_Token(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	public void Click_on_NFT_Wallet_tab()
	{
		My_Token_navigation_button.click();
	}
	
	public void Click_on_more_Button() throws InterruptedException
	{
		  Thread.sleep(5000);
			
			//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']//p/span[text()='Test_Token_Wed Jun 02 18:24:30 GMT 2021']//ancestor::div/following-sibling::button/div/div/button[text()='More']
					String MoreOption="//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']//p/span[text()='"+MintedTokenName+"']//ancestor::div/following-sibling::button/div/div/button[text()='More']";
					
					
					WebDriverWait wait1 = new WebDriverWait(driver,20);
					 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(MoreOption)));
					

					WebElement MoreButton= driver.findElement(By.xpath(MoreOption));
					
					MoreButton.click();
	}
	
	
	
	public void Click_on_Gift_Option_onToken() throws InterruptedException
	{
		Thread.sleep(1000);
		
		String gift="//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']//p/span[text()='"+MintedTokenName+"']//ancestor::div/following-sibling::button/div/div//div/button[text()='Gift']";
		
		WebDriverWait wait1 = new WebDriverWait(driver,20);
		 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(gift)));
	
		 
		 WebElement GiftButton= driver.findElement(By.xpath(gift));
			
		 GiftButton.click();
	}
	
	
	public void Insert_WalletAddress() throws InterruptedException
	{  Thread.sleep(1000);
	WebDriverWait wait1 = new WebDriverWait(driver,20);
	 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-content']//button[text()='Gift']")));
		
	 
	 Actions act =  new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[@class='modal-content']//button[text()='Gift']")));
	 WalletAddressInputField.sendKeys("eDUwOTo6Q049YWZkZjc4YTAtYjk3YS00ODdlLThmYmItYWY4ZTNlOTM4MTAxLE9VPWNsaWVudCtPVT1vcmcxK09VPWlzeGhiNnkwZWtjbmV0eGt0NGc6OkNOPWNhLnBlZXJzLmNsdXN0ZXIxLmF3cy54b29hLmNvbSxPPXBlZXJzLmNsdXN0ZXIxLmF3cy54b29hLmNvbSxMPVNhbiBGcmFuY2lzY28sU1Q9Q2FsaWZvcm5pYSxDPVVT");
	}
	
	
	public void Click_on_GiftButton_onModal() throws InterruptedException
	{   Thread.sleep(1000);
		 
		GiftButtonOnModal.click();
	}
	

}
