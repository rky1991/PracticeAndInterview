package TabSwitch;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchOnTabs {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./jar/driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newTabBtn")).click();
		

		// get the windowHandles of browsers
		
		String parent_wh = driver.getWindowHandle();
		System.out.println(parent_wh);
		String parentPageTitle = driver.getTitle();
		System.out.println("Parent -->"+parentPageTitle);
		Set<String> whs = driver.getWindowHandles();
		int size = whs.size();
		System.out.println(size);
		List ls = new ArrayList(whs);
		System.out.println(ls.get(0));
		WebDriver parent1 = driver.switchTo().window(ls.get(0).toString());
		System.out.println("Parent -->"+parent1.getTitle());
		WebDriver childtitle = driver.switchTo().window(ls.get(1).toString());
		System.out.println("Child -->"+childtitle.getTitle());
		
		driver.quit();
		

}
	
}
