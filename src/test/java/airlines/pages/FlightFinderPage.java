package airlines.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import airlines.utils.ElementIdentifier;

public class FlightFinderPage {

WebDriver driver;

@FindBy(how=How.XPATH, using="//input[@name='tripType']")
private WebElement rdTripType;

@FindBy(how=How.XPATH, using="//select[@name='passCount']")
private WebElement dPassengers;

@FindBy(how=How.XPATH, using="//select[@name='fromPort']")
private WebElement dDepartingFrom;

@FindBy(how=How.XPATH, using="//select[@name='fromMonth']")
private WebElement dFromMonth;

@FindBy(how=How.XPATH, using="//select[@name='fromDay']")
private WebElement dFromDay;


@FindBy(how=How.XPATH, using="//select[@name='toPort']")
private WebElement dArrivingIn;

@FindBy(how=How.XPATH, using="//select[@name='toMonth']")
private WebElement dToMonth;

@FindBy(how=How.XPATH, using="//select[@name='toDay']")
private WebElement dToDay;


@FindBy(how=How.XPATH, using="//input[@name='servClass']")
private WebElement rdServiceClass;

@FindBy(how=How.XPATH, using="//select[@name='airline']")
private WebElement dAirline;

@FindBy(how=How.XPATH, using="//input[@name='findFlights']")
private WebElement btnContinue;

public FlightFinderPage(WebDriver driver)
{	
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void searchFlight()
{
	btnContinue.click();
}



}
