package Waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebDriverWaitProgram {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./jar/driver/chromedriver.exe");
	}
	WebDriver driver;
	
	@BeforeMethod
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void login_withValidWaits() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Boolean exp_title = wait.until(ExpectedConditions.titleIs("OrangeHRM"));
		Reporter.log("Title Present -->> "+exp_title +"Title is in Text -->"+driver.getTitle());
		System.out.println("Title is in Text -->"+driver.getTitle());
		System.out.println("URL is in Text -->"+driver.getCurrentUrl());
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//div[contains(@class,\"orangehrm-login-action\")]")).click();
		WebElement dashboard = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		wait.until(ExpectedConditions.visibilityOf(dashboard));
		Assert.assertEquals(dashboard.getText(), "Dashboard");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	


}
