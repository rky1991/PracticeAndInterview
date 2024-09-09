package Codality;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyElementPresent {
	
	
	
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

	@Test(enabled=true)
	public void verifyElementPresent() {
		
		boolean email_present=false;
		boolean password_present=false;
		boolean loginBTN_present = false;
		
		// Verify Email Field is present on page
		try {
			driver.findElement(By.id("email-input"));
			email_present=true;
			driver.findElement(By.id("password-input"));
			password_present=true;
			driver.findElement(By.id("login-button"));
			loginBTN_present=true;

		} catch (Exception e) {
			System.out.println("Exception Catched Element is not present ---->>>>> "+e);

		}
		Assert.assertTrue(email_present, "Email input field is not Present");
		Assert.assertTrue(password_present, "Password Field is not Present");
		Assert.assertTrue(loginBTN_present, "Login Button is not Present");
		driver.quit();

	}
	
	@Test(enabled=true)
	public void verifyElementPresent1() {
		
		boolean email_present=false;
		boolean password_present=false;
		boolean loginBTN_present = false;
		
		// Verify Email Field is present on page
		
		email_present = driver.findElements(By.id("email-input")).size() !=0;
		password_present = driver.findElements(By.id("password-inputt")).size() !=0;
		loginBTN_present = driver.findElements(By.id("login-button")).size() !=0;
		
		
		Assert.assertTrue(email_present, "Email input field is not Present");
		Assert.assertTrue(password_present, "Password Field is not Present");
		Assert.assertTrue(loginBTN_present, "Login Button is not Present");
		driver.quit();

	}

	
	

}
