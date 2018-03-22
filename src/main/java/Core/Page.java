package Core;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Page  {
	public static String mailscreenshotpath;
	 public static WebDriver driver;
	public static Properties Config = new Properties();

	public static FileInputStream fis;
	public static Logger logs = Logger.getLogger("devpinoyLogger");	
	//Loading Files and executing them before executing the suite 
	//Reload the config file and open the browser after each test
	@BeforeMethod
	public void init() throws IOException, AddressException, SQLException, ClassNotFoundException, MessagingException{
	 //driver is set to null
	driver=null;
	//Below we load Config file onto fis 
	fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Utilities\\Config.properties");
	Config.load(fis);
	logs.debug("Loaded the Config property file");
	//Below we are loading the Or file which holds all the xpaths 	
	//the test will open the browser whichever is written in the config file 			
	driver = new ChromeDriver();
	logs.debug("Opened the Browser");
	driver.get(Config.getProperty("testsiteurl"));
	//above code will check for the website 
	logs.debug("Navigating to website");
	driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
	}
	public static void CaptureScreenshot() throws IOException{
		
		  Calendar cal = new GregorianCalendar();
		  int month = cal.get(Calendar.MONTH); //3
		  int year = cal.get(Calendar.YEAR); //2014
		  int sec =cal.get(Calendar.SECOND);
		  int min =cal.get(Calendar.MINUTE);
		  int date = cal.get(Calendar.DATE);
		  int day =cal.get(Calendar.HOUR_OF_DAY);
		
		  
		  /*Below Code will capture the screenshot*/
		  mailscreenshotpath = System.getProperty("user.dir")+"\\screenshots\\"+year+"_"+date+"_"+(month+1)+"_"+day+"_"+min+"_" +sec+".jpeg";
			
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(scrFile, new File(mailscreenshotpath));
		
	}
	@AfterMethod
	public void QuitDriver(ITestResult result) throws IOException{
	//Captures the Screenshot
		
		if(ITestResult.FAILURE==result.getStatus()){
			 try{
			 // To create reference of TakesScreenshot
			 TakesScreenshot screenshot=(TakesScreenshot)driver;
			 // Call method to capture screenshot
			 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 // Copy files to specific location 
			 // result.getName() will return name of test case so that screenshot name will be same as test case name
			 FileUtils.copyFile(scrFile, new File(mailscreenshotpath));
			 System.out.println("Successfully captured a screenshot");
			 }catch (Exception e){
			 System.out.println("Exception while taking screenshot "+e.getMessage());
			 logs.debug("Error is Catched and screenshot is taken");
			 } 
			 }
	CaptureScreenshot();
	//Close the Browser After Each Test
	driver.quit();
	logs.debug("Browser is closed");
		
	}

}
