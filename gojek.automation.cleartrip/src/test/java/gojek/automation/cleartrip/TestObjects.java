package gojek.automation.cleartrip;

import org.openqa.selenium.By;

public class TestObjects {
	public By AllowLocation       =  By.id("com.android.packageinstaller:id/permission_allow_button");
	public By selectTravel        =  By.id("com.cleartrip.android:id/original_travel_text");
	public By RounTripRadiobtn    =  By.id("com.cleartrip.android:id/fhf_roundtrip");
	public By Fromcity            =  By.id("com.cleartrip.android:id/txt_from_city");
	public By Tocity              =  By.id("com.cleartrip.android:id/txt_to_city");
	public By searchCity          =  By.id("com.cleartrip.android:id/filter_edittext");
	public String citySelected    =  "//android.widget.ScrollView[@index='3']";
	public By citySelect          =  By.xpath("//android.widget.RelativeLayout[@index='0']");
	public By chooseDatefrom      =  By.id("com.cleartrip.android:id/flight_lyt_depart_date");
	public By tapDepartDate       =  By.xpath("//android.widget.TextView[@index='28']");
	public By tapSelectioncorrect =  By.id("com.cleartrip.android:id/correctTick");
	public By chooseReturnDate    =  By.id("com.cleartrip.android:id/flight_lyt_return_date");
	public By tapReturnDate       =  By.xpath("//android.widget.TextView[@index='29']");
	public By TapTravelClass      =  By.id("com.cleartrip.android:id/fhf_flight_lyt_travellers_class");
	public By ChooseTravelClass   =  By.xpath("//android.widget.RadioButton[@name='Business']");
	public By Scrollup            =  By.xpath("//android.widget.ScrollView[@index='0']");
	public By ClickSearchFlight   =  By.id("com.cleartrip.android:id/fhf_btn_search_flights");
	
	
	

}
