package TESTNGprogramsALL;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

  public class parametersDemo {
   @Parameters({"val1","val2"})
   @Test
  public void f(int v1 ,int v2) {
  
  int sum = v1+v2;
  System.out.println("Addition is"+sum);
	   
	   
	   
  }
}
