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

public class FlightFinderHelper {
	RemoteWebDriver driver;
FlightFinderPage flightfinderpage;

public FlightFinderHelper(RemoteWebDriver driver2)
{
	this.driver=driver2;
	flightfinderpage=new FlightFinderPage(driver2);
}



public void findFlight() throws InterruptedException
{
	flightfinderpage.TripType("Round Trip").click();
	flightfinderpage.Passengers().selectByValue("3");
	flightfinderpage.DepartingFrom().selectByValue("Frankfurt");
	flightfinderpage.FromMonth().selectByText("May");
	flightfinderpage.FromDay().selectByValue("20");
	flightfinderpage.ArrivingIn().selectByValue("London");
	flightfinderpage.ToMonth().selectByText("June");
	flightfinderpage.ToDay().selectByValue("25");
	flightfinderpage.ServiceClass("BUSINESS").click();
	Thread.sleep(5000);
	flightfinderpage.btnContinue().click();
	Thread.sleep(5000);
	
}

public void findFlight(String sTripType,String iPassengers,String sDepartingFrom,String sFromMonth,String sFromDay,String sReturnTo, String sToMonth,String sToDay,String sServiceClass) throws InterruptedException
{
	flightfinderpage.TripType(sTripType).click();
	flightfinderpage.Passengers().selectByValue(iPassengers);
	flightfinderpage.DepartingFrom().selectByValue(sDepartingFrom);
	flightfinderpage.FromMonth().selectByText(sFromMonth);
	flightfinderpage.FromDay().selectByValue(sFromDay);
	flightfinderpage.ArrivingIn().selectByValue(sReturnTo);
	flightfinderpage.ToMonth().selectByText(sToMonth);
	flightfinderpage.ToDay().selectByValue(sToDay);
	flightfinderpage.ServiceClass(sServiceClass).click();
	Thread.sleep(5000);
	flightfinderpage.btnContinue().click();
	Thread.sleep(5000);
	
}


}
