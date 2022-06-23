package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.SeleniumSpecificMethods;


public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Login Form')]")
	private WebElement link_LoginForm;
	
	@FindBy(xpath = "//a[contains(text(),'Multiple Windows')]")
	private WebElement link_MultipleWindows;
	
	@FindBy(xpath = "//a[contains(text(),'Click Here')]")
	private WebElement link_ClickHere;
	
	
	public void click_LoginForm() {
		SeleniumSpecificMethods.click(link_LoginForm);
	}
	public void click_MultipleWindows() {
		SeleniumSpecificMethods.click(link_MultipleWindows);
	}
	
	public void click_ClickHere() {
		SeleniumSpecificMethods.click(link_ClickHere);
	}

}
