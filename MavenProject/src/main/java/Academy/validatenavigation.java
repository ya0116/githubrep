package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.landingpage;
import resources.base;

public class validatenavigation extends base
{
	public static Logger log=LogManager.getLogger(validatenavigation.class.getName());
	@BeforeTest
	 public void intialize() throws IOException
	 {
		
		 driver=initializeDriver();
		 log.info("Driver is initialized");
		 //Opening home page with the given browser in properties file 
		driver.get(prop.getProperty("url"));
		log.info("Url received");
	 }
	
	
	
  @Test
	public void navigationbarvalidation() throws IOException
	{
	
	
		 landingpage l=new landingpage(driver);
		 
		Assert.assertTrue(l.navigationtopbar().isDisplayed());//if present
		//Assert.assertFalse(l.navigationtopbar().isDisplayed());//if not present
		//driver.close();
	}
  
  @AfterTest
	public void closingbrowser()
	{  
       driver.close();
	}
}
