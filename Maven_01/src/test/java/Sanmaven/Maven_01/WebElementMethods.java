package Sanmaven.Maven_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://snapdeal.com/");
		System.out.println("homepage title : " + driver.getTitle());
		
		WebElement Searchbox  = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		Searchbox.sendKeys("shoes");
		driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		System.out.println("Webpage title after search : " + driver.getTitle());
		
		driver.findElement(By.xpath("//img[@title=\"Hakkel Multi Color Men's Outdoor Shoes\"]")).click();
		

	}

}
