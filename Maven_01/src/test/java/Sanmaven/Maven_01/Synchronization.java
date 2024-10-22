package Sanmaven.Maven_01;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// 1)implicit wait :(throws NoSuchElementException)
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		
		
		//2) WebDriverWait :( throws ElementNotVisibleException"/TimeOutException)
		
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("Snehal.duragwar.9"); //id
		Email.sendKeys(Keys.RETURN);
		
		driver.findElement(By.id("pass")).sendKeys("password"); //pwd
		
		driver.findElement(By.xpath("//button[@id='u_0_5_V7']")).click(); //login
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='u_0_5_9Q']"))); 
		
		//3) FluentWait : (throws ElementNotVisibleException)
		
		FluentWait<WebDriver> wait2 = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(30))
			.pollingEvery(Duration.ofSeconds(10))
			.ignoring(NoSuchElementException.class);
	
		wait2.until(ExpectedConditions.alertIsPresent());
		
		//4) Thread.sleep() :
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='u_0_0_Hb']")).click();
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.findElement(By.xpath("//button[normalize-space()='Yes, Continue']")).click();
		
		
		
		
		

	}

}
