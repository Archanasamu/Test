package com.Bank.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Bank.BaseClass.ProjectSpecificMethods;

public class AddCustomerPage extends ProjectSpecificMethods {

	public AddCustomerPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public AddCustomerPage enterFirstName() {
		driver.findElementByXPath("//input[@ng-model='fName']").sendKeys("Archana");
		return this;
	}
	
	public AddCustomerPage enterLastName() {
		driver.findElementByXPath("//input[@ng-model='lName']").sendKeys("Boopathi");
		return this;
	}
	
	public AddCustomerPage enterPinCode() {
		driver.findElementByXPath("//input[@ng-model='postCd']").sendKeys("600101");
		return this;
	}
	
	public AddCustomerPage addCustomerBtn() {
		driver.findElementByXPath("//button[@type='submit']").click();
		return this;
	}
	
	public AddCustomerPage getTextfromAlert() {
		Alert alert = driver.switchTo().alert();
		String alerttext = alert.getText();
		System.out.println(alerttext);
		alert.accept();
		return this;
	}
	
	public ManagerLogin clickHome() {
		driver.findElementByXPath("//button[@ng-click='home()']").click();
		return new ManagerLogin(driver);
	}

}
