package TestModules;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Core.Page;

import PageObjects.PageObjectFile;
public class LoginTest extends Page {
/*Declaring a global Username to assign value of the username*/
public static String GlobalUsername;
/* Below  function is used when the runmode is no in exxcel file */
@SuppressWarnings("unused")
public static void Execute(List<HashMap<String,String>> datamap) throws Exception{
		System.out.println("########################");
		System.out.println("1. BrowSer Opened");
		
		/*below code is used for hovering over the Signin and clicking on it */
		WebElement mouse = driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']"));	
		Actions builder = new Actions(driver);
		builder.moveToElement(mouse).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 5);
	
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='nav-flyout-ya-signin']/a/span")));
		driver.findElement(By.xpath(".//*[@id='nav-flyout-ya-signin']/a/span")).click();	
		System.out.println("2. User Clicked on Sign in");
		System.out.println("3.Login Page will open Up");
		WebDriverWait wait1 = new WebDriverWait(driver, 5);
		System.out.println("4.Entered the Email");	
		PageObjectFile.email.sendKeys(datamap.get(0).get("username"));
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		PageObjectFile.Continue.click();
		System.out.println("5.Entered the Password");
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		PageObjectFile.password.sendKeys(datamap.get(0).get("password"));	
		PageObjectFile.signin_button.click();
		System.out.println("6. Clicked Login");
		System.out.println("User Got Logged In");
	
		
	}
}

