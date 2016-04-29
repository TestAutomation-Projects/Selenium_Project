package airlines.helper;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import airlines.pages.BookFlightPage;
import airlines.pages.FlightConfirmationPage;
import airlines.pages.FlightFinderPage;
import airlines.pages.LoginPage;
import airlines.pages.SelectFlightPage;

public class LoginHelper {
	RemoteWebDriver driver;
LoginPage loginpage;

public LoginHelper(RemoteWebDriver driver2)
{
	this.driver=driver2;
	loginpage=new LoginPage(driver2);
}



public void Login(String username,String password) throws InterruptedException
{
	loginpage.gettxtUserName().sendKeys(username);
	loginpage.gettxtPassword().sendKeys(password);
     Thread.sleep(5000);
	loginpage.getLoginButton().click();
}


}
