package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;

public class landingpage
{

	public WebDriver driver;
	
	//login page
	By username=By.xpath(".//input[@name='userid']");
	By password=By.xpath(".//input[@name='pwd']");
	By login=By.xpath(".//*[@id='login']/fieldset/input");
	
	//login page
	By navbar=By.xpath(".//a[@class='PSHYPERLINKNOUL']");
	By calender=By.xpath(".//ul[@class='nav nav-pills pull-right']/li[1]/a");
	
	
	
     public landingpage(WebDriver driver)
       {
		this.driver=driver;
       }

         
	 public WebElement enterusername()
        {
	    	return driver.findElement(username);
        }
	
	  public WebElement enterpassword()
	     {
			return driver.findElement(password);
	     }
	  public WebElement clicklogin()
	    {
		   return driver.findElement(login);
	    }
	  public WebElement calender1()
	     {
			return driver.findElement(calender);
	     }
	  
	  public WebElement navigationtopbar()
	    {
		   return driver.findElement(navbar);
	    }
	
	
}
