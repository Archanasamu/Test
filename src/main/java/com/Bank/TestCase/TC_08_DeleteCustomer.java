package com.Bank.TestCase;

import org.testng.annotations.Test;

import com.Bank.BaseClass.ProjectSpecificMethods;
import com.Bank.Pages.ManagerLogin;

public class TC_08_DeleteCustomer extends ProjectSpecificMethods {
	
	@Test
	public void verifyDeletCustomer() {
		ManagerLogin ml = new ManagerLogin(driver);
		
		ml.selectManager()
		.clickOnAddCustomer().enterFirstName().enterLastName().enterPinCode().addCustomerBtn().getTextfromAlert().clickHome()
		.selectManager().clickCustomer().delectCust();
		
	}

}
