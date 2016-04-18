package airlines.utils;

import org.openqa.selenium.WebElement;

public interface IOperations extends WebElement{

	public void selectByValue(String value);
	public void selectByText(String text);
	public void set(String text);
	public void selectByIndex(int value);
	
}
