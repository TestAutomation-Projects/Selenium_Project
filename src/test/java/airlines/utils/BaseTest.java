package airlines.utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import org.openqa.selenium.WebElement;
public class BaseTest extends RemoteWebDriver implements IDriver {
	private RemoteWebDriver driver;
	
	public RemoteWebDriver getDriver()
	{
		return driver;
	}
	public  void  initDriver(String url,String browser,String platform,String deviceId) throws MalformedURLException
	  {
		  if(platform.equalsIgnoreCase("WINDOWS"))
		  {
		      this.driver= new RemoteWebDriver(new URL(url),getBrowserCapability(platform,browser,deviceId));
		  }
		  else if(platform.equalsIgnoreCase("ANDROID"))
		  {
			  this.driver= new AndroidDriver(new URL(url), getBrowserCapability(platform,browser,deviceId));

		  }
		  else if(platform.equalsIgnoreCase("IOS"))
		  {
			  this.driver=new IOSDriver(new URL(url), getBrowserCapability(platform,browser,deviceId));
		  }
		  
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
	public  DesiredCapabilities getBrowserCapability(String platform,String browserType,String deviceId)
	  {
		 if(platform.equalsIgnoreCase("WINDOWS"))
		 {
		  switch(browserType)
		  {
		  case "firefox":
			  System.out.println("Get firefox driver");
			  return DesiredCapabilities.firefox();
		  case "chrome":
			 System.setProperty("remotewebdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			  System.out.println("Get the chrome driver");
			  return DesiredCapabilities.chrome();
		  case "IE":
			  System.out.println("Get the IE driver");
			  return DesiredCapabilities.internetExplorer();
		  default:
			  return DesiredCapabilities.firefox();
		  }
		 }
		 else if(platform.equalsIgnoreCase("ANDROID"))
		 {
				DesiredCapabilities capabilities = new DesiredCapabilities();
				 switch(browserType)
				  {
				  case "chrome":
					  	capabilities.setCapability("BROWSER_NAME", "Chrome");
					  	break;
				  case "firefox":
					  	capabilities.setCapability("BROWSER_NAME", "firefox");
					  	break;
				  case "browser":
					  	capabilities.setCapability("BROWSER_NAME", "Browser");
					  	break;
				  default:
					  	capabilities.setCapability("BROWSER_NAME", "Browser");
					  	break;
				  }
			    capabilities.setCapability("CapabilityType.VERSION", "4.3");
				capabilities.setCapability("platformName","Android");
				capabilities.setCapability("deviceName",deviceId);

	            return capabilities;
	 
		 }
		return null;
	  }

}
