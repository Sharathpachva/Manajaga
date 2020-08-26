package manajaga.stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import manajaga.objectrepository.manajaga_elements;
import manajaga.pages.CommonMethods;

public class PostPropertyOwnerSaleFunctionality {
	String PropertyID = null;
	
	@Given("^User SignIn and Navigate to Post Free Window$")
	public void User_SignIn_and_Navigate_to_Post_Free_Window() throws Throwable {
		BaseTest.driver.findElement(By.xpath("//a[@href='#'][contains(.,'Sign In')]")).click();
		Thread.sleep(3000);
		BaseTest.driver.findElement(By.xpath("//input[contains(@name,'username')]")).clear();
		BaseTest.driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("shiva.dba84@gmail.com");
		Thread.sleep(1000);
		BaseTest.driver.findElement(By.xpath("//input[contains(@id,'password-field')]")).sendKeys("123456");
		Thread.sleep(1000);
		BaseTest.driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();
		BaseTest.waitUntilPageLoad();
		Thread.sleep(2000);
		WebElement MyAccount = BaseTest.driver.findElement(By.xpath("//a[@title='My Account']"));
		MyAccount.isDisplayed();
		BaseTest.waitUntilPageLoad();
		BaseTest.driver.findElement(By.id("blink_me")).click();
		BaseTest.waitUntilPageLoad();
		BaseTest.driver.findElement(By.xpath("//label[@for='PostProperty']")).click();
		BaseTest.waitUntilPageLoad();
	}

	@When("^User select Post Property and Select Owner for Sale$")
	public void user_select_Post_Property_and_Select_Owner_for_Sale() throws Throwable {

		BaseTest.driver.findElement(manajaga_elements.PostProperty_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.nxt_btn_choose_option).click();
		BaseTest.driver.findElement(manajaga_elements.PP_Owner_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.PP_Sale_rdbtn).click();
		BaseTest.driver.findElement(manajaga_elements.nxt_btn_user_info).click();

	}

	@When("^User select ([^\"]*) Property type of post property for sale$")
	public void user_select_Property_type_of_post_property_for_sale(String Propertytype) throws Throwable {
		CommonMethods.SelectDD("propertyTypeSale", Propertytype);
	}

