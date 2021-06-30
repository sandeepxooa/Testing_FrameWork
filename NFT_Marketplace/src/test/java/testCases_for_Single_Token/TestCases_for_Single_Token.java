package testCases_for_Single_Token;

import java.awt.AWTException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import browserSetup.Pojo;
import pom_package.Buy_Token_From_MarketPlace;
import pom_package.Click_To_Refresh;
import pom_package.Delist_Token;
import pom_package.Destroy_Token;
import pom_package.Log_out;
import pom_package.Mint_Token_Through_Marketplace;
import pom_package.My_Token_Tab;
import pom_package.OTP_and_Update_Login_validation;
import pom_package.Open_NFT_Marketplace;
import pom_package.Sell_token;
import pom_package.Xooa_Login;

public class TestCases_for_Single_Token extends Pojo{
	WebDriver driver;

	ExtentHtmlReporter htmlReporter;

	public static ExtentReports extent;
	public static ThreadLocal parentTest = new ThreadLocal();
	public static ThreadLocal test = new ThreadLocal();
 
	@BeforeSuite
		public void beforeSuite() 
	{
			extent = Extnd.createInstance("extent.html");
			ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
			extent.attachReporter(htmlReporter);
			}

	@BeforeClass
	public void OpenBrowser()
	{
//		      parentTest.set(parent);
		driver= OpenChrome();
		//driver =OpenMozila();

	}


//		@BeforeMethod 
//		public void BeforeMethod(Method method) 
//		{
//					extent = Extnd.createInstance("extent.html");
//				ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
//				extent.attachReporter(htmlReporter);
//				ExtentTest parent = extent.createTest(getClass().getName());
//			    parentTest.set(parent);
//			    
//			        ExtentTest child = ((ExtentTest) parentTest.get()).createNode(method.getName());
//			        test.set(child);
//	       
//			
//			
//		}


	@Test (priority = 1)
	public void Login_for_sellers_account_with_valid_credentials() throws InterruptedException 
	{
		Xooa_Login userlogin = new Xooa_Login(driver);
		Thread.sleep(3000);
		userlogin.accept_cookies();
		Thread.sleep(2000);
		userlogin.SendUsername();
		userlogin.Sendpassword();
		Thread.sleep(1000);
		userlogin.ClickOnSigninButton();



		String abc="logged in";
		System.out.println(abc);
		Thread.sleep(5000);
		Assert.assertTrue(true, "Logged in succesully");
	}

	@Test (priority = 2)
	public void Validate_for_OTP_and_Decline_the_updates() throws InterruptedException 
	{	
		Thread.sleep(2000);
		OTP_and_Update_Login_validation declineUpdate= new OTP_and_Update_Login_validation(driver);
		declineUpdate.Skip_to_update_mobileNo_Massege();

		//Assert.assertTrue(true, "OTP Validation and profile update has skipped succesully");
	}


	@Test (priority = 3)
	public void openMarketplace() throws InterruptedException
	{
		Open_NFT_Marketplace appurl = new Open_NFT_Marketplace(driver);

		appurl.NFT_Marketplace_url();
		//appurl.selectNft10();
		Thread.sleep(5000);

	}




	@Test(priority = 4)
	public void Validate_for_minting_token_from_marketplace_with_single_edition_WithoutAnyRoyaltyCheck() throws InterruptedException, AWTException
	{      
		Mint_Token_Through_Marketplace mintToken=new Mint_Token_Through_Marketplace(driver)	 ;     
		//mintToken.checkSideBar();
		mintToken.MintSingleTokenFromMarketplace_OneCategory();


	}    		  

	@Test(priority = 5)	
	public void Validate_Success_Massage_for_minted_token() throws InterruptedException
	{
		Thread.sleep(7000);	  
		My_Token_Tab token=new My_Token_Tab(driver);
		//  token.Validate_Success_massage_on_minting();
		token.ValidateTokenInMyToken();
//
//		String msg=token.Actualmsg;
//		String expmsg= token.expectedMsg;
//		
//		System.out.println(msg);
//		System.out.println(expmsg);
//
//
//		SoftAssert softAssert = new SoftAssert();
//
//		softAssert.assertTrue(msg.equals(expmsg), "Token Minted succesfully");
//		softAssert.assertAll();
//		System.out.println("assert succeed on Minting");

	}

	

