package MyyyRetryTests;

import org.junit.Assert;
import org.testng.annotations.Test;

public class MyyAgainRetryTests {
	
	
	@Test(retryAnalyzer = AgainRetryTests.AgainIretryAnalizer.class)
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

