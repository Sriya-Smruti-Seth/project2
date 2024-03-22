package Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderDemo {

WebDriver driver;
	
	@Test(dataProvider="Testdata")
	//@DataProvider(name="Testdata")
	public void test(String username,String password) {
	
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login")).click();
	}
	@DataProvider(name="Testdata")
	public Object getdata() {
		Object[][]data=new Object[5][2];
		data[0][0]="sriyaseth";
		data[0][1]="Sriya@86";
		data[1][0]="jastisrija";
		data[1][1]="OY38RV";
		data[2][0]="Chaithuuu";
		data[2][1]="12309876";
		data[3][0]="Varsharaj";
		data[3][1]="Varsharaj";
		data[4][0]="vasuvespag";
		data[4][1]="vasu1234";
		
		return data;
		
	}
}
