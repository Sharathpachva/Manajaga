package manajaga.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import manajaga.pages.CommonMethods;

public class RequirePropertyBuyRentValidation {

	@When("^User select Require Property and select Buy$")
	public void user_select_Require_Property_and_select_Buy() throws Throwable {
		BaseTest.driver.findElement(By.xpath("//label[@for='RequiredProperty']")).click();
		BaseTest.driver.findElement(By.xpath("(//button[@class='btn btn-theme-2 nextBtn'][contains(.,'Next')])[1]"))
				.click();
		BaseTest.driver.findElement(By.xpath("//label[@for='n_pp_buyer']")).click();
		BaseTest.driver.findElement(By.xpath("//label[@for='ReqBuy']")).click();
		BaseTest.driver.findElement(By.xpath("(//button[@class='btn btn-theme-2 nextBtn'][contains(.,'Next')])[2]"))
				.click();

	}

	@Then("^Agricultural Land fields for buy or rent are displayed$")
	public void agricultural_Land_fields_for_buy_or_rent_are_displayed() throws Throwable {
		CommonMethods.FieldValidation("req-areas-all");
		CommonMethods.FieldValidation("require-area-value");
		CommonMethods.FieldValidation("require-area-length");
		CommonMethods.FieldValidation("require-area-bredth");
		CommonMethods.FieldValidation("requireFacing");
		CommonMethods.FieldValidation("requireOpenSides");
		CommonMethods.FieldValidation("requireBoundaryWith");
		CommonMethods.FieldValidation("req-waterfacility");
		CommonMethods.FieldValidation("Req-ExpectingTotalPrice");
		CommonMethods.FieldValidation("req-responsefrom");
		Thread.sleep(1000);

	}

	@Then("^Apartment fields for buy or rent are displayed$")
	public void apartment_fields_for_buy_or_rent_are_displayed() throws Throwable {
		CommonMethods.FieldValidation("requireBedrooms");
		CommonMethods.FieldValidation("requireBathrooms");
		CommonMethods.FieldValidation("requireFurniture");
		CommonMethods.FieldValidation("req-areas-few");
		CommonMethods.FieldValidation("require-area-value");
		CommonMethods.FieldValidation("require-area-value");
		CommonMethods.FieldValidation("require-area-bredth");
		CommonMethods.FieldValidation("requireFacing");
		CommonMethods.FieldValidation("requireOpenSides");
		CommonMethods.FieldValidation("req-gcommunity");
		CommonMethods.FieldValidation("req-parking");
		CommonMethods.FieldValidation("req-poojaroom");
		CommonMethods.FieldValidation("req-otherroom");
		CommonMethods.FieldValidation("Req-ExpectingTotalPrice");
		CommonMethods.FieldValidation("req-responsefrom");

	}

	@Then("^Commercial Plot fields for buy or rent are displayed$")
	public void commercial_Plot_fields_for_buy_or_rent_are_displayed() throws Throwable {

		CommonMethods.FieldValidation("req-areas-few");
		CommonMethods.FieldValidation("req-area-value");
		CommonMethods.FieldValidation("req-area-length");
		CommonMethods.FieldValidation("req-area-breadth");
		CommonMethods.FieldValidation("req-opensides");
		CommonMethods.FieldValidation("req-BoundaryWith");
		CommonMethods.FieldValidation("req-plot-facing-mainroad");
		CommonMethods.FieldValidation("req-lrs");
		CommonMethods.FieldValidation("req-waterfacility");
		CommonMethods.FieldValidation("req-permission");
		CommonMethods.FieldValidation("req-expprice");
		CommonMethods.FieldValidation("req-responsefrom");

	}

	@Then("^Commercial Shop fields for buy or rent are displayed$")
	public void commercial_Shop_fields_for_buy_or_rent_are_displayed() throws Throwable {
		CommonMethods.FieldValidation("req-areas-few");
		CommonMethods.FieldValidation("req-area-value");
		CommonMethods.FieldValidation("req-area-length");
		CommonMethods.FieldValidation("req-area-breadth");
		CommonMethods.FieldValidation("req-face");
		CommonMethods.FieldValidation("req-opensides");
		CommonMethods.FieldValidation("req-waterfacility");
		CommonMethods.FieldValidation("req-permission");
		CommonMethods.FieldValidation("req-expprice");
		CommonMethods.FieldValidation("req-responsefrom");
	}

