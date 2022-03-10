package com.Bank.TestCase;

import org.testng.annotations.Test;

import com.Bank.BaseClass.ProjectSpecificMethods;
import com.Bank.Pages.CustLoginPage;

public class TC_05_WithdrawalPage extends ProjectSpecificMethods{
	
	@Test
	public void verifyWithdrawal() {
		
		CustLoginPage clp = new CustLoginPage(driver);
		
		clp.loginpage().clickLogin().clickOnWithdrawal().enterAmount().clickOnWithdrawbtn();
	}

}
