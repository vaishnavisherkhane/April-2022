package seleniumfirstday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseaction19 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "H:\\seleniumfirstday\\Binary6\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/buttons");
	driver.manage().window().maximize();
	
	Actions act = new Actions(driver);
	WebElement doubleclickbtn = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
    act.doubleClick(doubleclickbtn).perform();
    
    WebElement rightClickbtn = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
    act.contextClick(rightClickbtn).perform();
    
    WebElement Buttons = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
    act.moveToElement(Buttons).perform();
    
    WebElement DynamicClick = driver.findElement(By.xpath("//button[text()='Click Me']"));
    act.click(DynamicClick).perform();
	
	}

}
