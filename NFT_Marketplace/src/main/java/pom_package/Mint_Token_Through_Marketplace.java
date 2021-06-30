package pom_package;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mint_Token_Through_Marketplace {


	WebDriver driver;
	
    static String Token_Name;
    static String errorMassageOn_MintingModal;
    static String RequiredMssgeTextOn_MintingModal;
	
	
	
	@FindBy(xpath="//div[@id='root']//div[2]//div//nav")
	private WebElement sidebar;
	

	@FindBy(xpath="//div[@id='root']//div/button[@class='d-md-down-none p-0 navbar-toggler']")
	private WebElement NavigationButton;
	
	
	@FindBy(xpath="//div[@id='root']//span[text()='Marketplace']/parent::a")
	private WebElement marketplace;
	
	@FindBy(xpath="//div[@id='root']//child::button[text()='Mint Token']")
	private WebElement MintTokenButton;
	
	
	@FindBy(xpath="//div[@id='root']//child::button[text()='Mint Collectible']")
	private WebElement MintCollectableButton;
	
	
	@FindBy(xpath="//div[@class='modal fade show']")
	private WebElement MintTokenModal;
	
	@FindBy(xpath="//div[@class='modal fade show']//div/a[@class='browse']")
	private WebElement Browselink;
	
	@FindBy(xpath="//div[@class='modal fade show']//input[@id='eertku-properties.name']")
	private WebElement TokenName;
	
	
	
	
	
	
	@FindBy(xpath="//div[@class='modal fade show']//input[@id='emnf4gm-Art']")
	private WebElement ArtCheckbox;
	
	
	//         (//div[@class='modal fade show']//div[@ref='element' ])[3]//input
	@FindBy(xpath="(//div[@class='modal fade show']//input)[2]")
	private WebElement EditionTab;
	
	
	//(//div[@class='modal fade show']//div[6]/preceding-sibling::div//child::input)[2]
	@FindBy(xpath="(//div[@class='modal fade show']//input)[4]")
	private WebElement TradingCheckbox;
	
	@FindBy(xpath="(//div[@class='modal fade show']//textarea[@id='ez0ploe-properties.artistDetails']")
	private WebElement ArtistDetails;
	
	
	@FindBy(xpath="(//div[@class='modal fade show']//textarea[@id='eszi8fo-properties.description']")
	private WebElement TokenDetails;
	
	//div[@class='modal fade show']//textarea[@id='eszi8fo-properties.description']
	@FindBy(xpath="//div[@class='modal fade show']//button[@class='btn btn-primary']")
	private WebElement MintButton;
	
	@FindBy(xpath="//div[@class='form-group has-feedback formio-component formio-component-file formio-component-properties.asset  required']")
	private WebElement Imagemodule;
	
	//div[@class='modal fade show']//a[@href='#royaltiesSelling']
	@FindBy(xpath="(//div[@class='modal fade show']//a[@href='#royaltiesSelling']")
	private WebElement SellingAndOwnershipLink;
	
	
	@FindBy(xpath="(//div[@class='modal fade show']//input)[16]")
	private WebElement No_Radio_button_For_Sell_option;
	
	
	@FindBy(xpath="//div[@role='alert']")
	private WebElement ErrorMassageDivOnMintingModule;
	
	
//			@FindBy(xpath="(@FindBy(xpath=\"(//div[@class='modal fade show']//input)[2]\")\r\n"
//					+ "	private WebElement EditionTab;")
//			private WebElement SellingAndOwnershipLink;
//	
	
	//div[@class="modal fade show"]//div[6]/preceding-sibling::div
	
	
	
//	@FindBy(xpath="//div[@id='root']//div[2]//div/nav")
//	private WebElement MintToken;
//	//button[@type='button' and text()='Mint Token']
//	
//	@FindBy(xpath="//div[@id='root']")
//	private WebElement MintToken;
//	
	@FindBy(xpath="(//div//div/div[@class='custom-header'])")
	private WebElement body;
//	@FindBy(xpath="//button[@type='button' and text()='Mint Token']")
//	private WebElement MintTokenButton;
	
//	//span[@class='hidden-cn' and text()='My Tokens']
//	@FindBy(xpath="//button[@type='button' and text()='Mint Token']")
//	private WebElement MintTokenButton;
	
//	WebElement togle =driver.findElemen(ByXPath("//*[@class='d-lg-none p-0 navbar-toggler']"));
	
	
	
	
	
	public Mint_Token_Through_Marketplace(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
//	public void click_on_myToken() throws InterruptedException
//	{
//		
//		 
//		Set<String> ab = driver.getWindowHandles();
//		System.out.println(ab);
//		Thread.sleep(3000);
//		MintToken.isDisplayed();
//		System.out.println(MintToken.isDisplayed());
//		MintToken.click();
//		String m=MintToken.getText();
//		System.out.println(m);
//		
//	if(a=true) 
//		{
//			Thread.sleep(3000);
//			Togle.click();
//		}
//		else
//		{
//			
//		}
//	    }
//	
//	public void click_on_MintToken()
//	{
//		MintTokenButton.click();
//		
//	}
	
	
	
public void checkSideBar() throws InterruptedException 
	{
	WebDriverWait wait1 = new WebDriverWait(driver,20);
	 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='root']//child::button[text()='Mint Collectible']")));
	
	Thread.sleep(3000);
		boolean sidebarResult=sidebar.isDisplayed();
		
		
		System.out.println("sidebar"+sidebarResult);
		System.out.println("Marketplace"+marketplace.isDisplayed());
		System.out.println("NavButton"+NavigationButton.isDisplayed());
		
		
		if(sidebarResult=true)
		{
			marketplace.click();
			System.out.println("Clicked on mp");
		}
		else 
		{
			NavigationButton.click();
			System.out.println("NavButton");
			Thread.sleep(2000);
			
			marketplace.click();
			System.out.println("Clicked on mp");
			
		}
		
		System.out.println("marketplace "+marketplace.isSelected());
	Thread.sleep(5000);
	
	WebDriverWait wait = new WebDriverWait(driver,20);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='root']//child::button[text()='Mint Token']")));
		System.out.println("MintTokenButton "+MintTokenButton.isDisplayed());
		MintTokenButton.click();
		
		
		
		
		
		
		
		
	}



