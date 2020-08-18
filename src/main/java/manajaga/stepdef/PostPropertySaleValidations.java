package manajaga.stepdef;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PostPropertySaleValidations {
	
	@Given("^User Navigate to post Free Window$")
	public void user_Navigate_to_post_Free_Window() throws Throwable {
		BaseTest.driver.findElement(By.id("blink_me")).click();
	}
		
	@When("^User select Post Property and select Sale$")
	public void user_select_Post_Property_and_select_Sale() throws Throwable {
	    
	}

	@When("^User Select Agricultural Land Property type$")
	public void user_Select_Agricultural_Land_Property_type() throws Throwable {
	    
	}

	@Then("^Agricultural Land fields are displayed$")
	public void displays_Agricultural_Land_fields() throws Throwable {
	   
	}
	
	@When("^User Select Apartment Property type$")
	public void user_Select_Apartment_Property_type() throws Throwable {
	   
	}

	@Then("^Apartment Land fields are displayed$")
	public void displays_Apartment_Land_fields() throws Throwable {
	
	}

	@When("^User Select Commercial Plot Property type$")
	public void user_Select_Commercial_Plot_Property_type() throws Throwable {
	   
	}

	@Then("^Commercial Plot Land fields are displayed$")
	public void displays_Commercial_Plot_Land_fields() throws Throwable {
	    
	}

	@When("^User Select Commercial Shop Property type$")
	public void user_Select_Commercial_Shop_Property_type() throws Throwable {
	   
	}

	@Then("^Commercial Shop Land fields are displayed$")
	public void displays_Commercial_Shop_Land_fields() throws Throwable {
	  
	}

	@When("^User Select Industrial Land Property type$")
	public void user_Select_Industrial_Land_Property_type() throws Throwable {
	  
	}
	
	@Then("^Industrial Land fields are displayed$")
	public void Industrial_Land_fields_are_displayed() throws Throwable {
		
	}

	@When("^User Select Individual House Property type$")
	public void user_Select_Individual_House_Property_type() throws Throwable {
	  
	}

	@Then("^Individual House Land fields are displayed$")
	public void displays_Individual_House_Land_fields() throws Throwable {
	   
	}

	@When("^User Select Office Space Property type$")
	public void user_Select_Office_Space_Property_type() throws Throwable {
	    
	}

	@Then("^Office Space Land fields are displayed$")
	public void displays_Office_Space_Land_fields() throws Throwable {
	    
	}

	@When("^User Select Pent House Property type$")
	public void user_Select_Pent_House_Property_type() throws Throwable {
	    
	}

	@Then("^Pent House Land fields are displayed$")
	public void displays_Pent_House_Land_fields() throws Throwable {
	   
	}

	@When("^User Select residential Plot Property type$")
	public void user_Select_residential_Plot_Property_type() throws Throwable {
	   
	}

	@Then("^Residential Plot Land fields are displayed$")
	public void displays_Residential_Plot_Land_fields() throws Throwable {
	    
	}

	@When("^User Select WareHouse Property type$")
	public void user_Select_Ware_House_Property_type() throws Throwable {
	    
	}

	@Then("^WareHouse Land fields are displayed$")
	public void displays_Ware_House_Land_fields() throws Throwable {
	    
	}



}
