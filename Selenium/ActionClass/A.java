package ActionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		List<WebElement> we = driver.findElements(By.xpath("test"));
	}

}
