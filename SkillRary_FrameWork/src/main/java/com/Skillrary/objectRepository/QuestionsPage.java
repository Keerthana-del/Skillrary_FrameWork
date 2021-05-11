package com.Skillrary.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Skillrary.GenericUtils.BaseClass;
/*
 * author
 * @Keerthana C
 */
public class QuestionsPage extends BaseClass{


	public QuestionsPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}


	@FindBy(id="askQuestion")
	private WebElement submitQuestionBtn;
	@FindBy(name="question_text")
	private WebElement questionsTitleTf;
	@FindBy(name="category_id")
	private WebElement questionsCategoryDd;
	@FindBy(name="sub_cat_id")
	private WebElement subCategoryDd;
	@FindBy(name="question_description")
	private WebElement DescriptionTf;
	@FindBy(name="luploaddoc")
	private WebElement chooseFile;
	@FindBy(xpath="//button[.='Submit Question']")
	private WebElement submitBtn;



	public WebElement getSubmitQuestionBtn() {
		return submitQuestionBtn;
	}
	public WebElement getQuestionsTitleTf() {
		return questionsTitleTf;
	}
	public WebElement getQuestionsCategoryDd() {
		return questionsCategoryDd;
	}
	public WebElement getSubCategoryDd() {
		return subCategoryDd;
	}
	public WebElement getDescriptionTf() {
		return DescriptionTf;
	}
	public WebElement getChooseFile() {
		return chooseFile;
	}
	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	public void questionPage(String category,String subcategory,String question_title,String description)
	{
		submitQuestionBtn.click();
		questionsTitleTf.sendKeys(question_title);
		wUtil.SelectOption(questionsCategoryDd, category);
		wUtil.SelectOption(subCategoryDd, subcategory);
		DescriptionTf.sendKeys(description);
		submitBtn.click();

	}
}
