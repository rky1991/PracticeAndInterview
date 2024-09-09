package Codality;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyLoginMessages {
	
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
		driver.get(
				"https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_login_page/9a83bda125cd7398f9f482a3d6d45ea4/static/attachments/reference_page.html");
	}
	
	@Test(enabled = false)
	public void loginSuccessMessage() {
		WebElement email = driver.findElement(By.id("email-input"));
		WebElement password = driver.findElement(By.id("password-input"));
		WebElement loginButton = driver.findElement(By.id("login-button"));
		// Verify welcome message is present on page
		email.sendKeys("login@codility.com");
		password.sendKeys("password");
		loginButton.click();
		WebElement welcomeMessage = driver.findElement(By.xpath("//div[@class]"));
		System.out.println("Message From UI--> "+welcomeMessage.getText());
		Assert.assertEquals(welcomeMessage.getText(), "Welcome to Codility");
		driver.quit();

	}
	
	@Test
	public void blank() {
		WebElement email = driver.findElement(By.id("email-input"));
		WebElement password = driver.findElement(By.id("password-input"));
		WebElement loginButton = driver.findElement(By.id("login-button"));
		// Verify invalid message is present on page
		email.sendKeys("unknown@codility.com");
		password.sendKeys("password");
		loginButton.click();
		WebElement errorMessage = driver.findElement(By.id("messages"));
		System.out.println("Message we got from UI -->"+errorMessage.getText());
		assertEquals (errorMessage.getText(),"You shall not pass! Arr!");

	}


}
