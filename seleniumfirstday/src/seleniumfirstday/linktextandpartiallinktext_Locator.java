package seleniumfirstday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktextandpartiallinktext_Locator {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","H:\\seleniumfirstday\\Binary6\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//Locator linkText
		
		WebElement fbpay = driver.findElement(By.linkText("Facebook Pay"));
		fbpay.click();
		
		//Locator PartallinkText
		
		WebElement votingpage = driver.findElement(By.partialLinkText("Voting Information Centre"));
		votingpage.click();
	}

}
