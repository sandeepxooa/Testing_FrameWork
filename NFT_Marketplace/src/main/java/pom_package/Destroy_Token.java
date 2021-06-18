package pom_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Destroy_Token 
{
WebDriver driver;
	
	
	Mint_Token_Through_Marketplace  getTokenName = new Mint_Token_Through_Marketplace(driver);
	String MintedTokenName=getTokenName.Token_Name;
	
	
	@FindBy(xpath="(//div[@class='container-fluid']//div[@class='row'])[1]")
	private WebElement MyToken_container;
	
	@FindBy(xpath="//div[@id='root']//span[text()='My Tokens']/parent::a")
	private WebElement My_Token_navigation_button;
	
	
	
	public Destroy_Token(WebDriver driver)
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
		 wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='root']//span[text()='My Tokens']/parent::a")));
		My_Token_navigation_button.click();
		
	}
	
	public void Detsroy_Token() throws InterruptedException
	{
			Thread.sleep(5000);
		
		//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']/p[text()='Test_Token_Wed Jun 02 18:24:30 GMT 2021']//parent::div/following-sibling::button/div/div/button[text()='More']
				String MoreOption="//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']/p[text()='"+MintedTokenName+"']//parent::div/following-sibling::button/div/div/button[text()='More']";
				
				
				WebDriverWait wait1 = new WebDriverWait(driver,20);
				 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(MoreOption)));
				

				WebElement MoreButton= driver.findElement(By.xpath(MoreOption));
				
				MoreButton.click();
				
				Thread.sleep(3000);
				
				
				
//				//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']/p[text()='Test_Token_Thu Jun 10 13:25:54 GMT 2021']//parent::div/following-sibling::button/div/div//div/button[text()='Destroy Token']
//				String DestroyOption="//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']/p[text()='"+MintedTokenName+"']//parent::div/following-sibling::button/div/div//div/button[text()='Destroy Token']";
//
//				WebElement DestroyButton= driver.findElement(By.xpath(DestroyOption));
//				
//				 
//				Actions token=new Actions(driver);
//				token.moveToElement(driver.findElement(By.xpath(DestroyOption)));
//				Thread.sleep(2000);
//
//				DestroyButton.clear();
//				Thread.sleep(5000);
				
				
				String DestroyOptionindex="(//div[@id='root']//div[@class='row']//div[@class='MuiCardContent-root px-2 pt-3 pb-1']/p[text()='"+MintedTokenName+"']//parent::div/following-sibling::button/div/div//div/button)[3]";
				WebElement DestroyButtonindex= driver.findElement(By.xpath(DestroyOptionindex));
				DestroyButtonindex.click();
				
				WebDriverWait wait3 = new WebDriverWait(driver,20);
				 wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-content']//button[text()='Destroy']")));
				
				WebElement DestroyButtonOnModal= driver.findElement(By.xpath("//div[@class='modal-content']//button[text()='Destroy']"));
				
				DestroyButtonOnModal.click();
				
				
	}
}
