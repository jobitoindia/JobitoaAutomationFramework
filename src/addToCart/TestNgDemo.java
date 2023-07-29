package addToCart;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class TestNgDemo {
		
		@BeforeSuite
		public void Bsuite() {
			System.out.println("Before Suite");
		}
		
		@AfterSuite
		public void Asuite() {
			System.out.println("after Suite");
		}
		
		@BeforeTest
		public void BTest() {
			System.out.println("Before Test");
		}
		
		@AfterTest
		public void ATest() {
			System.out.println("after test");
		}
		
		@BeforeClass
		public void Bclass() {
			System.out.println("Before class");
		}
		
		@AfterClass
		public void AClass() {
			System.out.println("after class");
		}
		
		@BeforeMethod
		public void BMethod() {
			System.out.println("Before method");
		}
		
		@AfterMethod
		public void Amethod() {
			System.out.println("after method");
		}
		
		@Test( )
		public void TestCase() {
			System.out.println("i am test case");
		}
		
		
	}



