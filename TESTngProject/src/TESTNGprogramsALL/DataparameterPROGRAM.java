package TESTNGprogramsALL;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataparameterPROGRAM {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] { 52, "c" },
      new Object[] { 62, "d" },
      new Object[] { 72, "e" },
      
      
      
    };
  }
}
