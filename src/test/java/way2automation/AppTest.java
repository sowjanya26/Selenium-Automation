package way2automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	public static Properties config = new Properties();
	public static WebDriver driver;
	@Test
	public void testLogin() throws IOException{
		FileInputStream fIS = new FileInputStream(System.getProperty("user.dir")+"\\src\\dd_Properties\\configure.properties");
		config.load(fIS);
		
		System.getProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(config.getProperty("website"));
	}
	@AfterTest
	public void tearDown(){
		driver.close();
	}
   
}
