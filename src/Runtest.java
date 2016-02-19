//import java.io.BufferedWriter;
//import java.io.FileOutputStream;
//import java.io.OutputStreamWriter;
//import java.io.PrintWriter;
//import java.io.Writer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Runtest {
	public static void main(String args[]){
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String langs[] = {"cs","it","en","pl","pt","de","da","fi","sv","es","tr","fr","ru","th","hu","ko","nl","zh","nb","ja"};
		
		for(int i = 0; i < langs.length; i++){
			String url = "https://www.qa.shutterstock.com/" + langs[i] + "/";
			driver.get(url);
			System.out.println(driver.findElement(By.xpath("//section[@class='content-carousel-section']/h1")).getText());
		}
		
		//section[@class='content-carousel-section']/h1
		/*driver.get("https://www.qa.shutterstock.com/cs/");
		driver.get("https://www.qa.shutterstock.com/it/");
		driver.get("https://www.qa.shutterstock.com/en/");
		driver.get("https://www.qa.shutterstock.com/zn/");
		driver.get("https://www.qa.shutterstock.com/es/");
		driver.get("https://www.qa.shutterstock.com/it/");*/
//		driver.findElement(By.id("language-toggle")).click();
//		WebElement drop = driver.findElement(By.xpath("//div[@id='shutterstock-header']/div/div/div[2]/div/ul"));
//		System.out.println(drop.isEnabled());
//		System.out.println(drop.isDisplayed());
//		System.out.println(drop.getText());
		//System.out.println(driver.findElement(By.xpath("//div[@id='content']/section[2]/h1")).getText());
		//language-toggle
		//Common.Searchphoto(driver);
		//Common.Loginfromheader(driver);
		//driver.getPageSource();
		//System.out.println(driver.getPageSource());
		//System.out.println(driver.getPageSource().contains(""));
		
				
		
		driver.quit();
	}

}
