package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	protected WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/orangehrm/orangehrm-5.8/web/index.php/auth/login");
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		if (driver != null) {
			Thread.sleep(2000);
			driver.quit();
		}
	}
}
