package com.Bank.TestCase;

import org.testng.annotations.Test;

import com.Bank.BaseClass.ProjectSpecificMethods;
import com.Bank.Pages.CustLoginPage;

public class TC_03_TranscationPage extends ProjectSpecificMethods{
	
	@Test
	public void verifyTranscations() throws InterruptedException {
		
		CustLoginPage clp = new CustLoginPage(driver);
		
		
		clp.loginpage().clickLogin().clickTransaction().sortByDate();
		
		
		
	}

}