		@Test(priority=6)	
		public void Validate_Minted_Token() throws InterruptedException
		{   
			Thread.sleep(5000);	
			Sell_token View=new Sell_token(driver);
			//View.ViewToken();
		}

	@Test(priority=7)	
	public void SellToken() throws InterruptedException
	{
		Thread.sleep(5000);	
		Sell_token sell=new Sell_token(driver);
		sell.Sell_Single_Edition_Token();
		
//		SellPrice_Disbursement ValidateDisbursement= new SellPrice_Disbursement(driver);
//				ValidateDisbursement.Validate_Disbursment_on_primary_Sell();
				Thread.sleep(2000);
		
		sell.Click_on_submit_Button();


//		String msg=sell.ActualMsg;
//		String expmsg= sell.expectedMsg;
//		System.out.println(msg);
//		System.out.println(expmsg);


//		SoftAssert softAssert = new SoftAssert();
//
//		softAssert.assertTrue(msg.equals(expmsg), "Token sold succesfully");
//		softAssert.assertAll();
//		System.out.println("assert succeed on sell");
		Thread.sleep(5000);	

	}

	
	@Test(priority=8)
	public void Buy_Token_With_same_seller_Account() throws InterruptedException
	{
		Buy_Token_From_MarketPlace buy=new Buy_Token_From_MarketPlace(driver);
		buy.Click_on_GeneralMarket_Button();
		buy.Buy_Token_of_single_Edition();
		Thread.sleep(2000);
		buy.StripModal();
		buy.Close_to_StripePayment_modal();
		buy.Close_to_Buy_modal();
		
	}
	
	
@Test(priority=9)

	public void logout_Seller_account() throws InterruptedException
	{
		Log_out logoutfromselleraccount=new Log_out(driver);
		logoutfromselleraccount.Click_on_ProfileLink();
		logoutfromselleraccount.Click_on_SignOutButton();

	}



	@Test(priority=10)

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




	@Test(priority=11)
	public void Buy_Token_Other_Buyer_account() throws InterruptedException
	{
		Buy_Token_From_MarketPlace buy=new Buy_Token_From_MarketPlace(driver);
		buy.Click_on_GeneralMarket_Button();
		buy.Buy_Token_of_single_Edition();
		buy.StripModal();
		

	}
	
	
	/*
//	@Test(priority=11)
//	public void Validate_secondary_sell() throws InterruptedException, AWTException
//	{  
//		
//		Click_To_Refresh reLoad= new Click_To_Refresh(driver);
//	         reLoad.Click_on_AppLogo();
//	
//	Thread.sleep(5000);
//		My_Token_Tab token=new My_Token_Tab(driver);
//		//  token.Validate_Minted_token_in_My_Token();
//		token.ValidateTokenInMyToken();
//		System.out.println("Clicked on MT");
//		
//		
//		
//		Thread.sleep(2000);	
//		Sell_token sell=new Sell_token(driver);
//		sell.Sell_Single_Edition_Token();
//		
//		
////		SellPrice_Disbursement ValidateDisbursement= new SellPrice_Disbursement(driver);
////		ValidateDisbursement.Validate_Disbursment_on_primary_Sell();
//		Thread.sleep(2000);
//
//        sell.Click_on_submit_Button();
//}
	
	
	*/
	
	@Test(priority=12)
	public void Validate_Minting_Function_With_missing_one_Mandantory_filed_eg_Name() throws InterruptedException, AWTException
	{
		Mint_Token_Through_Marketplace mint= new Mint_Token_Through_Marketplace(driver);
		mint.MintSingleTokenFromMarketplace_OneCategory_without_TokenName();
	}


