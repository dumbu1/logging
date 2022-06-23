package stepDefinations;

import commonMethods.SeleniumSpecificMethods;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.MultipleWindowsHandle_HomePage;

public class MultipleWindows_HomePage_SD {
	
	@Given("user is on {string} page")
	public void user_is_on_home_page_with_title(String expectedPageTitle) {
		SeleniumSpecificMethods.validate_PageTitle(expectedPageTitle);
	}
	@When("user navigates to multiple windows page")
	public void user_navigates_to_multiple_windows_page() {
	   MultipleWindowsHandle_HomePage obj_MultipleWindowsHandle_HomePage=new MultipleWindowsHandle_HomePage(SeleniumSpecificMethods.getDriver());
	   obj_MultipleWindowsHandle_HomePage.navigateToMultiplePage();
	   
	}
	
	
	@When("user clicks on Click Here link")
	public void user_clicks_on_Click_Here_link() {
		MultipleWindowsHandle_HomePage obj_MultipleWindowsHandle_HomePage=new MultipleWindowsHandle_HomePage(SeleniumSpecificMethods.getDriver());
		obj_MultipleWindowsHandle_HomePage.click_ClickHere();
	   
	}
	
	
	
	@Then("system should shift the focus to new window")
	public void system_should_shift_the_focus_to_new_window() {
	   SeleniumSpecificMethods.switch_To_Last_Window();
	}
	
	@Then("system should open {string} page")
	public void system_should_open_page(String expectedPageTitle) {
		SeleniumSpecificMethods.validate_PageTitle(expectedPageTitle);
	}
	
	@Then("system should display the message {string}")
	public void system_should_display_the_message(String message) {
		
		MultipleWindowsHandle_HomePage obj_MultipleWindowsHandle_HomePage=new MultipleWindowsHandle_HomePage(SeleniumSpecificMethods.getDriver());
		obj_MultipleWindowsHandle_HomePage.verifyText(message);
	   
	}


}
