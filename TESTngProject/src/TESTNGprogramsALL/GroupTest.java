package TESTNGprogramsALL;

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.testng.Assert;
    import org.testng.annotations.Test;

    public class GroupTest {
	public WebDriver driver;
	
    @Test(groups = {"sanity","regression"},priority = 1)
    public void launchBrowser() {
    System.setProperty("webdriber.chrome.driver","/TESTngProject/Binary6/chromedriver.exe")	;
    driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    }
    
    @Test(groups = "regression",priority = 2)
    public void Checktitle() {
    String expectedTitle =	"Facebook – log in or sign up";
    String ActualTitle = driver.getTitle()	;
    Assert.assertEquals(ActualTitle, expectedTitle);
    }
      @Test(groups = "sanity",priority = 3)
       public void login() {
    	 WebElement username = driver.findElement(By.xpath("//input[@id='email']"));	  
    	  WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));		
    	  WebElement loginbtn= driver.findElement(By.xpath("//button[@name='login']"));		
    		username.sendKeys("vaishnavi satpute")	;
    		password.sendKeys("1234vaishu");
    		loginbtn.click();	  }
      
    @Test(groups = {"sanity","regression"},priority = 40)
    public void teardown() {
    driver.close();	
    }
}
