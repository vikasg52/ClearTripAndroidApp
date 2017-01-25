package gojek.automation.cleartrip;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class RoundTripBookingTest {
	AndroidDriver driver;
	UtilityFuntions wd = new UtilityFuntions();
	TestObjects TO= new TestObjects();
	
	@BeforeTest
	public void AppLaunched(){
		wd.LaunchApp(driver);
	}
	
	@Test
	public void bookRoundTrip(){
	//select travel option
		wd.tap(driver,TO.AllowLocation);
		wd.WaitForDisplay(driver, TO.selectTravel);
		wd.tap(driver, TO.selectTravel);
		wd.tap(driver,TO.AllowLocation);
		wd.tap(driver,TO.RounTripRadiobtn);
		wd.tap(driver, TO.Fromcity);
		wd.tap(driver, TO.Tocity);
		wd.tap(driver, TO.searchCity);
		wd.type(driver, TO.searchCity, "Delhi");
			
	}
	
	@AfterTest
	public void closeApp(){
		wd.QuitSession(driver);
	}

}
