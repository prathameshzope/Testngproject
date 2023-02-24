package TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObjects;
import Resources.baseClass;
import Resources.commonMethods;
import Resources.constants;

public class verifyLogin extends baseClass {

	@Test(dataProvider="testData")
	public void  login(String uname,String password) throws IOException  {

	
	LoginPageObjects obj=new LoginPageObjects(driver);
	
    commonMethods.handleAssertions(driver.getCurrentUrl(),"https://login.salesforce.com/" , "url is not matching");
	
	
	
	
	obj.enterUsername().sendKeys(uname);
		
	obj.enterpassword().sendKeys(password);

	obj.ClickOnLogin().click();
	
	commonMethods.handleAssertions(obj.errorText().getText(),"Please check your usrname and password. If you still can't log in, contact your Salesforce administrator."
,"Error message is not matching");
	
	
	
	
	/*SoftAssert a=new SoftAssert();
	
	String actual=obj.errorText().getText();
	
	String expected="Please check your usrname and password. If you still can't log in, contact your Salesforce administrator.";

	a.assertEquals(actual, expected,"Error message is not matching");
	a.assertAll();*/
	
	
	}
    @DataProvider	
	public Object[][] testData() {
		Object[][] data=new Object [3][2];
	    data[0][0]=constants.username1;
		data[0][1]=constants.password1;
		data[1][0]=constants.username2;
		data[1][1]=constants.password2;
		data[2][0]=constants.username3;
		data[2][1]=constants.password3;
		
      return data;
		
	}
}
