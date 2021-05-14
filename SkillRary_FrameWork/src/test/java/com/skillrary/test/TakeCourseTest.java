package com.skillrary.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Skillrary.GenericUtils.BaseClass;
import com.Skillrary.objectRepository.TakeCourse;

import junit.framework.Assert;

/**
 * This class contains method to enroll a course from Courses page
 * @author SOUMYASANTA SAHOO
 *
 */
@Listeners(com.Skillrary.GenericUtils.ListenerIMP.class)
public class TakeCourseTest extends BaseClass {
	
	/**
	 * This method is used to take a course from Courses page
	 * @author SOUMYASANTA SAHOO
	 * @throws Throwable
	 */
	@Test
	public void takeSpecificCourse() throws Throwable
	{
		//Fetching Data From Excel Sheet
		String expectedButton=eUtil.getExcelData("Smoke", 13, 2);
		
		//Take Corse
		TakeCourse takeCourse=new TakeCourse(driver);
		String text=takeCourse.takeCourse();
		
		//Verification
		Assert.assertEquals(expectedButton, text);
	}
}
