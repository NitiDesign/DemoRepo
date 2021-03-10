package RetryPackage;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalizerclass implements IRetryAnalyzer {
	
	int counter;
	int RetryLimit=3;
	
	@Override
	public boolean retry(ITestResult result) {
		if (counter<RetryLimit)
		{
			counter++;
			return true;}
		
		return false;
	}}
