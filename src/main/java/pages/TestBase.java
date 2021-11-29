package pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	
	 public static WebDriver initDriver() {
		  System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		  driver.get("http://techfios.com/test/101/");
		return driver;
	}
//
//	public void teardown() {
//		driver.close();
//		driver.quit();
//		
//		
//	}
	
}