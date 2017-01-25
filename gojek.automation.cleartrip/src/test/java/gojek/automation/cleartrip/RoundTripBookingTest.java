package gojek.automation.cleartrip;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class RoundTripBookingTest extends UtilityFuntions{
	AndroidDriver driver;
	RoundTripBookingTest t= new RoundTripBookingTest();
	@BeforeTest
	public void AppLaunched(){
		t.LaunchApp(driver);
	}
	
	@Test
	public void bookRoundTrip(){
	
		
	}
	
	@AfterTest
	public void closeApp(){
		t.QuitSession(driver);
	}

}
