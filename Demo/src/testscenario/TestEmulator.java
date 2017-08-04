package testscenario;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.mobile.NetworkConnection;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import pageobject.calcualtor;

public class TestEmulator {
		   

	@Test(enabled=true)
		public void testEmulator1()
		{
		 AppiumDriver<WebElement> driver;
	     try
	     {
	    	 
	        DesiredCapabilities cap = new DesiredCapabilities();
	        File app=new File("D:\\apk\\Android Messages.apk");
	        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
	        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
	       // cap.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.CHROME);
	        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 20000);
	      //  cap.setCapability("appPackage", "com.android.calculator2");
	    //    cap.setCapability("appActivity", "com.android.calculator2.Calculator");
	        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	        driver=  new AndroidDriver<WebElement>(new URL("http://127.0.0.34:4723/wd/hub"), cap);
	        System.out.println(driver.getDeviceTime());
	        //System.out.println(driver.getContext());
	       driver.get("https://paytm.com");
	      
	        Thread.sleep(4000);
	        
	       // driver.closeApp();
	        
	     }
	     catch(Exception e)

	     {
	    	 e.printStackTrace();
	     }
	    }
	
	@Test(enabled=false)
	public void testEmulator2()
	{
	 AppiumDriver<WebElement> driver;
     try
     {
    	 
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 200000);
        cap.setCapability("appPackage", "com.android.calculator2");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");
        
        driver=  new AndroidDriver<WebElement>(new URL("http://127.0.0.34:4723/wd/hub"), cap);
        //System.out.println(driver.getContext());
        calcualtor c=new calcualtor(driver);
        c.btn_2.click();
        //  driver.findElementById("com.android.calculator2:id/digit_3").click();
        c.btn_mul.click();
      //  driver.findElementById("com.android.calculator2:id/op_mul").click();
      //  driver.findElementById("com.android.calculator2:id/digit_7").click();
        c.btn_7.click();
        String data=driver.findElementById("com.android.calculator2:id/result").getText();
        System.out.println("Result="+data);
        Thread.sleep(4000);
        
        driver.closeApp();
        
     }
     catch(Exception e)

     {
    	 e.printStackTrace();
     }
    }
	
	@Test(enabled=false)
	public void testEmulator3()
	{
	 AppiumDriver<WebElement> driver;
     try
     {
    	 
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 200000);
        cap.setCapability("appPackage", "com.android.calculator2");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");
        
        driver=  new AndroidDriver<WebElement>(new URL("http://127.0.0.34:4723/wd/hub"), cap);
        //System.out.println(driver.getContext());
      
        calcualtor c=new calcualtor(driver);
       // c.btn_2.click();
          driver.findElementById("com.android.calculator2:id/digit_3").click();
       // c.btn_mul.click();
        driver.findElementById("com.android.calculator2:id/op_mul").click();
        driver.findElementById("com.android.calculator2:id/digit_7").click();
       // c.btn_7.click();
        String data=driver.findElementById("com.android.calculator2:id/result").getText();
        System.out.println("Result="+data);
       
        Thread.sleep(4000);
        
        driver.closeApp();
        
     }
     catch(Exception e)

     {
    	 e.printStackTrace();
     }
    }

	
	

}
