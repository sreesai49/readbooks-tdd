package stepDefinations;

import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

import config.testSetUpFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class whatsTheBookName extends testSetUpFactory{
	
	public whatsTheBookName() {
		super();
	}
	
	@Given("^the user launch the web browser$")
	public void the_user_launch_the_web_browser() throws Throwable {
		driver = new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver", currentDir+"/drivers/chromedriver");
	    
	}

	@Given("^the user navigates to \"([^\"]*)\"$")
	public void the_user_navigates_to(String url) throws Throwable {
		driver.get(url);
	    
	}

	@Given("^login with email \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void login_with_email_and_password(String email, String password) throws Throwable {
	    
	}

	@When("^user enter value in console, search with that text and display results in console$")
	public void user_enter_value_in_console_search_with_that_text_and_display_results_in_console() throws Throwable {
	    
	}

	@Then("^save the whole search data and results in bookNames excel sheet$")
	public void save_the_whole_search_data_and_results_in_bookNames_excel_sheet() throws Throwable {
	    
	}

}
