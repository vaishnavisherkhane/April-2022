package TESTNGprogramsALL;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardSoftAssertPro {
	public WebDriver driver;
  @Test
  public void facebookLaunch1() {
  System.setProperty("webdriver.chrome.driver","/TESTngProject/Binary6/chromedriver.exe");
  driver = new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  driver.get("https://www.facebook.com");
  
  String ExpectedTitle = "Facebook – log in or sign up";
  String ActualTitle = driver.getTitle();	
  Assert.assertEquals(ActualTitle, ExpectedTitle);
  
  WebElement fblogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
  Assert.assertTrue(fblogo.isDisplayed()); 
  System.out.println("welcome to test ng assert");
  }
  @Test
  public void launchKite() {
  System.setProperty("webdriver.chrome.driver","/TESTngProject/Binary6/chromedriver.exe");
  driver = new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  driver.get("https://kite.zerodha.com/");
  
  String ExpectedTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
  String ActualTile = driver.getTitle();
  SoftAssert SAssert = new  SoftAssert();
  SAssert.assertEquals(ActualTile, ExpectedTitle);
  
  WebElement kitelogo = driver.findElement(By.xpath("//img[contains(@src,'kite-logo')]"));
  SAssert.assertTrue(kitelogo.isDisplayed());
  System.out.println("welcome to testng assert");
  SAssert.assertAll();
  
  
}  
}