public void MintSingleTokenFromMarketplace_OneCategory() throws InterruptedException, AWTException

	{   
	WebDriverWait wait1 = new WebDriverWait(driver,20);
	 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='root']//child::button[text()='Mint Collectible']")));
				     Thread.sleep(5000);
	
					  MintCollectableButton.click();

//					MintTokenButton.click();
					  Thread.sleep(3000);
					boolean validateModal =Browselink.isDisplayed();
				
				
					 LocalDateTime timestamp = LocalDateTime.now();
					    DateTimeFormatter gmtDateTimeFormatter = DateTimeFormatter.ofPattern("EE MMM dd HH:mm:ss 'GMT' yyyy", Locale.ENGLISH);
					    String time = gmtDateTimeFormatter.format(timestamp); 
					     Token_Name= "Test_Token_"+time;
					    
					    System.out.println(Token_Name);
					    
//				   SimpleDateFormat formatter = new SimpleDateFormat("dd-MM HH-mm");  
//				   Date date = new Date();  	     
//				   String str1 =formatter.format(date);
//				   Token_Name= "Test_Token"+str1;
				   
					TokenName.sendKeys(Token_Name);
					//EditionTab.clear();
					Thread.sleep(500);
					//EditionTab.sendKeys("4");
					TradingCheckbox.click();
					
					ArtCheckbox.click();
					
					Browselink.click();
					Thread.sleep(2000);
					
