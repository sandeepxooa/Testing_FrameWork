package browserSetup;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class Pojo 

{



	public static WebDriver OpenChrome()
	{


		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver91.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blockchain.ci.xooa.io/");
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
