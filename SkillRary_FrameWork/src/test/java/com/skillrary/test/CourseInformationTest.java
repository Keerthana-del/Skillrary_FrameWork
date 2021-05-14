package com.skillrary.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Skillrary.GenericUtils.BaseClass;
import com.Skillrary.objectRepository.CourseViewPage;
import com.Skillrary.objectRepository.HomePage;
import com.Skillrary.objectRepository.MyCoursesPage;

/**
 * Test script to view the course information in Mycourses page
 * @author Adarsh
 *
 */
@Listeners(com.Skillrary.GenericUtils.ListenerIMP.class)
public class CourseInformationTest extends BaseClass{
	@Test
	public void courseInfo() throws Throwable {

		//fetch the data from excel sheet
		String courseName=eUtil.getExcelData("Smoke", 9, 2);
		String expetedLabel=eUtil.getExcelData("Smoke", 9, 3);

		//navigate to my course page
		HomePage homepage=new HomePage(driver);
		homepage.clickOnMyCourses();

		//select a course
		MyCoursesPage myCoursesPage=new MyCoursesPage(driver);
		myCoursesPage.viewCourse(courseName);
		
		//click on info icon
		CourseViewPage courseViewPage=new CourseViewPage(driver);
		String actuallabel = courseViewPage.courseInfoClick();
		courseViewPage.getAboutCourseClosebutton().click();
		
		
		//verification
		Assert.assertEquals(expetedLabel, actuallabel);
		
	}

}
