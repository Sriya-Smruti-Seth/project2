package Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HotelAppLogin {
	WebDriver driver;
	@Test(dataProvider="Testdata")
	
	public void test1(String username,String password) {
		
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login")).click();
	}
	@DataProvider(name="Testdata")
	public Object getData() {
ExcelUtilities ex=new ExcelUtilities("C:\\Users\\SSMRUTIS\\Documents\\mydocuments\\testing1.xlsx");
int row=ex.getRowCount(0);
Object[][] login_details=new Object[row][2];
for(int i=0;i<row;i++)
{
	for(int j=0;j<2;j++)
	{
		login_details[i][j]=(ex.getdata(0,i+1,j));
	}
}
   return login_details;
	}
}
