package airlines.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import airlines.utils.ElementIdentifier;

public class LoginPage {
	private  RemoteWebDriver driver = null;

By UserName = By.xpath("//input[@name='userName']");
By Password = By.xpath("//input[@name='password']");
By Login = By.xpath("//input[@name='login']");
ElementIdentifier txtUserName;
ElementIdentifier txtPassword;
ElementIdentifier btnLogin;
public LoginPage(RemoteWebDriver driver)
{	this.driver=driver;
}
public ElementIdentifier gettxtUserName()
{
	return new ElementIdentifier(driver.findElement(UserName));
}
public ElementIdentifier gettxtPassword()
{
	return new ElementIdentifier(driver.findElement(Password));
}
public ElementIdentifier getLoginButton()
{
	return new ElementIdentifier(driver.findElement(Login));
}





}
