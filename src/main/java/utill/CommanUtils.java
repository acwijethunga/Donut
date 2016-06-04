package utill;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommanUtils {
	private WebDriver driver;
	private WebElement webElement;

	public CommanUtils(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void typeToTb(By element,String text){
		webElement = driver.findElement(element);
		webElement.clear();
		webElement.sendKeys(text);
		
	}
	public void click(By element){
		webElement = driver.findElement(element);
		webElement.click();
	}
	public void getUrl(String url){
		driver.get(url);
	}
	public void SwitchToPopup(){
		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window
		                                            // perform operations on popup

		//driver.switchTo().window(parentWindowHandler);  // switch back to parent window
	}

}
