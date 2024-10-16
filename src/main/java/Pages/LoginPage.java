package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Core.StepBase;

public class LoginPage extends StepBase  {
	
	@FindBy(name = "username")
	WebElement userName;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Clickbutton;
	
	@FindBy (name = "cusid")
	WebElement Id;
	
	@FindBy (name = "submit")
	WebElement searchButton;
	
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public void pageMethod() {
		userName.sendKeys("Admin");
		password.sendKeys("admin123");
		Clickbutton.click();
	}
	public void handing() {
		
		Alert alert = driver.switchTo().alert();
		String deleteMSG = alert.getText();
		System.out.println(deleteMSG);
		
		alert.accept();
		
		Id.sendKeys("1233");
		searchButton.click();
	}

}
