package MyTestToBeRetry;
import org.testng.annotations.Test;

import org.junit.Assert;

public class MyTests {
	
	@Test(retryAnalyzer = RetryPackage.RetryAnalizerclass.class)
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}

	@Test
	public void Test2()
	{
		Assert.assertEquals(false, false);
	}

}
