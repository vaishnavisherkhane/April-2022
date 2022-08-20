package seleniumfirstday;

   import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class ParenttoChildCssSElector {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "H:\\seleniumfirstday\\Binary6\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//css Selector with parent to child method
		
		WebElement loginbtn = driver.findElement(By.cssSelector("div>button"));
		 loginbtn.click();
		 
		
	}

}
