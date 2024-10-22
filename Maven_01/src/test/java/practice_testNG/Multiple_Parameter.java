package practice_testNG;

import org.testng.annotations.Test;

public class Multiple_Parameter {
  
  @Test(priority = 1, description = "abc method executed")
  public void abc() {
		System.out.println("abc method");
  }
  
  @Test(priority = 1, enabled = false)
  public void def() {
	  System.out.println("def method");
  }
  
  @Test(description = "ghi method invoked", invocationCount = 2)
  public void ghi() {
	  System.out.println("ghi method");
  }
  
  @Test(priority = 2, enabled = true)
  public void jkl() {
	  System.out.println("jkl method");
  }
}
