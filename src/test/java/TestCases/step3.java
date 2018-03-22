package TestCases;
import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Core.Page;
import PageObjects.PageObjectFile;
import Utilities.DataHelper;
public class step3 extends Page{  
	 public List<HashMap<String,String>> datamap;    
	 public step3()
	    { 	
	datamap = DataHelper.data();
	    }
    @Test
    public void d() throws Throwable {
    // Write code here that turns the phrase above into concrete actions   	
   	PageFactory.initElements(driver, PageObjectFile.class);
    TestModules.AddtoCart.Execute(datamap);   
    logs.debug("thir testcases is executed");
    }
}
    