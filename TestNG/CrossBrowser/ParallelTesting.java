package CrossBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTesting {
	/*
	 * If we just execute the above code as TestNG Test, the tests will execute
	 * serially. To run them parallelly, head over to the testng.xml file, and write
	 * the following code:
	 * ------>>>>> Xml File --> This Parallel Execution based on Methods
	 * <suite name = "Parallel Testing Suite"> 
	 * <test name = "Parallel Tests"parallel = "methods"> 
	 * <classes> <class name = "ParallelTest" />
	 *  </classes>
	 * </test>
	 *  </suite>
	 */

	WebDriver driver;

	static {
		System.setProperty("webdriver.chrome.driver", "./jar/driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./jar/driver/geckodriver.exe");

	}

	@Test
	public void launchChromeBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		System.out.println("Crome Browser is launched ");
		System.out.println("Thread Id --> "+Thread.currentThread().threadId());
		driver.get("https://www.google.com");
		driver.quit();
	}

	@Test
	public void launchFireFoxBrowser() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		System.out.println("FireFox Browser is launched ");		
		System.out.println("Thread Id --> "+Thread.currentThread().threadId());
		driver.get("https://www.google.com");
		driver.quit();
	}

}
