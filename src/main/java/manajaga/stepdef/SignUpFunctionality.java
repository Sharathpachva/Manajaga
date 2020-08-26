package manajaga.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import manajaga.objectrepository.manajaga_elements;
import manajaga.pages.CommonMethods;

public class SignUpFunctionality {
	@Given("^User navigates to Sign Up window$")
	public void user_navigates_to_Sign_Up_window() throws Throwable {
	    BaseTest.driver.findElement(manajaga_elements.Open_SignUP_btn).click();
	    BaseTest.waitUntilPageLoad();
	}

	@When("^User enters the Username password and required fields in the Sign up window$")
	public void user_enters_the_Username_password_and_required_fields_in_the_Sign_up_window() throws Throwable {
	    BaseTest.driver.findElement(manajaga_elements.firstName).sendKeys("lahari");
	    BaseTest.driver.findElement(manajaga_elements.LastName).sendKeys("rao");
	    BaseTest.driver.findElement(manajaga_elements.EmailID).sendKeys("laharirao43@gmail.com");
	    BaseTest.driver.findElement(manajaga_elements.NewPassword).sendKeys("123456");
	    BaseTest.driver.findElement(manajaga_elements.ConfirmPassword).sendKeys("123456");
	    CommonMethods.SelectDD("countryCode", "IND +91");
	    BaseTest.driver.findElement(manajaga_elements.MobileNumber).sendKeys("9564888546");
	    BaseTest.driver.findElement(manajaga_elements.Buyer_rdbtnSignup).click();
	    BaseTest.driver.findElement(manajaga_elements.SignUp_submitBtn).click();
	}

	@Then("^User Creates Accoount Succesfully$")
	public void user_Creates_Accoount_Succesfully() throws Throwable {
	    WebElement TxtSuccess=BaseTest.driver.findElement(By.xpath("//span[@class='text-success']"));
	    TxtSuccess.isDisplayed();
		
		
		
	}


}
