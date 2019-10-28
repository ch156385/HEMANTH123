import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WindowHandle {
	public WebDriver driver;
@Test
public void verfy(){
	System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).sendKeys("phone");
	driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
	driver.findElement(By.xpath(".//*[text()='Nokia 105 (Black)']")).click();
	String s1 = driver.getWindowHandle();
	driver.findElement(By.xpath(".//*[@id='purchase-sims-feature']/div/div[2]/div/div[2]/div/ol/li[4]/div/a/div[2]")).click();
	Set<String> ele = driver.getWindowHandles();
	for(String ele1:ele){
		if(!s1.equals(ele1)){
			driver.switchTo().window(ele1);
			driver.findElement(By.xpath(".//*[@id='alternativeOfferEligibilityMessaging_feature_div']/div/a")).click();
		}
	}
}
}
