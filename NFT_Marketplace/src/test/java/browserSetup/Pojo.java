package browserSetup;


import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class Pojo 

{


	
	public static WebDriver OpenChrome()
	{
		
		
//		String root = System.getProperty("user.dir");
//		System.out.println(root);
//		String filepath = "Drivers"+File.separator+"chromedriver91.exe"; 
//		String path = root+filepath;
		
		//String path= "C:\\Users\\xooa\\git\\Testing_FrameWork\\Testing_FrameWork\\NFT_Marketplace\\Drivers\\chromedriver91.exe";
		//"." + File.separator +
		
		
        // String path="Driver" + File.separator + "chromedriver91.exe";
//		"."+File.separator+"Drivers"+File.separator+"chromedriver91.exe"
		
		System.setProperty("webdriver.chrome.driver","Drivers"+File.separator+"chromedriver91.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blockchain.ci.xooa.io");
		//driver.get("https://blockchain.ci.xooa.io/apps-console/8038d538-96d0-4faa-82f9-bb33db396ae7");
		return driver;

	}

	public WebDriver OpenMozila() 
	{
		System. setProperty("webdriver. gecko. driver","D:\\GeckoDriver\\geckodriver.exe" );
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("https://blockchain.ci.xooa.io/");
		driver.get("https://blockchain.ci.xooa.io/apps-console/8038d538-96d0-4faa-82f9-bb33db396ae7");
		return driver;
	}

	////	public static WebDriver openChromeBrowser() 
	//	{
	//		System.setProperty("webdriver.chrome.driver","src" + File.separator + "test" + File.separator + "resources" + File.separator + "Browsers" + File.separator + "chromedriver.exe");
	//		WebDriver driver = new ChromeDriver();
	////		return driver;
	//	}

}
