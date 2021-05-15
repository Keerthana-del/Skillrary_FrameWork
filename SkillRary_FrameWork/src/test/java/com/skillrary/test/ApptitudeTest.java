package com.skillrary.test;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Skillrary.GenericUtils.BaseClass;
import com.Skillrary.objectRepository.ApptitudePage;
/*
 * This class is used to navigate to wishlist in my course page  and check whether the product is added or not
 * @author Keerthana C
 */

@Listeners(com.Skillrary.GenericUtils.ListenerIMP.class)
public class ApptitudeTest extends BaseClass{
	
	@Test
	public void apptitudeTest() throws Throwable
	{
		
		//Fetching data from Excel sheet
		String expectedresult=eUtil.getExcelData("Smoke",19,2);
		System.out.println(expectedresult);
		
		//Navigate to mycourse wishlist page
		ApptitudePage apptitudepage=new ApptitudePage(driver);
		apptitudepage.aptitude();
		Thread.sleep(4000);
		
		//Verification
		String actual = apptitudepage.textFunction();
		System.out.println(actual);
		Assert.assertTrue(actual.contains(expectedresult));
		
		
	}

}
