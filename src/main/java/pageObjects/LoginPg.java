package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPg {
	 public WebDriver driver;
	   

	 public LoginPg(WebDriver driver) {
			// TODO Auto-generated constructor stu
	        this.driver = driver;
	    }
	 public By userName=By.xpath(".//*[@id='ffp_username']");
	 public By password=By.xpath(".//*[@id='ffp_password']");
	 public By login=By.xpath(".//*[@id='btnffpmodal']");
	 public By login2=By.xpath(".//*[@id='logIn']");
}
