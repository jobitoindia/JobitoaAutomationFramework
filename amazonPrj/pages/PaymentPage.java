package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class PaymentPage extends BaseClass {
	
	public PaymentPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="emailOrPhone")
	WebElement mobNo;
	
	@FindBy(xpath="//input[@name='fullName']")
	WebElement fullName;
	
	

}
