package gojek.automation.cleartrip;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class UtilityFuntions {
	public AndroidDriver driver=null;
	
	public AndroidDriver LaunchApp(AndroidDriver driver){
		if(driver==null){
			DesiredCapabilities cap= new DesiredCapabilities();
			File app = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\cleartrip.apk");
			cap.setCapability("platformVersion", "Android");
			cap.setCapability("deviceName", "VikasMicromax");
			cap.setCapability("platformVersion", "6.0");
			cap.setCapability("platformVersion", "Android");
			cap.setCapability("app", app.getAbsolutePath());
					try {
						System.out.println("Launching the app...");
						driver= new AndroidDriver(new URL("http://localhost:4723/wd/hub"),cap);
					} catch (MalformedURLException e1) {
						System.out.println("could not start hub due to: "+e1.getMessage());
					}
					driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
					System.out.println("App Launched successfulyy...");
		}
		return driver;
	 }
	
	public void tap(AndroidDriver driver, By by){
		driver.findElement(by).click();
	}
	public static void WaitForDisplay(AndroidDriver driver, By by){
		WebDriverWait w= new WebDriverWait(driver, 90);
		w.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	public static void WaitForClickable(AndroidDriver driver, By by){
		WebDriverWait w= new WebDriverWait(driver, 90);
		w.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	public void switchWindow(AndroidDriver driver){
		Set<String> popup= driver.getWindowHandles();
		for(String pop:popup){
			driver.switchTo().window(pop);
		}
	}
		public String SwitchToMain(AndroidDriver driver){
			String fbloginwindow = driver.getWindowHandle();
			driver.switchTo().window(fbloginwindow);
			return fbloginwindow;
		}
	
	public void selectfrommenu(AndroidDriver driver, MobileElement e, int index){
		Select select =new Select(e);
		select.selectByIndex(index);
		
	}
	
	public void type(AndroidDriver driver, By by, String s){
		driver.findElement(by).sendKeys(s);
	}
	public void Clear(AndroidDriver driver, By by){
		driver.findElement(by).clear();
	}
	
	public void QuitSession(AndroidDriver driver){
		if(driver!=null)
		driver.quit();
	}

}
