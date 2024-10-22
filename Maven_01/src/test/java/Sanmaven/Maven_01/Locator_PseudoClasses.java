package Sanmaven.Maven_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locator_PseudoClasses {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.opencart.com/");
		//driver.findElement(By.cssSelector("a[class='btn btn-link navbar-btn']")).click();
		WebElement ele = driver.findElement(By.cssSelector("a[data-toggle='dropdown']:first-child"));
		ele.click();
	}

}
