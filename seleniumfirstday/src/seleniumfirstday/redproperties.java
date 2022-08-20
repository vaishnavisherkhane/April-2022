package seleniumfirstday;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class redproperties {

	public static void main(String[] args) throws IOException {
		
	FileInputStream srcfile = new FileInputStream("H:\\seleniumfirstday\\Binary6\\chromedriver.exe");
	Properties prop = new Properties();
	prop.load(srcfile);
	
	System.setProperty(prop.getProperty("key"),prop.getProperty("value"));
	WebDriver driver = new ChromeDriver();
	driver.get(prop.getProperty("url"));
	
	}

}
