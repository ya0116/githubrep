package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.steadystate.css.util.Output;

public class base
{
	public WebDriver driver;
   public Properties prop;
	
	public WebDriver initializeDriver() throws IOException
   //Browser invocation for all the test cases from base file
   //100 test cases
   {
  
	    prop=new Properties();
	    FileInputStream fis=new FileInputStream("C:\\Users\\yesh3\\Project\\src\\main\\java\\resources\\data.properties");
	    prop.load(fis);
	   
	   String browserName= prop.getProperty("browser");	   	    
	   if(browserName.equals("firefox"))
	     {
		    System.out.println("Using firefox browser");
		    System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
			driver=new FirefoxDriver();
		   		   
	     }
	   else if(browserName.equals("chrome"))
	     {
		   System.out.println("Using chrome browser"); 
		   System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		   driver=new ChromeDriver();
		   
	     }
	   	   
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   return driver;

	   
   }
	public void getScreenshot(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\yesh3\\Project\\screenshot\\+result+failure.jpg"));
	}
	
	
				   
}
