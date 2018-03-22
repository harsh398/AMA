package TestCases;
import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Core.Page;
import PageObjects.PageObjectFile;
import Utilities.DataHelper;
public class step4 extends Page {
	 public List<HashMap<String,String>> datamap;	    
	 public step4()
	    {
		 datamap = DataHelper.data();
	    }  
    @Test
    public void e() throws Throwable {
        // Write code here that turns the phrase above into concrete actions   	
    	PageFactory.initElements(driver, PageObjectFile.class);  	
          TestModules.OpenAccount.Execute(datamap);
          logs.debug("fourth testcase is executed");
         
    }
}
    