package manajaga.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import manajaga.stepdef.BaseTest;

public class CommonMethods {
	
	public static void  SelectDD(String ID, String Value) throws Throwable {
		WebElement propertytype_DD =BaseTest.driver.findElement(By.id(ID));
		new Select(propertytype_DD).selectByVisibleText(Value);
		BaseTest.waitUntilPageLoad();
		}

	public static void FieldValidation(String FieldName) throws Throwable{
		WebElement Field=BaseTest.driver.findElement(By.id(FieldName));
		Field.isDisplayed();
	}
	
	public static void LocationDetails(String Address,String City,String State,String Country) 
	{
		BaseTest.driver.findElement(By.xpath("//input[@name='address']")).sendKeys(Address);
		BaseTest.driver.findElement(By.xpath("(//input[@name='city'])[2]")).sendKeys(City);
		BaseTest.driver.findElement(By.xpath("//input[@name='state']")).sendKeys(State);
		BaseTest.driver.findElement(By.xpath("//input[@name='country']")).sendKeys(Country);
	}
}
