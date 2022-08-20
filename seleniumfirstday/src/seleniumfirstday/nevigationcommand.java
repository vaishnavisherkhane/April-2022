package seleniumfirstday;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nevigationcommand {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "H:\\seleniumfirstday\\Binary6\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.navigate().to("https://www.flipkart.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
		
	}

}
