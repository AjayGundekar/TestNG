package Core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StepBase {
    public static WebDriver driver;
    
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
//	public static void teardown() {
//		driver.quit();
//	}
	public static void popUp() {
		System.setProperty("webdriver.chrome.driver", "Resoures/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		System.out.println("Browser has been Launched");
	}
}
