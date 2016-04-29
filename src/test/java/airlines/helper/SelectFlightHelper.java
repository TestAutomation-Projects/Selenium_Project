package airlines.helper;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
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

public class SelectFlightHelper {
	RemoteWebDriver driver;
public SelectFlightPage selectflightpage;

public SelectFlightHelper(RemoteWebDriver driver2)
{
	this.driver=driver2;
	selectflightpage=new SelectFlightPage(driver2);
}



public void verifyDepartingDate(String date)
{
	String actValue=selectflightpage.DepartingDate().getText();
	Assert.assertTrue(actValue.equalsIgnoreCase(date), "Departing Date mismatch");
}
public void verifyReturningDate(String date)
{
	String actValue=selectflightpage.ReturningDate().getText();
	Assert.assertTrue(actValue.equalsIgnoreCase(date), "Returning Date mismatch");
}

public void verifyDepartingItinerary(String sItinerary)
{
	String actValue=selectflightpage.DepartingItinerary().getText();
	Assert.assertTrue(actValue.equalsIgnoreCase(sItinerary), "Departing Itinerary mismatch");
}

public void verifyReturningItinerary(String sItinerary)
{
	String actValue=selectflightpage.ReturningItinerary().getText();
	Assert.assertTrue(actValue.equalsIgnoreCase(sItinerary), "Returning Itinerary mismatch");
}

public void selectFlight(String sDepartFlight,String sReturnFlight) throws InterruptedException
{
	selectflightpage.DepartFlight(sDepartFlight).click();
	Thread.sleep(5000);
	selectflightpage.ReturnFlight(sReturnFlight).click();
	Thread.sleep(5000);
	selectflightpage.Continue().click();
	Thread.sleep(5000);
}


}
