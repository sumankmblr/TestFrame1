package Genericlibraries;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import POM.CoreJavaForSeleniumPage;
import POM.HomePage;
import POM.SkillraryDemoAppPage;
import POM.TestingPage;
import POM.ContactUsPage;
import POM.CoreJavaVedioPage;
import POM.SeleniumTrainingPage;

public class BaseClass {
	protected PropertiesFileUtility property;
	protected ExcelUtility excel;
	protected WebDriverUtility web;
	protected WebDriver driver;
	protected HomePage home;
	protected SkillraryDemoAppPage skillraryDemo;
	protected ContactUsPage contact;
	protected TestingPage testing;
	protected CoreJavaForSeleniumPage coreJava;
	protected SeleniumTrainingPage selenium;
	protected CoreJavaVedioPage javaVideo;
	protected long time;
	
	//@BeforeSuite
	//@BeforeTest
	@BeforeClass
	       public void classConfiguration()
	       {
		     property= new PropertiesFileUtility();
		     excel= new ExcelUtility();
		    
			 web= new WebDriverUtility();
		
		     
		     property.propertyFileInitialization(AutoConstantPath.PROPERTIES_FILE_PATH);
		     excel.excelInitialization(AutoConstantPath.EXCEL_FILE_PATH);
		     
	       }

	@BeforeMethod
	public void methodConfiguration() {
		time = Long.parseLong(property.fetchProperty("timeouts"));
		driver = web.openApplication(property.fetchProperty("browser"), property.fetchProperty("url"), time);
		home=new HomePage(driver);
		Assert.assertTrue(home.getLogo().isDisplayed());
		skillraryDemo = new SkillraryDemoAppPage(driver);
		selenium= new SeleniumTrainingPage(driver);
		coreJava=new CoreJavaForSeleniumPage(driver);
		javaVideo= new CoreJavaVedioPage(driver);
		testing=new TestingPage(driver);
		contact=new ContactUsPage(driver);
	}

	@AfterMethod
	    public void methodTearDown()
	    {
		   web.quitCurrentWindow();
	    }
	@AfterClass
	     public void classTearDown()
	     {
		   excel.closeExcel();
	     }
       	
	// @AfterTest
	// @AfterSuite
}


	
