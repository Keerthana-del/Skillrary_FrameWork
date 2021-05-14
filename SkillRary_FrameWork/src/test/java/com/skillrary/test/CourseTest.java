package com.skillrary.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Skillrary.GenericUtils.BaseClass;
import com.Skillrary.objectRepository.CoursePage;
/*
 * This class is used to navigate to computer science page and verify the title
 * @author Keerthana C
 */

@Listeners(com.Skillrary.GenericUtils.ListenerIMP.class)
public class CourseTest extends BaseClass {
	@Test
	public void course() throws Throwable {
		
		
		//Fetching data from Excel sheet
		String expectedresult=eUtil.getExcelData("smoke", 3, 2);
		System.out.println(expectedresult);
		
		
		//Navigate to engneeringPage page
		CoursePage coursepage=new CoursePage(driver);
		coursepage.coursePage();
		
		
		
		//verification
		String text = coursepage.textEn();
		System.out.println(text);
		Assert.assertTrue(text.contains(expectedresult));
	}
}
