package manajaga.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import manajaga.objectrepository.manajaga_elements;
import manajaga.pages.CommonMethods;

public class PostPropertySaleValidations {

	@Given("^User Navigate to post Free Window$")
	public void user_Navigate_to_post_Free_Window() throws Throwable {
		BaseTest.waitUntilPageLoad();
		BaseTest.driver.findElement(By.id("blink_me")).click();
		Thread.sleep(1000);
		BaseTest.waitUntilPageLoad();
	}

	@When("^User select Post Property and select Sale$")
	public void user_select_Post_Property_and_select_Sale() throws Throwable {
		BaseTest.driver.findElement(manajaga_elements.PostProperty_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.Next_btn_ChooseOptn).click();
		BaseTest.waitUntilPageLoad();
		BaseTest.driver.findElement(manajaga_elements.PP_Sale_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.nxt_btn_user_info).click();
		Thread.sleep(1000);
	}

	@When("^User Select Agricultural Land Property type$")
	public void user_Select_Agricultural_Land_Property_type() throws Throwable {
		CommonMethods.SelectDD("propertyTypeSale", "Agriculture Land");
	}

	@Then("^Agricultural Land fields are displayed$")
	public void displays_Agricultural_Land_fields() throws Throwable {
		// Facing field validation
		WebElement Facing = BaseTest.driver.findElement(By.id("post-face"));
		Facing.isDisplayed();

		// Boundary with field validation
		WebElement BoundaryWith = BaseTest.driver.findElement(By.id("boundaryWith"));
		BoundaryWith.isDisplayed();

		// Now under lease field validation
		WebElement UnderLease = BaseTest.driver.findElement(By.xpath("//label[@for='UnderLeaseNo']"));
		UnderLease.isDisplayed();

		// Water availability field validation
		WebElement WaterAvailability = BaseTest.driver.findElement(By.xpath("//label[@for='WaterAvailabilityYes']"));
		WaterAvailability.isDisplayed();

		// Total price field validation
		WebElement TotalPrice = BaseTest.driver.findElement(By.id("Post-Total-Price"));
		TotalPrice.isDisplayed();

		// Acres field validation
		WebElement Acres = BaseTest.driver.findElement(By.id("post-scres-val"));
		Acres.isDisplayed();

		// Land to main road distance field validation
		WebElement LandToMainRoaddistance = BaseTest.driver.findElement(By.id("post-LandToMainRoaddistance"));
		LandToMainRoaddistance.isDisplayed();

		// Metric field validation
		WebElement LandToMainRoaddistanceMetric = BaseTest.driver.findElement(By.id("LandToMainRoaddistanceMetric"));
		LandToMainRoaddistanceMetric.isDisplayed();

		// Soil type field validation
		WebElement soilType = BaseTest.driver.findElement(By.id("soilType"));
		soilType.isDisplayed();

		// Response from field validation
		WebElement responsefrom = BaseTest.driver.findElement(By.id("post-responsefrom"));
		responsefrom.isDisplayed();
	}

	@When("^User Select Apartment Property type$")
	public void user_Select_Apartment_Property_type() throws Throwable {
		CommonMethods.SelectDD("propertyType", "Apartment");
	}

	@Then("^Apartment fields are displayed$")
	public void displays_Apartment_fields() throws Throwable {
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
		CommonMethods.FieldValidation("post-otherroom");
		CommonMethods.FieldValidation("post-tradetype");
		CommonMethods.FieldValidation("post-possession");
		CommonMethods.FieldValidation("post-permission");
		CommonMethods.FieldValidation("post-gcommunity");
		CommonMethods.FieldValidation("post-venture");
		CommonMethods.FieldValidation("post-parking");
		CommonMethods.FieldValidation("post-totalprice");
		CommonMethods.FieldValidation("post-responsefrom");
		CommonMethods.FieldValidation("post-youtube-url");
		CommonMethods.FieldValidation("post-description");
	}

	@When("^User Select Commercial Plot Property type$")
	public void user_Select_Commercial_Plot_Property_type() throws Throwable {
		CommonMethods.SelectDD("propertyTypeSale", "Commercial Plot");
	}

