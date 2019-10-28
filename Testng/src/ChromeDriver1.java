import org.apache.http.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ChromeDriver1 {
 public static <WebDriver> void main(String[] args) {
 
System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");

 
WebDriver driver = new FirefoxDriver();
 driver.manage().window().maximize();
 driver.get("http://google.com");

 }
 
}