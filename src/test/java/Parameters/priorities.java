package Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class priorities {

	WebDriver driver;
	@BeforeTest
	public void setdriver() {
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
	}
	@Test(priority='1')
	public void data() {
		driver.findElement(By.id("username")).sendKeys("sriyaseth");
		driver.findElement(By.id("password")).sendKeys("Sriya@86");
		//driver.findElement(By.id("login")).click();
		System.out.println("Sriya");
	}
	@Test(priority='2')
	public void adata() {
		System.out.println("a");
	}
	@Test(priority='3')
	public void bdata(){
		System.out.println("b");
	}
	
}
