package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class RegistrationPage extends BaseClass {
	
	@FindBy(name="emailOrPhone")
	private WebElement mobNo;
	
	@FindBy(xpath="//input[@name='fullName']")
	private WebElement fullName;
	
	@FindBy(name="username")
	private WebElement uName;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(xpath = "//button[text()='Sign up']")
	private WebElement signUp;
	
	

	public RegistrationPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validatePageTitle() {
		return driver.getCurrentUrl().contains("emailsignup");	
	}
	
	public void fillUserDetails(String email,String fName,String un,String ps) {
		
		mobNo.sendKeys(email);
		fullName.sendKeys(fName);
		uName.sendKeys(un);
		pass.sendKeys(ps);
		signUp.click();
	}
}
