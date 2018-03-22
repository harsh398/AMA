package TestModules;
import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.support.ui.WebDriverWait;
import Core.Page;
import PageObjects.PageObjectFile;
public class AddtoCart extends Page{
	@SuppressWarnings("unused")
	public static void Execute(List<HashMap<String, String>> datamap) throws Exception{
		Search.Execute(datamap);
		PageObjectFile.cart.click();
		WebDriverWait wait1 = new WebDriverWait(driver,10);	
		PageObjectFile.check.click();
		
	}
}
