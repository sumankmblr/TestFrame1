package TestScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Genericlibraries.BaseClass;

public class TestCase3 extends BaseClass{

	@Test
	public void thirdCase() throws InterruptedException {
		
		SoftAssert soft=new SoftAssert();
		
		home.searchFor("core java for selenium");
		soft.assertEquals(coreJava.getPageHeader(), "COR JAVA FOR SELENIUM");
		
		coreJava.clickCoreJavaForSeleniumLink();
		soft.assertEquals(javaVideo.pageHeader(), "Core Java For Selenium");
		
		javaVideo.closepopUp();
		web.switchToFrame();
		javaVideo.clickPlayButton();
		Thread.sleep(2000);
		javaVideo.cliclPauseButton();
		
		web.switchBackFromFrame();
		
		javaVideo.addToWist();
		soft.assertAll();
		
		
		
		
		
		
	}
	
	
	
	
}
