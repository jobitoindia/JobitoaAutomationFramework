package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass() throws IOException {
		
		FileInputStream fis;
		fis=new FileInputStream("E:\\Java_Development\\Amazon\\amazonPrj\\config\\commonData.properties");
		prop=new Properties();
		prop.load(fis);
		
	}
	
	public void intialization() {
		
		String browserName=prop.getProperty("browerName");
		
		
		if(browserName.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Framework\\chromedriver_win32\\chromedriver.exe");  // set the broswer exe path
			driver=new ChromeDriver();
		}
		else if(browserName.contains("firefox")){
			System.setProperty("webdriver.firefix.driver", "D:\\Framework\\chromedriver_win32\\Firefoxdriver.exe");  // set the broswer exe path
			driver=new FirefoxDriver();
		}
		else if(browserName.contains("ie")){
			System.setProperty("webdriver.ie.driver", "D:\\Framework\\chromedriver_win32\\ie.exe");  // set the broswer exe path
			driver=new InternetExplorerDriver();
		}
		else if(browserName.contains("safari")){
			System.setProperty("webdriver.safari.driver", "D:\\Framework\\chromedriver_win32\\safari.exe");  // set the broswer exe path
			driver=new SafariDriver();
		}else {
			System.out.println("please give correct broswer name");
		}
		

		driver.get(prop.getProperty("baseUrl"));
		driver.manage().window().maximize();
		
		}
		
	}
	

