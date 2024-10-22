package practice_testNG;
/*
 - Suite : is a collection of tests that are grouped and executed together.
 - The methods in @test will be executed alphabetically.
 - If you are executing methods from another class it will be executed after @afterclass annotation.
 */

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotation_Hierarchy {
	 @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("beforeSuite() : Execution starts from this method");
	  }
	 @BeforeTest
	  public void beforeTest() {
		  System.out.println("beforeTest() : Runs before any test case in a <test> tag within the suite XML");
	  }
	 @BeforeClass
	  public void beforeClass() {
		  System.out.println("beforeClass() : Runs before 1st method in the current class is invoked");  
	  }
	 @BeforeMethod
	  public void beforeMethod() {
		 System.out.println("beforeMethod() : Runs before each test method.");
	  }
	 
	  @Test
	  public void Testlogic() {
		  System.out.println("@Test : Used to indicate a method is a test case. Can use attributes like priority,dependsonMethods,groups,timeout,enabled,etc.,to control the test behavior.");
	  }
  
	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("afterMethod() : Runs after each test method, used for cleanup operation");
	  }
	  @AfterClass
	  public void afterClass() {
		  System.out.println("afterClass() : Runs after all the test methods in current class have been Executed");
	  }
	  @AfterTest
	  public void afterTest() {
		  System.out.println("afterTest() : Runs after all the test cases inside a <test> tag have been Executed");
	  }
	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("afterSuite() : Runs after all the test within the suite have been executed");
	  }
	  
}
