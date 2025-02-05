package SeleniumInterviewQues;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertExamples {
	
	WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "./jar/driver/chromedriver.exe");
	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letcode.in/alert");
		Thread.sleep(1000);

	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void testAcceptAlert() throws InterruptedException {
		WebElement alertElement=driver.findElement(By.id("accept"));
		alertElement.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text -->"+alert.getText());
		Thread.sleep(1000);
		alert.accept();
		//change focus from alert to current page--->>
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
	}
	
	@Test
	public void testDidmisAlertAndReadText() throws InterruptedException {
		WebElement alertElement=driver.findElement(By.id("confirm"));
		alertElement.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text -->"+alert.getText());
		Thread.sleep(1000);
		alert.dismiss();
		//change focus from alert to current page--->>
		driver.switchTo().defaultContent();
		
	}
	

	@Test
	public void testSendKeysInAlert() throws InterruptedException {
		WebElement alertElement=driver.findElement(By.id("prompt"));
		alertElement.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text -->"+alert.getText());
		Thread.sleep(1000);
		alert.sendKeys("Rahul");
		Thread.sleep(1000);
		alert.accept();
		//change focus from alert to current page--->>
		driver.switchTo().defaultContent();
		
	}
	
	@Test
	public void testMordenAlert() throws InterruptedException {
		WebElement alertElement=driver.findElement(By.id("modern"));
		alertElement.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement alertText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Modern Alert - Some people address me as sweet alert as well ']")));
		String text=alertText.getText();
		System.out.println("Morden Alert Text ---->>"+text);
		driver.findElement(By.xpath("//div[@class='card']//button[contains(@class,'close')]")).click();
		Thread.sleep(2000);
		
	}


}