	@Then("^Pent House fields for buy or rent are displayed$")
	public void pent_House_fields_for_buy_or_rent_are_displayed() throws Throwable {
		CommonMethods.FieldValidation("req-bedrooms");
		CommonMethods.FieldValidation("req-bathrooms");
		CommonMethods.FieldValidation("req-furniture");
		CommonMethods.FieldValidation("req-areas-few");
		CommonMethods.FieldValidation("req-area-value");
		CommonMethods.FieldValidation("req-area-length");
		CommonMethods.FieldValidation("req-area-breadth");
		CommonMethods.FieldValidation("req-face");
		CommonMethods.FieldValidation("req-opensides");
		CommonMethods.FieldValidation("req-tradetype");
		CommonMethods.FieldValidation("req-permission");
		CommonMethods.FieldValidation("req-rent-purpose");
		CommonMethods.FieldValidation("req-gcommunity");
		CommonMethods.FieldValidation("req-parking");
		CommonMethods.FieldValidation("req-poojaroom");
		CommonMethods.FieldValidation("req-otherroom");
		CommonMethods.FieldValidation("req-possession");
		CommonMethods.FieldValidation("req-expprice");
		CommonMethods.FieldValidation("req-responsefrom");

	}

	@When("^User Select residential House Property type$")
	public void user_Select_residential_House_Property_type() throws Throwable {
		BaseTest.driver.findElement(By.xpath("//label[@for='RequiredProperty']")).click();
		BaseTest.driver.findElement(By.xpath("(//button[@class='btn btn-theme-2 nextBtn'][contains(.,'Next')])[1]"))
				.click();
		BaseTest.driver.findElement(By.xpath("//label[@for='n_pp_buyer']")).click();
		BaseTest.driver.findElement(By.xpath("//label[@for='ReqBuy']")).click();
		BaseTest.driver.findElement(By.xpath("(//button[@class='btn btn-theme-2 nextBtn'][contains(.,'Next')])[2]"))
				.click();
	}

	@Then("^Residential House fields for buy or rent are displayed$")
	public void residential_House_fields_for_buy_or_rent_are_displayed() throws Throwable {
		CommonMethods.FieldValidation("req-bedrooms");
		CommonMethods.FieldValidation("req-bathrooms");
		CommonMethods.FieldValidation("req-floorno");
		CommonMethods.FieldValidation("req-furniture");
		CommonMethods.FieldValidation("req-areas-few");
		CommonMethods.FieldValidation("req-area-value");
		CommonMethods.FieldValidation("req-area-length");
		CommonMethods.FieldValidation("req-area-breadth");
		CommonMethods.FieldValidation("req-face");
		CommonMethods.FieldValidation("req-opensides");
		CommonMethods.FieldValidation("req-tradetype");
		CommonMethods.FieldValidation("req-permission");
		CommonMethods.FieldValidation("req-rent-purpose");
		CommonMethods.FieldValidation("req-cshop");
		CommonMethods.FieldValidation("req-gcommunity");
		CommonMethods.FieldValidation("req-parking");
		CommonMethods.FieldValidation("req-poojaroom");
		CommonMethods.FieldValidation("req-otherroom");
		CommonMethods.FieldValidation("req-possession");
		CommonMethods.FieldValidation("req-expprice");
		CommonMethods.FieldValidation("req-responsefrom");
	}

	@Then("^Residential Plot fields for buy or rent are displayed$")
	public void residential_Plot_fields_for_buy_or_rent_are_displayed() throws Throwable {
		CommonMethods.FieldValidation("req-areas-few");
		CommonMethods.FieldValidation("req-area-value");
		CommonMethods.FieldValidation("req-area-length");
		CommonMethods.FieldValidation("req-area-breadth");
		CommonMethods.FieldValidation("req-opensides");
		CommonMethods.FieldValidation("req-BoundaryWith");
		CommonMethods.FieldValidation("req-plot-facing-mainroad");
		CommonMethods.FieldValidation("req-lrs");
		CommonMethods.FieldValidation("req-venture");
		CommonMethods.FieldValidation("req-waterfacility");
		CommonMethods.FieldValidation("req-permission");
		CommonMethods.FieldValidation("req-expprice");
		CommonMethods.FieldValidation("req-responsefrom");
	}

	@Then("^WareHouse fields for buy or rent are displayed$")
	public void warehouse_fields_for_buy_or_rent_are_displayed() throws Throwable {
		CommonMethods.FieldValidation("req-bathrooms");
		CommonMethods.FieldValidation("req-totalfloors");
		CommonMethods.FieldValidation("req-furniture");
		CommonMethods.FieldValidation("req-areas-few");
		CommonMethods.FieldValidation("req-area-value");
		CommonMethods.FieldValidation("req-area-length");
		CommonMethods.FieldValidation("req-area-breadth");
		CommonMethods.FieldValidation("req-warehousefacing");
		CommonMethods.FieldValidation("req-opensides");
		CommonMethods.FieldValidation("req-waterfacility");
		CommonMethods.FieldValidation("req-permission");
		CommonMethods.FieldValidation("req-parking");
		CommonMethods.FieldValidation("req-expprice");
		CommonMethods.FieldValidation("req-responsefrom");
	}

