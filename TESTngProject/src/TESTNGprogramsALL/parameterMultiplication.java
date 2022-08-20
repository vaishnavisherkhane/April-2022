package TESTNGprogramsALL;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterMultiplication {
	@Parameters({"val1","val2"})
   @Test
  public void mul(int v1 , int v2) {
  int mul = v1*v2;
  System.out.println("Multiplication is "+mul);
  }
}
