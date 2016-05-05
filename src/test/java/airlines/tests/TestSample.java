package airlines.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.util.Date;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import airlines.helper.BookFlightHelper;
import airlines.helper.FlightFinderHelper;
import airlines.helper.LoginHelper;
import airlines.helper.SelectFlightHelper;
import airlines.pages.BookFlightPage;
import airlines.pages.FlightConfirmationPage;
import airlines.pages.FlightFinderPage;
import airlines.pages.LoginPage;
import airlines.pages.SelectFlightPage;
import airlines.utils.BaseTest;

public class TestSample {

	LoginHelper lh;
	FlightFinderHelper ffh;
	SelectFlightHelper sfh;
	BookFlightHelper bfh;
	RemoteWebDriver driver;
	@BeforeClass
	@Parameters({"host","port","platform","browserType","deviceId"})
	public void init(String host, String port, String platform, String browserType,@Optional String deviceId) throws MalformedURLException
	{
		System.out.println("init");
		String url="http://"+ host + ":" +   port + "/wd/hub";
		BaseTest b = new BaseTest();
		b.initDriver(url,browserType, platform,deviceId);
		this.driver=b.getDriver();
	    driver.get("http://newtours.demoaut.com");
	    lh=new LoginHelper(driver);
	    ffh=new FlightFinderHelper(driver);
	    sfh=new SelectFlightHelper(driver);
	    bfh=new BookFlightHelper(driver);
	    System.out.println("init completed");
	}

	
	@Test(priority=1)	
	
	public void BookFlight() throws InterruptedException
	{
		 System.out.println("bookflight started");
		 String sUserName="mercury";
		 String sPwd="mercury";
		 String FromCity="Frankfurt";
		 String ToCity="London";
		 String sTripType="Round Trip";
		 String sPassengers="3";
		 String sDepartFlight="Pangaea Airlines 362";
		 String sReturnFlight="Unified Airlines 633";
		 String DepartingItinerary=FromCity + " to " + ToCity ;
		 String ReturningItinerary=ToCity + " to " + FromCity;
		 String sDepartingDate="5/20/2016";
		 String sReturningDate="6/25/2016";
		 lh.Login(sUserName,sPwd);	
		
		ffh.findFlight(sTripType,sPassengers,FromCity,"May","20",ToCity,"June","25","BUSINESS");
		
		Thread.sleep(5000);
		
		sfh.verifyDepartingItinerary(DepartingItinerary);
		sfh.verifyReturningItinerary(ReturningItinerary);
		sfh.verifyDepartingDate(sDepartingDate);
		sfh.verifyReturningDate(sReturningDate);
		
		String sDepartFlightName=sfh.selectflightpage.DepartFlightName(sDepartFlight).getText().trim();
		String sDepartFlightPrice=sfh.selectflightpage.DepartFlightPrice(sDepartFlight).getText().trim();
		String sDepartFlightType=sfh.selectflightpage.DepartFlightType(sDepartFlight).getText().trim();
		String sDepartFlightTime=sfh.selectflightpage.DepartFlightTime(sDepartFlight).getText().trim();
		
		String sReturnFlightName=sfh.selectflightpage.ReturnFlightName(sReturnFlight).getText().trim();
		String sReturnFlightPrice=sfh.selectflightpage.ReturnFlightPrice(sReturnFlight).getText().trim();
		String sReturnFlightType=sfh.selectflightpage.ReturnFlightType(sReturnFlight).getText().trim();
		String sReturnFlightTime=sfh.selectflightpage.ReturnFlightTime(sReturnFlight).getText().trim();

		sfh.selectFlight(sDepartFlight,sReturnFlight);
		Thread.sleep(5000);
		
		bfh.verifyDepartingAirline(DepartingItinerary, sDepartFlightName);
		bfh.verifyDepartingAirlineClassType(DepartingItinerary, sDepartFlightType);
		bfh.verifyDepartingAirlinePrice(DepartingItinerary, sDepartFlightPrice);
		bfh.verifyDepartingDate(sDepartingDate);
		bfh.verifyDepartingItinerary(DepartingItinerary);
		
		bfh.verifyReturnAirline(ReturningItinerary, sReturnFlightName);
		bfh.verifyReturningAirlineClassType(ReturningItinerary, sReturnFlightType);
		bfh.verifyReturningAirlinePrice(ReturningItinerary,sReturnFlightPrice);
		bfh.verifyReturningDate(sReturningDate);
		bfh.verifyReturningItinerary(ReturningItinerary);
		
		bfh.bookFlight();
		System.out.println("bookflight ended");
	}
	
	@AfterMethod
	@AfterClass
	public void tearDown()
	{
		System.out.println("tearDown");
		driver.quit();
	}

}
