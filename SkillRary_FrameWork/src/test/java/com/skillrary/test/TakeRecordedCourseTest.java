package com.skillrary.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Skillrary.GenericUtils.BaseClass;
import com.Skillrary.objectRepository.CourseViewPage;
import com.Skillrary.objectRepository.HomePage;
import com.Skillrary.objectRepository.MyCoursesPage;
import com.Skillrary.objectRepository.TakeThisCoursePage;

/**
 * Test script to take one recorded course in skillrary
 * @author Adarsh
 *
 */
public class TakeRecordedCourseTest extends BaseClass{
	@Test
	public void takeCourse() throws Throwable {
		
		//fetch the data from excel sheet
		String courseName=eUtil.getExcelData("Smoke", 7, 2);
		String expetedTitle=eUtil.getExcelData("Smoke", 7, 3);

		//navigate to my course page
		HomePage homepage=new HomePage(driver);
		homepage.clickOnMyCourses();
		
		//select a course
		MyCoursesPage myCoursesPage=new MyCoursesPage(driver);
		myCoursesPage.viewCourse(courseName);
		
		//start the course
		CourseViewPage courseViewPage=new CourseViewPage(driver);
		courseViewPage.startcourse();
		
		//verification
		TakeThisCoursePage takeThisCoursePage=new TakeThisCoursePage(driver);
		String actualTitle=takeThisCoursePage.pageTitle();
		takeThisCoursePage.backToCourse();
		Assert.assertEquals(actualTitle, expetedTitle);
		
		


	}

}
