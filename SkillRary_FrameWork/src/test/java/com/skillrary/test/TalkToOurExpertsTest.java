package com.skillrary.test;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Skillrary.GenericUtils.BaseClass;
import com.Skillrary.GenericUtils.JavaUtility;
import com.Skillrary.objectRepository.HomePage;
import com.Skillrary.objectRepository.InstructorListPage;
import com.Skillrary.objectRepository.Message;
import com.Skillrary.objectRepository.SentMessagePage;
import com.Skillrary.objectRepository.SkillrarySRPage;


@Listeners(com.Skillrary.GenericUtils.ListenerIMP.class)
public class TalkToOurExpertsTest extends BaseClass {
	@Test
	public void talkToExperts() throws Throwable {
		String subjects=eUtil.getExcelData("Smoke", 15, 2) + JavaUtility.getRandomData();
		String messages=eUtil.getExcelData("Smoke", 15, 3) + JavaUtility.getRandomData();
		String expectedSubject=eUtil.getExcelData("Smoke", 15, 4);
		
		//navigate to instructor list page
		HomePage homePage=new HomePage(driver);
		homePage.talkToExpert();
		InstructorListPage InstructorListPage=new InstructorListPage(driver);
		InstructorListPage.clickSkillRarySR();
		SkillrarySRPage skillrarySRPage=new SkillrarySRPage(driver);
		skillrarySRPage.getSendMessageLink().click();
		
		
		//contact through message
		Message message=new Message(driver);
		message.talkToExpert(subjects, messages);
		
		SentMessagePage sentMsg=new SentMessagePage(driver);
		String text=sentMsg.verifySentMsg();
		Assert.assertTrue(text.contains(expectedSubject));
		
		
		
		
		
	}

}
