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

public class OfferpageStepdefination2 {
 public WebDriver driver;
 
 String productName1;
 TextContext textContext;
 
public OfferpageStepdefination2(TextContext textContext) {
	this.textContext=textContext;
}
 
 
 
	
	@Then("User search for {string} short name in offerpage and find actual name of product")
	public void user_search_for_short_name_in_offerpage_and_find_actual_name_of_product(String ShortName1) throws InterruptedException {
	
		
		textContext.driver.findElement(By.cssSelector("a.cart-header-navlink:nth-child(2)")).click();
		
             Set<String> s1= driver.getWindowHandles();
            Iterator<String> it =s1.iterator();
            String parentwindow =it.next();
            String childwindow= it.next();
 
            textContext.driver.switchTo().window(childwindow);
		
            textContext.driver.findElement(By.cssSelector("#search-field")).sendKeys(ShortName1);
		Thread.sleep(2000);
		 productName1=textContext.driver.findElement(By.cssSelector("tr td:first-child")).getText();
		 System.out.println(productName1 +" is extracted from product page");
	}

@Then("productname of landingpage and offerpage is similer")
public void productname_of_landingpage_and_offerpage_is_similer() {
   
Assert.assertEquals(textContext.productName,productName1);
//	Assert.assertEquals(productName, productName1);
	
}

	
}
