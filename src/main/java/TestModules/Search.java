package TestModules;
import org.openqa.selenium.support.ui.WebDriverWait;

import Core.Page;

import PageObjects.PageObjectFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Search extends Page {
	@SuppressWarnings("unused")
	public static void Execute(List<HashMap<String,String>> datamap) throws Exception{	
	  LoginTest.Execute(datamap);
	  PageObjectFile.search.sendKeys(datamap.get(0).get("Search"));
		PageObjectFile.search1.click();
		WebDriverWait wait1 = new WebDriverWait(driver, 5);
    	String oldTab = driver.getWindowHandle();	
		PageObjectFile.search2.click();
	    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
	    newTab.remove(oldTab);
	    // change focus to new tab
	    driver.switchTo().window(newTab.get(0));
	    PageObjectFile.item.click();
	    System.out.println("item Added to cart");
	
	}
}
