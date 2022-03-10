package com.Bank.TestCase;

import org.testng.annotations.Test;

import com.Bank.BaseClass.ProjectSpecificMethods;
import com.Bank.Pages.CustLoginPage;

public class TC_04_DepositePage extends ProjectSpecificMethods{
	
	@Test
	public void verifyDeposite() {
		
		CustLoginPage clp = new CustLoginPage(driver);
		
		clp.loginpage().clickLogin().clickDeposite().enterDepAmount().clickDepSubmit();
		
	}

}
