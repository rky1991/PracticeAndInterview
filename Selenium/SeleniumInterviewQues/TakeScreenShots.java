package SeleniumInterviewQues;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TakeScreenShots {

	WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "./jar/driver/chromedriver.exe");
	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(1000);
		
	}

	@Test
	public void takeScreenShots() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File ss = ts.getScreenshotAs(OutputType.FILE);
		File fs = new File("./ScreenShots/OrangHRM_LoginPage_photo.png");
		FileUtils.copyFile(ss, fs);
	
		 
//			TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
//			byte[] screenShoot = takeScreenShot.getScreenshotAs(OutputType.BYTES);
//			scenario.attach(screenShoot, "image/png", scenarioName);

	}

}
