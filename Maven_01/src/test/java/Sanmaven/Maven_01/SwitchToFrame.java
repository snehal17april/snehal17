/*
1  * to switch from one frame to another we can perform it by 3 ways.
 * 1)by id value of iframe
 * 2) by id name of iframe
 * 3) through xpath by ref. variable of web element
 */


package Sanmaven.Maven_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		driver.switchTo().frame("iframeResult"); // through iframe id -"iframeResult"
		
		//driver.switchTo().frame("iframeResult"); // through iframe name -"iframeResult"
		//WebElement clk =driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		//driver.switchTo().frame(clk); //through xpath 
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		

	}

}
