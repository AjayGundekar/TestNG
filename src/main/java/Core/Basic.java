package Core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

   
public class Basic {
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

	}
}
