package seleniumfirstday;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


    public class chrome2 {
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "H:\\seleniumfirstday\\Binary6\\chromedriver.exe");
	     ChromeOptions opt = new ChromeOptions();
	    opt.addArguments("--headless");
	
		 WebDriver driver = new ChromeDriver(opt);
		 
		 driver.get("https://www.facebook.com/");
		 System.out.println(driver.getTitle());
	}

}
