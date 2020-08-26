package manajaga.stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import manajaga.objectrepository.manajaga_elements;
import manajaga.pages.CommonMethods;

public class RequirePropertyAgentBrokerBuyFunctionality 
{
	@When("^User select Require Property and Select AgentBroker for Buy$")
	public void user_select_Require_Property_and_Select_AgentBroker_for_Buy() throws Throwable {
		BaseTest.driver.findElement(manajaga_elements.RequireProperty_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.nxt_btn_choose_option).click();
		BaseTest.driver.findElement(manajaga_elements.RP_AgentBroker_rdbtn).click();
		WebElement buyRdBtn=BaseTest.driver.findElement(manajaga_elements.RP_buy_rdbtn);
		buyRdBtn.isDisplayed();
		BaseTest.driver.findElement(manajaga_elements.RP_buy_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.nxt_btn_user_info).click();
	}

	@When("^User select ([^\"]*) Property type of Require property for Buy or Rent$")
	public void user_select_Property_type_of_post_property_for_Buy_or_Rent(String Propertytype) throws Throwable {
		CommonMethods.SelectDD("requirePropertyTypeBuyRent", Propertytype);
	}

	@When("^Enter All the Mandatory fields for ([^\"]*) Property type of Require property for Buy or Rent$")
	public void enter_All_the_Mandatory_fields_for_Property_type_of_post_property_for_Buy_or_Rent(String Propertytype) throws Throwable {
		if (Propertytype.contains("Agriculture Land")) 
		{
			CommonMethods.SelectDD("req-areas-all", "Hectare");
			BaseTest.driver.findElement(manajaga_elements.RP_ExpTotalArea).sendKeys("52100");
			BaseTest.driver.findElement(manajaga_elements.RP_length).sendKeys("5126");
			BaseTest.driver.findElement(manajaga_elements.RP_breadth).sendKeys("562");
			CommonMethods.SelectDD("requireFacing", "North");
			CommonMethods.SelectDD("requireOpenSides", "2");
			CommonMethods.SelectDD("requireBoundaryWith", "Fencing"); 
			BaseTest.driver.findElement(manajaga_elements.RP_WaterFacilityYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_ExpTotalPrice).sendKeys("854000");
			BaseTest.driver.findElement(manajaga_elements.RP_Owners_chkbx).click();
			BaseTest.driver.findElement(manajaga_elements.RP_Builders_chkbx).click();
			BaseTest.driver.findElement(manajaga_elements.RP_Brokers_chkbx).click();
			BaseTest.driver.findElement(manajaga_elements.RP_Description).sendKeys("Entered all the fields of Agricultural Land");
			BaseTest.driver.findElement(manajaga_elements.RP_AreThisEnteredPropertyDetailsAreNegotiable).click();
			BaseTest.driver.findElement(manajaga_elements.nxtbtn_propertyinfo).click();
			Thread.sleep(2000);
			BaseTest.driver.findElement(manajaga_elements.nxt_btn_gallery).click();
			BaseTest.waitUntilPageLoad();
			CommonMethods.LocationDetails("hyderbad", "Hyderabad", "Telangana", "India");
			BaseTest.driver.findElement(manajaga_elements.nxt_btn_adress).click();
		//	BaseTest.driver.findElement(manajaga_elements.submit_btn_contactinfo).click();
		}
		if (Propertytype.contains("Apartment")) 
		{
			CommonMethods.SelectDD("requireBedrooms", "5");
			CommonMethods.SelectDD("requireBathrooms", "6");
			CommonMethods.SelectDD("requireFurniture", "UnFurnished");
			CommonMethods.SelectDD("req-areas-few", "Sq-ft");
			BaseTest.driver.findElement(manajaga_elements.RP_ExpTotalArea).sendKeys("52100");
			BaseTest.driver.findElement(manajaga_elements.RP_length).sendKeys("520");
			BaseTest.driver.findElement(manajaga_elements.RP_breadth).sendKeys("562");
			CommonMethods.SelectDD("requireFacing", "Northeast");
			CommonMethods.SelectDD("requireOpenSides", "2");
			BaseTest.driver.findElement(manajaga_elements.RP_TradeTypeResale).click();
			BaseTest.driver.findElement(manajaga_elements.RP_PermissionYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_GatedCommYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_ParkingYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_ParkingForBoth).click();
			BaseTest.driver.findElement(manajaga_elements.RP_PoojaRoomYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_OtherRoomNo).click();
		
			BaseTest.driver.findElement(manajaga_elements.RP_PossessionReadyToMove).click();
			BaseTest.driver.findElement(manajaga_elements.RP_ExpTotalPrice).sendKeys("4521212");
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
		if (Propertytype.contains("Commercial Plot")) 
		{
			CommonMethods.SelectDD("req-areas-few", "Sq-ft");
			BaseTest.driver.findElement(manajaga_elements.RP_ExpTotalArea).sendKeys("15200");
			BaseTest.driver.findElement(manajaga_elements.RP_length).sendKeys("5421");
			BaseTest.driver.findElement(manajaga_elements.RP_breadth).sendKeys("54263");
			CommonMethods.SelectDD("requireOpenSides", "3");
			CommonMethods.SelectDD("requireBoundaryWith", "Open");
			BaseTest.driver.findElement(manajaga_elements.RP_PlotFacingToMainRoadYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_LRSYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_WaterFacilityYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_PermissionYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_ExpTotalPrice).sendKeys("51426151");
			BaseTest.driver.findElement(manajaga_elements.RP_responsefrm_all_chkbx).click();
			BaseTest.driver.findElement(manajaga_elements.RP_Description).sendKeys("Entered all the fields of Commercial plot");
			BaseTest.driver.findElement(manajaga_elements.nxtbtn_propertyinfo).click();
			
			Thread.sleep(2000);
			BaseTest.driver.findElement(manajaga_elements.nxt_btn_gallery).click();
			BaseTest.waitUntilPageLoad();
			CommonMethods.LocationDetails("hyderbad", "Hyderabad", "Telangana", "India");
			BaseTest.driver.findElement(manajaga_elements.nxt_btn_adress).click();
		//	BaseTest.driver.findElement(manajaga_elements.submit_btn_contactinfo).click();
		}
		
		if (Propertytype.contains("Commercial Shop")) 
		{
			CommonMethods.SelectDD("req-areas-few", "Sq-ft");
			BaseTest.driver.findElement(manajaga_elements.RP_ExpTotalArea).sendKeys("51220");
			BaseTest.driver.findElement(manajaga_elements.RP_length).sendKeys("565");
			BaseTest.driver.findElement(manajaga_elements.RP_breadth).sendKeys("253");
			CommonMethods.SelectDD("requireFacing", "Eastsouth");
			CommonMethods.SelectDD("requireOpenSides", "4");
			BaseTest.driver.findElement(manajaga_elements.RP_WaterFacilityNo).click();
			BaseTest.driver.findElement(manajaga_elements.RP_PermissionNo).click();
			BaseTest.driver.findElement(manajaga_elements.RP_ExpTotalPrice).sendKeys("1452366");
			BaseTest.driver.findElement(manajaga_elements.RP_responsefrm_all_chkbx).click();
			BaseTest.driver.findElement(manajaga_elements.RP_Description).sendKeys("Entered all the fields of Commercial shop ");
			BaseTest.driver.findElement(manajaga_elements.nxtbtn_propertyinfo).click();
			
			Thread.sleep(2000);
			BaseTest.driver.findElement(manajaga_elements.nxt_btn_gallery).click();
			BaseTest.waitUntilPageLoad();
			CommonMethods.LocationDetails("hyderbad", "Hyderabad", "Telangana", "India");
			BaseTest.driver.findElement(manajaga_elements.nxt_btn_adress).click();
		//	BaseTest.driver.findElement(manajaga_elements.submit_btn_contactinfo).click();
		}
		
		if (Propertytype.contains("PentHouse")) 
		{
			CommonMethods.SelectDD("requireBedrooms", "5");
			CommonMethods.SelectDD("requireBathrooms", "6");
			CommonMethods.SelectDD("requireFurniture", "UnFurnished");
			CommonMethods.SelectDD("req-areas-few", "Sq-ft");
			BaseTest.driver.findElement(manajaga_elements.RP_ExpTotalArea).sendKeys("52100");
			BaseTest.driver.findElement(manajaga_elements.RP_length).sendKeys("520");
			BaseTest.driver.findElement(manajaga_elements.RP_breadth).sendKeys("562");
			CommonMethods.SelectDD("requireFacing", "Northeast");
			CommonMethods.SelectDD("requireOpenSides", "2");
			BaseTest.driver.findElement(manajaga_elements.RP_TradeTypeResale).click();
			BaseTest.driver.findElement(manajaga_elements.RP_PermissionYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_RentPurposeYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_GatedCommYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_ParkingYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_ParkingForBoth).click();
			BaseTest.driver.findElement(manajaga_elements.RP_PoojaRoomYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_OtherRoomNo).click();
			BaseTest.driver.findElement(manajaga_elements.RP_PossessionReadyToMove).click();
			BaseTest.driver.findElement(manajaga_elements.RP_ExpTotalPrice).sendKeys("4521212");
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
		
		if (Propertytype.contains("Residential House")) 
		{
			CommonMethods.SelectDD("requireBedrooms", "5");
			CommonMethods.SelectDD("requireBathrooms", "6");
			CommonMethods.SelectDD("requireFloorNo", "5");
			CommonMethods.SelectDD("requireFurniture", "UnFurnished");
			CommonMethods.SelectDD("req-areas-few", "Sq-ft");
			BaseTest.driver.findElement(manajaga_elements.RP_ExpTotalArea).sendKeys("52100");
			BaseTest.driver.findElement(manajaga_elements.RP_length).sendKeys("520");
			BaseTest.driver.findElement(manajaga_elements.RP_breadth).sendKeys("562");
			CommonMethods.SelectDD("requireFacing", "Northeast");
			CommonMethods.SelectDD("requireOpenSides", "2");
			BaseTest.driver.findElement(manajaga_elements.RP_TradeTypeResale).click();
			BaseTest.driver.findElement(manajaga_elements.RP_PermissionYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_RentPurposeYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_CommercialShopYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_GatedCommYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_ParkingYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_ParkingForBoth).click();
			BaseTest.driver.findElement(manajaga_elements.RP_PoojaRoomYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_OtherRoomNo).click();
			BaseTest.driver.findElement(manajaga_elements.RP_PossessionReadyToMove).click();
			BaseTest.driver.findElement(manajaga_elements.RP_ExpTotalPrice).sendKeys("4521212");
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
		if (Propertytype.contains("Residential Plot")) 
		{
			CommonMethods.SelectDD("req-areas-few", "Sq-ft");
			BaseTest.driver.findElement(manajaga_elements.RP_ExpTotalArea).sendKeys("15200");
			BaseTest.driver.findElement(manajaga_elements.RP_length).sendKeys("5421");
			BaseTest.driver.findElement(manajaga_elements.RP_breadth).sendKeys("54263");
			CommonMethods.SelectDD("requireOpenSides", "3");
			CommonMethods.SelectDD("requireBoundaryWith", "Open");
			BaseTest.driver.findElement(manajaga_elements.RP_PlotFacingToMainRoadYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_LRSYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_VentureYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_WaterFacilityYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_PermissionYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_ExpTotalPrice).sendKeys("51426151");
			BaseTest.driver.findElement(manajaga_elements.RP_responsefrm_all_chkbx).click();
			BaseTest.driver.findElement(manajaga_elements.RP_Description).sendKeys("Entered all the fields of Commercial plot");
			BaseTest.driver.findElement(manajaga_elements.nxtbtn_propertyinfo).click();
			
			Thread.sleep(2000);
			BaseTest.driver.findElement(manajaga_elements.nxt_btn_gallery).click();
			BaseTest.waitUntilPageLoad();
			CommonMethods.LocationDetails("hyderbad", "Hyderabad", "Telangana", "India");
			BaseTest.driver.findElement(manajaga_elements.nxt_btn_adress).click();
		//	BaseTest.driver.findElement(manajaga_elements.submit_btn_contactinfo).click();
		}
		
		if (Propertytype.contains("Warehouse")) 
		{
			CommonMethods.SelectDD("requireBathrooms", "6");
			CommonMethods.SelectDD("requireTotalFloors", "4");
			CommonMethods.SelectDD("requireFurniture", "UnFurnished");
			CommonMethods.SelectDD("req-areas-all", "Marla");
			BaseTest.driver.findElement(manajaga_elements.RP_ExpTotalArea).sendKeys("5426");
			BaseTest.driver.findElement(manajaga_elements.RP_length).sendKeys("52");
			BaseTest.driver.findElement(manajaga_elements.RP_breadth).sendKeys("563");
			CommonMethods.SelectDD("requireWarehouseFacing", "North");
			CommonMethods.SelectDD("requireOpenSides", "1");
			BaseTest.driver.findElement(manajaga_elements.RP_WaterFacilityYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_PermissionYes).click();
			BaseTest.driver.findElement(manajaga_elements.RP_ParkingNo).click();
			BaseTest.driver.findElement(manajaga_elements.RP_ExpTotalPrice).sendKeys("52214");
			BaseTest.driver.findElement(manajaga_elements.RP_Builders_chkbx).click();
			BaseTest.driver.findElement(manajaga_elements.RP_Description).sendKeys("Entered all the fields of WareHouse");
			BaseTest.driver.findElement(manajaga_elements.nxtbtn_propertyinfo).click();
			
			Thread.sleep(2000);
			BaseTest.driver.findElement(manajaga_elements.nxt_btn_gallery).click();
			BaseTest.waitUntilPageLoad();
			CommonMethods.LocationDetails("hyderbad", "Hyderabad", "Telangana", "India");
			BaseTest.driver.findElement(manajaga_elements.nxt_btn_adress).click();
	//		BaseTest.driver.findElement(manajaga_elements.submit_btn_contactinfo).click();
		}
		
		
	}
	@Then("^Require Property is created$")
	public void require_Property_is_created() throws Throwable {
		int alert=BaseTest.driver.findElements(By.xpath("//h4[contains(text(),'Alert Message')]")).size();
		if(alert!=1)
		{
			Assert.fail("alert is not displayed");
		}
		String AlertMsg=BaseTest.driver.findElement(By.id("alertSuccessMessage")).getText();
		String ExpectedMsg="Property created successfully. The property will appear in search once the admin approves it. You can check the property in your Dashboard. Please Search with this Unique Id after the admin approved your property :";
		if(!AlertMsg.contains(ExpectedMsg))
		{
			Assert.fail("Alert Msg is not same as Expected");
		}
	}


	@When("^User select Require Property and Select Buyer for Buy$")
	public void user_select_Require_Property_and_Select_Buyer_for_Buy() throws Throwable {
		BaseTest.driver.findElement(manajaga_elements.RequireProperty_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.nxt_btn_choose_option).click();
		BaseTest.driver.findElement(manajaga_elements.RP_buyer_rdbtn).click();
		WebElement buyRdBtn=BaseTest.driver.findElement(manajaga_elements.RP_buy_rdbtn);
		buyRdBtn.isDisplayed();
		BaseTest.driver.findElement(manajaga_elements.RP_buy_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.nxt_btn_user_info).click();
	}
	
	@When("^User select Require Property and Select Tenant for Buy$")
	public void user_select_Require_Property_and_Select_Tenant_for_Buy() throws Throwable {
		BaseTest.driver.findElement(manajaga_elements.RequireProperty_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.nxt_btn_choose_option).click();
		BaseTest.driver.findElement(manajaga_elements.RP_Tenant_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.RP_buy_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.nxt_btn_user_info).click();
	}
	
	@When("^User select Require Property and Select AgentBroker for Rent$")
	public void user_select_Require_Property_and_Select_AgentBroker_for_Rent() throws Throwable {
		BaseTest.driver.findElement(manajaga_elements.RequireProperty_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.nxt_btn_choose_option).click();
		BaseTest.driver.findElement(manajaga_elements.RP_AgentBroker_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.RP_rent_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.nxt_btn_user_info).click();
	}
	@When("^User select Require Property and Select Tenant for Rent$")
	public void user_select_Require_Property_and_Select_Tenant_for_Rent() throws Throwable {
		BaseTest.driver.findElement(manajaga_elements.RequireProperty_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.nxt_btn_choose_option).click();
		BaseTest.driver.findElement(manajaga_elements.RP_Tenant_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.RP_rent_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.nxt_btn_user_info).click();
	}
}
