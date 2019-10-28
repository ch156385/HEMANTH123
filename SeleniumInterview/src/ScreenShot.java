import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class ScreenShot {
	public WebDriver driver;
@Test
public void verfy () throws IOException, InterruptedException{
	System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("http://opensource.demo.orangehrmlive.com/");
	Thread.sleep(5000);
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    //The below method will save the screen shot in d drive with name "screenshot.png"
       FileUtils.copyFile(scrFile, new File("C:\\Users\\Hemanth\\Desktop\\Selenium\\SeleniumInterview\\Screenshot\\screenshot1.png"));
}
}
