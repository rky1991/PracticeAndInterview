package CrossBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LaunchFireFoxBrowser {
	
	/*
	 * ----->>>> Class Lavel Parallel Cross Browser Testing <<<-----------------
	 * <suite name="Suite Parallel Cross browser testing Class Lavel">
	 *  <test thread-count="2" name="Parallel Test" parallel = "classes"> 
	 *  <classes>
	 *  <classname="CrossBrowser.LaunchChromeBrowser"/> 
	 *  <classname="CrossBrowser.LaunchFireFoxBrowser"/> 
	 *  </classes> 
	 *  </test> <!-- Test -->
	 * </suite> <!-- Suite -->
	 */
	
WebDriver driver;
	
	static {
		
		System.setProperty("webdriver.gecko.driver", "./jar/driver/geckodriver.exe");
		
	}
	
	@BeforeMethod
	public void beforeTestChrome() {
		System.out.println(" Before Method ");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		System.out.println("FireFox Browser is launched ");
		driver.get("https://www.google.com");
	}
	
	@Test
	public void testChrome() throws InterruptedException {
	
		
		Assert.assertTrue(true);
		System.out.println("FireFox browser successfully launched");
		System.out.println("Thread Id --> "+Thread.currentThread().getId());
	 		
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("All test are done Closing the browser");
		driver.quit();
	}


}
