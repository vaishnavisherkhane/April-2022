         package seleniumfirstday;

          import org.openqa.selenium.By;
          import org.openqa.selenium.WebDriver;
          import org.openqa.selenium.WebElement;
          import org.openqa.selenium.chrome.ChromeDriver;

        public class OtherAttributeCss {

	    public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\seleniumfirstday\\Binary6\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//id with OtherAttribute _ class attribute use kela ;
		
		
		WebElement userid = driver.findElement(By.cssSelector("input#email[class='inputtext _55r1 _6luy']"));
		userid.sendKeys("vaishu@123.com");
		
		// classname with OtherAttribute _id use kela:
		
		WebElement userid1 = driver.findElement(By.cssSelector("input.inputtext._55r1._6luy[id='email'"));
		userid1.sendKeys("vaishu2020@134.com");

	}

}
