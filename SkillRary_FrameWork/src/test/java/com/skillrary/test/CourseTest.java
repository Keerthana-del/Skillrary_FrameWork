package com.skillrary.test;

import org.junit.Test;

import com.Skillrary.GenericUtils.BaseClass;
import com.Skillrary.objectRepository.CoursePage;

import junit.framework.Assert;

public class CourseTest extends BaseClass {
	@Test
	public void course()
	{
		CoursePage cp=new CoursePage(driver);
		String text = cp.coursePage(engineeringcategory);
		Assert.assertEquals(text, expectedOutput);
	}
	

}
