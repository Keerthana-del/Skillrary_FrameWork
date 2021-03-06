package com.skillrary.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Skillrary.GenericUtils.BaseClass;
import com.Skillrary.objectRepository.HomePage;


/**
 * This Class contains method to Handle Home Page
 * @author SOUMYASANTA SAHOO
 *
 */
@Listeners(com.Skillrary.GenericUtils.ListenerIMP.class)
public class HomePageTest extends BaseClass {
	
	/**
	 * This method is used to handle Home Page
	 * @author SOUMYASANTA SAHOO
	 * @throws Throwable
	 */
	@Test
	public void takeCourseFromHomePage() throws Throwable
	{
		//Fetching data from Excel sheet
		String expectedButton=eUtil.getExcelData("Smoke", 13, 1);
		
		//navigate to Home Page
		HomePage homePage=new HomePage(driver);
		homePage.clickOnLogo();
		
		//Verification
		String text=homePage.enrollForCourse();
		Assert.assertEquals(expectedButton, text);
	}

}
