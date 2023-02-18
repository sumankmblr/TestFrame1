package TestScripts;

import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Genericlibraries.BaseClass;

public class TestCase4 extends BaseClass {

	@Test
	public void fouthCase() {

		SoftAssert soft = new SoftAssert();

		home.clickGears();
		home.clickSkillrarydemoApp();
		web.handleChildBrowser();

		soft.assertTrue(skillraryDemo.getPageHeader().isDisplayed());

		web.scrollToElement(skillraryDemo.getContactUs());
		skillraryDemo.clickContactUs();
		
		List<String> data = excel.fetchDataFromExcel("sheet1");
		contact.submitDetails(data.get(0), data.get(1), data.get(2), data.get(3));

		soft.assertAll();

	}

}
