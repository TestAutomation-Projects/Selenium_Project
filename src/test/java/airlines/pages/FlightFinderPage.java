package airlines.pages;

import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import airlines.utils.ElementIdentifier;

public class FlightFinderPage {

	RemoteWebDriver driver;

By firstClass = By.xpath("//input[@name='servClass' and @value='First']");
By econClass =  By.xpath("//input[@name='servClass' and @value='Coach']");
By busClass = By.xpath("//input[@name='servClass' and @value='Business']");


By owTripType = By.xpath("//input[@name='tripType' and @value='oneway']");
By rdTripType = By.xpath("//input[@name='tripType' and @value='roundtrip']");

By Passengers = By.xpath("//select[@name='passCount']");
By dDepartingFrom = By.xpath("//select[@name='fromPort']");
By dFromMonth = By.xpath("//select[@name='fromMonth']");
By dFromDay = By.xpath("//select[@name='fromDay']");
By dArrivingIn = By.xpath("//select[@name='toPort']");
By dToMonth = By.xpath("//select[@name='toMonth']");
By dToDay = By.xpath("//select[@name='toDay']");

By dAirline = By.xpath("//select[@name='airline']");
By btnContinue = By.xpath("//input[@name='findFlights']");


public FlightFinderPage(RemoteWebDriver driver)
{	
	this.driver=driver;
	//PageFactory.initElements(driver, this);

}


public ElementIdentifier Passengers()
{
 return new ElementIdentifier(driver.findElement(Passengers));

}
public ElementIdentifier TripType(String type)
{
	if(type.equalsIgnoreCase("ONE WAY"))
	{
		return new ElementIdentifier(driver.findElement(owTripType));
	}
	else
	{
		return new ElementIdentifier(driver.findElement(rdTripType));
	}
	 
}

public ElementIdentifier DepartingFrom()
{
	return new ElementIdentifier(driver.findElement(dDepartingFrom));
}

public ElementIdentifier FromMonth()
{
	return new ElementIdentifier(driver.findElement(dFromMonth));
}

public ElementIdentifier FromDay()
{
	return new ElementIdentifier(driver.findElement(dFromDay));
}

public ElementIdentifier ArrivingIn()
{
	return new ElementIdentifier(driver.findElement(dArrivingIn));
}

public ElementIdentifier ToMonth()
{
	return new ElementIdentifier(driver.findElement(dToMonth));
}
public ElementIdentifier ToDay()
{
	return new ElementIdentifier(driver.findElement(dToDay));
}
public ElementIdentifier ServiceClass(String classType)
{
	switch(classType.toUpperCase())
	{
	case "ECONOMY":
		return new ElementIdentifier(driver.findElement(econClass));
		
	case "BUSINESS":
		return new ElementIdentifier(driver.findElement(busClass));		
	case "FIRST":
		return new ElementIdentifier(driver.findElement(firstClass));		
	}
	return null;
	
}
public ElementIdentifier Airline()
{
	return new ElementIdentifier(driver.findElement(dAirline));
}
public ElementIdentifier btnContinue()
{
	return new ElementIdentifier(driver.findElement(btnContinue));
}






}
