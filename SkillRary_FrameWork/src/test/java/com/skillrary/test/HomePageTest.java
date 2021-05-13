package com.skillrary.test;

import org.testng.annotations.Test;

import com.Skillrary.GenericUtils.BaseClass;
import com.Skillrary.objectRepository.HomePage;

import junit.framework.Assert;

/**
 * This Class contains method to Handle Home Page
 * @author SOUMYASANTA SAHOO
 *
 */
public class HomePageTest extends BaseClass {
	
	/**
	 * This method is used to handle Home Page
	 * @author SOUMYASANTA SAHOO
	 * @throws Throwable
	 */
	@Test
	public void takeCourseFromHomePage() throws Throwable
	{
		String expectedButton=eUtil.getExcelData("Smoke", 13, 2);
		HomePage homePage=new HomePage(driver);
		homePage.clickOnLogo();
		String text=homePage.enrollForCourse();
		Assert.assertEquals(expectedButton, text);
	}

}
