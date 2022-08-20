    package seleniumfirstday;

   import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class absolutexpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","H:\\seleniumfirstday\\Binary6\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.facebook.com");
   WebElement useremail = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
	 useremail.sendKeys("Vishu@1234.com");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
