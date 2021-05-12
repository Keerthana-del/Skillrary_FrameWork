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
		String expectedresult=eUtil.getExcelData("smoke", 3, 2);
		
		
		//Navigate to computerscience page
		CoursePage coursepage=new CoursePage(driver);
		coursepage.coursePage();
		
		
		
		//verification
		String text = coursepage.textEn();
		Assert.assertTrue(text.contains(expectedresult));
	}
}
