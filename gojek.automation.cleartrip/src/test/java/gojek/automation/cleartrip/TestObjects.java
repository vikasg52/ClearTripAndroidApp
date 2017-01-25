package gojek.automation.cleartrip;

import org.openqa.selenium.By;

public class TestObjects {
	public By AllowLocation       = By.name("Allow");
	public By selectTravel        =  By.id("RoundTripBookingTest");
	public By RounTripRadiobtn    =  By.id("com.cleartrip.android:id/fhf_roundtrip");
	public By Fromcity            =  By.id("com.cleartrip.android:id/txt_from_city");
	public By Tocity              =  By.id("com.cleartrip.android:id/txt_to_city");
	public By searchCity          =  By.id("com.cleartrip.android:id/filter_edittext");
	public String city            =  "//[@name='']";
	public By chooseDatefrom      =  By.id("com.cleartrip.android:id/flight_lyt_depart_date");
	public By tapDepartDate       =  By.xpath("//android.widget.TextView[@name='28']");
	public By tapSelectioncorrect =  By.id("com.cleartrip.android:id/correctTick");
	public By chooseReturnDate    =  By.id("com.cleartrip.android:id/flight_lyt_return_date");
	public By tapReturnDate       =  By.xpath("//android.widget.TextView[@name='29']");
	public By ChooseTraveler      =  By.id("com.cleartrip.android:id/fhf_flightLytTravellerPicker");
	public By TapTravelClass      =  By.id("com.cleartrip.android:id/fhf_flight_lyt_travellers_class");
	public By ChooseTravelClass   =  By.xpath("//android.widget.RadioButton[@name='Business']");
	public By ClickSearchFlight   =  By.id("com.cleartrip.android:id/fhf_btn_search_flights");
	
	
	

}
