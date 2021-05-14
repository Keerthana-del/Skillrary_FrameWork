package com.Skillrary.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Skillrary.GenericUtils.BaseClass;
/*
 * This is the object repository created for QuestionPage
 * author
 * @Keerthana C
 */
public class QuestionsPage extends BaseClass {


	public QuestionsPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}


	@FindBy(id="askQuestion")
	private WebElement submitQuestionBtn;
	@FindBy(name="question_text")
	private WebElement questionsTitleTf;
	@FindBy(xpath="//select[@id='category_id']")
	private WebElement questionsCategoryDd;
	@FindBy(name="sub_cat_id")
	private WebElement subCategoryDd;
	@FindBy(name="question_description")
	private WebElement DescriptionTf;
	@FindBy(xpath=" //a[.=' Ask a Question ']")
	private WebElement askQuestionLink;
	@FindBy(xpath="//button[.='Submit Question']")
	private WebElement submitBtn;
    @FindBy(xpath="//h2[.='Questions']")
    private WebElement questionLink;

	public WebElement getAskQuestionLink() {
		return askQuestionLink;
	}
	public WebElement getQuestionLink() {
		return questionLink;
	}
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
	
	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	/*
	 * author 
	 * @Keerthana
	 * This method will click on Submitbutton and enter all the valid credentials to ask a query
	 * return category
	 * return subcategory
	 * return question_title
	 * return description
	 */
	public void questionPage(String category,String subcategory,String question_title,String description) {
		askQuestionLink.click();
		submitQuestionBtn.click();
		questionsTitleTf.sendKeys(question_title);
		wUtil.SelectOption(questionsCategoryDd, category);
		wUtil.SelectOption(subCategoryDd, subcategory);
		DescriptionTf.sendKeys(description);
		submitBtn.click();

	}
	/*
	 * author
	 * @Keerthana C
	 * This method will return text of question page
	 * 
	 */
	public String questionsLink() {
		return questionLink.getText();
		
	}

}
