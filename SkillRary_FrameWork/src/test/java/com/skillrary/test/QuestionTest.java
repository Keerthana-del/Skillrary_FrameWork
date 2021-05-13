package com.skillrary.test;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.Skillrary.GenericUtils.BaseClass;
import com.Skillrary.objectRepository.QuestionsPage;
/*
 * This class is used to navigate to question page
 * @author Keerthana C
 */
public class QuestionTest extends BaseClass{
	@Test
	public void questionTest() throws Throwable  {
		
		//Fetching data from Excel sheet
		String category=eUtil.getExcelData("smoke", 1, 2);
		String subcategory=eUtil.getExcelData("smoke", 1, 3);
		String question_title=eUtil.getExcelData("smoke", 1, 4);
		String description=eUtil.getExcelData("smoke", 1, 5);
		String expectedresult=eUtil.getExcelData("smoke", 1, 6);

		//Navigate to QuestionPage
		QuestionsPage questionpage=new QuestionsPage(driver);
		questionpage.questionPage(category, subcategory, question_title, description);
		
		//Verification
		String actual = questionpage.questionsLink();
		Assert.assertTrue(actual.contains(expectedresult));
	}
}
