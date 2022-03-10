package com.Bank.TestCase;

import org.testng.annotations.Test;

import com.Bank.BaseClass.ProjectSpecificMethods;
import com.Bank.Pages.ManagerLogin;

public class TC_06_Manager_AddCust extends ProjectSpecificMethods{
	
	@Test
	public void verifyAddCustomer() {
		
		ManagerLogin ml = new ManagerLogin(driver);
		
		ml.selectManager().clickOnAddCustomer().enterFirstName().enterLastName().enterPinCode().addCustomerBtn().getTextfromAlert();
	}

}
