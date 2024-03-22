package Parameters;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
public class Retry implements IRetryAnalyzer{
	int retry_count=0;
	int max_retry=4;

	public boolean retry(ITestResult result){
	if(!result.isSuccess()) {
		if(retry_count<max_retry)
		{
			retry_count++;
			System.out.println(retry_count);
			result.setStatus(ITestResult.FAILURE);
			return true;
		}
		else 
		{
			result.setStatus(ITestResult.FAILURE);
		}
	}
	else {
		result.setStatus(ITestResult.SUCCESS);
	}
	return false;
}
}
