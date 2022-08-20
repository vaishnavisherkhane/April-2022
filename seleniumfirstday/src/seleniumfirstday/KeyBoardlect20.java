package seleniumfirstday;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardlect20 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "H:\\seleniumfirstday\\Binary6\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
     driver.get("https://demoqa.com/text-box");
     driver.manage().window().maximize();
     
     Actions act = new Actions(driver);
     
     WebElement usermane = driver.findElement(By.xpath("//input[@id='userName']"));
     act.sendKeys(usermane, "VAISHNAVI SATPUTE").perform();
     
     act.sendKeys(Keys.TAB).perform();
     act.sendKeys("vaishnavisatpute@gmail.com").perform();
     
     act.sendKeys(Keys.TAB).perform();
     act.sendKeys("AT DHARUR UDAY_NAGAR PIN=431124").perform();
     
     act.keyDown(Keys.CONTROL);
     act.sendKeys("a");
     act.build().perform();
     act.keyUp(Keys.CONTROL).perform();
     
     act.keyDown(Keys.CONTROL);
     act.sendKeys("c");
     act.build().perform();
     act.keyUp(Keys.CONTROL).perform();
     
     act.sendKeys(Keys.TAB).perform();
     act.keyDown(Keys.CONTROL);
     act.sendKeys("v");
     act.build().perform();
     act.keyUp(Keys.CONTROL).perform();
     
     // For submit 
     act.sendKeys(Keys.TAB).perform();
     act.sendKeys(Keys.ENTER).perform();
    
     // scrolling method
     WebElement forms = driver.findElement(By.xpath("//div[text()='Forms']"));
     act.scrollToElement(forms).perform();
      
     
     
     
     
     
	}

}
