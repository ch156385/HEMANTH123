import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HowtofindTotalframeAndSwitchingFrame {
	public WebDriver driver;
@Test(priority =1)
public void Setup(){
	System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("http://demo.guru99.com/test/guru99home/");
}
@Test(priority =2)
public void Frames(){
	int size = driver.findElements(By.tagName("iframe")).size();
	System.out.println(size);
	driver.switchTo().frame(1);
	for(int i =0 ; i<=size;i++){
		driver.switchTo().frame(i);
	}
}
}
