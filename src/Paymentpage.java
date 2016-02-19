import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Paymentpage {

	
	public static void Creditcard(WebDriver driver)
	{
		WebElement tagPayment = null;
		Select dropdown = new Select(driver.findElement(By.id("card_type")));
		dropdown.selectByValue("Mastercard");
		tagPayment=driver.findElement(By.id("cc_num"));
		tagPayment.sendKeys("5555555555554444");
		Select dropdown1 = new Select(driver.findElement(By.id("cc_exp_month")));
		dropdown1.selectByValue("07 - Jul");
		Select dropdown2= new Select(driver.findElement(By.id("cc_exp_year")));
		dropdown2.selectByValue("2020");
		tagPayment.findElement(By.id("cvv2"));
		tagPayment.sendKeys("321");
		tagPayment=driver.findElement(By.id("payment_submit_button_credit_card"));
		tagPayment.click();
		System.out.println("Payment Done");
		
	}
	public static void Directdebit(WebDriver driver)
	{
		
	}
	
	
}
