package stepDefination;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.TextContext;

public class LandingpageStepdefination {
 public WebDriver driver;
 

public String productName;

TextContext textContext;

 
public LandingpageStepdefination(TextContext textContext) {
	this.textContext=textContext;
}
 
 
	@Given("User is o greencart landing page")
	public void user_is_o_greencart_landing_page() {
		WebDriverManager.chromedriver().setup();
		textContext.driver=new ChromeDriver();
		textContext.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		textContext.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}
	@When("User search for short name {string} and got actual name of product")
	public void user_search_for_short_name_and_got_actual_name_of_product(String ShortName) throws InterruptedException {
		
		
		
		
		textContext.driver.findElement(By.cssSelector(".search-keyword")).sendKeys(ShortName);
		Thread.sleep(2000);
		textContext.productName=textContext.driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
		System.out.println(productName +" is extracted from home page");
		
		
		
	}


	
}
