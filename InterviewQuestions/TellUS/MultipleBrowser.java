package TellUS;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleBrowser {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("URL");
		Set<String> set = driver.getWindowHandles();
		
		for(String st : set) {
			 boolean title = driver.switchTo().window(st).getTitle().contains("[^0-9]");
		}
	}

}
