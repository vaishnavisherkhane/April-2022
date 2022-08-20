package TESTNGprogramsALL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

   public class superclass {
	public WebDriver driver;
	
	  @Test
	  public void launchBrowser() {
	  System.setProperty("webdriver.chrome.driver ","/TESTngProject/Binary6/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  }
   }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

