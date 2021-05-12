package com.skillrary.test;

import org.testng.annotations.Test;

import com.Skillrary.GenericUtils.BaseClass;
import com.Skillrary.objectRepository.HomePage;

public class TakeRecordedCourseTest extends BaseClass{
	@Test
	public void takeCourse() throws Throwable {
		
		String courseName=eUtil.getExcelData("smoke", 7, 2);

		//navigate to my course page

		HomePage homepage=new HomePage();
		homepage.clickOnMyCourses();


	}

}
