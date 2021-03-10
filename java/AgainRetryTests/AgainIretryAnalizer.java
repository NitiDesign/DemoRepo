package AgainRetryTests;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class AgainIretryAnalizer implements IRetryAnalyzer{
	
	int count;
	int MaxLimit=5;

	@Override
	public boolean retry(ITestResult result) {
		
		if(count<MaxLimit) {
			
			count++;
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	

}
