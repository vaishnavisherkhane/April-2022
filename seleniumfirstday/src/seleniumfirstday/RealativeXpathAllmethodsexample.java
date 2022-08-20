package seleniumfirstday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealativeXpathAllmethodsexample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","H:\\seleniumfirstday\\Binary6\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//Xpath method of AND operator
		//WebElement usermail = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy'and @name='email']"));
		//usermail.sendKeys("12345");
	          // or method
		WebElement usermail1 = driver.findElement(By.xpath("//input[@name='emai'or@class='inputtext _55r1 _6luy']"));
		usermail1.sendKeys("12345@#45");
		
		// text() method
		WebElement loginl = driver.findElement(By.xpath("//button[text()='Log In']"));
		loginl.click();
		
		// contains text() method
		
		WebElement forgotpass = driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]"));
		forgotpass.click();
	}

}
