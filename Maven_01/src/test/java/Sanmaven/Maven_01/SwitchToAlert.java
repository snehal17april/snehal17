package Sanmaven.Maven_01;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.selenium.dev/selenium/web/alerts.html");
		
		driver.findElement(By.xpath("//a[@id='alert']")).click();
		
		Alert alrt = driver.switchTo().alert();
		
		alrt.accept(); // click on ok
		
		String str = alrt.getText(); // display string in alert
		System.out.println("String present in alert : " + str);
		
		alrt.dismiss(); // dismiss alert without accepting it.

	}

}
