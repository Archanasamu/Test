package com.Bank.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Bank.BaseClass.ProjectSpecificMethods;

public class OpenAccount extends ProjectSpecificMethods{
	
	public OpenAccount(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public OpenAccount selectCustomerName(){
		WebElement selectCustName = driver.findElementById("userSelect");
		Select sName = new Select(selectCustName);
		sName.selectByVisibleText("Archana Boopathi");
		return this;
	}
	
	public OpenAccount selectCurrency(){
		WebElement currency = driver.findElementById("currency");
		Select sCurrency = new Select(currency);
		sCurrency.selectByIndex(1);
		return this;
	}
	public OpenAccount clickProcess() {
		driver.findElementByXPath("//button[@type='submit']").click();
		return this;
	}

	public OpenAccount getTextfromAlertopen() {
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
