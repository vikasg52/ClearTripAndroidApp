package gojek.automation.cleartrip;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UtilityFuntions {
	public static AndroidDriver<AndroidElement> driver;
	
        public AndroidDriver<AndroidElement> LaunchApp(){
		if(driver==null){
			DesiredCapabilities cap= new DesiredCapabilities();
			File app = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\cleartrip.apk");
			cap.setCapability("platformVersion", "Android");
			cap.setCapability("deviceName","MPDQWW4161117007847");
			cap.setCapability("platformVersion","6.0");
			cap.setCapability("platformVersion","Android");
			cap.setCapability("app",app.getAbsolutePath());
			try {
				System.out.println("Launching the app...");
				driver= new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				} catch (MalformedURLException e1) {
				System.out.println("could not start hub due to: "+e1.getMessage());
			}
		  }
		return driver;
      }
	
	public void tap(By by){
		driver.findElement(by).click();
	}
	public AndroidDriver<?> driver(AndroidDriver<?> driver){
		return driver;
	}
	
	public void WaitForDisplay(By by){
		WebDriverWait w= new WebDriverWait(driver, 120);
		w.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public static void WaitForClickable(By by){
		WebDriverWait w= new WebDriverWait(driver, 90);
		w.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	public void switchContext(){
		Set<String> contexts= driver.getContextHandles();
		for(String context:contexts){
			driver.context(context);
		}
	}
		public String SwitchToMain(){
			String maincontext = driver.getContext();
			driver.context(maincontext);
			return maincontext;
		}
		public void SelectOption(By by){
		List<AndroidElement> list = driver.findElements(by);
		list.get(0).click();
		}
	
	public void moveto(WebElement e){
		TouchAction t = new TouchAction(driver);
		t.moveTo(e).perform();
	}
	
	public void datepick(MobileBy by){
		Point p1=driver.findElement(by).getLocation();
		Dimension d1 = driver.findElement(by).getSize();
        driver.tap(1, p1.getX()+ d1.getWidth(), p1.getY() + d1.getHeight()-100, 500);
	}
	public void type(By by, String s){
		driver.findElement(by).sendKeys(s);
	}
	public void swipeUpElement(By by, int duration) throws InterruptedException{
	    int topY = driver.findElement(by).getLocation().getY();
		int bottomY = topY+driver.findElement(by).getSize().getHeight();
		int centerX = driver.findElement(by).getLocation().getX() + (driver.findElement(by).getSize().getWidth()/2);
		driver.swipe(centerX, bottomY-100, centerX, topY,duration);
		Thread.sleep(1000);
	}
	
	public void Clear(By by){
		driver.findElement(by).clear();
	}
	
	public void QuitSession(){
		if(driver!=null)
		driver.quit();
	}

}
