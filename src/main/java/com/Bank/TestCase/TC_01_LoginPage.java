package com.Bank.TestCase;

import org.testng.annotations.Test;

import com.Bank.BaseClass.ProjectSpecificMethods;
import com.Bank.Pages.CustLoginPage;

public class TC_01_LoginPage extends ProjectSpecificMethods{
	
	@Test
	public void verifyLogin(){
		CustLoginPage clp = new CustLoginPage(driver);
		
		clp.loginpage().clickLogin();
		
	}

}
