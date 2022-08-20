package TESTNGprogramsALL;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

 	public class FBdataTEST {
	public WebDriver driver;
	
    @Test(dataProvider = "dp")
  public void fblogin(String username, String password) {
  System.setProperty("webdriver.chrome.driver", "/TESTngProject/Binary6/chromedriver.exe");
   driver = new ChromeDriver();
   driver.get("https://WWW.facebook.com");
   WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
   WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
   WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
   UserName.sendKeys(username);
   Password.sendKeys(password);
   LoginBtn.click();
  // String ExpectedTitle = "Facebook";
  // String ActualTitle = driver.getTitle();
  // Assert.assertEquals(ActualTitle, ExpectedTitle);
    }
  
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "vishalsherkhane98@gmail.com" ,"Vishlfb01@#"},
      new Object[] { "vishaal123" ,"Vishl01" },
    };
  }
}
