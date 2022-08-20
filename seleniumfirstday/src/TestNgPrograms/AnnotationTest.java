package TestNgPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationTest {
  @Test
  public void f() {
  System.out.println("hi am in first method");
  }
  @Test
  public void s() {
  System.out.println("hi am in second  method");  
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
  System.out.println("i am before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("iam in afterrmethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i am after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("i am beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i am aftertest");
  }

  @BeforeSuite
  public void beforeSuite() {
  System.out.println("i am beforesuite");
  }

  @AfterSuite
  public void afterSuite() {
  System.out.println("i am aftersuite");
  }

}
