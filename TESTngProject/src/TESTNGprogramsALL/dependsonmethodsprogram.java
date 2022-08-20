package TESTNGprogramsALL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

   public class dependsonmethodsprogram {
	   
	public WebDriver driver;
	
  @Test
  public void launchBrowser() {
  System.setProperty("webdriver.chrome.driver ","/TESTngProject/Binary6/chromedriver.exe");
  driver = new ChromeDriver();
  driver.get("https://www.facebook.com/");
  }
  
  @Test(dependsOnMethods = "launchBrowser")
  public void Checktitle() {
  String expectedTitle = "Facebook – log in or sign up";
  String ActualTitle = driver.getTitle()	;
  Assert.assertEquals(ActualTitle, expectedTitle);
  }
  
    @Test(dependsOnMethods = "Checktitle")
     public void login() {
  	 WebElement username = driver.findElement(By.xpath("//input[@id='email']"));	  
  	  WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));		
  	  WebElement loginbtn= driver.findElement(By.xpath("//button[@name='login']"));		
  		username.sendKeys("vaishnavi satpute")	;
  		password.sendKeys("1234vaishu");
  		loginbtn.click();	  }
    
  @Test(dependsOnMethods = "login")
  public void teardown() {
  driver.close();	
  
  }
}
