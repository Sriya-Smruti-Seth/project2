package Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization_With_Xml 
{
  WebDriver driver;
   @Test
   @Parameters({"username","password"})
   public void test(String username,String password)
   {
	driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/index.php");
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.id("login")).click();
	
   }
}
 