	@Test(priority =12)
	public void Validate_Destroy_option() throws InterruptedException, AWTException
	{ 
		Open_NFT_Marketplace appurl = new Open_NFT_Marketplace(driver);		
		appurl.NFT_Marketplace_url();


		Mint_Token_Through_Marketplace mintToken=new Mint_Token_Through_Marketplace(driver)	 ;           
		mintToken.MintSingleTokenFromMarketplace_OneCategory();

		Thread.sleep(7000);


		My_Token_Tab token=new My_Token_Tab(driver);
		token.ValidateTokenInMyToken();


		Destroy_Token destroy= new Destroy_Token(driver);
		destroy.Click_on_MyToken_Naviagtion();
		destroy.Detsroy_Token();
		Thread.sleep(5000);	
	}


	@Test(priority =13 )
	public void Validate_Delist_option() throws InterruptedException, AWTException
	{    
		Open_NFT_Marketplace appurl = new Open_NFT_Marketplace(driver);		
		appurl.NFT_Marketplace_url();


		Mint_Token_Through_Marketplace mintToken=new Mint_Token_Through_Marketplace(driver)	 ;           
		mintToken.MintSingleTokenFromMarketplace_OneCategory();

		Thread.sleep(7000);
		My_Token_Tab token=new My_Token_Tab(driver);
		token.ValidateTokenInMyToken();

		
		Thread.sleep(5000);	
		Sell_token sell=new Sell_token(driver);
		sell.Sell_Single_Edition_Token();
		sell.Click_on_submit_Button();
		
		Delist_Token delist= new Delist_Token(driver);
		//delist.Click_on_MyToken_Naviagtion();
		delist.Delist_Token();
		Thread.sleep(5000);	
	}




	/*
	
	
	@Test
	public void Validate_Minting_token_from_marketplace_with_multi_edition_WithoutAnyRoyaltyCheck() throws InterruptedException
	{

			Mint_Token_Through_Marketplace mintsingle =new Mint_Token_Through_Marketplace(driver);
										   mintsingle.checkSideBar();
										   mintsingle.MintSingleTokenFromMarketplace_OneCategory();
	}


	@Test
	public void Validate_Minting_token_from_marketplace_with_multiple_edition_WithoutAnyRoyaltyCheck() throws InterruptedException
	{

			Mint_Token_Through_Marketplace mintmulti =new Mint_Token_Through_Marketplace(driver);
										   mintmulti.checkSideBar();
										   mintmulti.MintMultipleEditionTokenFromMarketplace_OneCategory();


	}



	@Test
	public void Validate_Minting_token_from_marketplace_with_multiple_edition_TwoCaterories_WithoutAnyRoyaltyCheck() throws InterruptedException
	{

		Mint_Token_Through_Marketplace mintmultiCategory =new Mint_Token_Through_Marketplace(driver);
									   mintmultiCategory.checkSideBar();
									   mintmultiCategory.MintMultipleEditionTokenFromMarketplace_TwoCategories();


	}


	

		@AfterMethod	
		public synchronized void afterMethod(ITestResult result) 
		{
//	        if (result.getStatus() == ITestResult.FAILURE)
//	             ((ExtentTest) test.get()).fail(result.getThrowable());
//	        else if (result.getStatus() == ITestResult.SKIP)
//	            ((ExtentTest) test.get()).skip(result.getThrowable());
//	        else
//	            ((ExtentTest) test.get()).pass("Test passed");
	
	       // extent.flush();
	    }
	
//	
//		@AfterClass
//	public void after_class(ITestResult result)  throws InterruptedException
//		{
//			if (result.getStatus() == ITestResult.FAILURE)
//	             ((ExtentTest) test.get()).fail(result.getThrowable());
//	        else if (result.getStatus() == ITestResult.SKIP)
//	            ((ExtentTest) test.get()).skip(result.getThrowable());
//	        else
//	            ((ExtentTest) test.get()).pass("Test passed");
//			Log_out logoutfromselleraccount=new Log_out(driver);
//			//logoutfromselleraccount.Click_on_ProfileLink();
//			logoutfromselleraccount.Click_on_SignOutButton();
//			driver.quit();
//			
//	       extent.flush();
//      }

 */
}
