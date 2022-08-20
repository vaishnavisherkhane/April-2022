package TESTNGprogramsALL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

    public class NewTest1 {
	public WebDriver driver;
	
  @Test
  public void launchbrowser() {
	  
    System.setProperty("webdriver.chrome.driver", "/TESTngProject/Binary6/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
  }
  
  @Test
  
  public void login() {
  WebElement username = driver.findElement(By.xpath("//input[@id='email']"));	  
  WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));		
  WebElement loginbtn= driver.findElement(By.xpath("//button[@name='login']"));		
	username.sendKeys("vaishnavi satpute")	;
	password.sendKeys("1234vaishu");
	loginbtn.click();	  
  }	  
	  
	  
  }
  
  
  
  
  
  
  
  
  

