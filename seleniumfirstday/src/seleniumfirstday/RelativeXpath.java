      package seleniumfirstday;

      import org.openqa.selenium.By;
      import org.openqa.selenium.WebDriver;
      import org.openqa.selenium.WebElement;
      import org.openqa.selenium.chrome.ChromeDriver;

      public class RelativeXpath {

	 public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","H:\\seleniumfirstday\\Binary6\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com");
	
	  // Relative Xpath.
	
	//WebElement userid = driver.findElement(By.xpath("//input[@id='email']"));
	 // userid.sendKeys("vaishu@123.com");

	  // Relative Xpath methods 1:contains method
	 
	   WebElement username = driver.findElement(By.xpath("//input[contains(@id,'e')]"));
	   username.sendKeys("avbncm");
	   
	   WebElement password = driver.findElement(By.xpath("//input[contains(@name,'pass')]"));
	   password.sendKeys("1234567");
	   
       WebElement login = driver.findElement(By.xpath("//button[contains(@name,'log')]"));
	   login .click();
	   
	   //Relative xpath Starts-with method
	   
	   WebElement Loginbutton = driver.findElement(By.xpath("//button[starts-with(@class,'_42ft ')]"));
	   Loginbutton.click();
	   
	  
}
}