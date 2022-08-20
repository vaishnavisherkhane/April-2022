package seleniumfirstday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubstringCssSelector {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","H:\\seleniumfirstday\\Binary6\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
				  
		  
		 // css Selector SubString with chArat (^)
		
		WebElement loginbtn = driver.findElement(By.cssSelector("button[class^='_42ft']"));
	     loginbtn.click();
	     
	     //css Selector SubString with doller ($)
	     
	     WebElement loginbtn1 = driver.findElement(By.cssSelector("button[class$=' _51sy']"));
	     loginbtn1.click();
	     
	     
	   //css Selector SubString with star(*)
	     WebElement loginbtn2 = driver.findElement(By.cssSelector("button[class*='_42ft _4jy0 ']"));
	     loginbtn2.click();
	}

}
