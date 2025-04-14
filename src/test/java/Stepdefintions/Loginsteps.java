package Stepdefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {
	
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Pass");
	}

	@When("User enters the username and password")
	public void user_enters_the_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Pass");
	}

	@And("Clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Pass");
	}

	@Then("User is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Pass");
	}




}
