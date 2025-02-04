package listners;

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

public class TestClass {

	WebDriver driver;

	static {

		System.setProperty("webdriver.chrome.driver", "./jar/driver/chromedriver.exe");

	}

	@BeforeMethod
	public void beforeTestChrome() {
		System.out.println(" Before Method ");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		System.out.println("Chrome Browser is launched ");
		driver.get("https://www.google.com");
	}

	@Test
	public void testChrome() throws InterruptedException {

		Assert.assertTrue(true);
		System.out.println("Chrome browser successfully launched");
		System.out.println("Thread Id --> " + Thread.currentThread());

	}

	@AfterTest
	public void tearDown() {
		System.out.println("All test are done Closing the browser");
		driver.quit();
	}

}
