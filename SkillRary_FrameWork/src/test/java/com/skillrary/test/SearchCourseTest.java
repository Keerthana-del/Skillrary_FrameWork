package com.skillrary.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Skillrary.GenericUtils.BaseClass;
import com.Skillrary.objectRepository.HomePage;
import com.Skillrary.objectRepository.MyCoursesPage;

/**
 * Test Script to search the course in MyCourses page.
 * @author Adarsh
 *
 */
public class SearchCourseTest extends BaseClass {
	@Test
	public void searchCourse() throws Throwable {
		
		//fetch the courseName from excel sheet
		String courseName=eUtil.getExcelData("smoke", 5, 2);
		
		//navigate to my course page
		HomePage homepage=new HomePage(driver);
		homepage.clickOnMyCourses();
		
		//searching the course
		MyCoursesPage myCoursePage=new MyCoursesPage(driver);
		String expectedCourseName =myCoursePage.searchCourse(courseName);
		
		//Verification steps
		Assert.assertEquals(courseName, expectedCourseName);
		
	}

}
