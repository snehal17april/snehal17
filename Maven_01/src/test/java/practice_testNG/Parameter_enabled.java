/*
 - if @test annotation parameter enabled is set TRUE then method will be executed
   and if enabled is set to FALSE  it prevent the execution of that method.
 */

package practice_testNG;

import org.testng.annotations.Test;

public class Parameter_enabled {
	
  @Test(enabled = true)
  public void abc() {
	  System.out.println("abc method");
  }
  
  @Test(enabled = true)
  public void def() {
	  System.out.println("def def method");
  }
  
  @Test(enabled = false)
  public void ghi() {
	  System.out.println("ghi method");
  }
  
  @Test(enabled = true)
  public void xyz() {
	  System.out.println("xyz method ");
  }
}
