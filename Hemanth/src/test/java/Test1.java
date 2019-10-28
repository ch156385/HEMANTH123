import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	public WebDriver driver;
@Test
public void verfy(){
	System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	String s1 = driver.getTitle();
	System.out.println(s1);
	String  s2 = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	Assert.assertEquals(s1, s2);
	List <WebElement> ele =driver.findElements(By.tagName("a"));
	int i = ele.size();
	System.out.println(i);
	for( WebElement Element :ele){
		System.out.println(Element.getAttribute("href"));
	}
}
}
