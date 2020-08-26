package manajaga.stepdef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import manajaga.objectrepository.manajaga_elements;
import manajaga.pages.CommonMethods;

public class PostPropertyRentValidations {
	
	@When("^User Select Apartment Property type for Rent$")
	public void User_Select_Apartment_Property_type_for_Rent() throws Throwable {
		CommonMethods.SelectDD("propertyTypeRent", "Apartment");
	}
	
	@When("^User select Post Property and select Rent$")
	public void user_select_Post_Property_and_select_Rent() throws Throwable {
		BaseTest.driver.findElement(manajaga_elements.PostProperty_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.Next_btn_ChooseOptn).click();
		BaseTest.waitUntilPageLoad();
		BaseTest.driver.findElement(manajaga_elements.PP_Rent_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.nxt_btn_user_info).click();
		Thread.sleep(1000);
	}

	@Then("^Apartment fields for Rent are displayed$")
	public void apartment_fields_for_Rent_are_displayed() throws Throwable {
		CommonMethods.FieldValidation("bedrooms");
		CommonMethods.FieldValidation("post-bathrooms");
		CommonMethods.FieldValidation("post-totalfloors");
		CommonMethods.FieldValidation("post-floorno");
		CommonMethods.FieldValidation("post-area");
		CommonMethods.FieldValidation("post-areavalue");
		CommonMethods.FieldValidation("area-length");
		CommonMethods.FieldValidation("area-bredth");
		CommonMethods.FieldValidation("post-furniture");
		CommonMethods.FieldValidation("post-buildingage");
		CommonMethods.FieldValidation("post-opensides");
		CommonMethods.FieldValidation("post-face");
		CommonMethods.FieldValidation("post-poojaroom");
		CommonMethods.FieldValidation("leaseYears");
		CommonMethods.FieldValidation("availableFor");
		CommonMethods.FieldValidation("availableStatus");
		CommonMethods.FieldValidation("post-attachedbathroom");
		CommonMethods.FieldValidation("post-commonbathroom");
		CommonMethods.FieldValidation("post-otherroom");
		CommonMethods.FieldValidation("post-balcony");
		CommonMethods.FieldValidation("post-water");
		CommonMethods.FieldValidation("post-commonarea");
		CommonMethods.FieldValidation("post-pets-allowed");
		CommonMethods.FieldValidation("post-watchmen");
		CommonMethods.FieldValidation("post-cc-cameras");
		CommonMethods.FieldValidation("post-parking");
		CommonMethods.FieldValidation("post-totalprice");
		CommonMethods.FieldValidation("post-responsefrom");
		CommonMethods.FieldValidation("post-rent-details");
	   
	}

	@Then("^Commercial Plot fields for Rent are displayed$")
	public void commercial_Plot_fields_for_Rent_are_displayed() throws Throwable {
		CommonMethods.FieldValidation("post-areas-few");
		CommonMethods.FieldValidation("post-areavalue");
		CommonMethods.FieldValidation("area-length");
		CommonMethods.FieldValidation("area-bredth");
		CommonMethods.FieldValidation("post-opensides");
		CommonMethods.FieldValidation("post-face");
		CommonMethods.FieldValidation("availableStatus");
		CommonMethods.FieldValidation("post-water");
		CommonMethods.FieldValidation("post-Bathroom");
		CommonMethods.FieldValidation("post-commonarea");
		CommonMethods.FieldValidation("post-watchmen");
		CommonMethods.FieldValidation("post-cc-cameras");
		CommonMethods.FieldValidation("post-rent-details");
		CommonMethods.FieldValidation("post-responsefrom");
	}

	@Then("^Commercial Shop fields for Rent are displayed$")
	public void commercial_Shop_fields_for_Rent_are_displayed() throws Throwable {
		CommonMethods.FieldValidation("post-totalfloors");
		CommonMethods.FieldValidation("post-floorno");
		CommonMethods.FieldValidation("post-area");
		CommonMethods.FieldValidation("post-areavalue");
		CommonMethods.FieldValidation("area-length");
		CommonMethods.FieldValidation("area-bredth");
		CommonMethods.FieldValidation("post-furniture");
		CommonMethods.FieldValidation("post-opensides");
		CommonMethods.FieldValidation("post-face");
		CommonMethods.FieldValidation("leaseYears");
		CommonMethods.FieldValidation("availableStatus");
		CommonMethods.FieldValidation("post-permission");
		CommonMethods.FieldValidation("post-Bathroom");
		CommonMethods.FieldValidation("post-water");
		CommonMethods.FieldValidation("post-watchmen");
		CommonMethods.FieldValidation("post-cc-cameras");
		CommonMethods.FieldValidation("post-responsefrom");
		CommonMethods.FieldValidation("post-rent-details");
	}

	@When("^User Select Farm House Property type$")
	public void user_Select_Farm_House_Property_type() throws Throwable {
		CommonMethods.SelectDD("propertyTypeRent", "Farm House");
	}

