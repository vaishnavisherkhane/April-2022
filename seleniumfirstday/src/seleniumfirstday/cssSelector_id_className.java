package seleniumfirstday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class cssSelector_id_className {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "H:\\seleniumfirstday\\Binary6\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		// cssSelector with ID(#)
		
		WebElement usermail = driver.findElement(By.cssSelector("input#email"));
          usermail.sendKeys("vaishu@123.com");
          
          //cssSelector with class(.)
          
          WebElement password  = driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi"));
          password.sendKeys("23356d");
          
		

	}

}
