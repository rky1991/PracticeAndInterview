package SelBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserLaunch {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./jar/driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.get("https://www.amazon.in");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nav-logo-sprites")));
		System.out.println("Homepage is found");
		driver.findElement(By.xpath("//div[@id='nav-xshop']//a[text()='Mobiles']")).click();
		String pricerange="//span[text()='Price']/../following-sibling::ul//span[text()='₹10,000 - ₹20,000']";
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath(pricerange)).click();
		
		
		
	}
	
	

}
