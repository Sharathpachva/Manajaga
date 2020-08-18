package manajaga.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import manajaga.stepdef.BaseTest;

public class CommonMethods {
	
	public static void SelectDD(String name, String Value) throws Throwable {
		WebElement propertytype_DD =BaseTest.driver.findElement(By.xpath("(//*[@name='"+name+"'])[2]"));
		new Select(propertytype_DD).selectByVisibleText(Value);
		Thread.sleep(1000);
		}
	
	public static void FieldValidation(String FieldName) throws Throwable
	{
		WebElement Field=BaseTest.driver.findElement(By.id(FieldName));
		Field.isDisplayed();
	}

}
