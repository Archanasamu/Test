package com.Bank.Pages;

import org.openqa.selenium.chrome.ChromeDriver;

import com.Bank.BaseClass.ProjectSpecificMethods;

public class DepositePage extends ProjectSpecificMethods {
	
	public DepositePage(ChromeDriver driver) {
		this.driver=driver;
		
	}
	
	public DepositePage enterDepAmount() {
		
		driver.findElementByXPath("//input[@ng-model='amount']").sendKeys("100");
		return this;
	}

	public DepositePage clickDepSubmit(){
		driver.findElementByXPath("//button[text()='Deposit']").click();
		String text = driver.findElementByXPath("//span[@ng-show='message']").getText();
		System.out.println("Deposite status: "+ text);
		return this;
		
	}
}
