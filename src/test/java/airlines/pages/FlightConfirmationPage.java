package airlines.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import airlines.utils.BaseTest;

public class FlightConfirmationPage {
	RemoteWebDriver driver;
public FlightConfirmationPage(RemoteWebDriver driver)
{	
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
@FindBy(how=How.XPATH, using="//a[@href='mercurysignoff.php']")
private WebElement btnSignOff;

public void confirmFlight()
{
	btnSignOff.click();
}
}
