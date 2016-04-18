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

public class FlightFinderHelper {
MyDriver driver;
FlightFinderPage flightfinderpage;

public FlightFinderHelper(MyDriver driver)
{
	this.driver=driver;
	flightfinderpage=new FlightFinderPage(driver);
}



public void findFlight() throws InterruptedException
{
	flightfinderpage.TripType("One Way").click();
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


}
