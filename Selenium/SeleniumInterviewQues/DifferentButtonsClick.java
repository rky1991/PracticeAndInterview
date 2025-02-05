package SeleniumInterviewQues;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DifferentButtonsClick {

	WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "./jar/driver/chromedriver.exe");
	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letcode.in/buttons");
		Thread.sleep(1000);

	}

	@Test
	public void testDifferentButtons() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.findElement(By.id("home")).click();
		wait.until(ExpectedConditions.urlToBe("https://letcode.in/"));
		driver.navigate().back();
		wait.until(ExpectedConditions.urlToBe("https://letcode.in/buttons"));
		// Find Location of Element --> Using GetLocation
		WebElement findLocationButton = driver.findElement(By.id("position"));
		Point point = findLocationButton.getLocation();
		System.out.println("X- Cordinates -->" + point.getX());
		System.out.println("Y- Cordinates -->" + point.getY());

		// GetRect New command
		Rectangle rect = findLocationButton.getRect();
		System.out.println("X- Cordinates -->" + rect.getX());
		System.out.println("Y- Cordinates -->" + rect.getY());
		// *********************** Get Color of element --->>>>>>>>
		WebElement getColor = driver.findElement(By.id("color"));
		System.out.println("Color of an Element -->" + getColor.getCssValue("background-color"));

		// Get Properties of button height and width of button ---->>>>
		WebElement findHightAndWidth = driver.findElement(By.id("property"));
		Dimension d = findHightAndWidth.getSize();
		System.out.println(d.height);
		System.out.println(d.width);
		// Using react we can get height and width

		boolean disableElement = driver.findElement(By.id("isDisabled")).isDisplayed();
		System.out.println(disableElement);

		// Click and Hold On element -->>>
		WebElement clickAndHoldBtn = driver.findElement(By.xpath("//h2[text()='Button Hold!']"));
		Actions ac = new Actions(driver);
		ac.clickAndHold(clickAndHoldBtn).perform();
		Thread.sleep(1000);
		System.out.println(clickAndHoldBtn.getText());
		Assert.assertEquals(clickAndHoldBtn.getText(), "Button has been long pressed");
		ac.release().perform();
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
