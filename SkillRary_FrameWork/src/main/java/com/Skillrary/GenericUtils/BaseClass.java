package com.Skillrary.GenericUtils;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.Skillrary.objectRepository.HomePage;
import com.Skillrary.objectRepository.LoginPage;
import com.Skillrary.objectRepository.WelcomePage;

//import com.crm.vtiger.pomclass.HomePage;
//import com.crm.vtiger.pomclass.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver staticDriver;
	public ExcelUtility eUtil=new ExcelUtility();
	public FileUtility fUtil=new FileUtility();
	public WebDriverUtility wUtil=new WebDriverUtility();
	public DataBaseUtilities dblib = new DataBaseUtilities();
	public HomePage homePage;
	
	@BeforeSuite(groups = {"smokeTest" , "regressionTest"})
	public void configBS() throws Throwable {
		//connect to DB
		//dblib.connectToDB();
	}
	
	@BeforeTest(groups = {"smokeTest" , "regressionTest"})
	public void configBT() {
		//launch browser in parallel mode
	}
	
	//@Parameters("browser")
	@BeforeClass(groups = {"smokeTest" , "regressionTest"})
	public void configBC() throws Throwable {
		
		String browserName=fUtil.getPropertyKeyValue("browser");
		
		if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("Webdriver.chrome.driver", "./chromedriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("IE")) {
			driver=new InternetExplorerDriver();
		}
		staticDriver=driver;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
	@BeforeMethod(groups = {"smokeTest" , "regressionTest"})
	public void configBM() throws Throwable {
		String url=fUtil.getPropertyKeyValue("url");
		String username=fUtil.getPropertyKeyValue("email_id");
		String password=fUtil.getPropertyKeyValue("password");
		driver.get(url);
		//login to the application
		WelcomePage welcomePage=new WelcomePage(driver);
		welcomePage.clickOnSignIn();
		LoginPage loginPage=new LoginPage(driver);
		loginPage.login(username, password);
		
	}
	
	
	
	@AfterMethod(groups = {"smokeTest" , "regressionTest"})
	public void configAM() throws Throwable {
		HomePage homepage=new HomePage(driver);
		homepage.logout();
		
	}
	
	
	
	@AfterClass(groups = {"smokeTest" , "regressionTest"})
	public void configAC() {
		driver.quit();
	}
	
	@AfterTest(groups = {"smokeTest" , "regressionTest"})
	public void configAT() {
		//close driver ref in parallel mode
	}
	
	@AfterSuite(groups = {"smokeTest" , "regressionTest"})
	public void configAS() throws Throwable {
		// close DB connection
		//dblib.closeDb();
	}


}
