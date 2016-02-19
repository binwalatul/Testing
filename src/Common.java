import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Common {
	  static String name= String.valueOf(getRandom()); //static variable
	
	  //Signup from LOHP
	  	public static void LOHPSignup(WebDriver driver) 
	{
	
	driver.findElement(By.id("user-register")).sendKeys("test"+ name);
	driver.findElement(By.id("email-register")).sendKeys("test"+name+"@shutterstockc.com");
	driver.findElement(By.id("pass-register")).sendKeys("testing");
	driver.findElement(By.id("agree-to-tos")).click();
	driver.findElement(By.id("subscribe-submit-button")).click();
	}
	//Signup form sub11 long Page
	public static void signupsub11long(WebDriver driver)
	{
		
		String name = String.valueOf(getRandom());
		driver.findElement(By.id("firstname")).sendKeys(name);
		driver.findElement(By.id("lastname")).sendKeys(name);
		driver.findElement(By.id("company")).sendKeys("TFT");
		driver.findElement(By.id("address1")).sendKeys("TFT");
		driver.findElement(By.id("city")).sendKeys("xyz");
		driver.findElement(By.id("state")).sendKeys("xyz");
		driver.findElement(By.id("zip")).sendKeys("12345");
		Select dropdown = new Select(driver.findElement(By.id("country")));
		dropdown.selectByValue("United States");
		driver.findElement(By.id("email_register")).sendKeys("testuser"+name+"@shutterstock.com");
		driver.findElement(By.id("user_register")).sendKeys("testuser"+ name);
		driver.findElement(By.id("pass_register")).sendKeys("testing123");
		driver.findElement(By.id("pass_register_confirm")).sendKeys("testing123");
		driver.findElement(By.id("agree_to_tos")).click();
		//new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(tagAccount));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("subscribe_submit_button")).click();
		}
	//Signin from Sub11 Page
	public static void signinsub11(WebDriver driver){
		driver.findElement(By.id("user_login")).sendKeys("testuser4412");
		driver.findElement(By.id("pass_login")).sendKeys("12345678");
		driver.findElement(By.id("login_submit_button")).click();
	}

	//Search photo from the LOHP
	public static void Searchphoto(WebDriver driver){
		driver.findElement(By.id("search-input")).sendKeys("Animals");
		driver.findElement(By.className("dropdown-trigger")).click();
		driver.findElement(By.id("photos")).click();
		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
		
	}
	//Search vector from the LOHP
	public static void Searchvector(WebDriver driver){
		driver.findElement(By.id("search-input")).sendKeys("Lines");
		driver.findElement(By.className("dropdown-trigger")).click();
		driver.findElement(By.id("vectors")).click();
		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
		
	}
	
	public static void Loginfromheader(WebDriver driver){
		driver.findElement(By.id("inline-login")).click();
		driver.findElement(By.id("user")).sendKeys("Testuser4451");
		driver.findElement(By.id("pass")).sendKeys("12345678");
		driver.findElement(By.cssSelector("input[name='submit']")).click();
	}
	public static void Signupfromhearder(WebDriver driver){
		driver.findElement(By.cssSelector("#sign-up-link > a")).click();
		driver.findElement(By.id("user_register")).sendKeys("test" + name);
		
		
	}
	//Method to generate random numbers
public static long getRandom(){
	return System.currentTimeMillis();	
	}

}
