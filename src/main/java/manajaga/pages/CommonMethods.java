package manajaga.pages;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import manajaga.objectrepository.Userdata;
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
	
	public static void GalarySelection(String filename) throws FindFailed, Throwable {
		String userDir = System.getProperty("user.dir");
		String filepath = userDir+"\\src\\test\\resources\\ManajagaImages\\";
        String inputFilePath = userDir+"\\src\\test\\resources\\ManajagaImages\\";
        Screen s = new Screen();
        Pattern fileInputTextBox = new Pattern(filepath + "FileTextBox.PNG");
        Pattern openButton = new Pattern(filepath + "OpenButton.PNG");
        Thread.sleep(10000);
		s.wait(fileInputTextBox, 20);
       s.type(fileInputTextBox, inputFilePath + filename);
        s.click(openButton);
	}
}
