package airlines.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BookFlightPage {
	WebDriver driver;
public BookFlightPage(WebDriver driver)
{	
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(how=How.XPATH, using="//input[contains(@name,'passFirst')]")
private List<WebElement> txtPassengersFirtNames;

@FindBy(how=How.XPATH, using="//input[contains(@name,'passLast')]")
private List<WebElement> txtPassengersLastNames;

@FindBy(how=How.XPATH, using="//select[contains(@name,'pass')]")
private List<WebElement> dMealPerferences;

@FindBy(how=How.XPATH, using="//select[@name='creditCard']")
private WebElement dCreditCardType;


@FindBy(how=How.XPATH, using="//input[@name='creditnumber']")
private WebElement txtCreditCardNumber;

@FindBy(how=How.XPATH, using="//select[@name='cc_exp_dt_mn']")
private WebElement dCreditCardExpMonth;

@FindBy(how=How.XPATH, using="//select[@name='cc_exp_dt_yr']")
private WebElement dCreditCardExpYear;

@FindBy(how=How.XPATH, using="//input[@name='cc_frst_name']")
private WebElement txtCreditCardFirtName;


@FindBy(how=How.XPATH, using="//input[@name='cc_mid_name']")
private WebElement txtCreditCardMiddleName;


@FindBy(how=How.XPATH, using="//input[@name='cc_last_name']")
private WebElement txtCreditCardLastName;

@FindBy(how=How.XPATH, using="//input[@name='billAddress1']")
private WebElement txtBillingAddress1;

@FindBy(how=How.XPATH, using="//input[@name='billAddress2']")
private WebElement txtBillingAddress2;

@FindBy(how=How.XPATH, using="//input[@name='billCity']")
private WebElement txtBillingCity;


@FindBy(how=How.XPATH, using="//input[@name='billState']")
private WebElement txtBillingState;


@FindBy(how=How.XPATH, using="//input[@name='billZip']")
private WebElement txtBillingZip;


@FindBy(how=How.XPATH, using="//select[@name='billCountry']")
private WebElement dBillingCountry;

@FindBy(how=How.XPATH, using="//input[@name='delAddress1']")
private WebElement txtDeliveryAddress1;

@FindBy(how=How.XPATH, using="//input[@name='delAddress2']")
private WebElement txtDeliveryAddress2;

@FindBy(how=How.XPATH, using="//input[@name='delCity']")
private WebElement txtDeliveryCity;


@FindBy(how=How.XPATH, using="//input[@name='delState']")
private WebElement txtDeliveryState;


@FindBy(how=How.XPATH, using="//input[@name='delZip']")
private WebElement txtDeliveryZip;


@FindBy(how=How.XPATH, using="//select[@name='delCountry']")
private WebElement dDeliveryCountry;

@FindBy(how=How.XPATH, using="//input[@name='buyFlights']")
private WebElement btnSecurePurchase;


public void bookFlight()
{
	btnSecurePurchase.click();
}
}
