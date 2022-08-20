            package seleniumfirstday;

            import java.time.Duration;

import org.openqa.selenium.By;
            import org.openqa.selenium.WebDriver;
            import org.openqa.selenium.WebElement;
             import org.openqa.selenium.chrome.ChromeDriver;

            public class SynchronizationMethod {

        	public static void main(String[] args) throws InterruptedException {
        		
            System.setProperty("webdriver.chrome.driver","H:\\seleniumfirstday\\Binary6\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com");
            
            // implicit wait 
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            
            // page load wait
             driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
             
             WebElement  CreateNewAcc  = driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti ')]"));
             CreateNewAcc.click();
            
                //static wait
          //  Thread.sleep(5000);
            
            WebElement Firstname = driver.findElement(By.xpath("//input[@type='text'and @name='firstname']"));
            Firstname.sendKeys("vaishnavi");
		
            WebElement surname = driver.findElement(By.xpath("//input[@type='text'and @name='lastname']"));
            surname.sendKeys("satpute");
	}

}
