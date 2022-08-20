    package seleniumfirstday;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locat_TagName {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","H:\\seleniumfirstday\\Binary6\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement login = driver.findElement(By.tagName("button"));
	    login.click();
	    
	List<WebElement>  links  =driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	if(links.size() !=0) {
	for(WebElement linkname : links)
		System.out.println(linkname.getText());
	}
	             
	
		

		
		
	
	}
}
