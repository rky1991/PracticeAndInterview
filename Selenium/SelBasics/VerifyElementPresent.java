package SelBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyElementPresent {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		try {
			driver.findElement(By.xpath("//*[ext]"));
		}
		catch(Exception e){
			System.out.println("Element is not present --"+e);
		}
		
	}

}
