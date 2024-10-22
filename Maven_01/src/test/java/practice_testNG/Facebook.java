package practice_testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class Facebook {
	WebDriver driver;

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("beforeSuite() : Execution started..");
	  }
 
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/login/");
	  System.out.println("beforeMethod() : Browser Launched & navigated to facebook website");
  }
  
  @Test
  public void loginTest() {
	  WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
	  username.sendKeys("testUser");
	  WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
	  password.sendKeys("testPassword");
	  WebElement login = driver.findElement(By.xpath("//button[@id='loginbutton']"));
	  login.click();
  }

  @AfterMethod
  public void afterMethod() {
	  if(driver != null) {
		  driver.quit();
	  }
	  System.out.println(" afterMethod() : Browser Closed");
	  
  }


}
