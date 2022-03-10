package com.Bank.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Bank.BaseClass.ProjectSpecificMethods;

public class DashboardPage extends ProjectSpecificMethods {
	
	public DashboardPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	
	public DashboardPage selectAccNum() {
		WebElement accNo=driver.findElementById("accountSelect");
		Select sAccNo = new Select(accNo);
		sAccNo.selectByIndex(1);
		return this;
	}
	
	public DashboardPage comfirmSelectedAccNo() {
		String text = driver.findElementByXPath("//strong[@class='ng-binding'][1]").getText();
		System.out.println(text);
		return this;
	}
	
	public TransactionPage clickTransaction() {
		driver.findElementByXPath("//button[@ng-click='transactions()']").click();
		return new TransactionPage(driver);
	}
	
	public DepositePage clickDeposite() {
		driver.findElementByXPath("//button[@ng-click='deposit()']").click();
		return new DepositePage(driver);
	}
	
	public WithdrawalPage clickOnWithdrawal() {
		driver.findElementByXPath("//button[@ng-click='withdrawl()']").click();
		return new WithdrawalPage(driver);
		
	}

}
