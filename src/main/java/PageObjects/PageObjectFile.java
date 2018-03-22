package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class PageObjectFile extends BaseClass{
	public PageObjectFile(WebDriver driver){
		super(driver);
	}    
	@FindBy(how=How.XPATH, using=" //*[@id='nav-flyout-ya-signin']/a/span")
	public static WebElement sigin_in;
	@FindBy(how=How.XPATH, using="//*[@id='ap_email']")
	public static WebElement email;
	@FindBy(how=How.XPATH, using="//*[@id='ap_password']")
	public static WebElement password;
	@FindBy(how=How.XPATH, using="//*[@id='signInSubmit']")
	public static WebElement signin_button;
	@FindBy(how=How.XPATH, using="//*[@id='continue']")
	public static WebElement Continue;
	@FindBy(how=How.XPATH, using="//input[@id='twotabsearchtextbox']")
	public static WebElement search;
	@FindBy(how=How.XPATH, using="//div[@class='nav-search-submit nav-sprite']//input[@type='submit']")
	public static WebElement search1;
	@FindBy(how=How.XPATH, using="//h2[@data-attribute='Sony PS4 500 GB Slim Console (Free Games: Horizon Zero Dawn, Ratchet and Clank and Driveclub)']")
	public static WebElement search2;
	@FindBy(how=How.XPATH, using="//input[@id='add-to-cart-button']")
	public static WebElement item;
	@FindBy(how=How.XPATH, using="//a[@id='nav-cart']")
	public static WebElement cart;
	@FindBy(how=How.XPATH, using="//input[@name='proceedToCheckout']")
	public static WebElement check;
	@FindBy(how=How.XPATH, using="/html/body/div[1]/header/div/div[1]/div[4]/div[6]/div[3]/a[1]/span")
	public static WebElement yes;
	@FindBy(how=How.XPATH, using="	//a[@id='nav-link-yourAccount']//span[@class='nav-line-2']")
	public static WebElement account1;
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div[1]/header/div/div[1]/div[4]/div[6]/div[2]/a[1]/span")
	public static WebElement account2;
	}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