//				UploadFile_to_mint_token upld =new UploadFile_to_mint_token();
//					
//				upld.uploadFile("C:\\Users\\xooa\\Desktop\\Images for minting\\th (1).jpg");
					
//					String ImagePath=("user.home") + File.separator + "Assets_to_mint" + 
//							File.separator + "Image.jpg";
//					 StringSelection ss = new StringSelection(ImagePath);
				
					
					String root = System.getProperty("user.dir");
					String filepath = File.separator+"Assets_to_mint"+File.separator+"Image.jpg"; 
					String abspath = root+filepath;
					System.out.println(abspath);
					
					 StringSelection ss = new StringSelection(abspath);
					
				//	StringSelection ss = new StringSelection("C:\\Users\\xooa\\eclipse-workspace\\Xooa_NFT\\src\\test\\resources\\Image_to_Mint\\th (1).jpg");
				     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

				     
				     Robot robot = new Robot();
				     robot.delay(250);
				     robot.keyPress(KeyEvent.VK_ENTER);
				     robot.keyRelease(KeyEvent.VK_ENTER);
				     robot.keyPress(KeyEvent.VK_CONTROL);
				     robot.keyPress(KeyEvent.VK_V);
				     robot.keyRelease(KeyEvent.VK_V);
				     robot.keyRelease(KeyEvent.VK_CONTROL);
				     robot.keyPress(KeyEvent.VK_ENTER);
				     robot.delay(90);
				     robot.keyRelease(KeyEvent.VK_ENTER);
					
					Thread.sleep(10000);
					Actions act =  new Actions(driver);
					act.moveToElement(driver.findElement(By.xpath("//div[@class='modal fade show']//a[@href='#royaltiesSelling']"))).click().perform();
						
					//SellingAndOwnershipLink.click();
					No_Radio_button_For_Sell_option.click();
					
					
					Thread.sleep(3000);
					//SellingAndOwnershipLink.click();
					
					//Thread.sleep(3000);
					
					//MintButton..............
						Actions act1 =  new Actions(driver);
						act1.moveToElement(driver.findElement(By.xpath("//div[@class='modal fade show']//button[@class='btn btn-primary']"))).click().perform();
							
					//MintButton.click();
					
					Thread.sleep(2000);
				
	
}


public void MintSingleTokenFromMarketplace_OneCategory_without_TokenName() throws InterruptedException, AWTException

{   
WebDriverWait wait1 = new WebDriverWait(driver,20);
 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='root']//child::button[text()='Mint Collectible']")));
			     Thread.sleep(5000);

				  MintCollectableButton.click();

//				MintTokenButton.click();
				  Thread.sleep(3000);
				boolean validateModal =Browselink.isDisplayed();
			
			
				 
				    
//			   SimpleDateFormat formatter = new SimpleDateFormat("dd-MM HH-mm");  
//			   Date date = new Date();  	     
//			   String str1 =formatter.format(date);
//			   Token_Name= "Test_Token"+str1;
			   
				
				//EditionTab.clear();
				Thread.sleep(500);
				//EditionTab.sendKeys("4");
				TradingCheckbox.click();
				
				ArtCheckbox.click();
				
				Browselink.click();
				Thread.sleep(2000);
				
//			UploadFile_to_mint_token upld =new UploadFile_to_mint_token();
//				
//			upld.uploadFile("C:\\Users\\xooa\\Desktop\\Images for minting\\th (1).jpg");
				
