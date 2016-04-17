package airlines.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import airlines.utils.ElementIdentifier;

public class LoginPage {
	private  WebDriver driver = null;
@FindBy(how=How.XPATH, using="//input[@name='userName']")
private WebElement txtUserName;

@FindBy(how=How.XPATH, using="//input[@name='password']")
private WebElement txtPassword;

@FindBy(how=How.XPATH, using="//input[@name='login']")
private WebElement btnLogin;

public LoginPage(WebDriver driver)
{	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void EnterUserName(String username)
{
	txtUserName.sendKeys(username);
}
public void EnterPassword(String pwd)
{
	txtPassword.sendKeys(pwd);	
}

public void login(String username, String pwd)throws InterruptedException
{
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	txtUserName.sendKeys(username);
	txtPassword.sendKeys(pwd);
	txtPassword.click();
	
	Thread.sleep(10000);
	btnLogin.click();
	Thread.sleep(10000);
}
public void login(String username, String pwd,boolean bError) throws InterruptedException
{
	txtUserName.sendKeys(username);
	txtPassword.sendKeys(pwd);
	btnLogin.click();
	Thread.sleep(10000);
}



}
