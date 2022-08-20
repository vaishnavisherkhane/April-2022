package TESTNGprogramsALL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTestingprogram {
	public WebDriver driver;
	 @BeforeClass
	 @Parameters("browser")
	 
	 public void f (String browser) { 
	 if (browser.equalsIgnoreCase("chrome")) {
	 System.setProperty("webdriver.chrome.driver","/TESTngProject/Binary6/chromedriver.exe");	 
		driver = new ChromeDriver() ;
	}
	 else if (browser.equalsIgnoreCase("edge")) {
	 System.setProperty("webdriver.edge.driver","/TESTngProject/Binary6/msedgedriver.exe");	 
				driver = new ChromeDriver() ;
			} 
		 else if (browser.equalsIgnoreCase("gecko")) {
			   System.setProperty("webdriver.gecko.driver","/TESTngProject/Binary6/geckodriver.exe");	 
					driver = new ChromeDriver() ; 
		 }
		 
		 driver.get("https://kite.zerodha.com");
	 }
	    @Test(priority = 1)
	    public void loginlit() throws InterruptedException {
	    WebElement UserName = driver .findElement(By.xpath(""))	;
	    WebElement Password = driver .findElement(By.xpath(""))	;	
	    WebElement loginbtn = driver .findElement(By.xpath(""))	;
	    UserName.sendKeys("Xa2145");
	    Password.sendKeys("123467");
	    loginbtn.click();
	    Thread.sleep(1000);
	    }
	    
		@Test(priority = 2) 
		 public void checkTitleTest() {
		 String ExpectedTitle = "";
		 String ActualTitle = driver.getTitle();
		 Assert.assertEquals(ActualTitle, ExpectedTitle);
		}
		@ AfterClass
		public void teardown() {
			driver.quit();
		}
	  
	  
	  
	  
	  
  }