//				String ImagePath=("user.home") + File.separator + "Assets_to_mint" + 
//						File.separator + "Image.jpg";
//				 StringSelection ss = new StringSelection(ImagePath);
			
				
				String root = System.getProperty("user.dir");
				String filepath = File.separator+"Assets_to_mint"+File.separator+"Image.jpg"; 
				String abspath = root+filepath;
				System.out.println(abspath);
				
				 StringSelection ss = new StringSelection(abspath);
				
				//StringSelection ss = new StringSelection("C:\\Users\\xooa\\eclipse-workspace\\Xooa_NFT\\src\\test\\resources\\Image_to_Mint\\th (1).jpg");
			     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

			     
			     Robot robot = new Robot();
			     robot.delay(250);
			     robot.keyPress(KeyEvent.VK_ENTER);
			     robot.keyRelease(KeyEvent.VK_ENTER);
			     robot.keyPress(KeyEvent.VK_CONTROL);
			     robot.keyPress(KeyEvent.VK_V);
			     robot.keyRelease(KeyEvent.VK_V);
			     robot.keyRelease(KeyEvent.VK_CONTROL);
			     robot.keyPress(KeyEvent.VK_ENTER);
			     robot.delay(90);
			     robot.keyRelease(KeyEvent.VK_ENTER);
				
				Thread.sleep(10000);
				Actions act =  new Actions(driver);
				act.moveToElement(driver.findElement(By.xpath("//div[@class='modal fade show']//a[@href='#royaltiesSelling']"))).click().perform();
					
				//SellingAndOwnershipLink.click();
				No_Radio_button_For_Sell_option.click();
				
				
				Thread.sleep(3000);
				//SellingAndOwnershipLink.click();
				
				//Thread.sleep(3000);
				
				
					Actions act1 =  new Actions(driver);
					act1.moveToElement(driver.findElement(By.xpath("//div[@class='modal fade show']//button[@class='btn btn-primary']"))).click().perform();
						
				//MintButton.click();
					
					Actions act2 =  new Actions(driver);
					act2.moveToElement(driver.findElement(By.xpath("//div[@role='alert']")));
					
					WebElement massge =driver.findElement(By.xpath("//div[@role='alert']"));
					String errorMassageOn_MintingModal= massge.getText();

					//String errorMassageOn_MintingModal= ErrorMassageDivOnMintingModule.getText();
					
					
					System.out.println(ErrorMassageDivOnMintingModule.isDisplayed());
					System.out.println(errorMassageOn_MintingModal);
					  
					String RequiredMssgeTextOn_MintingModal="Error with submission data, please fix all validation errors.";
	               
					//System.out.println(RequiredMssgeTextOn_MintingModal);
					
					if (errorMassageOn_MintingModal.equals(RequiredMssgeTextOn_MintingModal))
					{
						System.out.println("Displying correct error massage");
					}
					
					Thread.sleep(1000);
					Actions act3 =  new Actions(driver);
					act3.moveToElement(driver.findElement(By.xpath("//button[text()='Close']"))).click().perform();;
//  WebElement closeButton =driver.findElement(By.xpath("//button[text()='Close']"));
//  closeButton.click();
					
  



}






public  void MintMultipleEditionTokenFromMarketplace_OneCategory() throws InterruptedException, AWTException
  	 {
	 
	
	WebDriverWait wait1 = new WebDriverWait(driver,20);
	 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='root']//child::button[text()='Mint Collectible']")));
				     Thread.sleep(5000);
	
					  MintCollectableButton.click();

//					MintTokenButton.click();
					  Thread.sleep(3000);
					boolean validateModal =Browselink.isDisplayed();
				
				
					 LocalDateTime timestamp = LocalDateTime.now();
					    DateTimeFormatter gmtDateTimeFormatter = DateTimeFormatter.ofPattern("EE MMM dd HH:mm:ss 'GMT' yyyy", Locale.ENGLISH);
					    String time = gmtDateTimeFormatter.format(timestamp); 
					     Token_Name= "Test_Token_"+time;
					    
					    System.out.println(Token_Name);
					    
