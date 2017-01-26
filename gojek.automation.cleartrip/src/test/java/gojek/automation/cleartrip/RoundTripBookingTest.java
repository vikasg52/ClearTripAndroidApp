package gojek.automation.cleartrip;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.android.AndroidDriver;

public class RoundTripBookingTest {
	AndroidDriver driver;
	UtilityFuntions wd = new UtilityFuntions();
	TestObjects test= new TestObjects();
	
	@BeforeTest
	public void AppLaunched(){
		driver=wd.driver(driver);
		wd.LaunchApp();
	}
	
	@Test
	public void bookRoundTrip() throws InterruptedException{
		System.out.println("Test Started.....");
		
		wd.WaitForDisplay(test.AllowLocation);
		wd.tap(test.AllowLocation);
		wd.WaitForDisplay(test.selectTravel);
		wd.tap(test.selectTravel);
		wd.tap(test.RounTripRadiobtn);
		wd.tap(test.Fromcity);
		wd.tap(test.searchCity);
		wd.type(test.searchCity,"Delhi");
		wd.tap(test.citySelectedDel);
		wd.WaitForDisplay(test.Tocity);
		wd.tap(test.Tocity);
		wd.tap(test.searchCity);
		wd.type(test.searchCity, "Bangalore");
		wd.tap(test.citySelectedBlr);
		wd.WaitForDisplay(test.tapDatefrom);
		wd.tap(test.tapDatefrom);
		wd.tap(test.chooseDepartDate);
		wd.tap(test.chooseReturnDate);
		wd.tap(test.TapTravelClass);
		wd.tap(test.ChooseTravelClass);
		wd.swipeUpElement(test.Scrollup, 2000);
		//search the flight based on above parameters
		wd.tap(test.ClickSearchFlight);
		wd.WaitForDisplay(test.bookFlight);
		// select Flights to and from
		wd.SelectOption(test.selectToFlight);
		wd.SelectOption(test.selectReturnFlight);
		
		//book flight
		wd.tap(test.bookFlight);
		// Review flights
		wd.WaitForDisplay(test.veriFyFlightFrom);
		wd.WaitForDisplay(test.veriFyFlightto);
		if(wd.isenabled(test.ScrollupContinue)){
		wd.swipeUpElement(test.ScrollupContinue, 5000);
		wd.swipeUpElement(test.ScrollupContinue, 5000);
		wd.swipeUpElement(test.ScrollupContinue, 5000);
		wd.WaitForDisplay(test.ContinueBooking);
		wd.tap(test.ContinueBooking);
		//Fill Traveller details
		wd.WaitForDisplay(test.Details);
		wd.tap(test.Title);
		wd.type(test.Fname, "vikas");
		wd.type(test.lname, "garg");
		wd.type(test.mobile, "9560684096");
		wd.type(test.Email, "vikasgarg.mgl@gmail.com");
		wd.swipeUpElement(test.ScrollupContinue, 2000);
		wd.tap(test.ContinueBooking);
		
		// check Insurance page: No Thanks selected
		wd.WaitForDisplay(test.Insurance);
		wd.tap(test.NoThanks);
		
		// Make Payment page: Wait till controls loads
		wd.WaitForDisplay(test.Payment);
		wd.WaitForDisplay(test.toFromSign);
		SoftAssert a =new SoftAssert();
		a.assertTrue(wd.displayed(test.Payment), "Payment page opened");
		a.assertAll();
		}
	}
	
	@AfterTest
	public void closeApp(){
		wd.QuitSession();
	}

}
