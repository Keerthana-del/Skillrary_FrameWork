package com.skillrary.test;

import org.junit.Test;

import com.Skillrary.GenericUtils.BaseClass;
import com.Skillrary.objectRepository.CoursePage;

import junit.framework.Assert;

public class CourseTest extends BaseClass {
	@Test
	public void course() throws Throwable
	{
		//Fetching data from Excel sheet
		String expectedresult=eUtil.getExcelData("Sheet1", 3, 3);
		String engineeringcategory=eUtil.getExcelData("Sheet1", 3, 2);
		
		
		//Navigate to engineering tution
		CoursePage cp=new CoursePage(driver);
		cp.coursePage(engineeringcategory);
		
		
		//verification
		String text = cp.textEn();
		Assert.assertTrue(text.contains(expectedresult));
	}
}
