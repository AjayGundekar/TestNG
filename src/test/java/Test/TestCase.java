package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Core.StepBase;
import Pages.LoginPage;

public class TestCase extends StepBase {
	LoginPage objlogin;
	
	@BeforeTest
	public void browserOpen() {
		setup();
	}
	
	@Test (dependsOnMethods = {"login"})
	public void bopen() {
		popUp();
		
	}
	@Test (dependsOnMethods = {"bopen"})
	public void cor() {
		objlogin = new LoginPage();
		objlogin.handing();
	}
	
	@Test
	public void login() {
		objlogin = new LoginPage();
		objlogin.pageMethod();
		
	}
	
	@AfterTest
	public void stop() {
		System.out.println("browser");
	}
}
