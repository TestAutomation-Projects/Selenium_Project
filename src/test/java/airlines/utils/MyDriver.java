package airlines.utils;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;

public class MyDriver implements IDriver {

	WebDriver driver;
	public MyDriver(WebDriver driver)
	{
		this.driver=driver;
	}
	public void close() {
		// TODO Auto-generated method stub
		driver.close();
	}

	public WebElement findElement(By arg0) {
		// TODO Auto-generated method stub
		return  driver.findElement(arg0);
	}

	public List<WebElement> findElements(By arg0) {
		// TODO Auto-generated method stub
		return driver.findElements(arg0);
	}

	public void get(String arg0) {
		// TODO Auto-generated method stub
		driver.get(arg0);
	}

	public String getCurrentUrl() {
		// TODO Auto-generated method stub
		return driver.getCurrentUrl();
	}

	public String getPageSource() {
		// TODO Auto-generated method stub
		return driver.getPageSource();
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}

	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return driver.getWindowHandle();
	}

	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return driver.getWindowHandles();
	}

	public Options manage() {
		// TODO Auto-generated method stub
		return driver.manage();
	}

	public Navigation navigate() {
		// TODO Auto-generated method stub
		return driver.navigate();
	}

	public void quit() {
		// TODO Auto-generated method stub
		driver.quit();
	}

	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return driver.switchTo();
	}

}
