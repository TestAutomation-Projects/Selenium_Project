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
	    System.out.println("init completed");
	}
	@Test
	public void BookFlight() throws InterruptedException
	{
		 System.out.println("bookflight started");
		lh.Login();
		ffh.findFlight();
		System.out.println("bookflight ended");
	}
	
	@AfterTest
	public void tearDown()
	{
		System.out.println("tearDown");
		driver.quit();
	}

}
