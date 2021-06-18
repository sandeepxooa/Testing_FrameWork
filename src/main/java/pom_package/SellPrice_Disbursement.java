package pom_package;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SellPrice_Disbursement 
{
WebDriver driver;
    
	
	
	@FindBy(xpath="//div[@class='modal-content']//div[@class='input-group']/input")
    private WebElement Sell_Value;
	
	@FindBy(xpath="//*[@id='edqz0sy00']")
    private WebElement PlatformFees;
	
	@FindBy(xpath="//*[@id='edqz0sy001']")
    private WebElement SellersAmount;
	
	
	
	
	public SellPrice_Disbursement(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	
	
		String  selling_price= Sell_Value.getText();
		String PlatformDeduction=PlatformFees.getText();
		String ActualSellersAmount=SellersAmount.getText();
			
		float i=Integer.parseInt(selling_price); 
		int j=Integer.parseInt(PlatformDeduction); 
		int k=Integer.parseInt(ActualSellersAmount); 
	
	public void Validate_Disbursment_on_primary_Sell()
	{
		System.out.println("Running code");
		double Calculated_PlatformDeduction=i*(0.1);
		double Calculated_SellersAmount=i-Calculated_PlatformDeduction;
		
		if(selling_price.equals(Calculated_PlatformDeduction))
		{
			System.out.println("Platform Fee is correct");
		}
		else
		{
			System.out.println("Platform Fee is Wrong");
		}
		
		if(ActualSellersAmount.equals(Calculated_SellersAmount))
		{
			System.out.println("Sellers Amount is correct");
		}
		else
		{
			System.out.println("Sellers Amounte is Wrong");
		}
		
	}
	
	public void Validate_Disbursment_on_secondary_Sell()
	{
		double Calculated_PlatformDeduction=i*(0.05);
		double Calculated_SellersAmount=i-Calculated_PlatformDeduction;
		
		if(selling_price.equals(Calculated_PlatformDeduction))
		{
			System.out.println("Platform Fee is correct");
		}
		else
		{
			System.out.println("Platform Fee is Wrong");
		}
		
		if(ActualSellersAmount.equals(Calculated_SellersAmount))
		{
			System.out.println("Sellers Amount is correct");
		}
		else
		{
			System.out.println("Sellers Amounte is Wrong");
		}
	}
	
	
	
	

}
