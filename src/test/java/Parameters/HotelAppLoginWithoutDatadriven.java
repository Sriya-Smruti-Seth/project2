package Parameters;

import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HotelAppLoginWithoutDatadriven {
	WebDriver driver;
	@BeforeTest
	public void setUp() {

	}
	@Test(retryAnalyzer=Retry.class)
	public void Sample() {
//		driver=new ChromeDriver();
//		driver.get("https://adactinhotelapp.com/index.php");
//		driver.findElement(By.id("username")).sendKeys("Chaithuuu");
//		driver.findElement(By.id("password")).sendKeys("12309777876");
//		driver.findElement(By.id("login")).click();

		assertEquals(2+2,5);
	}

}
