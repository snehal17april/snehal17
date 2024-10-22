package Sanmaven.Maven_01;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Secreenshot extends Dynamic_code {

	public static void main(String[] args) throws IOException {
		
		launch_browser("chrome");
		
		//Taking screenshot of browser launch
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File Target = new File("./Evidences/launch_browser.png");
		FileHandler.copy(Source, Target);
		
		hiturl("https://snapdeal.com/");
		
		//Taking Screenshot of hit url
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File Source1 = ts1.getScreenshotAs(OutputType.FILE);
		File Target1 = new File("./Evidences/hiturl.png");
		FileHandler.copy(Source1, Target1);
		
		driver.findElement(By.xpath("//input[@id='inputValEnter']")).sendKeys("Kitchen Appliences");
		
		//Taking Screenshot of Searchbox with entered value
		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File Source2 = ts2.getScreenshotAs(OutputType.FILE);
		File Target2 = new File("./Evidences/SearchBox.png");
		FileHandler.copy(Source2, Target2);
		
		driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		
		//Taking screenshot of click on searchbox by PROJECTPATH - another way
		String Projectpath = System.getProperty("user.dir");
		System.out.println(Projectpath);
		TakesScreenshot ts3 = (TakesScreenshot) driver;
		File Source3 = ts3.getScreenshotAs(OutputType.FILE);
		File Target3 = new File(Projectpath + "\\Evidences\\clickon_searchbox.png");
		FileHandler.copy(Source3, Target3);
		

	}

}
