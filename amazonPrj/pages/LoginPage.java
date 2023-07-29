package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	WebElement userName,password,login;
	
	
	

}
