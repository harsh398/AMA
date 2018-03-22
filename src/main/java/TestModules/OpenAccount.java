package TestModules;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Core.Page;
import PageObjects.PageObjectFile;

import java.util.HashMap;
import java.util.List;
public class OpenAccount extends Page {
    @SuppressWarnings("unused")
	public static void Execute(List<HashMap<String, String>> datamap) throws Exception{
    	AddtoCart.Execute(datamap);
    	driver.navigate().back();
		WebDriverWait wait4 = new WebDriverWait(driver,10);
    	WebElement mouse = 	PageObjectFile.account1;
		Actions builder = new Actions(driver);
		builder.moveToElement(mouse).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/header/div/div[1]/div[4]/div[6]/div[2]/a[1]/span")));
		PageObjectFile.account2.click();
    
    }
}
