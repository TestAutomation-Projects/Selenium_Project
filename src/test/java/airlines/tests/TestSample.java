package airlines.tests;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import airlines.helper.FlightFinderHelper;
import airlines.helper.LoginHelper;
import airlines.helper.SelectFlightHelper;
import airlines.pages.BookFlightPage;
import airlines.pages.FlightConfirmationPage;
import airlines.pages.FlightFinderPage;
import airlines.pages.LoginPage;
import airlines.pages.SelectFlightPage;
import airlines.utils.MyDriver;

public class TestSample {

	LoginHelper lh;
	FlightFinderHelper ffh;
	SelectFlightHelper sfh;
	MyDriver driver;
	@BeforeSuite
	public void init()
	{
		System.out.println("init");
	    driver = new MyDriver(new FirefoxDriver());
	    driver.get("http://newtours.demoaut.com");
	    lh=new LoginHelper(driver);
	    ffh=new FlightFinderHelper(driver);
	    sfh=new SelectFlightHelper(driver);
	    System.out.println("init completed");
	}
	@Test
	public void BookFlight() throws InterruptedException
	{
		 System.out.println("bookflight started");
		lh.Login("mercury","mercury");		
		ffh.findFlight("Round Trip","3","Frankfurt","May","20","London","June","25","BUSINESS");
		Thread.sleep(5000);
		sfh.selectFlight("Pangaea Airlines 362","Unified Airlines 633");
		Thread.sleep(5000);
		System.out.println("bookflight ended");
	}
	
	@AfterSuite
	public void tearDown()
	{
		System.out.println("tearDown");
		driver.quit();
	}

}
