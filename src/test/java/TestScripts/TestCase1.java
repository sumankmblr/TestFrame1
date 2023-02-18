package TestScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Genericlibraries.BaseClass;

public class TestCase1 extends BaseClass {

	@Test
	public void firstTest1() {
		SoftAssert soft = new SoftAssert();
		home.clickGears();
		home.clickSkillrarydemoApp();
		web.handleChildBrowser();

		soft.assertTrue(skillraryDemo.getPageHeader().isDisplayed());

		skillraryDemo.mouseHoverTocourse(web);
		skillraryDemo.clickSeleniumTraining();

		soft.assertEquals(selenium.getPageHeader(), "Selenium Training");

		selenium.doubleClickPlusButton(web);
		selenium.clickAddToCart();
		web.handleAlert();

		web.explicitWait(time, selenium.getItemAddedMessage());
		web.takeScreenShot();
		
		soft.assertTrue(selenium.getItemAddedMessage().isDisplayed());

		soft.assertAll();

	}

}
