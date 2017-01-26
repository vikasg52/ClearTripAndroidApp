package gojek.automation.cleartrip;

import org.openqa.selenium.By;

public class TestObjects {
	public By AllowLocation       =  By.id("com.android.packageinstaller:id/permission_allow_button");
	public By selectTravel        =  By.id("com.cleartrip.android:id/original_travel_text");
	public By RounTripRadiobtn    =  By.id("com.cleartrip.android:id/fhf_roundtrip");
	public By Fromcity            =  By.id("com.cleartrip.android:id/txt_from_city");
	public By Tocity              =  By.id("com.cleartrip.android:id/txt_to_city");
	public By searchCity          =  By.id("com.cleartrip.android:id/filter_edittext");
	public By citySelectedDel     =  By.name("New Delhi, IN - Indira Gandhi Airport (DEL)") ;
	public By citySelectedBlr     =  By.name("Bangalore, IN - Kempegowda International Airport (BLR)") ;
	//Searching Flight Objects
	public By tapDatefrom         =  By.id("com.cleartrip.android:id/flight_lyt_depart_date");
	public By chooseDepartDate    =  By.name("27");
	public By tapSelectioncorrect =  By.id("com.cleartrip.android:id/correctTick");
	public By tapReturnDate       =  By.id("com.cleartrip.android:id/flight_lyt_return_date");
	public By chooseReturnDate    =  By.name("29");
	public By TapTravelClass      =  By.id("com.cleartrip.android:id/fhf_flight_lyt_travellers_class");
	public By ChooseTravelClass   =  By.name("Business");
	public By Scrollup            =  By.xpath("//android.widget.ScrollView[@index='0']");
	public By ClickSearchFlight   =  By.id("com.cleartrip.android:id/fhf_btn_search_flights");
	// Flight Deatils-Review Objects
	public By bookFlight              =  By.name("Book");
	public By selectToFlight       =  By.id("com.cleartrip.android:id/list_domestic_onward");
	public By selectReturnFlight   =  By.id("com.cleartrip.android:id/list_domestic_return");
	public By veriFyFlightto       =  By.name("New Delhi - Bangalore");
	public By veriFyFlightFrom     =  By.name("Bangalore - New Delhi");
	public By ScrollupContinue     =  By.className("android.widget.ScrollView");
	public By ContinueBooking      =  By.name("Continue booking");
	
	//Traveller details-fill objects
	public By Details  = By.name("Traveller details");
	public By tapTitle   =By.name("Title");
	public By TitleValue  = By.name("Mr");
	public By Fname    = By.name("First Name");
	public By lname    = By.name("Last Name");
	public By mobile   = By.name("Mobile no");
	public By Email    = By.name("Email address");

	// Add Insurance to trip
	public By Insurance= By.name("Add insurance to your trip?");
	public By NoThanks = By.name("NO THANKS");
	
	// Make Payment Page Objects
	public By Payment  = By.name("Make payment");
public By toFromSign   = By.name("New Delhi ⇄ Bangalore");
	
	
	

}
