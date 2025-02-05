package FramesHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameHandlingRedBus {

	WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "./jar/driver/chromedriver.exe");
	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letcode.in/frame");
		Thread.sleep(1000);

	}

	@Test
	public void testFrames() {
		//Parent frame  
		WebElement iframe = driver.findElement(By.id("firstFr"));
		//Move to Parent frame
		driver.switchTo().frame(iframe);
		By byOB = By.xpath("//label[@class='label']/following-sibling::div/input[@placeholder='Enter name']");
		By obLName=By.xpath("//label[text()='Last Name']/following-sibling::div/input[@placeholder='Enter email']");
		//Enter First Name and Last name under parent frame
		WebElement enterName =driver.findElement(byOB);
		enterName.sendKeys("Rahul");
		WebElement enterLastName =driver.findElement(obLName);
		enterLastName.sendKeys("Kumar");
		
		//Move to inside inner frame to enter email --->
		WebElement childFrame = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(childFrame);
		driver.findElement(By.xpath("//label[text()='Email']/following-sibling::div/input[@placeholder='Enter email']")).sendKeys("rahulkumar@gmail.com");
		//Move control to Parent frame -->>
		driver.switchTo().parentFrame();
		String enteredText = driver.findElement(By.xpath("//div[@class='content mt-4']/p")).getText();
		Assert.assertEquals(enteredText.contains("Rahul Kumar"), true, "actual and Expected is not matched ");
		

	}

}
