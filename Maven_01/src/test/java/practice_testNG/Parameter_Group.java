/*
 - Group @test annotation parameter must be executed through XML file.
 - As we have to group the @test which we have to execute and which we don't.
 - As per HIGH, MEDIUM,LOW by including or excluding as per our requirement.
 - whatever the @test we don't want to execute have to exclude it from XML file.
 - After <suite> tag open new tag as <group> under it open <run> tag under it write down the code to include or exclude the @test
  as for exclude <exclude name="Low"></exclude> and for 
  include <include name="Low"></include> then </run> </group>.
 - Explained in Grouptestng.xml file. 
 */


package practice_testNG;

import org.testng.annotations.Test;

public class Parameter_Group {
	
  @Test(groups = {"High"} )
  public void abc() {
	  System.out.println("abc method");
  }
  
  @Test(groups = {"Medium"})
  public void def() {
	  System.out.println("def method");
  }
  
  @Test(groups = {"Low"})
  public void ghi() {
	  System.out.println("ghi method");
  }
  
  @Test(groups = {"High"})
  public void xyz() {
	  System.out.println("xyz method");
  }
}
