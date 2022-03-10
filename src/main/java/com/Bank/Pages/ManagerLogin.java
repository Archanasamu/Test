package com.Bank.Pages;

import org.openqa.selenium.chrome.ChromeDriver;

import com.Bank.BaseClass.ProjectSpecificMethods;

public class ManagerLogin extends ProjectSpecificMethods{
	
	public ManagerLogin(ChromeDriver driver){
		this.driver=driver;
		
	}
	
	public ManagerDashboard selectManager() {
		driver.findElementByXPath("//button[@ng-click='manager()']").click();
		return new ManagerDashboard(driver);
	}

}
