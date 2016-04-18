package airlines.helper;

import org.openqa.selenium.firefox.FirefoxDriver;
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
import airlines.utils.MyDriver;

public class LoginHelper {
MyDriver driver;
LoginPage loginpage;

public LoginHelper(MyDriver driver)
{
	this.driver=driver;
	loginpage=new LoginPage(driver);
}



public void Login() throws InterruptedException
{
	loginpage.gettxtUserName().sendKeys("mercury");
	loginpage.gettxtPassword().sendKeys("mercury");
     Thread.sleep(5000);
	loginpage.getLoginButton().click();
}


}
