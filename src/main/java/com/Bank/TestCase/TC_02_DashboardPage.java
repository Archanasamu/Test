package com.Bank.TestCase;

import org.testng.annotations.Test;

import com.Bank.BaseClass.ProjectSpecificMethods;
import com.Bank.Pages.CustLoginPage;


public class TC_02_DashboardPage extends ProjectSpecificMethods{
	
	@Test
	public void verifyDahsboard() {
		
		CustLoginPage clp = new CustLoginPage(driver);
		
		clp.loginpage().clickLogin().selectAccNum().comfirmSelectedAccNo();
	
	}

}
