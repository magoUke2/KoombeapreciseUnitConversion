package configuration;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.logging.Level;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AppiumConfiguration extends Utils{
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static void initializeDriver() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(capabilityName1, capabilityValue1);
		capabilities.setCapability(capabilityName2, capabilityValue2); 
		capabilities.setCapability(capabilityName3,capabilityValue3);
		capabilities.setCapability(capabilityName4,capabilityValue4);
		try {
			 driver = new AndroidDriver<WebElement>(new URL(urlAppiumServer), capabilities);
		} catch (MalformedURLException e) {
			System.err.println();
		}
	}
	
	public void screenshot(String description) {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(logFolder+"/"+date+"/screenshots/general/"+description+".png"));
		} catch (IOException e) {
			System.err.println("No se pudo tomar el pantallazo "+e.getMessage());
			logger.log(Level.SEVERE, "Couldnt take the screenshot "+description);
		}
	}
	
	public static void screenshot(String folder, String description) {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(logFolder+"/"+date+"/screenshots/"+folder+"/"+description+".png"));
		} catch (IOException e) {
			System.err.println("No se pudo tomar el pantallazo "+e.getMessage());
			logger.log(Level.SEVERE, "Couldnt take the screenshot "+description);
		}
	}
	
	public void click(String xpath) {
		try {
			WebElement element=driver.findElement(By.xpath(xpath));
			element.click();
		}catch(Exception e) {
			logger.log(Level.SEVERE, "Couldn't click object "+xpath+"  ----  "+e.getMessage());
			errorScreenshot("Couldnt click object ");
		}
	}
	
	public static void errorScreenshot(String description) {
		String uuid=Utils.randonUUID();
		logger.log(Level.INFO, uuid+" Taking error screenshot, see above for the trace");
		screenshot(errorFolder, description+" "+uuid);
	}
	
	public void clickByTextButton(String text) {
		try {
			//WebElement elemento=driver.findElementByAndroidUIAutomator("new UiSelector().textContains("+text+")");
			WebElement element=driver.findElement(By.xpath("//android.widget.Button[@text='"+text+"']"));
			element.click();
		}catch(Exception e) {
			logger.log(Level.SEVERE, "Couldn't click object "+text+"  ----  "+e.getMessage());
			errorScreenshot("Couldnt click object ");
		}
	}
	
	public void clickByTextTextView(String text) {
		try {
			//WebElement elemento=driver.findElementByAndroidUIAutomator("new UiSelector().textContains("+text+")");
			WebElement element=driver.findElement(By.xpath("//android.widget.TextView[@text='"+text+"']"));
			element.click();
		}catch(Exception e) {
			logger.log(Level.SEVERE, "Couldn't click object "+text+"  ----  "+e.getMessage());
			errorScreenshot("Couldnt click object ");
		}
	}
	
	public void selectOption(String selecto,String option) {
		try {
		WebElement element=driver.findElement(By.xpath(selecto));
		Select select=new Select(element);
		select.selectByVisibleText(option);
		}catch(Exception e) {
			logger.log(Level.SEVERE, "Couldnt select that option "+e.getMessage());
			errorScreenshot("Couldnt select that option");
		}
	}
	
	public void scroll(int x,int y) {
		//WebElement element=driver.findElement(By.xpath(xpath));
		TouchAction action = new TouchAction((PerformsTouchActions) driver);
		  action.press(PointOption.point(x,y))
		  .waitAction(new WaitOptions().withDuration(Duration.ofMillis(3000))) //you can change wait durations as per your requirement
		  .moveTo(PointOption.point(x+5, y+500))
		  .release()
		  .perform();
		 }
	

	public WebElement scroll2element(String text) {
	        return driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector())" +
	                ".scrollIntoView(new UiSelector().text(\"" + text + "\"));"));
	}
	}

