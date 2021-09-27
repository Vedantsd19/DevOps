package login_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import login.App;

public class AppTest {
  @Test(description="Valid login")
  public void validLogin() {
	  App app =new App();
	  boolean status = app.userLogin("userdemo", "password");
	  Assert.assertTrue(status,"Valid Login failed");
  }
  
  @Test(description="Invalid login")
  public void invalidLogin() {
	  App app =new App();
	  boolean status = app.userLogin("demouser123", "password312");
	  Assert.assertFalse(status);
  }
}
