package Pages;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Core.Basic;

public class HomePage extends Basic {

	
	@FindBy(name = "admin")
	WebElement username;
	
	@FindBy (name = "password")
	WebElement pass;
	
	@FindBy (xpath = "//button[@type='submit']")
	WebElement loginbuton;
	
	public HomePage() {
		
	}
}
