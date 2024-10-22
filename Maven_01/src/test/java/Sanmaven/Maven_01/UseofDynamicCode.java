package Sanmaven.Maven_01;

import org.openqa.selenium.By;

public class UseofDynamicCode extends Dynamic_code{

	public static void main(String[] args) throws Throwable {
		launch_browser("Chrome");
		takescreenshot("chrome_Browser");
				
		hiturl("https://www.flipkart.com/");
		takescreenshot("flipcart_home");
		
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("Mobile");
		takescreenshot("flipcart_Searchbox");
		
	}

}