	@Then("^Farm House fields for Rent are displayed$")
	public void farm_House_fields_for_Rent_are_displayed() throws Throwable {
		CommonMethods.FieldValidation("bedrooms");
		CommonMethods.FieldValidation("post-bathrooms");
		CommonMethods.FieldValidation("post-totalfloors");
		CommonMethods.FieldValidation("post-floorno");
		CommonMethods.FieldValidation("post-area");
		CommonMethods.FieldValidation("post-areavalue");
		CommonMethods.FieldValidation("area-length");
		CommonMethods.FieldValidation("area-bredth");
		CommonMethods.FieldValidation("post-furniture");
		CommonMethods.FieldValidation("post-buildingage");
		CommonMethods.FieldValidation("post-opensides");
		CommonMethods.FieldValidation("post-face");
		CommonMethods.FieldValidation("availableFor");
		CommonMethods.FieldValidation("availableStatus");
		CommonMethods.FieldValidation("post-attachedbathroom");
		CommonMethods.FieldValidation("post-commonbathroom");
		CommonMethods.FieldValidation("post-poojaroom");
		CommonMethods.FieldValidation("post-otherroom");
		CommonMethods.FieldValidation("post-water");
		CommonMethods.FieldValidation("post-commonarea");
		CommonMethods.FieldValidation("post-pets-allowed");
		CommonMethods.FieldValidation("post-watchmen");
		CommonMethods.FieldValidation("post-cc-cameras");
		CommonMethods.FieldValidation("post-responsefrom");
		CommonMethods.FieldValidation("post-rent-details");
	}
	        
	@Then("^Industrial Land fields for Rent are displayed$")
	public void industrial_Land_fields_for_Rent_are_displayed() throws Throwable {
		CommonMethods.FieldValidation("post-area");
		CommonMethods.FieldValidation("post-areavalue");
		CommonMethods.FieldValidation("area-length");
		CommonMethods.FieldValidation("area-bredth");
		CommonMethods.FieldValidation("post-opensides");
		CommonMethods.FieldValidation("post-face");
		CommonMethods.FieldValidation("leaseYears");
		CommonMethods.FieldValidation("post-permission");
		CommonMethods.FieldValidation("post-venture");
		CommonMethods.FieldValidation("post-water");
		CommonMethods.FieldValidation("post-Bathroom");
		CommonMethods.FieldValidation("post-rent-details");
	}

	@Then("^Individual House fields for Rent are displayed$")
	public void individual_House_fields_for_Rent_are_displayed() throws Throwable {
		CommonMethods.FieldValidation("bedrooms");
		CommonMethods.FieldValidation("post-bathrooms");
		CommonMethods.FieldValidation("post-totalfloors");
		CommonMethods.FieldValidation("post-floorno");
		CommonMethods.FieldValidation("post-area");
		CommonMethods.FieldValidation("post-areavalue");
		CommonMethods.FieldValidation("area-length");
		CommonMethods.FieldValidation("area-bredth");
		CommonMethods.FieldValidation("post-furniture");
		CommonMethods.FieldValidation("post-buildingage");
		CommonMethods.FieldValidation("post-opensides");
		CommonMethods.FieldValidation("post-face");
		CommonMethods.FieldValidation("availableFor");
		CommonMethods.FieldValidation("availableStatus");
		CommonMethods.FieldValidation("post-attachedbathroom");
		CommonMethods.FieldValidation("post-commonbathroom");
		CommonMethods.FieldValidation("post-poojaroom");
		CommonMethods.FieldValidation("post-otherroom");
		CommonMethods.FieldValidation("post-water");
		CommonMethods.FieldValidation("post-commonarea");
		CommonMethods.FieldValidation("post-pets-allowed");
		CommonMethods.FieldValidation("post-watchmen");
		CommonMethods.FieldValidation("post-cc-cameras");
		CommonMethods.FieldValidation("post-totalprice");
		CommonMethods.FieldValidation("post-responsefrom");
		CommonMethods.FieldValidation("post-rent-details");
	}

	@Then("^Office Space fields for Rent are displayed$")
	public void office_Space_fields_for_Rent_are_displayed() throws Throwable {
		CommonMethods.FieldValidation("post-totalfloors");
		CommonMethods.FieldValidation("post-floorno");
		CommonMethods.FieldValidation("post-area");
		CommonMethods.FieldValidation("post-areavalue");
		CommonMethods.FieldValidation("area-length");
		CommonMethods.FieldValidation("area-bredth");
		CommonMethods.FieldValidation("post-furniture");
		CommonMethods.FieldValidation("post-opensides");
		CommonMethods.FieldValidation("post-face");
		CommonMethods.FieldValidation("availableStatus");
		CommonMethods.FieldValidation("post-water");
		CommonMethods.FieldValidation("post-Bathroom");
		CommonMethods.FieldValidation("post-Cafeteria");
		CommonMethods.FieldValidation("post-watchmen");
		CommonMethods.FieldValidation("post-cc-cameras");
		CommonMethods.FieldValidation("post-responsefrom");
		CommonMethods.FieldValidation("post-rent-details");
	}

