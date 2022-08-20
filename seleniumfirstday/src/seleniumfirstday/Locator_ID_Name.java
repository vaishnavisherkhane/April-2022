package seleniumfirstday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_ID_Name {
	
	   public static void main(String[]args) {
		   
		System.setProperty("webdriver.chrome.driver","H:\\seleniumfirstday\\Binary6\\chromedriver.exe")  ; 
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 
	//	ID-LOCATOR SENARIO 
		 
    WebElement userid = driver.findElement(By.id("email"));
    WebElement password = driver.findElement(By.id("pass"));
    
     userid.sendKeys("vaishusatpute2020@.com");
     password .sendKeys("123446777");
     
     //NAME LOCATOR
     WebElement login = driver.findElement(By.name("login"));
     login.click();
     
   
		 
	   }

}
