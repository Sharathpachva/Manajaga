package manajaga.stepdef;

import org.openqa.selenium.By;

import cucumber.api.java.en.When;
import manajaga.objectrepository.manajaga_elements;
import manajaga.pages.CommonMethods;

public class PostPropertyOwnerRentFunctionality 
{

	@When("^User select Post Property and Select Owner for Rent$")
	public void user_select_Post_Property_and_Select_Owner_for_Rent() throws Throwable 
	{
		BaseTest.driver.findElement(manajaga_elements.PostProperty_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.nxt_btn_choose_option).click();
		BaseTest.driver.findElement(manajaga_elements.PP_Owner_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.PP_Rent_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.nxt_btn_user_info).click();
	}

	@When("^User select ([^\"]*) Property type of post property for Rent$")
	public void user_select_Property_type_of_post_property_for_Rent(String Propertytype) throws Throwable 
	{
		CommonMethods.SelectDD("propertyTypeRent", Propertytype);
	}

	@When("^Enter All the Mandatory fields for ([^\"]*) Property type of Post Property Rent$")
	public void enter_All_the_Mandatory_fields_for_Property_type_of_Post_Property_Rent(String Propertytype) throws Throwable 
	{
		if (Propertytype.contains("Apartment")) 
		{
			BaseTest.driver.findElement(manajaga_elements.PP_PropertyTitle).sendKeys("Apartment ");
			CommonMethods.SelectDD("bedrooms", "3BHK");
			CommonMethods.SelectDD("bathrooms", "5");
			CommonMethods.SelectDD("totalFloors", "6");
			CommonMethods.SelectDD("floorNo", "5");
			CommonMethods.SelectDD("post-areas-few", "Sq-yrd");
			BaseTest.driver.findElement(manajaga_elements.PP_totalarea).sendKeys("500");
			BaseTest.driver.findElement(manajaga_elements.PP_length).sendKeys("50");
			BaseTest.driver.findElement(manajaga_elements.PP_breadth).sendKeys("60");
			CommonMethods.SelectDD("furniture", "UnFurnished");
			CommonMethods.SelectDD("propertyAge", "0 - 5 Years");
			CommonMethods.SelectDD("openSides", "2");
			CommonMethods.SelectDD("facing", "North");
			CommonMethods.SelectDD("leaseYears", "5");
			CommonMethods.SelectDD("availableFor", "Family");
			CommonMethods.SelectDD("availableStatus", "Immediately");
			BaseTest.driver.findElement(manajaga_elements.PP_AttachedBathRoomNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_CommonBathRoomYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_PoojaRoomNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_OtherRoomYes).click();
			BaseTest.driver.findElement(By.id("otherRoomName")).sendKeys("GuestRoom");
			BaseTest.driver.findElement(manajaga_elements.PP_BalconyYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_WaterAvailabilityYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_commonAreaYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_petsAllowedNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_watchmenNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_ccCamerasYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_ParkingAvailableYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_CarYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_Monthly_Rent).sendKeys("55000");
			BaseTest.driver.findElement(manajaga_elements.PP_Security_Deposit).sendKeys("15000");
			BaseTest.driver.findElement(manajaga_elements.PP_Maintenance_Charges).sendKeys("5000");
			BaseTest.driver.findElement(manajaga_elements.PP_Post_Electricity_Charges).sendKeys("3000");
			CommonMethods.SelectDD("Post-NoticePeriod", "2 weeks");
			BaseTest.driver.findElement(manajaga_elements.PP_TotalPrice).sendKeys("78000");
			BaseTest.driver.findElement(manajaga_elements.PP_OnlyAgentsBrokers).click();
			BaseTest.driver.findElement(manajaga_elements.PP_ResponseFromAll).click();
			BaseTest.driver.findElement(manajaga_elements.videoURL).sendKeys("https://www.youtube.com/watch?v=Mw8E4QsdkJI");
			BaseTest.driver.findElement(manajaga_elements.PP_description).sendKeys("Entered all the fields of Apartment for Owner and Rent");
			
			
			BaseTest.driver.findElement(manajaga_elements.nxtbtn_propertyinfo).click();
			Thread.sleep(60000);
			BaseTest.waitUntilPageLoad();
		
			
			CommonMethods.LocationDetails("hyderbad", "Hyderabad", "Telangana", "India");
			BaseTest.driver.findElement(manajaga_elements.nxt_btn_adress).click();
			BaseTest.driver.findElement(manajaga_elements.submit_btn_contactinfo).click();
		}
		if (Propertytype.contains("Commercial Plot")) 
		{
			BaseTest.driver.findElement(manajaga_elements.PP_PropertyTitle).sendKeys("Commercial Plot");
			BaseTest.driver.findElement(manajaga_elements.PP_totalarea).sendKeys("562");
			BaseTest.driver.findElement(manajaga_elements.PP_length).sendKeys("50");
			BaseTest.driver.findElement(manajaga_elements.PP_breadth).sendKeys("65");
			CommonMethods.SelectDD("post-areas-few", "Sq-ft");
			CommonMethods.SelectDD("openSides", "3");
			CommonMethods.SelectDD("facing", "North");
			CommonMethods.SelectDD("availableStatus", "Immediately");
			BaseTest.driver.findElement(manajaga_elements.PP_WaterAvailabilityYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_BathroomYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_commonAreaYes).click();
			
			BaseTest.driver.findElement(manajaga_elements.PP_watchmenYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_ccCamerasYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_Monthly_Rent).sendKeys("50000");
			BaseTest.driver.findElement(manajaga_elements.PP_Security_Deposit).sendKeys("10000");
			BaseTest.driver.findElement(manajaga_elements.PP_Maintenance_Charges).sendKeys("5000");
			BaseTest.driver.findElement(manajaga_elements.PP_Post_Electricity_Charges).sendKeys("5000");
			CommonMethods.SelectDD("Post-NoticePeriod", "2 weeks");
			BaseTest.driver.findElement(manajaga_elements.PP_ResponseFromAll).click();
			BaseTest.driver.findElement(manajaga_elements.videoURL).sendKeys("https://www.youtube.com/watch?v=Mw8E4QsdkJI");
			BaseTest.driver.findElement(manajaga_elements.PP_description).sendKeys("Entered all the fields of Commercial plot of Owner Sale");
			BaseTest.driver.findElement(manajaga_elements.nxtbtn_propertyinfo).click();
			Thread.sleep(60000);
			BaseTest.waitUntilPageLoad();
		
			
			CommonMethods.LocationDetails("hyderbad", "Hyderabad", "Telangana", "India");
			BaseTest.driver.findElement(manajaga_elements.nxt_btn_adress).click();
			BaseTest.driver.findElement(manajaga_elements.submit_btn_contactinfo).click();
		}
		
		if (Propertytype.contains("Commercial Shop")) 
		{
			BaseTest.driver.findElement(manajaga_elements.PP_PropertyTitle).sendKeys("Commercial Shop");
			CommonMethods.SelectDD("totalFloors", "6");
			CommonMethods.SelectDD("floorNo", "5");
			CommonMethods.SelectDD("post-areas-few", "Sq-yrd");
			BaseTest.driver.findElement(manajaga_elements.PP_totalarea).sendKeys("600");
			BaseTest.driver.findElement(manajaga_elements.PP_length).sendKeys("55");
			BaseTest.driver.findElement(manajaga_elements.PP_breadth).sendKeys("65");
			CommonMethods.SelectDD("furniture", "Furnished");
			BaseTest.driver.findElement(manajaga_elements.PP_furnitureDetails).sendKeys("CubBoards, Desks");
			CommonMethods.SelectDD("openSides", "2");
			CommonMethods.SelectDD("facing", "North");
			CommonMethods.SelectDD("leaseYears", "5");
			CommonMethods.SelectDD("availableStatus", "Immediately");
			BaseTest.driver.findElement(manajaga_elements.PP_PropertyPermissionyes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_WaterAvailabilityYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_BathroomYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_watchmenYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_ccCamerasYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_Monthly_Rent).sendKeys("50000");
			BaseTest.driver.findElement(manajaga_elements.PP_Security_Deposit).sendKeys("10000");
			BaseTest.driver.findElement(manajaga_elements.PP_Maintenance_Charges).sendKeys("5000");
			BaseTest.driver.findElement(manajaga_elements.PP_Post_Electricity_Charges).sendKeys("5000");
			CommonMethods.SelectDD("Post-NoticePeriod", "1 month");
			BaseTest.driver.findElement(manajaga_elements.PP_ResponseFromAll).click();
			BaseTest.driver.findElement(manajaga_elements.videoURL).sendKeys("https://www.youtube.com/watch?v=Mw8E4QsdkJI");
			BaseTest.driver.findElement(manajaga_elements.PP_description).sendKeys("Entered all the fields of Commercial Shop of Owner Sale");
			BaseTest.driver.findElement(manajaga_elements.nxtbtn_propertyinfo).click();
//			Thread.sleep(60000);
//			BaseTest.waitUntilPageLoad();
		
			
//			CommonMethods.LocationDetails("hyderbad", "Hyderabad", "Telangana", "India");
//			BaseTest.driver.findElement(manajaga_elements.nxt_btn_adress).click();
//			BaseTest.driver.findElement(manajaga_elements.submit_btn_contactinfo).click();
		}
		
		if (Propertytype.contains("Farm House")) 
		{
			BaseTest.driver.findElement(manajaga_elements.PP_PropertyTitle).sendKeys("Farm House ");
			CommonMethods.SelectDD("bedrooms", "3BHK");
			CommonMethods.SelectDD("bathrooms", "5");
			CommonMethods.SelectDD("totalFloors", "6");
			CommonMethods.SelectDD("floorNo", "5");
			CommonMethods.SelectDD("post-areas-few", "Sq-yrd");
			BaseTest.driver.findElement(manajaga_elements.PP_totalarea).sendKeys("500");
			BaseTest.driver.findElement(manajaga_elements.PP_length).sendKeys("50");
			BaseTest.driver.findElement(manajaga_elements.PP_breadth).sendKeys("60");
			CommonMethods.SelectDD("furniture", "UnFurnished");
			CommonMethods.SelectDD("propertyAge", "0 - 5 Years");
			CommonMethods.SelectDD("openSides", "2");
			CommonMethods.SelectDD("facing", "North");
			CommonMethods.SelectDD("availableFor", "Family");
			CommonMethods.SelectDD("availableStatus", "Immediately");
			BaseTest.driver.findElement(manajaga_elements.PP_AttachedBathRoomYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_CommonBathRoomYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_PoojaRoomYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_OtherRoomYes).click();
			BaseTest.driver.findElement(By.id("otherRoomName")).sendKeys("GuestRoom");
			BaseTest.driver.findElement(manajaga_elements.PP_WaterAvailabilityYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_commonAreaYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_petsAllowedYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_watchmenYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_ccCamerasYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_Monthly_Rent).sendKeys("55000");
			BaseTest.driver.findElement(manajaga_elements.PP_Security_Deposit).sendKeys("15000");
			BaseTest.driver.findElement(manajaga_elements.PP_Maintenance_Charges).sendKeys("5000");
			BaseTest.driver.findElement(manajaga_elements.PP_Post_Electricity_Charges).sendKeys("3000");
			CommonMethods.SelectDD("Post-NoticePeriod", "2 weeks");
			BaseTest.driver.findElement(manajaga_elements.PP_OnlyAgentsBrokers).click();
			BaseTest.driver.findElement(manajaga_elements.PP_ResponseFromAll).click();
			BaseTest.driver.findElement(manajaga_elements.videoURL).sendKeys("https://www.youtube.com/watch?v=Mw8E4QsdkJI");
			BaseTest.driver.findElement(manajaga_elements.PP_description).sendKeys("Entered all the fields of FarmHouse for Owner and Rent");
			BaseTest.driver.findElement(manajaga_elements.nxtbtn_propertyinfo).click();
			Thread.sleep(60000);
			BaseTest.waitUntilPageLoad();
		
			
//			CommonMethods.LocationDetails("hyderbad", "Hyderabad", "Telangana", "India");
//			BaseTest.driver.findElement(manajaga_elements.nxt_btn_adress).click();
//			BaseTest.driver.findElement(manajaga_elements.submit_btn_contactinfo).click();
		}
		if (Propertytype.contains("Industrial Land")) 
		{
			BaseTest.driver.findElement(manajaga_elements.PP_PropertyTitle).sendKeys("Industrial Land");
			CommonMethods.SelectDD("post-areas-all", "Sq-yrd");
			BaseTest.driver.findElement(manajaga_elements.PP_totalarea).sendKeys("500");
			BaseTest.driver.findElement(manajaga_elements.PP_length).sendKeys("50");
			BaseTest.driver.findElement(manajaga_elements.PP_breadth).sendKeys("60");
			CommonMethods.SelectDD("openSides", "2");
			CommonMethods.SelectDD("facing", "North");
			CommonMethods.SelectDD("leaseYears", "5");
			BaseTest.driver.findElement(manajaga_elements.PP_PropertyPermissionNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_VentureNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_WaterAvailabilityNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_BathroomNo).click();
			
			BaseTest.driver.findElement(manajaga_elements.PP_Monthly_Rent).sendKeys("55000");
			BaseTest.driver.findElement(manajaga_elements.PP_Security_Deposit).sendKeys("15000");
			BaseTest.driver.findElement(manajaga_elements.PP_Maintenance_Charges).sendKeys("5000");
			BaseTest.driver.findElement(manajaga_elements.PP_Post_Electricity_Charges).sendKeys("3000");
			CommonMethods.SelectDD("Post-NoticePeriod", "2 weeks");
			BaseTest.driver.findElement(manajaga_elements.PP_ResponseFromAll).click();
			BaseTest.driver.findElement(manajaga_elements.videoURL).sendKeys("https://www.youtube.com/watch?v=Mw8E4QsdkJI");
			BaseTest.driver.findElement(manajaga_elements.PP_description).sendKeys("Entered all the fields of Industrial Land for Owner and Rent");
			BaseTest.driver.findElement(manajaga_elements.nxtbtn_propertyinfo).click();
			Thread.sleep(60000);
			BaseTest.waitUntilPageLoad();
		
			
//			CommonMethods.LocationDetails("hyderbad", "Hyderabad", "Telangana", "India");
//			BaseTest.driver.findElement(manajaga_elements.nxt_btn_adress).click();
//			BaseTest.driver.findElement(manajaga_elements.submit_btn_contactinfo).click();
		}
		
		if (Propertytype.contains("Individual House")) 
		{
			BaseTest.driver.findElement(manajaga_elements.PP_PropertyTitle).sendKeys("Individual House");
			CommonMethods.SelectDD("bedrooms", "3BHK");
			CommonMethods.SelectDD("bathrooms", "5");
			CommonMethods.SelectDD("totalFloors", "6");
			CommonMethods.SelectDD("floorNo", "5");
			CommonMethods.SelectDD("post-areas-few", "Sq-yrd");
			BaseTest.driver.findElement(manajaga_elements.PP_totalarea).sendKeys("500");
			BaseTest.driver.findElement(manajaga_elements.PP_length).sendKeys("50");
			BaseTest.driver.findElement(manajaga_elements.PP_breadth).sendKeys("60");
			CommonMethods.SelectDD("furniture", "UnFurnished");
			CommonMethods.SelectDD("propertyAge", "0 - 5 Years");
			CommonMethods.SelectDD("openSides", "2");
			CommonMethods.SelectDD("facing", "North");
			CommonMethods.SelectDD("leaseYears", "5");
			CommonMethods.SelectDD("availableFor", "Family");
			CommonMethods.SelectDD("availableStatus", "Immediately");
			BaseTest.driver.findElement(manajaga_elements.PP_AttachedBathRoomNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_CommonBathRoomNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_PoojaRoomNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_OtherRoomNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_BalconyNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_WaterAvailabilityNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_commonAreaNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_petsAllowedNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_watchmenNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_ccCamerasNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_Monthly_Rent).sendKeys("55000");
			BaseTest.driver.findElement(manajaga_elements.PP_Security_Deposit).sendKeys("15000");
			BaseTest.driver.findElement(manajaga_elements.PP_Maintenance_Charges).sendKeys("5000");
			BaseTest.driver.findElement(manajaga_elements.PP_Post_Electricity_Charges).sendKeys("3000");
			CommonMethods.SelectDD("Post-NoticePeriod", "2 weeks");
			BaseTest.driver.findElement(manajaga_elements.PP_TotalPrice).sendKeys("78000");
			BaseTest.driver.findElement(manajaga_elements.PP_OnlyAgentsBrokers).click();
			BaseTest.driver.findElement(manajaga_elements.PP_ResponseFromAll).click();
			BaseTest.driver.findElement(manajaga_elements.videoURL).sendKeys("https://www.youtube.com/watch?v=Mw8E4QsdkJI");
			BaseTest.driver.findElement(manajaga_elements.PP_description).sendKeys("Entered all the fields of Individual House for Owner and Rent");
			BaseTest.driver.findElement(manajaga_elements.nxtbtn_propertyinfo).click();
			Thread.sleep(60000);
			BaseTest.waitUntilPageLoad();
		
			
//			CommonMethods.LocationDetails("hyderbad", "Hyderabad", "Telangana", "India");
//			BaseTest.driver.findElement(manajaga_elements.nxt_btn_adress).click();
//			BaseTest.driver.findElement(manajaga_elements.submit_btn_contactinfo).click();
		}
		
		
		if (Propertytype.contains("Office Space")) 
		{
			BaseTest.driver.findElement(manajaga_elements.PP_PropertyTitle).sendKeys("Office Space");
			CommonMethods.SelectDD("totalFloors", "6");
			CommonMethods.SelectDD("floorNo", "5");
			CommonMethods.SelectDD("post-areas-few", "Sq-yrd");
			BaseTest.driver.findElement(manajaga_elements.PP_totalarea).sendKeys("600");
			BaseTest.driver.findElement(manajaga_elements.PP_length).sendKeys("55");
			BaseTest.driver.findElement(manajaga_elements.PP_breadth).sendKeys("65");
			CommonMethods.SelectDD("furniture", "Furnished");
			BaseTest.driver.findElement(manajaga_elements.PP_furnitureDetails).sendKeys("CubBoards, Desks");
			CommonMethods.SelectDD("openSides", "2");
			CommonMethods.SelectDD("facing", "North");
			CommonMethods.SelectDD("availableStatus", "Immediately");
			BaseTest.driver.findElement(manajaga_elements.PP_WaterAvailabilityNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_BathroomNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_CafeteriaNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_watchmenNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_ccCamerasNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_Monthly_Rent).sendKeys("55000");
			BaseTest.driver.findElement(manajaga_elements.PP_Security_Deposit).sendKeys("15000");
			BaseTest.driver.findElement(manajaga_elements.PP_Maintenance_Charges).sendKeys("5000");
			BaseTest.driver.findElement(manajaga_elements.PP_Post_Electricity_Charges).sendKeys("3000");
			CommonMethods.SelectDD("Post-NoticePeriod", "2 weeks");
			BaseTest.driver.findElement(manajaga_elements.PP_OnlyAgentsBrokers).click();
			BaseTest.driver.findElement(manajaga_elements.PP_ResponseFromAll).click();
			BaseTest.driver.findElement(manajaga_elements.videoURL).sendKeys("https://www.youtube.com/watch?v=Mw8E4QsdkJI");
			BaseTest.driver.findElement(manajaga_elements.PP_description).sendKeys("Entered all the fields of Office Space for Owner and Rent");
			BaseTest.driver.findElement(manajaga_elements.nxtbtn_propertyinfo).click();
			Thread.sleep(60000);
			BaseTest.waitUntilPageLoad();
		
			
//			CommonMethods.LocationDetails("hyderbad", "Hyderabad", "Telangana", "India");
//			BaseTest.driver.findElement(manajaga_elements.nxt_btn_adress).click();
//			BaseTest.driver.findElement(manajaga_elements.submit_btn_contactinfo).click();
		}
		if (Propertytype.contains("Pent House")) 
		{
			BaseTest.driver.findElement(manajaga_elements.PP_PropertyTitle).sendKeys("Pent House");
			CommonMethods.SelectDD("totalFloors", "6");
			CommonMethods.SelectDD("openSides", "2");
			CommonMethods.SelectDD("facing", "West");
			BaseTest.driver.findElement(manajaga_elements.PP_VentureNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_Monthly_Rent).sendKeys("55000");
			BaseTest.driver.findElement(manajaga_elements.PP_Security_Deposit).sendKeys("15000");
			BaseTest.driver.findElement(manajaga_elements.PP_Maintenance_Charges).sendKeys("5000");
			BaseTest.driver.findElement(manajaga_elements.PP_Post_Electricity_Charges).sendKeys("3000");
			CommonMethods.SelectDD("Post-NoticePeriod", "2 weeks");
			BaseTest.driver.findElement(manajaga_elements.PP_OnlyAgentsBrokers).click();
			BaseTest.driver.findElement(manajaga_elements.PP_ResponseFromAll).click();
			BaseTest.driver.findElement(manajaga_elements.videoURL).sendKeys("https://www.youtube.com/watch?v=Mw8E4QsdkJI");
			BaseTest.driver.findElement(manajaga_elements.PP_description).sendKeys("Entered all the fields of Pent House for Owner and Rent");
			BaseTest.driver.findElement(manajaga_elements.nxtbtn_propertyinfo).click();
			Thread.sleep(60000);
			BaseTest.waitUntilPageLoad();
		
			
			CommonMethods.LocationDetails("hyderbad", "Hyderabad", "Telangana", "India");
			BaseTest.driver.findElement(manajaga_elements.nxt_btn_adress).click();
			BaseTest.driver.findElement(manajaga_elements.submit_btn_contactinfo).click();
		}
		if (Propertytype.contains("Residential Plot")) 
		{
			BaseTest.driver.findElement(manajaga_elements.PP_PropertyTitle).sendKeys("Residential Plot");
			CommonMethods.SelectDD("post-areas-few", "Sq-yrd");
			BaseTest.driver.findElement(manajaga_elements.PP_totalarea).sendKeys("600");
			BaseTest.driver.findElement(manajaga_elements.PP_length).sendKeys("55");
			BaseTest.driver.findElement(manajaga_elements.PP_breadth).sendKeys("65");
			CommonMethods.SelectDD("openSides", "2");
			CommonMethods.SelectDD("facing", "North");
			BaseTest.driver.findElement(manajaga_elements.PP_VentureYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_WaterAvailabilityNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_Monthly_Rent).sendKeys("55000");
			BaseTest.driver.findElement(manajaga_elements.PP_Security_Deposit).sendKeys("2000");
			BaseTest.driver.findElement(manajaga_elements.PP_Maintenance_Charges).sendKeys("5000");
			BaseTest.driver.findElement(manajaga_elements.PP_Post_Electricity_Charges).sendKeys("3000");
			CommonMethods.SelectDD("Post-NoticePeriod", "2 weeks");
			BaseTest.driver.findElement(manajaga_elements.PP_OnlyAgentsBrokers).click();
			BaseTest.driver.findElement(manajaga_elements.PP_ResponseFromAll).click();
			BaseTest.driver.findElement(manajaga_elements.videoURL).sendKeys("https://www.youtube.com/watch?v=Mw8E4QsdkJI");
			BaseTest.driver.findElement(manajaga_elements.PP_description).sendKeys("Entered all the fields of Residential Plot for Owner and Rent");
			BaseTest.driver.findElement(manajaga_elements.nxtbtn_propertyinfo).click();
			Thread.sleep(60000);
			BaseTest.waitUntilPageLoad();
		
			
//			CommonMethods.LocationDetails("hyderbad", "Hyderabad", "Telangana", "India");
//			BaseTest.driver.findElement(manajaga_elements.nxt_btn_adress).click();
//			BaseTest.driver.findElement(manajaga_elements.submit_btn_contactinfo).click();
		}
		if (Propertytype.contains("Ware House")) 
		{
			BaseTest.driver.findElement(manajaga_elements.PP_PropertyTitle).sendKeys("Ware House");
			CommonMethods.SelectDD("totalFloors", "6");
			CommonMethods.SelectDD("floorNo", "5");
			CommonMethods.SelectDD("post-areas-all", "Sq-yrd");
			BaseTest.driver.findElement(manajaga_elements.PP_totalarea).sendKeys("600");
			BaseTest.driver.findElement(manajaga_elements.PP_length).sendKeys("55");
			BaseTest.driver.findElement(manajaga_elements.PP_breadth).sendKeys("65");
			CommonMethods.SelectDD("openSides", "2");
			CommonMethods.SelectDD("facing", "North");
			CommonMethods.SelectDD("availableStatus", "Date");
			BaseTest.driver.findElement(By.id("post-datepicker")).sendKeys("08/26/2020");
			BaseTest.driver.findElement(manajaga_elements.PP_PropertyPermissionyes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_WaterAvailabilityYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_BathroomYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_commonAreaYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_watchmenYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_ccCamerasYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_Monthly_Rent).sendKeys("55000");
			BaseTest.driver.findElement(manajaga_elements.PP_Security_Deposit).sendKeys("2000");
			BaseTest.driver.findElement(manajaga_elements.PP_Maintenance_Charges).sendKeys("5000");
			BaseTest.driver.findElement(manajaga_elements.PP_Post_Electricity_Charges).sendKeys("3000");
			CommonMethods.SelectDD("Post-NoticePeriod", "2 weeks");
			BaseTest.driver.findElement(manajaga_elements.PP_OnlyAgentsBrokers).click();
			BaseTest.driver.findElement(manajaga_elements.PP_ResponseFromAll).click();
			BaseTest.driver.findElement(manajaga_elements.videoURL).sendKeys("https://www.youtube.com/watch?v=Mw8E4QsdkJI");
			BaseTest.driver.findElement(manajaga_elements.PP_description).sendKeys("Entered all the fields of Ware House for Owner and Rent");
			BaseTest.driver.findElement(manajaga_elements.nxtbtn_propertyinfo).click();
			Thread.sleep(60000);
			BaseTest.waitUntilPageLoad();
		
			
//			CommonMethods.LocationDetails("hyderbad", "Hyderabad", "Telangana", "India");
//			BaseTest.driver.findElement(manajaga_elements.nxt_btn_adress).click();
//			BaseTest.driver.findElement(manajaga_elements.submit_btn_contactinfo).click();
		}
		
	}
	
	


	
}
