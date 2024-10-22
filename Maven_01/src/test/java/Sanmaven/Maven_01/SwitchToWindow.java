package Sanmaven.Maven_01;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.irctc.co.in/");
		driver.findElement(By.xpath("//span[@class='allcircle circletwo']")).click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator it =  handles.iterator();
		String parenthandle = (String) it.next();
		String childhandle = (String) it.next();
	
		
		driver.switchTo().window(childhandle);
		driver.findElement(By.xpath("//i[@class='IRBus']")).click();
		
		
		
		
		

	}

}
