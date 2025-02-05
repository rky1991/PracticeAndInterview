package SeleniumInterviewQues;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShadowDomExample {
	
	WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "./jar/driver/chromedriver.exe");
	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letcode.in/shadow");
		Thread.sleep(1000);

	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	//Directly we can not intract with the dom of Shadow dome element.
	@Test
	public void testShadowDom() {
		
		WebElement shadowHost = driver.findElement(By.id("open-shadow"));
		shadowHost.ge
		
	}


}
