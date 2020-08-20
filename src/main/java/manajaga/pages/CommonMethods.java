package manajaga.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import manajaga.stepdef.BaseTest;

public class CommonMethods {
	
//	public static void  SelectDD(String Name, String Value) throws Throwable {
//		WebElement propertytype_DD =BaseTest.driver.findElement(By.xpath("(//*[@name='"+Name+"'])[2]"));
//		new Select(propertytype_DD).selectByVisibleText(Value);
//		Thread.sleep(1000);
//	}
	
	public static void  SelectDD(String ID, String Value) throws Throwable {
		WebElement propertytype_DD =BaseTest.driver.findElement(By.id(ID));
		new Select(propertytype_DD).selectByVisibleText(Value);
		Thread.sleep(1000);
	}
	
	
	public static void FieldValidation(String FieldName) throws Throwable{
		WebElement Bathrooms=BaseTest.driver.findElement(By.id(FieldName));
		Bathrooms.isDisplayed();
	}

}