	@Then("^Commercial Plot fields are displayed$")
	public void displays_Commercial_Plot_fields() throws Throwable {
		CommonMethods.FieldValidation("post-areas-few");
		CommonMethods.FieldValidation("post-areavalue");
		CommonMethods.FieldValidation("area-length");
		CommonMethods.FieldValidation("area-bredth");
		CommonMethods.FieldValidation("post-opensides");
		CommonMethods.FieldValidation("post-face");
		CommonMethods.FieldValidation("boundaryWith");
		CommonMethods.FieldValidation("leaseYears");
		CommonMethods.FieldValidation("post-venture");
		CommonMethods.FieldValidation("post-totalprice");
		CommonMethods.FieldValidation("post-responsefrom");

	}

	@When("^User Select Commercial Shop Property type$")
	public void user_Select_Commercial_Shop_Property_type() throws Throwable {
		CommonMethods.SelectDD("propertyType", "Commercial Shop");

	}

	@Then("^Commercial Shop fields are displayed$")
	public void Commercial_Shop_fields_are_displayed() throws Throwable {
		CommonMethods.FieldValidation("bathrooms");
		CommonMethods.FieldValidation("post-totalfloors");
		CommonMethods.FieldValidation("post-floorno");
		CommonMethods.FieldValidation("post-area");
		CommonMethods.FieldValidation("post-areavalue");
		CommonMethods.FieldValidation("area-length");
		CommonMethods.FieldValidation("area-bredth");
		CommonMethods.FieldValidation("post-furniture");
		CommonMethods.FieldValidation("post-buildingage");
		CommonMethods.FieldValidation("post-face");
		CommonMethods.FieldValidation("post-otherroom");
		CommonMethods.FieldValidation("post-tradetype");
		CommonMethods.FieldValidation("post-possession");
		CommonMethods.FieldValidation("post-parking");
		CommonMethods.FieldValidation("post-totalprice");
		CommonMethods.FieldValidation("post-responsefrom");
	}

	@When("^User Select Industrial Land Property type$")
	public void user_Select_Industrial_Land_Property_type() throws Throwable {
		CommonMethods.SelectDD("propertyType", "Industrial Land");
	}

	@Then("^Industrial Land fields are displayed$")
	public void Industrial_Land_fields_are_displayed() throws Throwable {
		CommonMethods.FieldValidation("post-opensides");
		CommonMethods.FieldValidation("post-face");
		CommonMethods.FieldValidation("leaseYears");
		CommonMethods.FieldValidation("post-permission");
		CommonMethods.FieldValidation("post-venture");
		CommonMethods.FieldValidation("post-totalprice");
		CommonMethods.FieldValidation("post-responsefrom");
	}

	@When("^User Select Individual House Property type$")
	public void user_Select_Individual_House_Property_type() throws Throwable {
		CommonMethods.SelectDD("propertyType", "Individual House");
	}

	@Then("^Individual House fields are displayed$")
	public void displays_Individual_House_fields() throws Throwable {
		CommonMethods.FieldValidation("bathrooms");
		CommonMethods.FieldValidation("post-bathrooms");
		CommonMethods.FieldValidation("post-totalfloors");
		CommonMethods.FieldValidation("post-area");
		CommonMethods.FieldValidation("post-areavalue");
		CommonMethods.FieldValidation("area-length");
		CommonMethods.FieldValidation("area-bredth");
		CommonMethods.FieldValidation("post-furniture");
		CommonMethods.FieldValidation("post-buildingage");
		CommonMethods.FieldValidation("post-opensides");
		CommonMethods.FieldValidation("post-face");
		CommonMethods.FieldValidation("post-poojaroom");
		CommonMethods.FieldValidation("post-otherroom");
		CommonMethods.FieldValidation("post-tradetype");
		CommonMethods.FieldValidation("post-possession");
		CommonMethods.FieldValidation("post-parking");
		CommonMethods.FieldValidation("post-permission");
		CommonMethods.FieldValidation("post-gcommunity");
		CommonMethods.FieldValidation("post-balcony");
		CommonMethods.FieldValidation("post-totalprice");
		CommonMethods.FieldValidation("post-responsefrom");
		CommonMethods.FieldValidation("post-youtube-url");
		CommonMethods.FieldValidation("post-description");
	}

	@When("^User Select Office Space Property type$")
	public void user_Select_Office_Space_Property_type() throws Throwable {
		CommonMethods.SelectDD("propertyType", "Office Space");

	}

