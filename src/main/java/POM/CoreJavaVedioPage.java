package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaVedioPage {
		//Declaration
		@FindBy(xpath="//h1[text()='Core Java For Selenium Training']")
	    private WebElement pageHeader;
		
		@FindBy(xpath="//button[contains(@class,\"PlayButton\")]")
		private WebElement PlayButton;
		
		@FindBy(xpath="//button[@aria-label='Pause']")
		private WebElement PauseButton;
		
		@FindBy(xpath="//span[text()='Add To Wishlist']")
		private WebElement addToWishList;
		
		@FindBy(xpath="//a[@class='close_cookies']")
		private WebElement closePopup;
		
		
		//Initiliazation
		
		public CoreJavaVedioPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		
		public String pageHeader()
		{
			return pageHeader.getText();
		}
		
		public void clickPlayButton()
		{
			PlayButton.click();
		}
		
		public void cliclPauseButton()
		{
			PauseButton.click();
		}
		
		public void closepopUp()
		{
			closePopup.click();
		}
		
		public void addToWist() {
			addToWishList.click();
		}
	}

		
	
