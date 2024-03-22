package Parameters;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SuiteDemo {
	WebDriver driver;
	ExtentReports extent;
	ExtentSparkReporter extentRep;
	ExtentTest testcase;
	String ExpectedText="Hello Sriya!";
	
	@Test
	public void verifyurl() {
		testcase=extent.createTest("Validate Greeting");
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("sriyaseth");
		driver.findElement(By.id("password")).sendKeys("Sriya@86");
     	driver.findElement(By.id("login")).click();

     	String Greeting=driver.findElement(By.id("username_show")).getAttribute("value");
     	if(Greeting.equalsIgnoreCase(ExpectedText)) {
     		testcase.log(Status.PASS, "Actual Greeting!");
     	}
     	else {
     		testcase.log(Status.FAIL,"Not Actual Greeting!");
     	}
     	File srcFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
     	
     	try {
     		FileUtils.copyFile(srcFile,new File("C:\\Users\\SSMRUTIS\\Pictures\\Screenshots\\Screenshot (1).png"));
     	} catch(IOException e)
     	
     	{
     		e.printStackTrace();
     	}

	}
	
	
	@BeforeSuite
	private void extentLaunch() {
		extent=new ExtentReports();
		extentRep=new ExtentSparkReporter("target/extHtml.html");
		extent.attachReporter(extentRep);
	}
	
	@AfterSuite
	private void findOper() {
		testcase.addScreenCaptureFromPath("C:\\Users\\SSMRUTIS\\Pictures\\Screenshots\\Screenshot (1).png");
		driver.quit();
		extent.flush();
	}

}
