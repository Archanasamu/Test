package com.Bank.Pages;

import org.openqa.selenium.chrome.ChromeDriver;

import com.Bank.BaseClass.ProjectSpecificMethods;

public class DelectCustomer extends ProjectSpecificMethods{
	
	public DelectCustomer(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public DelectCustomer delectCust() {
		driver.findElementByXPath("//table[@class='table table-bordered table-striped']/tbody/tr[6]/td[5]/button").click();
		return this;
	}

}
