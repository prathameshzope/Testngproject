package TestCases;

import java.io.IOException;


import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignUpPageObjects;
import Resources.baseClass;
import Resources.commonMethods;
import Resources.constants;

public class verifySignup extends baseClass {

	@Test
	
	public void signup() throws IOException, InterruptedException {

	
	     LoginPageObjects lpo=new LoginPageObjects(driver);
	     
	     lpo.ClickOntryforFree().click();
	     
	     SignUpPageObjects spo=new SignUpPageObjects(driver);
	     
   Thread.sleep(5000);
	     
	  spo.enterFirstname().sendKeys(constants.firstname);
	  spo.enterLastname().sendKeys(constants.lastname) ; 
	  spo.enterJobtitle().sendKeys(constants.jobtitle);
	  spo.enterEmail().sendKeys(constants.email);
	  spo.enterPhone().sendKeys(constants.phone);
	  spo.enterCompany().sendKeys(constants.company);
	  
	  
      /* Select s = new Select(spo.selectemployees());
	   s.selectByIndex(1);
	     
       Select k = new Select(spo.enterCountry());
	   k.selectByIndex(98);    */

	     commonMethods.selectDropdown(spo.selectemployees(), 1);
	     commonMethods.selectDropdown(spo.enterCountry(), 98);
	
	}
}	
	

