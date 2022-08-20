package seleniumfirstday;

 import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

        public class javascriptexicutrerprogram2 {

	    public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "H:\\seleniumfirstday\\Binary6\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		String DomainName = js.executeScript("return document.domain;").toString();
		System.out.println("Domainname of the site = "+DomainName);
		
		String url = js.executeScript("return document.url").toString();
		System.out.println("URL of the site = "+url);

		String TitleName = js.executeScript("return document.title;").toString();
		System.out.println("Title of the page = "+TitleName);
		
		js.executeScript("window.scrollBy(0,600");

	}

}
