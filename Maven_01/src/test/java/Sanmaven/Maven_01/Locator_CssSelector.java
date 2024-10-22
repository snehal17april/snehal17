package Sanmaven.Maven_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_CssSelector {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//driver.get("https://snapdeal.com/");
		driver.get("https://www.jeevansathi.com/"); //till [4] types
		
		//1) "tagName#id" :
		
		  driver.findElement(By.cssSelector("div#help")).click();
		//driver.findElement(By.cssSelector("div#loginTopNavBar")).click();
		//driver.findElement(By.cssSelector("div#relationshipBlock")).click();
		
		//2) "tagName.className_value" :
		
		//driver.findElement(By.cssSelector("p.cursor-pointer text-sm text-white")).click();
		//driver.findElement(By.cssSelector("svg.mr-2 inline-block h-5 w-5 flex-none text-neutral-500")).click();
		
		//3) "tagName[attribute=attribute_value]"
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("sduragwar.sd@gmail.com");
		//driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		
		//4)"tagName[attribute1=attribute_value1][attribute2=attribute_value2]"
		//driver.findElement(By.cssSelector("svg[fill='currentColor'][class='text-white']")).click();
		//driver.findElement(By.cssSelector("input[id='password'][type='password']")).sendKeys("password");
		
		//5) contains : tagName[attribute* = 'partial attribute value']
		//denoted by * and use along with partial attribute value
		//driver.findElement(By.cssSelector("span[class*='atText']")).click();
		
		//6)startsWith : tagName[attribute^='starting value of attribute']
		// denoted by ^
		//driver.findElement(By.cssSelector("img[title^='Snapd']")).click();
		
		//7) endsWith : tagName[attribute$=end value of attribute]
		// denoted by $ 
		//driver.findElement(By.cssSelector("a['class='hookLink']")).click();
		
		
		
		
				
		
		
	
	}

}
