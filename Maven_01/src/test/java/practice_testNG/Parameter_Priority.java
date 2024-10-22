/*
 - If parameter not set to annotations or only having priority = 0
   execution starts alphabetically.
 - In a class,If there are multiple @test annotations having parameter priority
   and some without priority then the @test annotations which do not have 
   parameter should be executed first alphabetically then it will execute
   according to priority set. 
 - If @test annotation set to priority = 0, priority =1, and so on and some
   @test annotations do not have any parameter then it will execute priority =0
   first then alphabetically then priority wise like 1,2,3,etc.
 */
package practice_testNG;

import org.testng.annotations.Test;

public class Parameter_Priority {
	
  @Test(priority = 2)
  public void abc() {
	  System.out.println("abc method : priority = 2");
  }
  
  @Test(priority = 0)
  public void def() {
	  System.out.println("def method : priority = 0");
  }
  
  @Test(priority = 1)
  public void ghi() {
	  System.out.println("ghi method : priority = 1");
  }
  
  @Test(priority = 3)
  public void jkl() {
	  System.out.println("jkl method : priority = 3");
  }
  
  @Test(priority = 4)
  public void xyz() {
	  System.out.println("xyz method : priority = 4");
  }
  
  @Test()
  public void pqr() {
	  System.out.println("pqr method : priority not set");
  }
  @Test()
  public void lmn() {
	  System.out.println("lmn method : priority not set");
  }
  
}
