package airlines.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import airlines.utils.MyDriver;

public class SelectFlightPage {
	MyDriver driver;
@FindBy(how=How.XPATH, using="//input[@name='outFlight']")
private WebElement dDepartAirline;

@FindBy(how=How.XPATH, using="//input[@name='inFlight']")
private WebElement dReturnAirline;

@FindBy(how=How.XPATH, using="//input[@name='reserveFlights']")
private WebElement btnContinue;

public SelectFlightPage(MyDriver driver)
{	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void selectFlight()
{
	btnContinue.click();
}
}
