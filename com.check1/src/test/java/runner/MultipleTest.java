package runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MultipleTest {

public WebDriver driver;

  @Test(priority = 0)

  public void One() {

      System.out.println("This is the Test Case number One");
      System.out.println("Changes done");
      System.out.println("Changes reverted");

  }

  @Test(priority = 1)

  public void Two() {

   System.out.println("This is the Test Case number Two");
   System.out.println("Check loal branch");

  }

  @Test(priority = 2, enabled = false)

  public void Three() {

   System.out.println("This is the Test Case number Three");

  }

  @Test(priority = 3)

  public void Four() {

   System.out.println("This is the Test Case number Four");

  }

}
