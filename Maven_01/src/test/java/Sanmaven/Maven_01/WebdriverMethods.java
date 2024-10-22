package Sanmaven.Maven_01;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//Manage method():
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.in/");
		System.out.println("get(): use to hit the URL");
		
		driver.getTitle();
		System.out.println("getTitle() : get the title of current Webpage - " +" "+driver.getTitle());
		
		driver.getCurrentUrl();
		System.out.println("getCurrentUrl() : returns URL of current webpage - " +" "+driver.getCurrentUrl());
		
		//driver.getPageSource();
		//System.out.println("getPageSource() : Capture the source code of the webpage - "+" "+driver.getPageSource());
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		System.out.println("findElement() : find the web element using locator");
		
		driver.findElements(By.xpath("//input[@id='twotabsearchtextbox']"));
		System.out.println("findElements() : find the multiple web element using locator ");
		
		driver.getWindowHandle();
		System.out.println("getWindowHandle() : get the window ID of specific or current window : " + driver.getWindowHandle());
		
		//driver.getWindowHandles();
		//System.out.println("getWindowHandles() : get the window ID of all the associated windows : " + driver.getWindowHandles() );
		
		//navigate():
		
		driver.navigate().to("https://www.facebook.com/");
		System.out.println("navigate().to() : navigate to URL");
		driver.navigate().back();
		System.out.println("navigate().back(): moves to backpage");
		driver.navigate().forward();
		System.out.println("navigate().forward(): moves to nextpage");
		driver.navigate().refresh();
		System.out.println("navigate().refresh(): refresh the current webpage");
		
		//switchTo():
		
				//driver.switchTo().window(null);
				//driver.switchTo().frame(0);
				//driver.switchTo().alert(); 
		
		driver.close();
		System.out.println("close() : Close the current window ");
		
		driver.quit();
		System.out.println("quit() : Quit or close all the associated window");	
		
	}

}
