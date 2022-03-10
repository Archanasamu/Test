package com.Bank.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Bank.BaseClass.ProjectSpecificMethods;

public class CustLoginPage extends ProjectSpecificMethods{
	
	public CustLoginPage(ChromeDriver driver){
		this.driver = driver;
	}

	public CustLoginPage loginpage() {
		driver.findElementByXPath("//button[text()='Customer Login']").click();
		WebElement name = driver.findElementById("userSelect");
		Select Sname = new Select(name);
		Sname.selectByVisibleText("Hermoine Granger");
		return this;
		}
	
	public DashboardPage clickLogin() {
		driver.findElementByXPath("//button[text()='Login']").click();
		return new DashboardPage(driver);
	}
}
