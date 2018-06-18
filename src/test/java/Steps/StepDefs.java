package Steps;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefs {
	@Given("^I navigate to login page$")
	public void i_navigate_to_login_page() throws Throwable {
		System.out.println("Hello Senthil");
	    
	   
	}

	/*@Given("^I enter the username as \"([^\"]*)\" and password as \"(.*)\"$")
	public void i_enter_the_username_as_admin_and_password_as_admin(String username,String password) throws Throwable {
	 System.out.println("Username is "+username+" and  Password is "+password);  
	}*/
	
	@Given("^I enter the following for Login$")
	public void i_enter_the_following_for_Login(DataTable table) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> data = table.raw();
		System.out.println("The value of username is "+data.get(1).get(0));
		System.out.println("The value of password is "+data.get(1).get(1));
		
		
	    
	}

	@Given("^I click login button$")
	public void i_click_login_button() throws Throwable {
	   
	}

	@Then("^I should see the userform page$")
	public void i_should_see_the_userform_page() throws Throwable {
	   
	}
	

}
