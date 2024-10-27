package TabSwitch;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
	static {
		System.setProperty("webdriver.chrome.driver", "./jar/driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();

		// get the windowHandles of browsers
		
		String parent_wh = driver.getWindowHandle();
		System.out.println(parent_wh);
		Set<String> whs = driver.getWindowHandles();
		int size = whs.size();
		System.out.println(size);
	
		for(String awhs : whs) {
			
			System.out.println(awhs);
			System.out.println("Print Title of All Window -->"+driver.getTitle());
		}
		
		driver.quit();

	}

}
