package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSel {

//	static {
//		System.setProperty("webdriver.chrome.driver", "./jar/driver/chromedriver.exe");
//	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.get("https://www.google.com");

		WebElement searchBox = driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
		searchBox.click();
		searchBox.sendKeys("delhi to goa flight");

		driver.findElement(By.xpath("//*[@class='erkvQe']/li//b[contains(text(),'indigo')]")).click();

	}
}
