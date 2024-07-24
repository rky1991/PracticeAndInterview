package Codality;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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
		driver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_login_page/9a83bda125cd7398f9f482a3d6d45ea4/static/attachments/reference_page.html");
	}
	
	@Test
	public void testChrome() throws InterruptedException {
		 WebElement email=driver.findElement(By.id("email-input"));
		  WebElement password=driver.findElement(By.id("password-input"));
		  WebElement loginButton=driver.findElement(By.id("login-button"));
		  //Verify Email Field is present on page
		  try{
		      Boolean emV=email.isDisplayed();
		  Boolean pwD=password.isDisplayed();
		  Boolean lgBtn=loginButton.isDisplayed();

		  }
		  catch(Exception e){

		  }
		
	 		
	}
	
	@Test
	public void testScenario2() {
	  WebElement email=driver.findElement(By.id("email-input"));
	  WebElement password=driver.findElement(By.id("password-input"));
	  WebElement loginButton=driver.findElement(By.id("login-button"));
	  //Verify welcome message is present on page
	  email.sendKeys("login@codility");
	  password.sendKeys("password");
	  loginButton.click();
	  WebElement welcomeMessage=driver.findElement(By.xpath("//div[@class]"));
	  System.out.println(welcomeMessage.getText());
	  assertEquals("Welcome to Codility", welcomeMessage.getText());

	}
	
	@Test
	public void testScenario3() {
	  WebElement email=driver.findElement(By.id("email-input"));
	  WebElement password=driver.findElement(By.id("password-input"));
	  WebElement loginButton=driver.findElement(By.id("login-button"));
	  //Verify invalid message is present on page
	  email.sendKeys("unknown@codility.com");
	  password.sendKeys("password");
	  loginButton.click();
	  WebElement errorMessage=driver.findElement(By.id("messages"));
	  System.out.println(errorMessage.getText());
	  assertEquals("You shall not pass! Arr!",errorMessage.getText());

	}
	
	@AfterMethod
	public void CloseChrome() {
		driver.close();
		driver.quit();
	}
	
	
	
	

}
