package pom_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Open_NFT_Marketplace 
{
WebDriver driver;
	
	
	@FindBy (xpath="//button[@class='dropdown-toggle btn btn-secondary']")
	private WebElement appDropdown;
	
	@FindBy (xpath="//button[text()='NFT Marketplace 10']")
	private WebElement NFT_Marketplace_10;
	

	public Open_NFT_Marketplace(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void NFT_Marketplace_url() throws InterruptedException
	{   Thread.sleep(2000);
		//driver.get("https://blockchain.ci.xooa.io/apps-console/8038d538-96d0-4faa-82f9-bb33db396ae7");   //nft mp10
		//driver.get("https://blockchain.ci.xooa.io/apps-console/ac75ea10-d4c8-439b-9e4a-fb71d0030ad4");....nft test
		driver.get("https://blockchain.ci.xooa.io/apps-console/1f1660ba-21ee-46b6-a8e1-18b20c51e08b");     //....nft prod replica
	}
	
	public void selectNft10()
	{
		appDropdown.click();
		NFT_Marketplace_10.click();
		
	}
	
	

}
