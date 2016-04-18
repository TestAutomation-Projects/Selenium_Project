package airlines.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementIdentifier implements IOperations {
	
	WebElement elem;
	List<WebElement> elems;

	
	public ElementIdentifier(WebElement elem) {
		// TODO Auto-generated constructor stub
		this.elem=elem;
	}
	public ElementIdentifier(List<WebElement> elems) {
		// TODO Auto-generated constructor stub
		this.elems=elems;
	}
	public void selectByValue(String value) {
		// TODO Auto-generated method stub
		Select select= new Select(elem);
		select.selectByValue(value);
		
		
	}
	public void selectByText(String text) {
		// TODO Auto-generated method stub
		Select select= new Select(elem);
		select.selectByVisibleText(text);
		
		
	}
	public void selectByIndex(int value) {
		// TODO Auto-generated method stub
		Select select= new Select(elem);
		select.selectByIndex(value);
		
		
	}
	
	public void clear() {
		// TODO Auto-generated method stub
		elem.clear();
	}
	public void click() {
		elem.click();
		// TODO Auto-generated method stub
		
	}
	public WebElement findElement(By arg0) {
		// TODO Auto-generated method stub
		return elem.findElement(arg0);
	}
	public List<WebElement> findElements(By arg0) {
		// TODO Auto-generated method stub
		return elem.findElements(arg0);
	}
	public String getAttribute(String arg0) {
		// TODO Auto-generated method stub
		return elem.getAttribute(arg0);
	}
	public String getCssValue(String arg0) {
		// TODO Auto-generated method stub
		return elem.getCssValue(arg0);
	}
	public Point getLocation() {
		// TODO Auto-generated method stub
		return elem.getLocation();
	}
	public Rectangle getRect() {
		// TODO Auto-generated method stub
		return elem.getRect();
	}
	public Dimension getSize() {
		// TODO Auto-generated method stub
		return elem.getSize();
	}
	public String getTagName() {
		// TODO Auto-generated method stub
		return elem.getTagName();
	}
	public String getText() {
		// TODO Auto-generated method stub
		return elem.getText();
	}
	public boolean isDisplayed() {
		// TODO Auto-generated method stub
		return elem.isDisplayed();
	}
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return elem.isEnabled();
	}
	public boolean isSelected() {
		// TODO Auto-generated method stub
		return elem.isSelected();
	}
	public void sendKeys(CharSequence... arg0) {
		// TODO Auto-generated method stub
		elem.sendKeys(arg0);
	}
	public void submit() {
		// TODO Auto-generated method stub
		elem.submit();
	}
	public <X> X getScreenshotAs(OutputType<X> arg0) throws WebDriverException {
		// TODO Auto-generated method stub
		elem.getScreenshotAs(arg0);
		return null;
	}
	public void set(String text) {
		// TODO Auto-generated method stub
		
	}


}
