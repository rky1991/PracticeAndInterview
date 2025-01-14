package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleSuggetionClick {
	static {
		System.setProperty("webdriver.chrome.driver", "./jar/driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://Google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//div[@id='Zrbbw' and @aria-label='selenium latest version']")))
		.click().perform();
	}

}
