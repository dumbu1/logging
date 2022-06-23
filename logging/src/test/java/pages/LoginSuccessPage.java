package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.SeleniumSpecificMethods;


public class LoginSuccessPage {
	
	private WebDriver driver;
	public LoginSuccessPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//div[@id='logged-in-message']/p[@id='logged-in'and@xpath='1']")
	private WebElement text_LoginMessage;
	
	public void login_Checking(String expectedText) {
		
		SeleniumSpecificMethods.check_Text(text_LoginMessage, expectedText);
	}

	
}
