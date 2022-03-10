package com.Bank.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Bank.BaseClass.ProjectSpecificMethods;

public class TransactionPage extends ProjectSpecificMethods{
	
	public JavascriptExecutor js;
	
	public TransactionPage(ChromeDriver driver) {
		this.driver=driver;
	}

	/*
	 * public TransactionPage selectFromToDate() throws InterruptedException {
	 * 
	 * //WebElement startDate =
	 * driver.findElementByXPath("//input[@ng-model='startDate']");
	 * js.executeScript("arguments[0].value = arguments[1]",driver.
	 * findElementByXPath("//input[@ng-model='startDate']"),"2022-02-25T16:49:16");
	 * Thread.sleep(2000); //WebElement endDate =
	 * driver.findElementByXPath("//input[@ng-model='end']");
	 * js.executeScript("arguments[0].value = arguments[1]",driver.
	 * findElementByXPath("//input[@ng-model='end']"),"2022-02-25T16:51:24"); return
	 * this; }
	 */
	
	public TransactionPage sortByDate() {
		driver.findElementByPartialLinkText("Date-Time").click();
		return this;
	}
}
