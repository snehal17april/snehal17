package Sanmaven.Maven_01;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver(); //invoke chrome browser
		
		//WebDriver driver1 = new EdgeDriver();
		//WebDriver driver2 = new FirefoxDriver();
		//WebDriver driver3 = new SafariDriver();
		
		driver.manage().window().maximize(); //maximize the window
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.flipkart.com/");
		

	}

}
