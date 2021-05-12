package com.skillrary.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Skillrary.GenericUtils.BaseClass;
import com.Skillrary.objectRepository.CoursePage;
/*
 * This class is used to navigate to computer sceience page and verify the title
 * @author Keerthana C
 */

public class CourseTest extends BaseClass {
	@Test
	public void course() throws Throwable {
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
