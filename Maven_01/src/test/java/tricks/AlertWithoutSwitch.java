package tricks;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertWithoutSwitch {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		Thread.sleep(3000);
		
		//1)Handling alert using switchTo() method
		 //Alert alert = driver.switchTo().alert();
		 //alert.accept();
		 
		//2)Applying Explicit Wait
		/*
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		 alert.accept();
		 */
		//3) Using javaScriptExecutor interface object
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("Window.alert=function{};");
		 
		driver.close();
		 

	}

}
