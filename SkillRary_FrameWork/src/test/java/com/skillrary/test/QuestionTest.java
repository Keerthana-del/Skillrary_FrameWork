package com.skillrary.test;

import org.junit.Test;

import com.Skillrary.GenericUtils.BaseClass;
import com.Skillrary.objectRepository.QuestionsPage;

public class QuestionTest extends BaseClass{
@Test
public void questionTest() throws Throwable
{
	//Fetching data from Excel sheet
	String category=eUtil.getExcelData("smoke", 1, 2);
	String subcategory=eUtil.getExcelData("smoke", 1, 3);
	String question_title=eUtil.getExcelData("smoke", 1, 4);
	String description=eUtil.getExcelData("smoke", 1, 5);
	
	//Navigate to QuestionPage
	QuestionsPage questionpage=new QuestionsPage(driver);
	questionpage.questionPage(category, subcategory, question_title, description);
}
}
