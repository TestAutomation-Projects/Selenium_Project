package airlines.tests;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import airlines.helper.FlightFinderHelper;
import airlines.helper.LoginHelper;
import airlines.pages.BookFlightPage;
import airlines.pages.FlightConfirmationPage;
import airlines.pages.FlightFinderPage;
import airlines.pages.LoginPage;
import airlines.pages.SelectFlightPage;
import airlines.utils.MyDriver;

public class TestSample {

	LoginHelper lh;
	FlightFinderHelper ffh;
	MyDriver driver;
	@BeforeTest
	public void init()
	{
		System.out.println("init");
	    driver = new MyDriver(new FirefoxDriver());
	    driver.get("http://newtours.demoaut.com");
	    lh=new LoginHelper(driver);
	    ffh=new FlightFinderHelper(driver);
	}
	@Test
	public void BookFlight() throws InterruptedException
	{
		lh.Login();
		ffh.findFlight();
	}
	
	@AfterTest
	public void tearDown()
	{
		System.out.println("tearDown");
		driver.quit();
	}

}
