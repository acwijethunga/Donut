package utill;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.LoginPg;

public class BaseClass {
	public static WebDriver driver;
	public static CommanUtils commonUtil;
	public static LoginPg loginPg;
	
	@BeforeClass
	public static void setUp(){
		driver = new FirefoxDriver();
		commonUtil = new CommanUtils(driver);
		loginPg = new LoginPg(driver);
		
	}

}
