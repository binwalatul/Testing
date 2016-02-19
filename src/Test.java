//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//
//
////public class Test {
//
//
////public static void main(String[] args){
//	//System.setProperty("webdriver.chrome.driver","C:\\Users\\Binwal.atul\\Downloads\\chromedriver.exe");
//	WebDriver driver= new FirefoxDriver();
//	//WebDriver driver = new ChromeDriver();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	//driver.manage().window().maximize();
//	//String baseUrl="https://www.qa.shutterstock.com";
//	
////	WebElement tagSearch = null;
//	driver.get("https://www.qa.shutterstock.com");
//	Common.LOHPSignup(driver);
////  driver.findElement(By.id("search-input")).sendKeys("people");
////	tagSearch =driver.findElement(By.xpath("//div[@class='dropdown-wrapper']/span"));
////	tagSearch.click();
////	tagSearch=driver.findElement(By.id("photos"));
////	tagSearch.click();
////	tagSearch=driver.findElement(By.cssSelector("button.btn.btn-primary"));
//	tagSearch.click();
//	tagSearch=driver.findElement(By.className("btn-primary"));
//	tagSearch.click();
//	tagSearch= driver.findElement(By.className("gc_clip"));
//	tagSearch.click();
//	
//	//new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@class='image-specs']/tbody/tr/td")));
//	tagSearch =driver.findElement(By.xpath("//table[@class='image-specs']/tbody/tr/td"));
//	tagSearch.click();
//	tagSearch=driver.findElement(By.id("download_button_jpg"));
//	tagSearch.click();
//	tagSearch=driver.findElement(By.id("on_demand_large_2_download"));
//	tagSearch.click();
//	tagSearch=driver.findElement(By.xpath("//div[@class='text-center button-holder']/input"));
//	tagSearch.click();
//	Subscribe11.signup(driver);
//	tagSearch=driver.findElement(By.cssSelector("#subscribe_submit_button"));
//	Actions build = new Actions(driver);
//	build.moveToElement(tagSearch).build().perform();
//	tagSearch= driver.findElement(By.id("subscribe_submit_button"));	
//	tagSearch.click();
//	tagSearch.submit();;
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("arguments[0].click();", tagSearch);
//	//System.out.println("Signup complete");
//	//Paymentpage.Creditcard(driver);
	