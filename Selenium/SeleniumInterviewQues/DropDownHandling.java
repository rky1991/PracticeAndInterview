package SeleniumInterviewQues;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownHandling {
	
	WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "./jar/driver/chromedriver.exe");
	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letcode.in/dropdowns");
		Thread.sleep(1000);

	}
	
	@Test
	public void selectDropDown() {
		WebElement selectFruit = driver.findElement(By.id("fruits"));
		Select select = new Select(selectFruit);
		select.selectByVisibleText("Apple");
		String selectedFruit = driver.findElement(By.xpath("//p[text()='You have selected Apple']")).getText();
		Assert.assertEquals(selectedFruit, "You have selected Apple");
	}
	
	@Test
	public void multiSelectDropDown() throws InterruptedException {
		WebElement selectHero = driver.findElement(By.id("superheros"));
		Select select = new Select(selectHero);
		if(select.isMultiple()) {
			
			select.selectByVisibleText("Batman");
			select.selectByVisibleText("Aquaman");
		}
		else {
			select.selectByVisibleText("Aquaman");
		}
		Thread.sleep(1000);
	}
	
	@Test
	public void selectLanguageDropDown() throws InterruptedException {
		WebElement selectFruit = driver.findElement(By.id("lang"));
		Select select = new Select(selectFruit);
		List<WebElement> options = select.getOptions();
		System.out.println("Total option size -->"+options.size());
		select.selectByIndex(options.size()-1);
		Thread.sleep(1000);
		
		for(WebElement option :options ) {
			
			System.out.println(option.getText());
			
		}
	}
	
	@Test
	public void selectCountryDropDown() throws InterruptedException {
		WebElement selectFruit = driver.findElement(By.id("country"));
		Select select = new Select(selectFruit);
		select.selectByValue("India");
		System.out.println("Selected Option -->"+select.getFirstSelectedOption().getText());
		
		Thread.sleep(1000);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
