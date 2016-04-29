package airlines.helper;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import airlines.pages.BookFlightPage;
import airlines.pages.FlightFinderPage;

public class BookFlightHelper {
	RemoteWebDriver driver;
	BookFlightPage bookflightpage;

	public BookFlightHelper(RemoteWebDriver driver2)
	{
		this.driver=driver2;
		bookflightpage=new BookFlightPage(driver2);
	}
	
	public void verifyPassgengerCount(String val)
	{
		Assert.assertTrue(val.equalsIgnoreCase(bookflightpage.PassgengerCount().getText()), "Passenger mismatch");
	}
	
	public void verifyDepartingItinerary(String val)
	{
		Assert.assertTrue(val.equalsIgnoreCase(bookflightpage.DepartItinerary(val).getText()), "DepartItinerary mismatch");

	}
	public void verifyReturningItinerary(String val)
	{
		Assert.assertTrue(val.equalsIgnoreCase(bookflightpage.ReturnItinerary(val).getText()), "ReturnItinerary mismatch");

	}
	
	
	public void verifyReturnAirline(String sItinerary,String val)
	{
		Assert.assertTrue(val.equalsIgnoreCase(bookflightpage.ReturningAirline(sItinerary).getText()), "ReturningAirline mismatch");

	}
	public void verifyDepartingAirline(String sItinerary,String val)
	{
		Assert.assertTrue(val.equalsIgnoreCase(bookflightpage.DepartingAirline(sItinerary).getText()), "DepartingAirline mismatch");

	}
	
	public void verifyDepartingDate(String val)
	{
			//
	}
	
	public void verifyReturningDate(String val)
	{
	//	Assert.assertTrue(val.equalsIgnoreCase(bookflightpage.DepartingAirline(val).getText()), "DepartingAirline mismatch");

	}
	public void verifyDepartingAirlineClassType(String sItinerary,String val)
	{
		Assert.assertTrue(val.equalsIgnoreCase(bookflightpage.DepartingClassType(sItinerary).getText()), "DepartingClassType mismatch");

	}
	public void verifyReturningAirlineClassType(String sItinerary,String val)
	{
		Assert.assertTrue(val.equalsIgnoreCase(bookflightpage.ReturningClassType(sItinerary).getText()), "ReturningClassType mismatch");

	}
	
	public void verifyDepartingAirlinePrice(String sItinerary,String val)
	{
		Assert.assertTrue(val.equalsIgnoreCase(bookflightpage.DepartingAirlinePrice(sItinerary).getText()), "DepartingAirlinePrice mismatch");

	}
	public void verifyReturningAirlinePrice(String sItinerary,String val)
	{
		Assert.assertTrue(val.equalsIgnoreCase(bookflightpage.ReturningAirlinePrice(sItinerary).getText()), "ReturningAirlinePrice mismatch");

	}
	
	public void bookFlight() throws InterruptedException
	{
		Thread.sleep(5000);
		bookflightpage.SecurePurchase().click();

		Thread.sleep(5000);
	}
}