	@Then("^Office Space fields are displayed$")
	public void displays_Office_Space_fields() throws Throwable {
		CommonMethods.FieldValidation("bathrooms");
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
		CommonMethods.FieldValidation("leaseYears");
		CommonMethods.FieldValidation("post-tradetype");
		CommonMethods.FieldValidation("post-possession");
		CommonMethods.FieldValidation("post-parking");
		CommonMethods.FieldValidation("post-totalprice");
		CommonMethods.FieldValidation("post-Cafeteria");
		CommonMethods.FieldValidation("post-responsefrom");
	}

	@When("^User Select Pent House Property type$")
	public void user_Select_Pent_House_Property_type() throws Throwable {
		CommonMethods.SelectDD("propertyType", "Pent House");

	}

	@Then("^Pent House fields are displayed$")
	public void displays_Pent_House_fields() throws Throwable {
		CommonMethods.FieldValidation("bathrooms");
		CommonMethods.FieldValidation("post-bathrooms");
		CommonMethods.FieldValidation("balconies");
		CommonMethods.FieldValidation("post-area");
		CommonMethods.FieldValidation("post-areavalue");
		CommonMethods.FieldValidation("area-length");
		CommonMethods.FieldValidation("area-bredth");
		CommonMethods.FieldValidation("post-furniture");
		CommonMethods.FieldValidation("post-buildingage");
		CommonMethods.FieldValidation("post-opensides");
		CommonMethods.FieldValidation("post-face");
		CommonMethods.FieldValidation("post-poojaroom");
		CommonMethods.FieldValidation("post-otherroom");
		CommonMethods.FieldValidation("post-tradetype");
		CommonMethods.FieldValidation("post-possession");
		CommonMethods.FieldValidation("post-parking");
		CommonMethods.FieldValidation("post-permission");
		CommonMethods.FieldValidation("post-gcommunity");
		CommonMethods.FieldValidation("post-balcony");
		CommonMethods.FieldValidation("post-totalprice");
		CommonMethods.FieldValidation("post-responsefrom");
		CommonMethods.FieldValidation("post-youtube-url");
		CommonMethods.FieldValidation("post-description");

	}

	@When("^User Select residential Plot Property type$")
	public void user_Select_residential_Plot_Property_type() throws Throwable {
		CommonMethods.SelectDD("propertyType", "Residential Plot");
	}

	@Then("^Residential Plot fields are displayed$")
	public void displays_Residential_Plot_fields() throws Throwable {
		CommonMethods.FieldValidation("post-areas-few");
		CommonMethods.FieldValidation("post-areavalue");
		CommonMethods.FieldValidation("area-length");
		CommonMethods.FieldValidation("area-bredth");
		CommonMethods.FieldValidation("post-opensides");
		CommonMethods.FieldValidation("post-face");
		CommonMethods.FieldValidation("boundaryWith");
		CommonMethods.FieldValidation("post-venture");
		CommonMethods.FieldValidation("post-lrs");
		CommonMethods.FieldValidation("post-totalprice");
		CommonMethods.FieldValidation("post-responsefrom");
	}

	@When("^User Select WareHouse Property type$")
	public void user_Select_Ware_House_Property_type() throws Throwable {
		CommonMethods.SelectDD("propertyType", "Ware House");
	}

	@Then("^WareHouse fields are displayed$")
	public void displays_Ware_House_fields() throws Throwable {
		CommonMethods.FieldValidation("post-totalfloors");
		CommonMethods.FieldValidation("post-floorno");
		CommonMethods.FieldValidation("post-area");
		CommonMethods.FieldValidation("post-areavalue");
		CommonMethods.FieldValidation("area-length");
		CommonMethods.FieldValidation("area-bredth");
		CommonMethods.FieldValidation("post-opensides");
		CommonMethods.FieldValidation("post-face");
		CommonMethods.FieldValidation("post-furniture");
		CommonMethods.FieldValidation("post-tradetype");
		CommonMethods.FieldValidation("post-buildingage");
		CommonMethods.FieldValidation("post-permission");
		CommonMethods.FieldValidation("post-Bathroom");
		CommonMethods.FieldValidation("post-parking");
		CommonMethods.FieldValidation("post-totalprice");
		CommonMethods.FieldValidation("post-responsefrom");
	}

}