	@When("^User select Require Property and select Rent$")
	public void user_select_Require_Property_and_select_Rent() throws Throwable {

		BaseTest.driver.findElement(By.xpath("//label[@for='RequiredProperty']")).click();
		BaseTest.driver.findElement(By.xpath("(//button[@class='btn btn-theme-2 nextBtn'][contains(.,'Next')])[1]")).click();
		BaseTest.waitUntilPageLoad();
		BaseTest.driver.findElement(By.xpath("//label[@for='n_pp_tenant']")).click();
		BaseTest.driver.findElement(By.xpath("//label[@for='ReqRent']")).click();
		BaseTest.driver.findElement(By.xpath("(//button[@class='btn btn-theme-2 nextBtn'][contains(.,'Next')])[2]")).click();
		BaseTest.waitUntilPageLoad();
	}

	@When("^User Select Agricultural Land Property type for Require Property Buy$")
	public void User_Select_Agricultural_Land_Property_type_for_Require_Property_Buy() throws Throwable {
		CommonMethods.SelectDD("requirePropertyTypeBuyRent", "Agriculture Land");
	}

	@When("^User Select Commercial Plot Property type for Require Property Buy$")
	public void User_Select_Commercial_Plot_Property_type_for_Require_Property_Buy() throws Throwable {
		CommonMethods.SelectDD("requirePropertyTypeBuyRent", "Commercial Plot");
	}

	@When("^User Select Commercial Shop Property type for Require Property Buy$")
	public void User_Select_Commercial_Shop_Property_type_for_Require_Property_Buy() throws Throwable {
		CommonMethods.SelectDD("requirePropertyTypeBuyRent", "Commercial Shop");
	}

	@When("^User Select PentHouse Property type for Require Property Buy$")
	public void User_Select_PentHouse_Property_type_for_Require_Property_Buy() throws Throwable {
		CommonMethods.SelectDD("requirePropertyTypeBuyRent", "PentHouse");
	}

	@When("^User Select Residential House Property type for Require Property Buy$")
	public void User_Select_Residential_House_Property_type_for_Require_Property_Buy() throws Throwable {
		CommonMethods.SelectDD("requirePropertyTypeBuyRent", "Residential House");
	}

	@When("^User Select Residential Plot Property type for Require Property Buy$")
	public void User_Select_Residential_Plot_Property_type_for_Require_Property_Buy() throws Throwable {
		CommonMethods.SelectDD("requirePropertyTypeBuyRent", "Residential Plot");
	}

	@When("^User Select WareHouse Property type for Require Property Buy$")
	public void User_Select_WareHouse_Property_type_for_Require_Property_Buy() throws Throwable {
		CommonMethods.SelectDD("requirePropertyTypeBuyRent", "Warehouse");
	}

	@When("^User Select Apartment Property type for Require Property Buy$")
	public void User_Select_Apartment_Property_type_for_Require_Property_Buy() throws Throwable {
		CommonMethods.SelectDD("requirePropertyTypeBuyRent", "Apartment");
	}
	
	@When("^User Select Agricultural Land Property type for Require Property Rent$")
	public void User_Select_Agricultural_Land_Property_type_for_Require_Property_Rent() throws Throwable {
		CommonMethods.SelectDD("requirePropertyTypeBuyRent", "Agriculture Land");
	}

	@When("^User Select Commercial Plot Property type for Require Property Rent$")
	public void User_Select_Commercial_Plot_Property_type_for_Require_Property_Rent() throws Throwable {
		CommonMethods.SelectDD("requirePropertyTypeBuyRent", "Commercial Plot");
	}

	@When("^User Select Commercial Shop Property type for Require Property Rent$")
	public void User_Select_Commercial_Shop_Property_type_for_Require_Property_Rent() throws Throwable {
		CommonMethods.SelectDD("requirePropertyTypeBuyRent", "Commercial Shop");
	}

	@When("^User Select PentHouse Property type for Require Property Rent$")
	public void User_Select_PentHouse_Property_type_for_Require_Property_Rent() throws Throwable {
		CommonMethods.SelectDD("requirePropertyTypeBuyRent", "PentHouse");
	}

	@When("^User Select Residential House Property type for Require Property Rent$")
	public void User_Select_Residential_House_Property_type_for_Require_Property_Rent() throws Throwable {
		CommonMethods.SelectDD("requirePropertyTypeBuyRent", "Residential House");
	}

	@When("^User Select Residential Plot Property type for Require Property Rent$")
	public void User_Select_Residential_Plot_Property_type_for_Require_Property_Rent() throws Throwable {
		CommonMethods.SelectDD("requirePropertyTypeBuyRent", "Residential Plot");
	}

	@When("^User Select WareHouse Property type for Require Property Rent$")
	public void User_Select_WareHouse_Property_type_for_Require_Property_Rent() throws Throwable {
		CommonMethods.SelectDD("requirePropertyTypeBuyRent", "Warehouse");
	}

	@When("^User Select Apartment Property type for Require Property Rent$")
	public void User_Select_Apartment_Property_type_for_Require_Property_Rent() throws Throwable {
		CommonMethods.SelectDD("requirePropertyTypeBuyRent", "Apartment");
		
	}
}
