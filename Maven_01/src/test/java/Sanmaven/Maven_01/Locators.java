package Sanmaven.Maven_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		
		// 1) ID locator : By.id("id Attribute value")
		
		driver.findElement(By.id("email")).sendKeys("Snehal.duragwar.9");
		driver.findElement(By.id("pass")).sendKeys("MH32#af7937");
		
		// 2) className : By.className("className attribute value")
		
		driver.findElement(By.className("_9lsa")).click(); //click on eye button
		Thread.sleep(5000);
		driver.findElement(By.className("_9lsa")).click(); //again click on eye button
		Thread.sleep(5000);
		
		// 3) name : 
		
		//driver.findElement(By.name("login")).click();
		
		// 4) LinkText : By.("Text associated with the link")(links are identified by - href attribute)
		
		//driver.findElement(By.linkText("Sign Up")).click();
		//driver.findElement(By.linkText("Messenger")).click();
		
		// 5) partial link text : same as linkText but take part of the text 
		
		//driver.findElement(By.partialLinkText("Insta")).click(); //Instagram -Insta
		//driver.findElement(By.partialLinkText("eads")).click();  //Threads - eads
		driver.findElement(By.partialLinkText("ervic")).click();   // Services - ervic

		/*
		 * 6) tagname :
		 * - Used to represent HTML tags of the element.
		 * - generally use when working on multiple elements.
		 * - use to find out how many links are present in web page.
		 * - syntax : driver.findelement(By.tagName("name of the tag");
		 * - Multiple tags are present in a web page so not preffered to use for locating web element.
		 */
		
		

	}

}
