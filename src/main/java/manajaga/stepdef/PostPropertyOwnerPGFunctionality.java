package manajaga.stepdef;

import cucumber.api.java.en.When;
import manajaga.objectrepository.manajaga_elements;
import manajaga.pages.CommonMethods;

public class PostPropertyOwnerPGFunctionality 
{

	@When("^User select Post Property and Select Owner for PG$")
	public void user_select_Post_Property_and_Select_Owner_for_PG() throws Throwable {
		BaseTest.driver.findElement(manajaga_elements.PostProperty_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.nxt_btn_choose_option).click();
		BaseTest.driver.findElement(manajaga_elements.PP_Owner_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.PP_PG_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.nxt_btn_user_info).click();
	}

	@When("^User select ([^\"]*) Property type of post property for PG$")
	public void user_select_Property_type_of_post_property_for_PG(String Propertytype) throws Throwable 
	{
		CommonMethods.SelectDD("propertyTypePG", Propertytype);
	}

	@When("^Enter All the Mandatory fields for ([^\"]*) Property type of Post Property PG$")
	public void enter_All_the_Mandatory_fields_for_Property_type_of_Post_Property_PG(String Propertytype) throws Throwable 
	{
		if (Propertytype.contains("Apartment")) 
		{
			BaseTest.driver.findElement(manajaga_elements.PP_PropertyTitle).sendKeys("Apartment for PG");
			CommonMethods.SelectDD("totalFloors", "6");
			CommonMethods.SelectDD("floorNo", "4");
			CommonMethods.SelectDD("furniture", "UnFurnished");
			CommonMethods.SelectDD("pgavailableFor", "Female");
			CommonMethods.SelectDD("occupancy", "Sharing");
			CommonMethods.SelectDD("pgAge", "2 Year");
			CommonMethods.SelectDD("availableStatus", "Immediately");
			CommonMethods.SelectDD("tenantsPrefer", "Student");
			CommonMethods.SelectDD("roomsInPG", "5");
			CommonMethods.SelectDD("bedsInRoom", "5");
			BaseTest.driver.findElement(manajaga_elements.PP_AttachedBathRoomYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_sharingbathroomYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_BalconyYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_WaterAvailabilityYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_mealsIncludedInTheRentYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_laundryAvailableYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_cookingAvailableYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_guestsAllowedYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_commonAreaYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_petsAllowedYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_TimingRestrictionsYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_selecttime).sendKeys("6:59 AM");
			BaseTest.driver.findElement(manajaga_elements.PP_watchmenYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_ccCamerasYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_WiFi_chkbx).click();
			BaseTest.driver.findElement(manajaga_elements.PP_Cooler_chkbx).click();
			BaseTest.driver.findElement(manajaga_elements.PP_AC_chkbx).click();
			BaseTest.driver.findElement(manajaga_elements.PP_WashingMachine_chkbx).click();
			BaseTest.driver.findElement(manajaga_elements.PP_Monthly_Rent).sendKeys("95000");
			BaseTest.driver.findElement(manajaga_elements.PP_Security_Deposit).sendKeys("3000");
			BaseTest.driver.findElement(manajaga_elements.PP_Maintenance_Charges).sendKeys("6000");
			BaseTest.driver.findElement(manajaga_elements.PP_Post_Electricity_Charges).sendKeys("35200");
			CommonMethods.SelectDD("Post-NoticePeriod", "2 months");
			BaseTest.driver.findElement(manajaga_elements.PP_OnlyAgentsBrokers).click();
			BaseTest.driver.findElement(manajaga_elements.PP_ResponseFromAll).click();
			BaseTest.driver.findElement(manajaga_elements.videoURL).sendKeys("https://www.youtube.com/watch?v=Mw8E4QsdkJI");
			BaseTest.driver.findElement(manajaga_elements.PP_description).sendKeys("Entered all the fields of Apartment for Owner and PG");
			BaseTest.driver.findElement(manajaga_elements.nxtbtn_propertyinfo).click();
			Thread.sleep(60000);
			BaseTest.waitUntilPageLoad();
		
			
			CommonMethods.LocationDetails("hyderbad", "Hyderabad", "Telangana", "India");
			BaseTest.driver.findElement(manajaga_elements.nxt_btn_adress).click();
			BaseTest.driver.findElement(manajaga_elements.submit_btn_contactinfo).click();
		}
		
		if (Propertytype.contains("Individual House")) 
		{
			BaseTest.driver.findElement(manajaga_elements.PP_PropertyTitle).sendKeys("Individual House for PG");
			CommonMethods.SelectDD("totalFloors", "6");
			CommonMethods.SelectDD("floorNo", "4");
			CommonMethods.SelectDD("furniture", "UnFurnished");
			CommonMethods.SelectDD("pgavailableFor", "Female");
			CommonMethods.SelectDD("occupancy", "Sharing");
			CommonMethods.SelectDD("pgAge", "2 Year");
			CommonMethods.SelectDD("availableStatus", "Immediately");
			CommonMethods.SelectDD("tenantsPrefer", "Student");
			CommonMethods.SelectDD("roomsInPG", "5");
			CommonMethods.SelectDD("bedsInRoom", "5");
			BaseTest.driver.findElement(manajaga_elements.PP_AttachedBathRoomNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_sharingbathroomNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_BalconyNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_WaterAvailabilityNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_mealsIncludedInTheRentNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_laundryAvailableNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_cookingAvailableNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_guestsAllowedNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_commonAreaNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_petsAllowedNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_TimingRestrictionsNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_watchmenNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_ccCamerasNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_WiFi_chkbx).click();
			BaseTest.driver.findElement(manajaga_elements.PP_Cooler_chkbx).click();
			BaseTest.driver.findElement(manajaga_elements.PP_AC_chkbx).click();
			BaseTest.driver.findElement(manajaga_elements.PP_WashingMachine_chkbx).click();
			BaseTest.driver.findElement(manajaga_elements.PP_Monthly_Rent).sendKeys("95000");
			BaseTest.driver.findElement(manajaga_elements.PP_Security_Deposit).sendKeys("3000");
			BaseTest.driver.findElement(manajaga_elements.PP_Maintenance_Charges).sendKeys("6000");
			BaseTest.driver.findElement(manajaga_elements.PP_Post_Electricity_Charges).sendKeys("35200");
			CommonMethods.SelectDD("Post-NoticePeriod", "1 month");
			BaseTest.driver.findElement(manajaga_elements.PP_OnlyAgentsBrokers).click();
			BaseTest.driver.findElement(manajaga_elements.PP_ResponseFromAll).click();
			BaseTest.driver.findElement(manajaga_elements.videoURL).sendKeys("https://www.youtube.com/watch?v=Mw8E4QsdkJI");
			BaseTest.driver.findElement(manajaga_elements.PP_description).sendKeys("Entered all the fields of Individual House for Owner and PG");
			BaseTest.driver.findElement(manajaga_elements.nxtbtn_propertyinfo).click();
			Thread.sleep(60000);
			BaseTest.waitUntilPageLoad();
		
			
			CommonMethods.LocationDetails("hyderbad", "Hyderabad", "Telangana", "India");
			BaseTest.driver.findElement(manajaga_elements.nxt_btn_adress).click();
			BaseTest.driver.findElement(manajaga_elements.submit_btn_contactinfo).click();
		}
		
	}
	@When("^User select Post Property and Select Builder for PG$")
	public void user_select_Post_Property_and_Select_Builder_for_PG() throws Throwable {
		BaseTest.driver.findElement(manajaga_elements.PostProperty_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.nxt_btn_choose_option).click();
		BaseTest.driver.findElement(manajaga_elements.PP_Builder_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.PP_PG_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.nxt_btn_user_info).click();
	}
	@When("^User select Post Property and Select AgentBroker for PG$")
	public void user_select_Post_Property_and_Select_AgentBroker_for_PG() throws Throwable {
		BaseTest.driver.findElement(manajaga_elements.PostProperty_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.nxt_btn_choose_option).click();
		BaseTest.driver.findElement(manajaga_elements.PP_Agent_Broker_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.PP_PG_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.nxt_btn_user_info).click();
	}
	
}