//				   SimpleDateFormat formatter = new SimpleDateFormat("dd-MM HH-mm");  
//				   Date date = new Date();  	     
//				   String str1 =formatter.format(date);
//				   Token_Name= "Test_Token"+str1;
				   
					TokenName.sendKeys(Token_Name);
					//EditionTab.clear();
					Thread.sleep(500);
					//EditionTab.sendKeys("4");
					TradingCheckbox.click();
					
					ArtCheckbox.click();
					
					Browselink.click();
					Thread.sleep(2000);
					
//				UploadFile_to_mint_token upld =new UploadFile_to_mint_token();
//					
//				upld.uploadFile("C:\\Users\\xooa\\Desktop\\Images for minting\\th (1).jpg");
					

					String root = System.getProperty("user.dir");
					String filepath = File.separator+"Assets_to_mint"+File.separator+"Image.jpg"; 
					String abspath = root+filepath;
					System.out.println(abspath);
					
					 StringSelection ss = new StringSelection(abspath);
					// StringSelection ss = new StringSelection("C:\\Users\\xooa\\Desktop\\Images for minting\\th (1).jpg");
				
					 
				     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

				     
				     Robot robot = new Robot();
				     robot.delay(250);
				     robot.keyPress(KeyEvent.VK_ENTER);
				     robot.keyRelease(KeyEvent.VK_ENTER);
				     robot.keyPress(KeyEvent.VK_CONTROL);
				     robot.keyPress(KeyEvent.VK_V);
				     robot.keyRelease(KeyEvent.VK_V);
				     robot.keyRelease(KeyEvent.VK_CONTROL);
				     robot.keyPress(KeyEvent.VK_ENTER);
				     robot.delay(90);
				     robot.keyRelease(KeyEvent.VK_ENTER);
					
					Thread.sleep(2000);
					
					EditionTab.click();
					EditionTab.clear();
					Thread.sleep(1000);
					EditionTab.sendKeys("4");
					
					Actions act =  new Actions(driver);
					act.moveToElement(driver.findElement(By.xpath("//div[@class='modal fade show']//a[@href='#royaltiesSelling']"))).click().perform();
						
					//SellingAndOwnershipLink.click();
					No_Radio_button_For_Sell_option.click();
					
					Thread.sleep(10000);
					
					//SellingAndOwnershipLink.click();
					
					//Thread.sleep(3000);
					
					
						Actions act1 =  new Actions(driver);
						act1.moveToElement(driver.findElement(By.xpath("//div[@class='modal fade show']//button[@class='btn btn-primary']"))).click().perform();
							
					//MintButton.click();
					
					
	  

 
		
  	 }
  

  public  void MintMultipleEditionTokenFromMarketplace_TwoCategories() throws InterruptedException, AWTException
	 {
	  Thread.sleep(5000);
	  
	  
			  	MintTokenButton.click();
				
				boolean validateModal =Browselink.isDisplayed();
				
				if(validateModal=true) 
				{
				Browselink.click();
				}
				
				else 
				{
					WebDriverWait wait = new WebDriverWait(driver,20);
					 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"modal fade show\"]//div/a[2]")));
					Browselink.click();
				}
				
			
				
////				SimpleDateFormat formatter = new SimpleDateFormat("dd-MM HH-mm");  
//			    Date date = new Date();  	     
//			   String str1 =formatter.format(date);
//			   String Token_Name= "Test_Token"+str1;
			   
				TokenName.sendKeys(Token_Name);
				
				EditionTab.sendKeys("7");

				ArtCheckbox.click();
				
				TradingCheckbox.click();
				
				Browselink.click();
				Thread.sleep(2000);
				
				UploadFile_to_mint_token upload =new UploadFile_to_mint_token();
				upload.uploadFile("C:\\Users\\xooa\\Desktop\\Images for minting\\th (1).jpg");
				
				Thread.sleep(10000);
				Actions act =  new Actions(driver);
				act.moveToElement(driver.findElement(By.xpath("//div[@class='modal fade show']//button[@class='btn btn-primary']"))).click().perform();
					
				MintButton.click();
				
	
	 }
}
