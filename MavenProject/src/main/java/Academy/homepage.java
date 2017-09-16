package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.landingpage;
import resources.base;


public class homepage extends base
{
	
	
	public static Logger log=LogManager.getLogger(homepage.class.getName());
 @Test(dataProvider="getData")
	public void logginguntaccount(String Username,String Password) throws IOException
	{
	 driver=initializeDriver();
	 log.info("Driver is initialized");
	 //Opening home page with the given browser in properties file  hello
	driver.get(prop.getProperty("url"));	 
	 
	 landingpage l=new landingpage(driver);
	 l.enterusername().sendKeys(Username);
	 l.enterpassword().sendKeys(Password);
	 l.clicklogin().click();
	 driver.close();
	}
 
 @DataProvider
   public Object[][] getData()
   {
	 
	 //creating array
	 Object[][]data=new Object[2][2];
	 data[0][0]="ya0116";
	 data[0][1]="*****";
	 data[1][0]="ya0116";
	 data[1][1]="*****";
	 
	return data;
	 	 
   }
 
 //@AfterTest
	public void closingbrowser()
	{  
    driver.close();
	}
 
 
}
