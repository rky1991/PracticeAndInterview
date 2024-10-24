package TabSwitch;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {
	
	 
	
	public static void main(String[] args) throws Exception {


		System.setProperty("webdriver.chrome.driver", "./jar/driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Load the website
		//driver.get("http://www.naukri.com/");
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();

		// It will return the parent window name as a String
		String parent=driver.getWindowHandle();
		System.out.println( "Parent Window Handle -->"+parent);

		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);
		System.out.println( "Child Window Handle -->"+parent);

		System.out.println(driver.switchTo().window(child_window).getTitle());

		driver.close();
		}

		}
		//switch to the parent window
		driver.switchTo().window(parent);
		driver.quit();

		}

}
