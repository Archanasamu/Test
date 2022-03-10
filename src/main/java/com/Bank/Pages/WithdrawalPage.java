package com.Bank.Pages;

import org.openqa.selenium.chrome.ChromeDriver;

import com.Bank.BaseClass.ProjectSpecificMethods;

public class WithdrawalPage extends ProjectSpecificMethods{
	
	public WithdrawalPage(ChromeDriver driver){
		
		this.driver=driver;
	}
	
	public WithdrawalPage enterAmount(){
		driver.findElementByXPath("//input[@ng-model='amount']").sendKeys("100");
		return this;
	}
	
	public WithdrawalPage clickOnWithdrawbtn() {
		driver.findElementByXPath("//button[text()='Withdraw']").click();
		String text = driver.findElementByXPath("//span[@ng-show='message']").getText();
		System.out.println(text);
		return this;
	}
	
	

}
