package com.skillrary.test;

import org.testng.annotations.Test;

import com.Skillrary.GenericUtils.BaseClass;
import com.Skillrary.objectRepository.CourseViewPage;
import com.Skillrary.objectRepository.HomePage;
import com.Skillrary.objectRepository.MyCoursesPage;

import junit.framework.Assert;
/**
 * Test script to view the course information in Mycourses page
 * @author Adarsh
 *
 */
public class CourseInformationTest extends BaseClass{
	@Test
	public void courseInfo() throws Throwable {

		//fetch the data from excel sheet
		String courseName=eUtil.getExcelData("smoke", 9, 2);
		String expetedLabel=eUtil.getExcelData("smoke", 9, 3);

		//navigate to my course page
		HomePage homepage=new HomePage(driver);
		homepage.clickOnMyCourses();

		//select a course
		MyCoursesPage myCoursesPage=new MyCoursesPage(driver);
		myCoursesPage.getLoadAllLink().click();
		myCoursesPage.viewCourse(courseName);
		
		//click on info icon
		CourseViewPage courseViewPage=new CourseViewPage(driver);
		String actuallabel = courseViewPage.courseInfoClick();
		
		//verification
		Assert.assertEquals(expetedLabel, actuallabel);
		
	}

}
