package com.Bank.TestCase;

import org.testng.annotations.Test;

import com.Bank.BaseClass.ProjectSpecificMethods;
import com.Bank.Pages.ManagerLogin;

public class TC_07_OpenAccount extends ProjectSpecificMethods{
	
	@Test
	public void verifyOpenAccount() {
		
		ManagerLogin ml = new ManagerLogin(driver);
		
		ml.selectManager().clickOnAddCustomer().enterFirstName().enterLastName().enterPinCode().addCustomerBtn().getTextfromAlert().clickHome().selectManager().clickOnOpenAcc().selectCustomerName().selectCurrency().clickProcess().getTextfromAlertopen();
	}

}
