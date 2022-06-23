package pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.DOMConfiguration;

import commonMethods.SeleniumSpecificMethods;
import utility.GetLog;

public class MultipleWindowsHandle_HomePage extends GetLog {
	
	public static final Logger logger=LogManager.getLogger(MultipleWindowsHandle_HomePage.class.getName());
	
	private WebDriver driver;
	public MultipleWindowsHandle_HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Click Here')]")
	private WebElement link_Click_Here;

	@FindBy(xpath = "//h3")
	private WebElement lable_text;
	
	
	/***
	 * @author Krishna Mohan
	 * is to navigate to the Multiple Page window
	 */
	public void navigateToMultiplePage() {
		
	DOMConfigurator.configure("log4j.xml");
		HomePage obj_HomePage=new HomePage(SeleniumSpecificMethods.getDriver());
		logger.info("****************user is on HomePage");
		
		obj_HomePage.click_MultipleWindows();
		
		logger.info("*************************clicked Multiple Windows link");
	}
	
	public void click_ClickHere() {
		DOMConfigurator.configure("log4j.xml");
		SeleniumSpecificMethods.click(link_Click_Here);
	}
	
	public void verifyText(String expectedText) {
		
		Assert.assertEquals(expectedText, SeleniumSpecificMethods.getText_lable(lable_text));
	}
	
}