	@Then("^Pent House fields for Rent are displayed$")
	public void pent_House_fields_for_Rent_are_displayed() throws Throwable {
		CommonMethods.FieldValidation("post-totalfloors");
		CommonMethods.FieldValidation("post-opensides");
		CommonMethods.FieldValidation("post-face");
		CommonMethods.FieldValidation("post-venture");
		CommonMethods.FieldValidation("post-responsefrom");
		CommonMethods.FieldValidation("post-rent-details");
	}

	@Then("^Residential Plot fields for Rent are displayed$")
	public void residential_Plot_fields_for_Rent_are_displayed() throws Throwable {
		CommonMethods.FieldValidation("post-areas-few");
		CommonMethods.FieldValidation("post-areavalue");
		CommonMethods.FieldValidation("area-length");
		CommonMethods.FieldValidation("area-bredth");
		CommonMethods.FieldValidation("post-opensides");
		CommonMethods.FieldValidation("post-venture");
		CommonMethods.FieldValidation("post-face");
		CommonMethods.FieldValidation("post-water");
		CommonMethods.FieldValidation("post-responsefrom");
		CommonMethods.FieldValidation("post-rent-details");
	}

	@Then("^WareHouse fields for Rent are displayed$")
	public void warehouse_fields_for_Rent_are_displayed() throws Throwable {
		CommonMethods.FieldValidation("post-totalfloors");
		CommonMethods.FieldValidation("post-floorno");
		CommonMethods.FieldValidation("post-area");
		CommonMethods.FieldValidation("post-areavalue");
		CommonMethods.FieldValidation("area-length");
		CommonMethods.FieldValidation("area-bredth");
		CommonMethods.FieldValidation("post-furniture");
		CommonMethods.FieldValidation("post-opensides");
		CommonMethods.FieldValidation("post-face");
		CommonMethods.FieldValidation("availableStatus");
		CommonMethods.FieldValidation("post-water");
		CommonMethods.FieldValidation("post-Bathroom");
		CommonMethods.FieldValidation("post-commonarea");
		CommonMethods.FieldValidation("post-watchmen");
		CommonMethods.FieldValidation("post-cc-cameras");
		CommonMethods.FieldValidation("post-responsefrom");
		CommonMethods.FieldValidation("post-rent-details");
	}
	
	@When("^User Select Apartment Property type for Post Property Rent$")
	public void User_Select_Apartment_Property_type_for_Post_Property_Rent() throws Throwable {
		CommonMethods.SelectDD("propertyTypeRent", "Apartment");
	}
	
	@When("^User Select Commercial Plot Property type for Post Property Rent$")
	public void User_Select_Commercial_Plot_Property_type_for_Post_Property_Rent() throws Throwable {
		CommonMethods.SelectDD("propertyTypeRent", "Commercial Plot");
	}
	
	@When("^User Select Commercial Shop Property type for Post Property Rent$")
	public void User_Select_Commercial_Shop_Property_type_for_Post_Property_Rent() throws Throwable {
		CommonMethods.SelectDD("propertyTypeRent", "Commercial Shop");
	}
	
	@When("^User Select FarmHouse Property type for Post Property Rent$")
	public void User_Select_FarmHouse_Plot_Property_type_for_Post_Property_Rent() throws Throwable {
		CommonMethods.SelectDD("propertyTypeRent", "Farm House");
	}
	
	@When("^User Select Industrial Land Property type for Post Property Rent$")
	public void User_Select_Industrial_Land_Property_type_for_Post_Property_Rent() throws Throwable {
		CommonMethods.SelectDD("propertyTypeRent", "Industrial Land");
	}
	
	@When("^User Select Individual House Property type for Post Property Rent$")
	public void User_Select_Individual_House_Property_type_for_Post_Property_Rent() throws Throwable {
		CommonMethods.SelectDD("propertyTypeRent", "Individual House");
	}
	
	@When("^User Select Office Space Property type for Post Property Rent$")
	public void User_Select_Office_Space_Property_type_for_Post_Property_Rent() throws Throwable {
		CommonMethods.SelectDD("propertyTypeRent", "Office Space");
	}
	
	@When("^User Select PentHouse Property type for Post Property Rent$")
	public void User_Select_PentHouse_Property_type_for_Post_Property_Rent() throws Throwable {
		CommonMethods.SelectDD("propertyTypeRent", "Pent House");
	}
	
	@When("^User Select Residential Plot Property type for Post Property Rent$")
	public void User_Select_Residential_Plot_Property_type_for_Post_Property_Rent() throws Throwable {
		CommonMethods.SelectDD("propertyTypeRent", "Residential Plot");
	}
	
	@When("^User Select WareHouse Property type for Post Property Rent$")
	public void User_Select_WareHouse_Property_type_for_Post_Property_Rent() throws Throwable {
		CommonMethods.SelectDD("propertyTypeRent", "Ware House");
	}

}
