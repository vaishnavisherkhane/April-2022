package seleniumfirstday;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JAVAscripExicuter20 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","H:\\seleniumfirstday\\Binary6\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	// URL pass kela    js.executescript ("Window.Loction=' ' " )
	
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("Window.Location='https://demoqa.com/text-box'");
    
    driver.manage().window().maximize();
    
   // value pass keli    js.executeScript("arguments[0].value=' '] ya method ne
     //full name: 
    WebElement username = driver.findElement(By.xpath("//input[@id='userName']"));
    js.executeScript("arguments[0].value='vaishnavi satpute", username);
    
    // submitbttn vr click kela   js.executeScript("arguments[0].click()"]
    
    WebElement submitbtn = driver.findElement(By.xpath("//button[@id='submit']"));
    js.executeScript("arguments[0].click()",submitbtn);
    
    // alert pass kela js.executescript("alert('     ')");
    js.executeScript("alert('welcome to javascript exicuter')");
    
    
	}

}
