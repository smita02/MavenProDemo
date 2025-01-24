package collectiondemo.hashmapdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dataproviderdemo.dataproviders.DataProviders;

public class TestCases  {

	@Test(dataProvider ="pincodes Data", dataProviderClass = DataProviders.class)
	public void verifyMixtureIsdeliverableForpincode(String pincode){
		//System.out.print(pincode);	
		Assert.assertTrue(pincode.contains("411"));
		
	}
}
