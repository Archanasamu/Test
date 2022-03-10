package com.Bank.Pages;

import org.openqa.selenium.chrome.ChromeDriver;

import com.Bank.BaseClass.ProjectSpecificMethods;

public class ManagerDashboard extends ProjectSpecificMethods{
	
	public ManagerDashboard(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public AddCustomerPage clickOnAddCustomer() {
		driver.findElementByXPath("//button[@ng-click='addCust()']").click();
		return new AddCustomerPage(driver);
	}
	
	public OpenAccount clickOnOpenAcc() {
		driver.findElementByXPath("//button[@ng-click='openAccount()']").click();
		return new OpenAccount(driver);
	}
	
	public DelectCustomer clickCustomer() {
		driver.findElementByXPath("//button[@ng-click='showCust()']").click();
		return new DelectCustomer(driver);
	}

}
