package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {


        // added new line for github demo purpose
		// This driver dont have scope
    	public WebDriver driver;
	
	  private  By password=By.xpath("//input[@id='password']");
	  private  By username=By.xpath("//input[@id='username']");
	  private  By login=By.xpath("//input[@id='Login']");
	  private By tryforFree=By.xpath("//a[@id='signup_link']");
	  
	  By errorMessage=By.xpath("//div[@id='error']");
	  
	  public LoginPageObjects(WebDriver driver2) {
  		this.driver=driver2;
  		
	}

		public WebElement enterUsername()  {

	
	    return driver.findElement(username);
	
    	}

	
    	public WebElement enterpassword()  {
    		
    	    return driver.findElement(password);
    	
        	}
	
    	public WebElement ClickOnLogin()  {
    		
    	    return driver.findElement(login);
    	
        	}

           public WebElement ClickOntryforFree()  {
    		
    	    return driver.findElement(tryforFree);
    	
        	}

           public WebElement errorText()  {
       		
    	    return driver.findElement(errorMessage);
    	
        	}



			
		}
			
		
	
	
	
	
    	
    	

