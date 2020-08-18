package manajaga.stepdef;

import org.openqa.selenium.By;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import manajaga.pages.CommonMethods;

public class PostPropertyPgValidation 
{
	
	
	@When("^User select Post Property and select PG$")
	public void user_select_Post_Property_and_select_PG() throws Throwable 
	{
		BaseTest.driver.findElement(By.xpath("//label[@for='PostProperty']")).click();
		BaseTest.driver.findElement(By.xpath("(//button[@class='btn btn-theme-2 nextBtn'][contains(.,'Next')])[1]")).click();
		BaseTest.driver.findElement(By.xpath("//label[@for='n_pp_owner']")).click();
		BaseTest.driver.findElement(By.xpath("//label[@for='PG']")).click();
		BaseTest.driver.findElement(By.xpath("(//button[@class='btn btn-theme-2 nextBtn'][contains(.,'Next')])[2]")).click();
		
		
	}

	@Then("^Apartment fields for PPPG are displayed$")
	public void apartment_fields_for_PPPG_are_displayed() throws Throwable 
	{
	    CommonMethods.SelectDD("propertyType", "Apartment");
	    CommonMethods.FieldValidation("post-totalfloors");
	    CommonMethods.FieldValidation("post-floorno");
	    CommonMethods.FieldValidation("post-furniture");
	    CommonMethods.FieldValidation("pgavailableFor");
	    CommonMethods.FieldValidation("occupancy");
	    CommonMethods.FieldValidation("pgAge");
	    CommonMethods.FieldValidation("availableStatus");
	    CommonMethods.FieldValidation("tenantsPrefer");
	    CommonMethods.FieldValidation("roomsInPG");
	    CommonMethods.FieldValidation("bedsInRoom");
	    CommonMethods.FieldValidation("post-attachedbathroom");
	    CommonMethods.FieldValidation("post-sharingbathroom");
	    CommonMethods.FieldValidation("post-balcony");
	    CommonMethods.FieldValidation("post-water");
	    CommonMethods.FieldValidation("post-meals");
	    CommonMethods.FieldValidation("post-laundryavailable");
	    CommonMethods.FieldValidation("post-cooking");
	    CommonMethods.FieldValidation("post-guests");
	    CommonMethods.FieldValidation("post-commonarea");
	    CommonMethods.FieldValidation("post-pets-allowed");
	    CommonMethods.FieldValidation("post-timeRestriction");
	    CommonMethods.FieldValidation("post-watchmen");
	    CommonMethods.FieldValidation("post-cc-cameras");
	    CommonMethods.FieldValidation("post-furnishingdetails");
	    CommonMethods.FieldValidation("post-rent-details");
	    CommonMethods.FieldValidation("post-responsefrom");
	    
	    
	    
	}

	@Then("^Individual House fields for PPPG are displayed$")
	public void individual_House_fields_for_PPPG_are_displayed() throws Throwable 
	{
		CommonMethods.SelectDD("propertyType", "Individual House");
		CommonMethods.FieldValidation("post-totalfloors");
	    CommonMethods.FieldValidation("post-floorno");
	    CommonMethods.FieldValidation("post-furniture");
	    CommonMethods.FieldValidation("pgavailableFor");
	    CommonMethods.FieldValidation("occupancy");
	    CommonMethods.FieldValidation("pgAge");
	    CommonMethods.FieldValidation("availableStatus");
	    CommonMethods.FieldValidation("tenantsPrefer");
	    CommonMethods.FieldValidation("roomsInPG");
	    CommonMethods.FieldValidation("bedsInRoom");
	    CommonMethods.FieldValidation("post-attachedbathroom");
	    CommonMethods.FieldValidation("post-sharingbathroom");
	    CommonMethods.FieldValidation("post-balcony");
	    CommonMethods.FieldValidation("post-water");
	    CommonMethods.FieldValidation("post-meals");
	    CommonMethods.FieldValidation("post-laundryavailable");
	    CommonMethods.FieldValidation("post-cooking");
	    CommonMethods.FieldValidation("post-guests");
	    CommonMethods.FieldValidation("post-commonarea");
	    CommonMethods.FieldValidation("post-pets-allowed");
	    CommonMethods.FieldValidation("post-timeRestriction");
	    CommonMethods.FieldValidation("post-watchmen");
	    CommonMethods.FieldValidation("post-cc-cameras");
	    CommonMethods.FieldValidation("post-furnishingdetails");
	    CommonMethods.FieldValidation("post-rent-details");
	    CommonMethods.FieldValidation("post-responsefrom");
	    
	}
	
}
