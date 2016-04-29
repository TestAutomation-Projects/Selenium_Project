package airlines.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import airlines.utils.ElementIdentifier;

public class BookFlightPage {
	RemoteWebDriver driver;
public BookFlightPage(RemoteWebDriver driver2)
{	
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
}

public ElementIdentifier PassengerFirtName(int index)
{
	By sPassengerFirtName=By.xpath("//input[contains(@name,'passFirst')]");
	List<WebElement> elems=driver.findElements(sPassengerFirtName);
	return new ElementIdentifier(elems.get(index));
	
}

public ElementIdentifier PassengerLastName(int index)
{
	By sPassengerLastName=By.xpath("//input[contains(@name,'passLast')]");
	List<WebElement> elems=driver.findElements(sPassengerLastName);
	return new ElementIdentifier(elems.get(index));
	
}

public ElementIdentifier MealPerferences(int index)
{
	By sMealPerferences=By.xpath("//input[contains(@name,'meal')]");
	List<WebElement> elems=driver.findElements(sMealPerferences);
	return new ElementIdentifier(elems.get(index));
	
}

public ElementIdentifier CreditCardType()
{
	By sCreditCardType=By.xpath("//select[@name='creditCard']");	
	return new ElementIdentifier(driver.findElement(sCreditCardType));
}

public ElementIdentifier CreditCardNumber()
{
	By sCreditCardNumber=By.xpath("//input[@name='creditnumber']");	
	return new ElementIdentifier(driver.findElement(sCreditCardNumber));
}


public ElementIdentifier CreditCardExpMonth()
{
	By sCreditCardExpMonth=By.xpath("//select[@name='cc_exp_dt_mn']");	
	return new ElementIdentifier(driver.findElement(sCreditCardExpMonth));
}

@FindBy(how=How.XPATH, using="//select[@name='cc_exp_dt_yr']")
private WebElement dCreditCardExpYear;
public ElementIdentifier  CreditCardExpYear()
{
	return new ElementIdentifier(dCreditCardExpYear);
}


@FindBy(how=How.XPATH, using="//input[@name='cc_frst_name']")
private WebElement txtCreditCardFirtName;
public ElementIdentifier  CreditCardFirtName()
{
	return new ElementIdentifier(txtCreditCardFirtName);
}


@FindBy(how=How.XPATH, using="//input[@name='cc_mid_name']")
private WebElement txtCreditCardMiddleName;
public ElementIdentifier  CreditCardMiddleName()
{
	return new ElementIdentifier(txtCreditCardMiddleName);
}


@FindBy(how=How.XPATH, using="//input[@name='cc_last_name']")
private WebElement txtCreditCardLastName;
public ElementIdentifier CreditCardLastName()
{
	return new ElementIdentifier(txtCreditCardLastName);
}

@FindBy(how=How.XPATH, using="//input[@name='billAddress1']")
private WebElement txtBillingAddress1;
public ElementIdentifier BillingAddress1()
{
	return new ElementIdentifier(txtBillingAddress1);
}

@FindBy(how=How.XPATH, using="//input[@name='billAddress2']")
private WebElement txtBillingAddress2;
public ElementIdentifier BillingAddress2()
{
	return new ElementIdentifier(txtBillingAddress2);
}

@FindBy(how=How.XPATH, using="//input[@name='billCity']")
private WebElement txtBillingCity;

public ElementIdentifier BillingCity()
{
	return new ElementIdentifier(txtBillingCity);
}



@FindBy(how=How.XPATH, using="//input[@name='billState']")
private WebElement txtBillingState;
public ElementIdentifier BillingState()
{
	return new ElementIdentifier(txtBillingState);
}


@FindBy(how=How.XPATH, using="//input[@name='billZip']")
private WebElement txtBillingZip;
public ElementIdentifier BillingZip()
{
	return new ElementIdentifier(txtBillingZip);
}


@FindBy(how=How.XPATH, using="//select[@name='billCountry']")
private WebElement dBillingCountry;
public ElementIdentifier BillingCountry()
{
	return new ElementIdentifier(dBillingCountry);
}

@FindBy(how=How.XPATH, using="//input[@name='delAddress1']")
private WebElement txtDeliveryAddress1;
public ElementIdentifier DeliveryAddress1()
{
	return new ElementIdentifier(txtDeliveryAddress1);
}

@FindBy(how=How.XPATH, using="//input[@name='delAddress2']")
private WebElement txtDeliveryAddress2;
public ElementIdentifier DeliveryAddress2()
{
	return new ElementIdentifier(txtDeliveryAddress2);
}

@FindBy(how=How.XPATH, using="//input[@name='delCity']")
private WebElement txtDeliveryCity;
public ElementIdentifier DeliveryCity()
{
	return new ElementIdentifier(txtDeliveryCity);
}

@FindBy(how=How.XPATH, using="//input[@name='delState']")
private WebElement txtDeliveryState;
public ElementIdentifier DeliveryState()
{
	return new ElementIdentifier(txtDeliveryState);
}

@FindBy(how=How.XPATH, using="//input[@name='delZip']")
private WebElement txtDeliveryZip;
public ElementIdentifier DeliveryZip()
{
	return new ElementIdentifier(txtDeliveryZip);
}

@FindBy(how=How.XPATH, using="//select[@name='delCountry']")
private WebElement dDeliveryCountry;
public ElementIdentifier DeliveryCountry()
{
	return new ElementIdentifier(dDeliveryCountry);
}
@FindBy(how=How.XPATH, using="//input[@name='buyFlights']")
private WebElement btnSecurePurchase;
public ElementIdentifier SecurePurchase()
{
	return new ElementIdentifier(btnSecurePurchase);
}

public ElementIdentifier DepartItinerary(String sval)
{
	By sDepartItinerary=By.xpath("//font[contains(text(),'" + sval +"')]");	
	return new ElementIdentifier(driver.findElement(sDepartItinerary));
}
public ElementIdentifier ReturnItinerary(String sval)
{
	By sReturnItinerary=By.xpath("//font[contains(text(),'" + sval +"')]");	
	return new ElementIdentifier(driver.findElement(sReturnItinerary));
}

public ElementIdentifier DepartingAirline(String sval)
{
	By sDepartingAirline=By.xpath("//font[text()='" + sval +"']/following::tr[2]/td[1]/descendant::b");	
	return new ElementIdentifier(driver.findElement(sDepartingAirline));
}

public ElementIdentifier ReturningAirline(String sval)
{
	By sReturningAirline=By.xpath("//font[text()='" + sval +"']/following::tr[2]/td[1]/descendant::b");	
	return new ElementIdentifier(driver.findElement(sReturningAirline));
}
public ElementIdentifier DepartingClassType(String sval)
{
	By sDepartingClassType=By.xpath("//font[text()='" + sval +"']/following::tr[2]/td[2]/descendant::font");	
	return new ElementIdentifier(driver.findElement(sDepartingClassType));
}

public ElementIdentifier ReturningClassType(String sval)
{
	By sReturningClassType=By.xpath("//font[text()='" + sval +"']/following::tr[2]/td[2]/descendant::font");	
	return new ElementIdentifier(driver.findElement(sReturningClassType));
}

public ElementIdentifier DepartingAirlinePrice(String sval)
{
	By sDepartingAirlinePrice=By.xpath("//font[text()='" + sval +"']/following::tr[2]/td[3]/descendant::font");	
	return new ElementIdentifier(driver.findElement(sDepartingAirlinePrice));
}

public ElementIdentifier ReturningAirlinePrice(String sval)
{
	By sReturningAirlinePrice=By.xpath("//font[text()='" + sval +"']/following::tr[2]/td[3]/descendant::font");	
	return new ElementIdentifier(driver.findElement(sReturningAirlinePrice));
}

public ElementIdentifier PassgengerCount()
{
	By sPassgengerCount=By.xpath("//td[font[contains(text(),'Passengers:')]]/following-sibling::td/font");	
	return new ElementIdentifier(driver.findElement(sPassgengerCount));
}

public ElementIdentifier Tax()
{
	By sTax=By.xpath("//td[font[contains(text(),'Taxes:')]]/following-sibling::td/font");	
	return new ElementIdentifier(driver.findElement(sTax));
}

public ElementIdentifier TotalPrice()
{
	By sTotalPrice=By.xpath("//td[font[contains(text(),'Total Price (including taxes):')]]/following-sibling::td/font");	
	return new ElementIdentifier(driver.findElement(sTotalPrice));
}

}
