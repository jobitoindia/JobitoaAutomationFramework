package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.RegistrationPage;

public class RegistrationTest extends BaseClass {


	RegistrationPage rp;
	
	public RegistrationTest() throws IOException {
		super();
	}
	
	@BeforeTest
	public void setup() throws IOException {
		intialization();
		rp=new RegistrationPage();
	}
	
	@Test
	public void pageNavigatino() {
		Assert.assertTrue(rp.validatePageTitle());
	} 
	
	@Test
	public void homePageNavigation() {
		
		rp.fillUserDetails(prop.getProperty("mobno"), prop.getProperty("fullname"), prop.getProperty("username"), prop.getProperty("password"));
	}
	
	

}
