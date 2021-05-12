package com.skillrary.test;

import org.junit.Test;

import com.Skillrary.GenericUtils.BaseClass;
import com.Skillrary.objectRepository.QuestionsPage;

public class QuestionTest extends BaseClass{
@Test
public void questionTest() throws Throwable
{
	//Fetching data from Excel sheet
	String category=eUtil.getExcelData("Sheet1", 1, 3);
	String subcategory=eUtil.getExcelData("Sheet1", 1, 4);
	String question_title=eUtil.getExcelData("Sheet1", 1, 5);
	String description=eUtil.getExcelData("Sheet1", 1, 6);
	
	//Navigate to QuestionPage
	QuestionsPage qp=new QuestionsPage(driver);
	qp.questionPage(category, subcategory, question_title, description);
}
}
