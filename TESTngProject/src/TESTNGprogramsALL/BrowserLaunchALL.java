package TESTNGprogramsALL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserLaunchALL {
	public WebDriver driver;
	
  @BeforeMethod
  public void beforemethod () {
  System.setProperty("webdriver.chrome.driver","/TESTngProject/Binary6/chromedriver.exe");
  driver = new ChromeDriver();
  }
  
  @Test
  public void openKite() {
  driver.get("https://kite.zerodha.com/");  
  driver.manage().window() .maximize(); 
  }
  
    @Test
    public void openfacebook() {
    driver.get("https://www.facebook.com/");  
    driver.manage().window() .maximize();  
      }
      
	 @AfterMethod 
	 public void aftermethod() {
	 driver.close();
	 }
}
  

