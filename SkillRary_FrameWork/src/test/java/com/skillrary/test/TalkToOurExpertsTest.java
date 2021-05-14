package com.skillrary.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Skillrary.GenericUtils.BaseClass;
import com.Skillrary.objectRepository.HomePage;


@Listeners(com.Skillrary.GenericUtils.ListenerIMP.class)
public class TalkToOurExpertsTest extends BaseClass {
	@Test
	public void talkToExperts() {
		
		//navigate to instructor list page
		HomePage homePage=new HomePage(driver);
		homePage.talkToExpert();
		
		
		
		
		
	}

}
