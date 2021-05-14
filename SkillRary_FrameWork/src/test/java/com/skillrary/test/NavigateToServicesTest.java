package com.skillrary.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Skillrary.GenericUtils.BaseClass;
import com.Skillrary.objectRepository.HomePage;
/**
 * Test script to check navigation to services
 * @author Adarsh
 *
 */
public class NavigateToServicesTest extends BaseClass{
	@Test
	public void services() {
		 String parentWinTitle="SkillRary | Courses"; 
		String serviceName="SKILLRARY LIVE";
		String partialWinTitle="SkillRary Live Courses";
		HomePage homePage=new HomePage(driver);
		homePage.navToServices(serviceName);
		
		String actualTitle=homePage.switchToServices(partialWinTitle,parentWinTitle);
		Assert.assertEquals(actualTitle, partialWinTitle);
		
	}

}
