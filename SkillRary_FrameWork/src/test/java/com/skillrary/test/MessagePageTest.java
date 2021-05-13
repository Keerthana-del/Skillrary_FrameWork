package com.skillrary.test;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.Skillrary.GenericUtils.BaseClass;
import com.Skillrary.GenericUtils.JavaUtility;
import com.Skillrary.objectRepository.Message;

/**
 * This class contains method to handle Message Page
 * @author SOUMYASANTA SAHOO
 *
 */
public class MessagePageTest extends BaseClass {
	
	/**
	 * This method is used to compose a message & verify it
	 * @author SOUMYASANTA SAHOO
	 * @throws Throwable
	 */
	@Test
	public void verifyMessage() throws Throwable
	{
		String sbjct=eUtil.getExcelData("Smoke", 15, 2) + JavaUtility.getRandomData();
		String mssg=eUtil.getExcelData("Smoke", 15, 3) + JavaUtility.getRandomData();
		String expectedSubject=eUtil.getExcelData("Smoke", 15, 4);
		
		Message message=new Message(driver);
		message.composeMessage(sbjct, mssg);
		
		String text=message.verifySentMsg();
		Assert.assertTrue(text.contains(expectedSubject));
	}

}
