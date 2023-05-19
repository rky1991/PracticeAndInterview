package anottations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Anotations {
	
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
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Amazon.in");
		
	    driver.findElement(By.xpath("(//input[@class='gNO89b' and @value='Google Search'])[2]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//cite[text()='http://www.amazon.in']/../../h3")).click();
	    
	    WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nav-logo-sprites")));
		System.out.println("Homepage is found");
		
	 		
	}
	
	@AfterMethod
	public void CloseChrome() {
		driver.close();
		driver.quit();
	}
	
	
	
	

}
