package seleniumfirstday;

 
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.chrome.ChromeDriver;

    public class locatorclaas {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","H:\\seleniumfirstday\\Binary6\\chromedriver.exe");
		// id locator
		
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://kite.zerodha.com/");
		   WebElement usermail = driver.findElement(By.id("userid"));
		   WebElement password = driver.findElement(By.id("password"));
		   
		 //  className locator
		   WebElement Login = driver.findElement(By.className("button-orange"));
		    usermail.sendKeys("vaishu@.com");
		    password.sendKeys("123456");
		    Login.click();
		
	}

}
