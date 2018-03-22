package TestCases;
import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Core.Page;
import PageObjects.PageObjectFile;
import Utilities.DataHelper;
public class Step2 extends Page {
	 public List<HashMap<String,String>> datamap;    
	 public Step2()
	    {	    	
	 datamap = DataHelper.data();
	    }
 @Test
    public void C() throws Throwable {
	 // Write code here that turns the phrase above into concrete actions
	 PageFactory.initElements(driver, PageObjectFile.class);
    TestModules.Search.Execute(datamap);
    logs.debug("Second Test Case is executing");
    }
}

