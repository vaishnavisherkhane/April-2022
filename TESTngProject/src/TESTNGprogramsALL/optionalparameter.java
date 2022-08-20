package TESTNGprogramsALL;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class optionalparameter {
	// optional sathi xml call nahi krat ..pn krycha asel tr kru shakta fakt class mdhlya valu call nahit hot
	// string sathi
  @Test
  @Parameters("message")
  public void opt(@Optional("optional parameter selected")String message){
  System.out.println(message);
  }
  
  // int sathi
  @Test
  @Parameters({"val1","val2"})
  public void opt1(@Optional("10") int v1,@Optional("20") int v2) {
  int sum = v1+v2;
  System.out.println(sum);
  }
}
  
  
  
  
  
  
  
  

