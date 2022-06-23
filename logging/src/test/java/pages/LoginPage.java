package pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.SeleniumSpecificMethods;


public class LoginPage {
	
	private WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement textBox_Username;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement textBox_Password;
	
	@FindBy(xpath = "//button[@id='submit']")
	private WebElement button_Login;
	
	
	public void EnterLoginCredentials(String Username,String Password) {
		SeleniumSpecificMethods.enterText_TextField(textBox_Username, Username);
		SeleniumSpecificMethods.enterText_TextField(textBox_Password, Password);
		
		
		SeleniumSpecificMethods.click(button_Login);
		//SpecificToSelenium.switch_To_Current_Window(driver);
		
	}
	
	
}
