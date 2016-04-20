package airlines.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import airlines.utils.ElementIdentifier;
import airlines.utils.MyDriver;

public class SelectFlightPage {
MyDriver driver;



public SelectFlightPage(MyDriver driver)
{	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public ElementIdentifier DepartFlight(String flightName)
{
	By sDepartFlight = By.xpath("//font[text()='DEPART']/following::b[contains(text(),'" + flightName + "')]/preceding::input[@name='outFlight'][1]");
	return new ElementIdentifier(driver.findElement(sDepartFlight));
	
}

public ElementIdentifier DepartFlightName(String flightName)
{
	By sDepartFlightName = By.xpath("//input[@name='outFlight'][1]/following::b[contains(text(),'" + flightName + "')]");
	return new ElementIdentifier(driver.findElement(sDepartFlightName));
	
}
public ElementIdentifier DepartFlightTime(String flightName)
{
	By sDepartFlightTime = By.xpath("//input[@name='outFlight'][1]/following::b[contains(text(),'" + flightName + "')]/following::td[1]/font");
	return new ElementIdentifier(driver.findElement(sDepartFlightTime));
	
}
public ElementIdentifier DepartFlightType(String flightName)
{
	By sDepartFlightType = By.xpath("//input[@name='outFlight'][1]/following::b[contains(text(),'" + flightName + "')]/following::td[2]/font");
	return new ElementIdentifier(driver.findElement(sDepartFlightType));
	
}
public ElementIdentifier DepartFlightPrice(String flightName)
{
	By sDepartFlightPrice = By.xpath("//input[@name='outFlight'][1]/following::b[contains(text(),'" + flightName + "')]/following::tr[1]/td/font/font/b");
	return new ElementIdentifier(driver.findElement(sDepartFlightPrice));
	
}
public ElementIdentifier ReturnFlight(String flightName)
{
	By sDepartFlight = By.xpath("//font[text()='RETURN']/following::b[contains(text(),'" + flightName + "')]/preceding::input[@name='inFlight'][1]");
	return new ElementIdentifier(driver.findElement(sDepartFlight));
	
}
public ElementIdentifier ReturnFlightName(String flightName)
{
	By sReturnFlightName = By.xpath("//input[@name='inFlight'][1]/following::b[contains(text(),'" + flightName + "')]");
	return new ElementIdentifier(driver.findElement(sReturnFlightName));
	
}

public ElementIdentifier ReturnFlightTime(String flightName)
{
	By sReturnFlightTime = By.xpath("//input[@name='inFlight'][1]/following::b[contains(text(),'" + flightName + "')]/following::td[1]/font");
	return new ElementIdentifier(driver.findElement(sReturnFlightTime));
	
}
public ElementIdentifier ReturnFlightType(String flightName)
{
	By sReturnFlightType = By.xpath("//input[@name='inFlight'][1]/following::b[contains(text(),'" + flightName + "')]/following::td[2]/font");
	return new ElementIdentifier(driver.findElement(sReturnFlightType));
	
}
public ElementIdentifier ReturnFlightPrice(String flightName)
{
	By sReturnFlightPrice = By.xpath("//input[@name='inFlight'][1]/following::b[contains(text(),'" + flightName + "')]/following::tr[1]/td/font/font/b");
	return new ElementIdentifier(driver.findElement(sReturnFlightPrice));
	
}

public ElementIdentifier Continue()
{
	By sContinue = By.xpath("//input[@name='reserveFlights']");
	return new ElementIdentifier(driver.findElement(sContinue));
}
}
