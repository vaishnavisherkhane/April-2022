    package seleniumfirstday;

     import org.openqa.selenium.By;
     import org.openqa.selenium.Dimension;
     import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;

    public class Axesmethod {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","H:\\seleniumfirstday\\Binary6\\chromedriver.exe")	;
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	
	//driver.manage().window().maximize();
	//mobile dimenston 
	Dimension d = new Dimension(400,621);
	driver.manage().window().setSize(d);
	
	
	//following
	//WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']//following::div"));
	       
	 //ancestor
	//WebElement customerservice = driver.findElement(By.xpath("//a[text()='Customer Service']//ancestor::div"));
	          
	// preceding
	//WebElement Electronics   = driver.findElement(By.xpath("//a[text()=' Electronics ']//preceding::img"));
	
	// following-sibling
	//WebElement  BestSeller  = driver.findElement(By.xpath("//a[text()='Best Sellers']//following-sibling::a"));
	
	// preceding-sibling
//	WebElement Amazonprime  = driver.findElement(By.xpath("//span[text()='Amazon Prime']//parent::div//preceding-sibling::span"));
	
	// parent 
	//WebElement    = driver.findElement(By.xpath(""));
	
	
	
		
		
	}

}
