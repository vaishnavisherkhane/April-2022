package TESTNGprogramsALL;

import org.testng.annotations.Test;

public class Groupdependancy {

	@Test(groups = "SignIn")
  public void  login () {
  System.out.println("login successfully");
  }
	
  @Test(dependsOnGroups = "SignIn")
   public void ViewAccount() {
	  System.out.println("view a account successfully");
  
  }
  
}
