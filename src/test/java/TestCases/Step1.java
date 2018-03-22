package TestCases;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Core.Page;
import PageObjects.PageObjectFile;
import TestModules.LoginTest;
import Utilities.DataHelper;
public class Step1 extends Page {
	 public List<HashMap<String,String>> datamap;    
	 public Step1()
   {    	
   	datamap = DataHelper.data();
   }
 @Test
    public void A() throws Throwable {
	 PageFactory.initElements(driver, PageObjectFile.class);
	LoginTest.Execute(datamap);
	logs.debug("Login Test is executed");
	  }  
}