	@When("^Enter All the Mandatory fields for ([^\"]*) Property type$")
	public void enter_All_the_Mandatory_fields_for_Property_type(String Propertytype) throws Throwable {
		if (Propertytype.contains("Agriculture Land")) {
			CommonMethods.SelectDD("facing", "South");
			CommonMethods.SelectDD("boundaryWith", "Fencing");
			BaseTest.driver.findElement(manajaga_elements.PP_nowunderleaseyes).click();
			CommonMethods.FieldValidation("leaseYears");
			CommonMethods.SelectDD("leaseYears", "5");
			BaseTest.driver.findElement(manajaga_elements.PP_WaterAvailabilityYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_TotalPrice).sendKeys("15000");
			BaseTest.driver.findElement(manajaga_elements.PP_acres).sendKeys("20");
			BaseTest.driver.findElement(manajaga_elements.PP_landtomainroadDistance).sendKeys("5");
			CommonMethods.SelectDD("LandToMainRoaddistanceMetric", "kms");
			BaseTest.driver.findElement(manajaga_elements.PP_soiltype).sendKeys("black soil");
			BaseTest.driver.findElement(manajaga_elements.PP_OnlyAgentsBrokers).click();
			BaseTest.driver.findElement(manajaga_elements.videoURL)
					.sendKeys("https://www.youtube.com/watch?v=0kudvXNCHGk");
			BaseTest.driver.findElement(manajaga_elements.PP_description)
					.sendKeys("entered all the fields of Agriculture Land property");
			Thread.sleep(2000);
			BaseTest.driver.findElement(manajaga_elements.nxtbtn_propertyinfo).click();
			BaseTest.waitUntilPageLoad();
			// windows

			BaseTest.driver.findElement(By.id("file1")).click();
			BaseTest.waitUntilPageLoad();
			CommonMethods.GalarySelection("download.jpg");
			BaseTest.waitUntilPageLoad();
			BaseTest.driver.findElement(By.id("file2")).click();
			BaseTest.waitUntilPageLoad();
			CommonMethods.GalarySelection("download (1).jpg");
			BaseTest.waitUntilPageLoad();
			BaseTest.driver.findElement(By.id("file3")).click();
			BaseTest.waitUntilPageLoad();
			CommonMethods.GalarySelection("download (2).jpg");
			BaseTest.waitUntilPageLoad();
			BaseTest.driver.findElement(By.id("imageTitle1")).sendKeys("Image1");
			BaseTest.driver.findElement(By.id("imageTitle2")).sendKeys("Image2");
			BaseTest.driver.findElement(By.id("imageTitle3")).sendKeys("Image3");
			BaseTest.waitUntilPageLoad();
			BaseTest.driver.findElement(manajaga_elements.nxt_btn_gallery).click();
			BaseTest.waitUntilPageLoad();
			CommonMethods.LocationDetails("hyderbad", "Hyderabad", "Telangana", "India");
			BaseTest.driver.findElement(manajaga_elements.nxt_btn_adress).click();
			BaseTest.driver.findElement(manajaga_elements.submit_btn_contactinfo).click();
		}

		if (Propertytype.contains("Apartment")) {
			BaseTest.driver.findElement(manajaga_elements.PP_PropertyTitle).sendKeys("3BHK");

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
			BaseTest.driver.findElement(manajaga_elements.PP_PoojaRoomYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_OtherRoomYes).click();
			CommonMethods.FieldValidation("otherRoomName");
			BaseTest.driver.findElement(manajaga_elements.PP_RoomName).sendKeys("guest room");
			BaseTest.driver.findElement(manajaga_elements.PP_Tradetypenewproperty).click();
			BaseTest.driver.findElement(manajaga_elements.PP_Possessionreadytomove).click();
			BaseTest.driver.findElement(manajaga_elements.PP_PropertyPermissionyes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_GatedCommYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_VentureYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_ParkingAvailableYes).click();
			CommonMethods.FieldValidation("post-available-parking");
			BaseTest.driver.findElement(manajaga_elements.PP_CarYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_TotalPrice).sendKeys("520000");
			BaseTest.driver.findElement(manajaga_elements.PP_OnlyAgentsBrokers).click();
			BaseTest.driver.findElement(manajaga_elements.videoURL)
					.sendKeys("https://www.youtube.com/watch?v=0kudvXNCHGk");
			Thread.sleep(2000);
			BaseTest.driver.findElement(manajaga_elements.PP_description)
					.sendKeys("entered all the fields of Apartment property");
			BaseTest.driver.findElement(manajaga_elements.nxtbtn_propertyinfo).click();
			Thread.sleep(60000);
			BaseTest.waitUntilPageLoad();

			CommonMethods.LocationDetails("hyderbad", "Hyderabad", "Telangana", "India");
			BaseTest.driver.findElement(manajaga_elements.nxt_btn_adress).click();
			BaseTest.driver.findElement(manajaga_elements.submit_btn_contactinfo).click();
		}

		if (Propertytype.contains("Commercial Plot")) {
			BaseTest.driver.findElement(manajaga_elements.PP_PropertyTitle).sendKeys("kruti shops");
			CommonMethods.SelectDD("post-areas-few", "Sq-yrd");
			BaseTest.driver.findElement(manajaga_elements.PP_totalarea).sendKeys("521");
			BaseTest.driver.findElement(manajaga_elements.PP_length).sendKeys("65");
			BaseTest.driver.findElement(manajaga_elements.PP_breadth).sendKeys("55");
			CommonMethods.SelectDD("openSides", "2");
			CommonMethods.SelectDD("facing", "North");
			CommonMethods.SelectDD("boundaryWith", "Open");
			CommonMethods.SelectDD("leaseYears", "15");
			BaseTest.driver.findElement(manajaga_elements.PP_VentureNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_TotalPrice).sendKeys("250000");
			BaseTest.driver.findElement(manajaga_elements.PP_ResponseFromAll).click();
			BaseTest.driver.findElement(manajaga_elements.videoURL)
					.sendKeys("https://www.youtube.com/watch?v=wc9gePevueQ");
			BaseTest.driver.findElement(manajaga_elements.PP_description)
					.sendKeys("Entered all the fields of Commercial Plot type");
			BaseTest.driver.findElement(manajaga_elements.nxtbtn_propertyinfo).click();
			Thread.sleep(60000);
			BaseTest.waitUntilPageLoad();

			CommonMethods.LocationDetails("hyderbad", "Hyderabad", "Telangana", "India");
			BaseTest.driver.findElement(manajaga_elements.nxt_btn_adress).click();
			BaseTest.driver.findElement(manajaga_elements.submit_btn_contactinfo).click();

		}

		if (Propertytype.contains("Commercial Shop")) {
			BaseTest.driver.findElement(manajaga_elements.PP_PropertyTitle).sendKeys("Commercial Shop");
			CommonMethods.SelectDD("bathrooms", "2");
			CommonMethods.SelectDD("totalFloors", "15");
			CommonMethods.SelectDD("floorNo", "10");
			CommonMethods.SelectDD("post-areas-few", "Sq-yrd");
			BaseTest.driver.findElement(manajaga_elements.PP_length).sendKeys("55");
			BaseTest.driver.findElement(manajaga_elements.PP_breadth).sendKeys("65");
			CommonMethods.SelectDD("furniture", "UnFurnished");
			CommonMethods.SelectDD("propertyAge", "5 - 10Years");
			CommonMethods.SelectDD("facing", "South");
			BaseTest.driver.findElement(manajaga_elements.PP_OtherRoomNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_Tradetypenewproperty).click();
			BaseTest.driver.findElement(manajaga_elements.PP_PossessionUnderConstruction).click();
			BaseTest.driver.findElement(manajaga_elements.PP_ParkingAvailableNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_TotalPrice).sendKeys("350000");
			BaseTest.driver.findElement(manajaga_elements.PP_ResponseFromAll).click();
			BaseTest.driver.findElement(manajaga_elements.videoURL)
					.sendKeys("https://www.youtube.com/watch?v=dQiYfH-C8lU");
			BaseTest.driver.findElement(manajaga_elements.PP_description)
					.sendKeys("Entered all the fields of Commercial Shop property type");
			BaseTest.driver.findElement(manajaga_elements.nxtbtn_propertyinfo).click();
			Thread.sleep(60000);
			BaseTest.waitUntilPageLoad();

			CommonMethods.LocationDetails("hyderbad", "Hyderabad", "Telangana", "India");
			BaseTest.driver.findElement(manajaga_elements.nxt_btn_adress).click();
			BaseTest.driver.findElement(manajaga_elements.submit_btn_contactinfo).click();
		}

		if (Propertytype.contains("Industrial Land")) {
			BaseTest.driver.findElement(manajaga_elements.PP_PropertyTitle).sendKeys("Industrial Land");
			CommonMethods.SelectDD("openSides", "3");
			CommonMethods.SelectDD("facing", "North");
			CommonMethods.SelectDD("leaseYears", "5");
			BaseTest.driver.findElement(manajaga_elements.PP_PropertyPermissionyes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_VentureNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_TotalPrice).sendKeys("540000");
			BaseTest.driver.findElement(manajaga_elements.PP_ResponseFromAll).click();
			BaseTest.driver.findElement(manajaga_elements.videoURL)
					.sendKeys("https://www.youtube.com/watch?v=CAEjVrj8Gaw");
			BaseTest.driver.findElement(manajaga_elements.PP_description)
					.sendKeys("Entered all the fields of Industrial Land property type");
			BaseTest.driver.findElement(manajaga_elements.nxtbtn_propertyinfo).click();
			Thread.sleep(60000);
			BaseTest.waitUntilPageLoad();

			CommonMethods.LocationDetails("hyderbad", "Hyderabad", "Telangana", "India");
			BaseTest.driver.findElement(manajaga_elements.nxt_btn_adress).click();
			BaseTest.driver.findElement(manajaga_elements.submit_btn_contactinfo).click();
		}

		if (Propertytype.contains("Individual House")) {
			BaseTest.driver.findElement(manajaga_elements.PP_PropertyTitle).sendKeys("5BHK");
			CommonMethods.SelectDD("bedrooms", "3BHK");
			CommonMethods.SelectDD("bathrooms", "5");
			CommonMethods.SelectDD("totalFloors", "6");
			CommonMethods.SelectDD("post-areas-few", "Sq-yrd");
			BaseTest.driver.findElement(manajaga_elements.PP_totalarea).sendKeys("500");
			BaseTest.driver.findElement(manajaga_elements.PP_length).sendKeys("50");
			BaseTest.driver.findElement(manajaga_elements.PP_breadth).sendKeys("60");
			CommonMethods.SelectDD("furniture", "UnFurnished");
			CommonMethods.SelectDD("propertyAge", "0 - 5 Years");
			CommonMethods.SelectDD("openSides", "2");
			CommonMethods.SelectDD("facing", "North");
			BaseTest.driver.findElement(manajaga_elements.PP_PoojaRoomYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_OtherRoomYes).click();
			CommonMethods.FieldValidation("otherRoomName");
			BaseTest.driver.findElement(manajaga_elements.PP_RoomName).sendKeys("guest room");
			BaseTest.driver.findElement(manajaga_elements.PP_Tradetypenewproperty).click();
			BaseTest.driver.findElement(manajaga_elements.PP_Possessionreadytomove).click();
			BaseTest.driver.findElement(manajaga_elements.PP_PropertyPermissionyes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_GatedCommYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_BalconyNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_ParkingAvailableNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_TotalPrice).sendKeys("3520000");
			BaseTest.driver.findElement(manajaga_elements.PP_OnlyBuyers).click();
			BaseTest.driver.findElement(manajaga_elements.videoURL)
					.sendKeys("https://www.youtube.com/watch?v=6GvCTfX5i5s");
			BaseTest.driver.findElement(manajaga_elements.PP_description)
					.sendKeys("Entered all the fields of Individual House property type");
			BaseTest.driver.findElement(manajaga_elements.nxtbtn_propertyinfo).click();
			Thread.sleep(60000);
			BaseTest.waitUntilPageLoad();

			CommonMethods.LocationDetails("hyderbad", "Hyderabad", "Telangana", "India");
			BaseTest.driver.findElement(manajaga_elements.nxt_btn_adress).click();
			BaseTest.driver.findElement(manajaga_elements.submit_btn_contactinfo).click();
		}

		if (Propertytype.contains("Office Space")) {
			BaseTest.driver.findElement(manajaga_elements.PP_PropertyTitle).sendKeys("Commercial Shop");
			CommonMethods.SelectDD("bathrooms", "2");
			CommonMethods.SelectDD("totalFloors", "15");
			CommonMethods.SelectDD("floorNo", "10");
			CommonMethods.SelectDD("post-areas-few", "Sq-yrd");
			BaseTest.driver.findElement(manajaga_elements.PP_length).sendKeys("55");
			BaseTest.driver.findElement(manajaga_elements.PP_breadth).sendKeys("65");
			CommonMethods.SelectDD("furniture", "UnFurnished");
			CommonMethods.SelectDD("propertyAge", "5 - 10Years");
			CommonMethods.SelectDD("openSides", "3");
			CommonMethods.SelectDD("facing", "South");
			CommonMethods.SelectDD("leaseYears", "6");
			BaseTest.driver.findElement(manajaga_elements.PP_Tradetypenewproperty).click();
			BaseTest.driver.findElement(manajaga_elements.PP_Possessionreadytomove).click();
			BaseTest.driver.findElement(manajaga_elements.PP_CafeteriaNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_ParkingAvailableNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_TotalPrice).sendKeys("650000");
			BaseTest.driver.findElement(manajaga_elements.PP_ResponseFromAll).click();
			BaseTest.driver.findElement(manajaga_elements.videoURL)
					.sendKeys("https://www.youtube.com/watch?v=mGV-qVkaD1g");
			BaseTest.driver.findElement(manajaga_elements.PP_description)
					.sendKeys("Entered all the fields of Office Space Property type");
			BaseTest.driver.findElement(manajaga_elements.nxtbtn_propertyinfo).click();
			Thread.sleep(60000);
			BaseTest.waitUntilPageLoad();

			CommonMethods.LocationDetails("hyderbad", "Hyderabad", "Telangana", "India");
			BaseTest.driver.findElement(manajaga_elements.nxt_btn_adress).click();
			BaseTest.driver.findElement(manajaga_elements.submit_btn_contactinfo).click();

		}

		if (Propertytype.contains("Pent House")) {
			BaseTest.driver.findElement(manajaga_elements.PP_PropertyTitle).sendKeys("2BHK");
			CommonMethods.SelectDD("bedrooms", "3BHK");
			CommonMethods.SelectDD("bathrooms", "5");
			CommonMethods.SelectDD("post-areas-few", "Sq-yrd");
			BaseTest.driver.findElement(manajaga_elements.PP_totalarea).sendKeys("500");
			BaseTest.driver.findElement(manajaga_elements.PP_length).sendKeys("65");
			BaseTest.driver.findElement(manajaga_elements.PP_breadth).sendKeys("70");
			CommonMethods.SelectDD("furniture", "UnFurnished");
			CommonMethods.SelectDD("propertyAge", "5 - 10 Years");
			CommonMethods.SelectDD("openSides", "3");
			CommonMethods.SelectDD("facing", "West");
			BaseTest.driver.findElement(manajaga_elements.PP_PoojaRoomYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_OtherRoomYes).click();
			CommonMethods.FieldValidation("otherRoomName");
			BaseTest.driver.findElement(manajaga_elements.PP_RoomName).sendKeys("guest room");
			BaseTest.driver.findElement(manajaga_elements.PP_Tradetypenewproperty).click();
			BaseTest.driver.findElement(manajaga_elements.PP_Possessionreadytomove).click();
			BaseTest.driver.findElement(manajaga_elements.PP_PropertyPermissionyes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_GatedCommYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_ParkingAvailableYes).click();
			CommonMethods.FieldValidation("post-available-parking");
			BaseTest.driver.findElement(manajaga_elements.PP_CarYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_TotalPrice).sendKeys("3650000");
			BaseTest.driver.findElement(manajaga_elements.PP_OnlyAgentsBrokers).click();
			BaseTest.driver.findElement(manajaga_elements.videoURL)
					.sendKeys("https://www.youtube.com/watch?v=pbOdgwUN8mY");
			Thread.sleep(2000);
			BaseTest.driver.findElement(manajaga_elements.PP_description)
					.sendKeys("entered all the fields of Pent House property");
			BaseTest.driver.findElement(manajaga_elements.nxtbtn_propertyinfo).click();
			Thread.sleep(60000);
			BaseTest.waitUntilPageLoad();

			CommonMethods.LocationDetails("hyderbad", "Hyderabad", "Telangana", "India");
			BaseTest.driver.findElement(manajaga_elements.nxt_btn_adress).click();
			BaseTest.driver.findElement(manajaga_elements.submit_btn_contactinfo).click();
		}

		if (Propertytype.contains("Residential Plot")) {
			BaseTest.driver.findElement(manajaga_elements.PP_PropertyTitle).sendKeys("kruti shops");
			CommonMethods.SelectDD("post-areas-few", "Sq-yrd");
			BaseTest.driver.findElement(manajaga_elements.PP_totalarea).sendKeys("521");
			BaseTest.driver.findElement(manajaga_elements.PP_length).sendKeys("65");
			BaseTest.driver.findElement(manajaga_elements.PP_breadth).sendKeys("55");
			CommonMethods.SelectDD("openSides", "2");
			CommonMethods.SelectDD("facing", "North");
			CommonMethods.SelectDD("boundaryWith", "Fencing");
			BaseTest.driver.findElement(manajaga_elements.PP_VentureNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_LRSNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_TotalPrice).sendKeys("250000");
			BaseTest.driver.findElement(manajaga_elements.PP_ResponseFromAll).click();
			BaseTest.driver.findElement(manajaga_elements.videoURL)
					.sendKeys("https://www.youtube.com/watch?v=wc9gePevueQ");
			BaseTest.driver.findElement(manajaga_elements.PP_description)
					.sendKeys("Entered all the fields of Commercial Plot type");
			BaseTest.driver.findElement(manajaga_elements.nxtbtn_propertyinfo).click();
			Thread.sleep(60000);
			BaseTest.waitUntilPageLoad();

			CommonMethods.LocationDetails("hyderbad", "Hyderabad", "Telangana", "India");
			BaseTest.driver.findElement(manajaga_elements.nxt_btn_adress).click();
			BaseTest.driver.findElement(manajaga_elements.submit_btn_contactinfo).click();
		}

		if (Propertytype.contains("Ware House")) {
			BaseTest.driver.findElement(manajaga_elements.PP_PropertyTitle).sendKeys("WareHouse");

			CommonMethods.SelectDD("totalFloors", "6");
			CommonMethods.SelectDD("floorNo", "5");
			CommonMethods.SelectDD("post-areas-all", "Sq-yrd");
			BaseTest.driver.findElement(manajaga_elements.PP_totalarea).sendKeys("500");
			BaseTest.driver.findElement(manajaga_elements.PP_length).sendKeys("84");
			BaseTest.driver.findElement(manajaga_elements.PP_breadth).sendKeys("60");
			CommonMethods.SelectDD("furniture", "Furnished");
			BaseTest.driver.findElement(By.id("furnitureDetails")).sendKeys("Cup boards");
			CommonMethods.SelectDD("propertyAge", "0 - 5 Years");
			CommonMethods.SelectDD("openSides", "2");
			CommonMethods.SelectDD("facing", "North");
			BaseTest.driver.findElement(manajaga_elements.PP_Tradetypenewproperty).click();
			BaseTest.driver.findElement(manajaga_elements.PP_PropertyPermissionyes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_BathroomNo).click();
			BaseTest.driver.findElement(manajaga_elements.PP_ParkingAvailableYes).click();
			CommonMethods.FieldValidation("post-available-parking");
			BaseTest.driver.findElement(manajaga_elements.PP_CarYes).click();
			BaseTest.driver.findElement(manajaga_elements.PP_TotalPrice).sendKeys("652100");
			BaseTest.driver.findElement(manajaga_elements.PP_OnlyAgentsBrokers).click();
			BaseTest.driver.findElement(manajaga_elements.videoURL)
					.sendKeys("https://www.youtube.com/watch?v=L-4j9B43IV8");
			Thread.sleep(2000);
			BaseTest.driver.findElement(manajaga_elements.PP_description)
					.sendKeys("entered all the fields of Ware House property");
			BaseTest.driver.findElement(manajaga_elements.nxtbtn_propertyinfo).click();
			Thread.sleep(60000);
			BaseTest.waitUntilPageLoad();

			CommonMethods.LocationDetails("hyderbad", "Hyderabad", "Telangana", "India");
			BaseTest.driver.findElement(manajaga_elements.nxt_btn_adress).click();
			BaseTest.waitUntilPageLoad();
			BaseTest.driver.findElement(manajaga_elements.submit_btn_contactinfo).click();
		}

	}

	@Then("^Post Property is created$")
	public void property_type_is_created() throws Throwable {
		int alert = BaseTest.driver.findElements(By.xpath("//h4[contains(text(),'Alert Message')]")).size();
		if (alert != 1) {
			Assert.fail("alert is not displayed");
		}
		String AlertMsg = BaseTest.driver.findElement(By.id("alertSuccessMessage")).getText();
		String ExpectedMsg = "Property created successfully. The property will appear in search once the admin approves it. You can check the property in your Dashboard. Please Search with this Unique Id after the admin approved your property :";
		if (!AlertMsg.contains(ExpectedMsg)) {
			Assert.fail("Alert Msg is not same as Expected");
		}
		
		if(AlertMsg.contains("property :")) {
			String[] data = AlertMsg.split("property :");
			PropertyID = data[1];
			}
		

	}

}
