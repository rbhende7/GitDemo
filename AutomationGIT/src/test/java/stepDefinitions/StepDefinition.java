package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String EnvType1 = System.getProperty("EnvType1");
		System.out.println("NEW EnvType1=" + EnvType1);
		System.out.println(EnvType1 + "-STARTING TEST WITH MAVEN-GIT");
	    
	}

	@Given("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String EnvType2 = System.getProperty("EnvType2");
		System.out.println("NEW EnvType2=" + EnvType2);
		System.out.println(EnvType2 + "-STARTING TEST WITH MAVEN-GIT");
	    
	}

	@Given("^Click on Login link in home page to land on Secure sign in Page$")
	public void click_on_Login_link_in_home_page_to_land_on_Secure_sign_in_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("GIT-Click on Login link in home page to land on Secure sign in Page");
	}

	@When("^User enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
		System.out.println("GIT-username=" + username + " password=" + password);
        
    }


	@Then("^Verify that user is successfully logged in$")
	public void verify_that_user_is_successfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("GIT-Verify that user is successfully logged in");
	}

}
