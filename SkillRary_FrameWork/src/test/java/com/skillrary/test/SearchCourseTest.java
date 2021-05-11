package com.skillrary.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Skillrary.GenericUtils.BaseClass;
import com.Skillrary.objectRepository.MyCoursesPage;

public class SearchCourseTest extends BaseClass {
	@Test
	public void searchCourse() throws Throwable {
		
		//fetch the courseName from excel sheet
		String courseName=fUtil.getPropertyKeyValue("coursename");
		
		//searching the course
		MyCoursesPage myCoursePage=new MyCoursesPage(driver);
		String expectedCourseName =myCoursePage.searchCourse(courseName);
		
		//Verification steps
		Assert.assertEquals(courseName, expectedCourseName);
		
		
	}

}
