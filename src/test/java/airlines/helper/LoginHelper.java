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

public class LoginHelper {
FirefoxDriver driver;
LoginPage loginpage;
FlightFinderPage flightfinderpage;
BookFlightPage bookflightpage;
FlightConfirmationPage flightconfirmationpage;
SelectFlightPage selectflightpage;

@BeforeTest
public void init()
{
	System.out.println("init");
    driver = new FirefoxDriver();
    driver.get("http://newtours.demoaut.com");
    flightfinderpage=new FlightFinderPage(driver);
    loginpage=new LoginPage(driver);
    bookflightpage=new BookFlightPage(driver);
    flightconfirmationpage=new FlightConfirmationPage(driver);
    selectflightpage=new SelectFlightPage(driver);
}

@Test
public void testLogin() throws InterruptedException
{
	System.out.println("testLogin");
	loginpage.login("mercury", "mercury");
	Thread.sleep(5000);
	flightfinderpage.searchFlight();
	Thread.sleep(5000);
	selectflightpage.selectFlight();

	Thread.sleep(5000);
	bookflightpage.bookFlight();
	Thread.sleep(5000);
	flightconfirmationpage.confirmFlight();
	
}

@AfterTest
public void tearDown()
{
	System.out.println("tearDown");
	driver.quit();
}

}
