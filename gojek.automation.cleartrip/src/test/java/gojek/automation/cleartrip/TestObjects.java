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
	//public By citySelect          =  By.xpath("//RelativeLayout[@index='0']");
	public By tapDatefrom         =  By.id("com.cleartrip.android:id/flight_lyt_depart_date");
	public By chooseDepartDate    =  By.name("27");
	public By tapSelectioncorrect =  By.id("com.cleartrip.android:id/correctTick");
	public By tapReturnDate       =  By.id("com.cleartrip.android:id/flight_lyt_return_date");
	public By chooseReturnDate    =  By.name("29");
	public By TapTravelClass      =  By.id("com.cleartrip.android:id/fhf_flight_lyt_travellers_class");
	public By ChooseTravelClass   =  By.name("Business");
	public By Scrollup            =  By.xpath("//android.widget.ScrollView[@index='0']");
	public By ClickSearchFlight   =  By.id("com.cleartrip.android:id/fhf_btn_search_flights");
	
	public By book               =  By.name("Book");
	public By selectToFlight       =  By.id("com.cleartrip.android:id/list_domestic_onward");
	public By selectReturnFlight   =  By.id("com.cleartrip.android:id/list_domestic_return");
	
	
	

}
