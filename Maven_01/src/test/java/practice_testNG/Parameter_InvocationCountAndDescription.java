/*
 - if @test annotation invoked 4 times but invocation count to set for one
   method it is 2 and one method it is 3 then total suite count is 7 but
   test count is 4.Explained in below example.
 */


package practice_testNG;

import org.testng.annotations.Test;

public class Parameter_InvocationCountAndDescription  {
	
  @Test(invocationCount = 2)
  public void FirstName() {
	  System.out.println("FirstName method invoked twice");
  }
  
  @Test(description = "it describes the middle name")
  public void MiddleName() {
	  System.out.println("MiddleName method");
  }
  
  @Test(description = "it describes the last name")
  public void LastName() {
	  System.out.println("LastName method");
  }
  
  @Test(invocationCount = 3)
  public void CompleteName() {
	  System.out.println("CompleteName method invoked thrice");
  }
}
