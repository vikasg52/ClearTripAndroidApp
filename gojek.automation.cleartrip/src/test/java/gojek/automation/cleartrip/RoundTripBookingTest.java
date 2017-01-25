package gojek.automation.cleartrip;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
		wd.tap(test.ClickSearchFlight);
		wd.WaitForDisplay(test.book);
		wd.SelectOption(test.selectToFlight);
		wd.SelectOption(test.selectReturnFlight);
		wd.tap(test.book);
			
	}
	
	@AfterTest
	public void closeApp(){
		wd.QuitSession();
	}

}
