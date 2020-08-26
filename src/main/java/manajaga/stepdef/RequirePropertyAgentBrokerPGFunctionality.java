package manajaga.stepdef;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.When;
import manajaga.objectrepository.manajaga_elements;
import manajaga.pages.CommonMethods;

public class RequirePropertyAgentBrokerPGFunctionality {


	@When("^User select Require Property and Select AgentBroker for PG$")
	public void user_select_Require_Property_and_Select_AgentBroker_for_PG() throws Throwable {
		BaseTest.driver.findElement(manajaga_elements.RequireProperty_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.nxt_btn_choose_option).click();
		BaseTest.driver.findElement(manajaga_elements.RP_AgentBroker_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.RP_PG_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.nxt_btn_user_info).click();
	}

	@When("^User select ([^\"]*) Property type of Require property for PG$")
	public void user_select_Property_type_of_Require_property_for_PG(String Propertytype) throws Throwable {
		CommonMethods.SelectDD("requirePropertyTypePG", Propertytype);
	}

	@When("^Enter All the Mandatory fields for ([^\"]*) Property type of Require property for PG$")
	public void enter_All_the_Mandatory_fields_for_Property_type_of_Require_property_for_PG(String Propertytype) throws Throwable {
		if(Propertytype.contains("Apartment"))
		{
			CommonMethods.SelectDD("requireTotalFloors", "9");
			CommonMethods.SelectDD("requireFloorNo", "5");
			CommonMethods.SelectDD("requireNeedFor", "Female");
			CommonMethods.SelectDD("requireOccupancy", "Single");
			CommonMethods.SelectDD("requirePgAge", "1 Year");
			CommonMethods.SelectDD("requireAvailableStatus", "Immediately");
			CommonMethods.SelectDD("requireTenantsPrefer", "Student");
			CommonMethods.SelectDD("requireNoOfRoomsPreferre", "5");
			CommonMethods.SelectDD("requireNoOfSharedBeds", "6");
			BaseTest.driver.findElement(manajaga_elements.RP_WaterFacilityNo).click();
			BaseTest.driver.findElement(manajaga_elements.RP_AttachedBathRoomReqNo).click();
			BaseTest.driver.findElement(manajaga_elements.RP_SharingBathRoomNoReq).click();
			BaseTest.driver.findElement(manajaga_elements.RP_BalconyNo).click();
			BaseTest.driver.findElement(manajaga_elements.RP_CommonAreaNo).click();
			BaseTest.driver.findElement(manajaga_elements.RP_MealsIncludedInRentNo).click();
			BaseTest.driver.findElement(manajaga_elements.RP_LaundryAvailabilityReqNo).click();
			BaseTest.driver.findElement(manajaga_elements.RP_CookingAvailabilityreqNo).click();
			BaseTest.driver.findElement(manajaga_elements.RP_GuestsAllowedReqNo).click();
			BaseTest.driver.findElement(manajaga_elements.RP_PetsAllowedReqNo).click();
			BaseTest.driver.findElement(manajaga_elements.RP_TimingRestrictionsReqNo).click();
			BaseTest.driver.findElement(manajaga_elements.RP_wifi_chkbx).click();
			BaseTest.driver.findElement(manajaga_elements.RP_AC_chkbx).click();
			BaseTest.driver.findElement(manajaga_elements.RP_Refrigerator_chkbx).click();
			BaseTest.driver.findElement(manajaga_elements.RP_washing_chkbx).click();
			BaseTest.driver.findElement(manajaga_elements.RP_WatchmenRequiredNo).click();
			BaseTest.driver.findElement(manajaga_elements.RP_CCCamerasReqNo).click();
			BaseTest.driver.findElement(manajaga_elements.RP_ReqMonthlyRentPG).sendKeys("8565");
			BaseTest.driver.findElement(manajaga_elements.RP_ReqSecurityDepositPG).sendKeys("963");
			BaseTest.driver.findElement(manajaga_elements.RP_ReqMaintenanceChargesPG).sendKeys("95659");
			BaseTest.driver.findElement(manajaga_elements.RP_ReqElectricityChargesPG).sendKeys("9859");
			BaseTest.driver.findElement(manajaga_elements.RP_ReqLaundaryChargesPG).sendKeys("4852");
			CommonMethods.SelectDD("Req-NoticePeriod", "2 weeks");
			BaseTest.driver.findElement(manajaga_elements.RP_ExpTotalPrice).sendKeys("548485651");
			BaseTest.driver.findElement(manajaga_elements.RP_Owners_chkbx).click();
			BaseTest.driver.findElement(manajaga_elements.RP_Builders_chkbx).click();
			BaseTest.driver.findElement(manajaga_elements.RP_Description).sendKeys("Entered all the fields of Apartment");
			BaseTest.driver.findElement(manajaga_elements.RP_AreThisEnteredPropertyDetailsAreNegotiable).click();
			BaseTest.driver.findElement(manajaga_elements.nxtbtn_propertyinfo).click();
			Thread.sleep(2000);
			BaseTest.driver.findElement(manajaga_elements.nxt_btn_gallery).click();
			BaseTest.waitUntilPageLoad();
			CommonMethods.LocationDetails("hyderbad", "Hyderabad", "Telangana", "India");
			BaseTest.driver.findElement(manajaga_elements.nxt_btn_adress).click();
			//	BaseTest.driver.findElement(manajaga_elements.submit_btn_contactinfo).click();
		}
		if(Propertytype.contains("Residential House"))
		{
			CommonMethods.SelectDD("requireTotalFloors", "9");
			CommonMethods.SelectDD("requireFloorNo", "5");
			CommonMethods.SelectDD("requireNeedFor", "Female");
			CommonMethods.SelectDD("requireOccupancy", "Single");
			CommonMethods.SelectDD("requirePgAge", "1 Year");
			CommonMethods.SelectDD("requireAvailableStatus", "Immediately");
			CommonMethods.SelectDD("requireTenantsPrefer", "Student");
			CommonMethods.SelectDD("requireNoOfRoomsPreferre", "5");
			CommonMethods.SelectDD("requireNoOfSharedBeds", "6");
			BaseTest.driver.findElement(manajaga_elements.RP_WaterFacilityYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_AttachedBathRoomReqYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_SharingBathRoomYesReq).click();
			BaseTest.driver.findElement(manajaga_elements.RP_BalconyYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_CommonAreaYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_MealsIncludedInRentYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_LaundryAvailabilityReqYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_CookingAvailabilityreqYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_GuestsAllowedReqYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_PetsAllowedReqYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_TimingRestrictionsReqYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_selectTime).sendKeys("8:45 AM");
			BaseTest.driver.findElement(manajaga_elements.RP_wifi_chkbx).click();
			BaseTest.driver.findElement(manajaga_elements.RP_AC_chkbx).click();
			BaseTest.driver.findElement(manajaga_elements.RP_Refrigerator_chkbx).click();
			BaseTest.driver.findElement(manajaga_elements.RP_washing_chkbx).click();
			BaseTest.driver.findElement(manajaga_elements.RP_WatchmenRequiredNo).click();
			BaseTest.driver.findElement(manajaga_elements.RP_CCCamerasReqNo).click();
			BaseTest.driver.findElement(manajaga_elements.RP_ReqMonthlyRentPG).sendKeys("8565");
			BaseTest.driver.findElement(manajaga_elements.RP_ReqSecurityDepositPG).sendKeys("963");
			BaseTest.driver.findElement(manajaga_elements.RP_ReqMaintenanceChargesPG).sendKeys("95659");
			BaseTest.driver.findElement(manajaga_elements.RP_ReqElectricityChargesPG).sendKeys("9859");
			BaseTest.driver.findElement(manajaga_elements.RP_ReqLaundaryChargesPG).sendKeys("4852");
			CommonMethods.SelectDD("Req-NoticePeriod", "2 weeks");
			BaseTest.driver.findElement(manajaga_elements.RP_ExpTotalPrice).sendKeys("548485651");
			BaseTest.driver.findElement(manajaga_elements.RP_Owners_chkbx).click();
			BaseTest.driver.findElement(manajaga_elements.RP_Builders_chkbx).click();
			BaseTest.driver.findElement(manajaga_elements.RP_Description).sendKeys("Entered all the fields of Apartment");
			BaseTest.driver.findElement(manajaga_elements.RP_AreThisEnteredPropertyDetailsAreNegotiable).click();
			BaseTest.driver.findElement(manajaga_elements.nxtbtn_propertyinfo).click();
			Thread.sleep(2000);
			BaseTest.driver.findElement(manajaga_elements.nxt_btn_gallery).click();
			BaseTest.waitUntilPageLoad();
			CommonMethods.LocationDetails("hyderbad", "Hyderabad", "Telangana", "India");
			BaseTest.driver.findElement(manajaga_elements.nxt_btn_adress).click();
			//	BaseTest.driver.findElement(manajaga_elements.submit_btn_contactinfo).click();
		}

	}

	@When("^User select Require Property and Select Tenant for PG$")
	public void user_select_Require_Property_and_Select_Tenant_for_PG() throws Throwable {
		BaseTest.driver.findElement(manajaga_elements.RequireProperty_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.nxt_btn_choose_option).click();
		BaseTest.driver.findElement(manajaga_elements.RP_Tenant_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.RP_PG_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.nxt_btn_user_info).click();
	}

}
