package testCases_for_Single_Token;

import java.awt.AWTException;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import browserSetup.Pojo;
import pom_package.Buy_Token_From_MarketPlace;
import pom_package.Destroy_Token;
import pom_package.Log_out;
import pom_package.Mint_Token_Through_Marketplace;
import pom_package.My_Token_Tab;
import pom_package.OTP_and_Update_Login_validation;
import pom_package.Open_NFT_Marketplace;
import pom_package.Sell_token;
import pom_package.Xooa_Login;


public class testCases_for_Multiple_Editions extends Pojo
{
	
	
	
	WebDriver driver;
	
	


@BeforeClass
public void OpenBrowser()
{
  
	driver= OpenChrome();
	
    
}



	@Test (priority = 1)
	public void Verifylogin_for_Multiple_Editon_Validation() throws InterruptedException 
	{
		Xooa_Login userlogin = new Xooa_Login(driver);
		Thread.sleep(3000);
		           userlogin.accept_cookies();
				   userlogin.SendUsername();
		           userlogin.Sendpassword();
		           Thread.sleep(1000);
		           userlogin.ClickOnSigninButton();
		           
		           
		 OTP_and_Update_Login_validation upademodal= new OTP_and_Update_Login_validation(driver);
		        		  upademodal.Skip_to_update_mobileNo_Massege();
		        		   
		        		  
		        		  
	 Open_NFT_Marketplace appurl = new Open_NFT_Marketplace(driver);
		        			
		        			appurl.NFT_Marketplace_url();		   
	}
	
  @Test(priority =2 )
  public void Validate_Token_Minting_for_multiple_Editions() throws InterruptedException, AWTException
  {
	  Mint_Token_Through_Marketplace mintToken=  new Mint_Token_Through_Marketplace(driver);
	//  mintToken.checkSideBar();
	  mintToken.MintMultipleEditionTokenFromMarketplace_OneCategory();
  }
	
  
	@Test(priority = 3)	
	public void Validate_Success_Massage_for_minted_token() throws InterruptedException
	{
		Thread.sleep(7000);	  
		My_Token_Tab token=new My_Token_Tab(driver);
		//  token.Validate_Minted_token_in_My_Token();
		token.ValidateTokenInMyToken();
	}
	
	
	 @Test(priority =4 )
	 public void Validate_SellAllEditions_option() throws InterruptedException 
	  {
		  Sell_token sellMultiEdition= new Sell_token(driver);
		  sellMultiEdition.ViewToken();
		  sellMultiEdition.Sell_Multiple_Edition_Token();
	  }
	 
	 @Test(priority=5)
		
		public void logout_buyer_account() throws InterruptedException
		{
			Log_out logoutfromselleraccount=new Log_out(driver);
			logoutfromselleraccount.Click_on_ProfileLink();
			logoutfromselleraccount.Click_on_SignOutButton();
		
		}
	
		
		
		@Test(priority=6)
		
		public void login_with_other_user() throws InterruptedException
		{
			Xooa_Login login2nd= new Xooa_Login(driver);
		
			login2nd.SendtestUsername();
			login2nd.Sendtestpassword();
			login2nd.ClickOnSigninButton();
			
			Thread.sleep(2000);
			OTP_and_Update_Login_validation declineUpdate= new OTP_and_Update_Login_validation(driver);
			      declineUpdate.Skip_to_update_mobileNo_Massege();
			      
			      Open_NFT_Marketplace appurl = new Open_NFT_Marketplace(driver);
			  	
					appurl.NFT_Marketplace_url();
			
			
		}
  
	 @Test(priority =7 )
	 public void Validate_BuyEdition_option() throws InterruptedException
	 {
		 Buy_Token_From_MarketPlace buyEdition= new Buy_Token_From_MarketPlace(driver);
		 
		 buyEdition.Click_on_GeneralMarket_Button();
		 buyEdition.Buy_Token_of_Multiple_Edition();
	 }
	 
	 @Test(priority =8 )
	 public void Validate_Destroy_option() throws InterruptedException
	 {
		 Destroy_Token destroy= new Destroy_Token(driver);
		 destroy.Click_on_MyToken_Naviagtion();
		 destroy.Detsroy_Token();
	 }
  
  
	

}
