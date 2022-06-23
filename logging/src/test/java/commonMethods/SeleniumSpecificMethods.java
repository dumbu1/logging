package commonMethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.GetLog;
import utility.InvokeBrowser;

public class SeleniumSpecificMethods extends GetLog{
	
	public static final Logger logger=LogManager.getLogger(SeleniumSpecificMethods.class.getName());
	
	//-----------------------------Windows related-----------------------------------

	/***
	 * @author Krishna Mohan
	 * to get the current browser. It will call static property utility.InvokeBrowser.driver
	 * @return WebDriver
	 */
	
		public static WebDriver getDriver() {
			
			return InvokeBrowser.driver;
		}	
		
		/***
		 * to maximize the window
		 * @author Krishna Mohan
		 */
		public static void windowMaximize() {
			DOMConfigurator.configure("log4j.xml");
			SeleniumSpecificMethods.getDriver().manage().window().maximize();
			
			logger.info("******************window maximized");
		}
	
	
	
		
		
	
	public static void validate_PageTitle(String expectedPageTitle) {
		
		DOMConfigurator.configure("log4j.xml");
		Assert.assertEquals("window title "+expectedPageTitle+" doesnot match",expectedPageTitle, SeleniumSpecificMethods.getDriver().getTitle());
		logger.info("page title validated");
	}
	
	
	
	
	
	//-----------------------shifting window focus--------------------------------------
	
	/***
	 * @author Krishna Mohan
	 * to get all the window handles.
	 * @return Object[]
	 */
	
	public static Object[] getAllWindowHandles() {
		DOMConfigurator.configure("log4j.xml");
		Set<String> windowHandles=SeleniumSpecificMethods.getDriver().getWindowHandles();
		Object[] arrayOfWindows=windowHandles.toArray();
		
		logger.info("*******************window handles converted to object array");
		return arrayOfWindows;
		
	}
	/***
	 * for switching to last window
	 * @author Krishna Mohan
	 */
	public static void switch_To_Last_Window() {
		Set<String> windowHandles=SeleniumSpecificMethods.getDriver().getWindowHandles();
		
		//converting Set<String> to Object array, so that it can be used to navigate to specific page through index
		//Object[] arrayOfWindows=windowHandles.toArray();
		
		for (String windowHandle : windowHandles) {
			SeleniumSpecificMethods.getDriver().switchTo().window(windowHandle);
		}
		
		SeleniumSpecificMethods.windowMaximize();
	
	}
	
	/***
	 * to shift the focus to specific window
	 * @param windows
	 * @param pageIndexNumber
	 */
	public static void switch_To_Specific_Window(Object[] windows,int pageNumberToFocus) {
		
		SeleniumSpecificMethods.getDriver().switchTo().window((String)windows[pageNumberToFocus-1]);
	}
		
	
	
	
	
	//------------------------------webelement actions related--------------------------
	
	
	/***
	 * @author Krishna Mohan
	 * To click on webelement
	 * @param link
	 */
	public static void click(WebElement link ) {
		link.click();
	}
	
	/***
	 * To enter data in text field
	 * @author Krishna Mohan
	 * @param textBox
	 * @param dataToEnter
	 */
	public static void enterText_TextField(WebElement textBox,String dataToEnter) {
		textBox.sendKeys(dataToEnter);
	}
	
	/***
	 * to check the text in a page
	 * @author Krishna Mohan
	 * @param element
	 * @param expectedText
	 */
	public static void check_Text(WebElement element,String expectedText) {
		Assert.assertEquals("expected page not opened",expectedText, element.getText());
	}
	
	//--------------------------------lable------------------------------------
	
	
	public static String getText_lable(WebElement element) {
		return element.getText();
	}
	
		
		
	}

