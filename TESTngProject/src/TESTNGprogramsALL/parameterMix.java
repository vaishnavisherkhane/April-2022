package TESTNGprogramsALL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterMix {
	
	@Parameters({"val1","val2","browser"})
   @Test
   
  public void f(int v1, int v2, String browser ) {
  int sum = v1+v2;
  System.out.println("Addition is"+sum);
  if(browser.equalsIgnoreCase("chrome")){
  System.setProperty("webdriver.chrome.driver","/TESTngProject/Binary6/chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("");
 }

	else if	(browser.equalsIgnoreCase("edge")) {
	  System.setProperty("webdriver.edge.driver","/TESTngProject/Binary6/msedgedriver.exe");
	  WebDriver driver = new EdgeDriver();
	  driver.get("https://WWW.facebook.com");
	}

	else if	(browser.equalsIgnoreCase("gecko")) {
	  System.setProperty("webdriver.gecko.driver","/TESTngProject/Binary6/geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://WWW.facebook.com");	
	
	
	
	}	
	
}
}
