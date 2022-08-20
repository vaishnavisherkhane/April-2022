     package seleniumfirstday;

     import org.openqa.selenium.htmlunit.HtmlUnitDriver;

     public class headless {

	  public static void main(String[] args) {
	
	 HtmlUnitDriver driver = new HtmlUnitDriver();
		
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
	}

}
