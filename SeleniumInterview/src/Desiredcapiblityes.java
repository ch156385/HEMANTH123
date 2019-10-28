import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Desiredcapiblityes {
	public WebDriver driver;
@Test
public void verfy(){
	DesiredCapabilities dc =  new DesiredCapabilities();
	dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	driver = new FirefoxDriver(dc);
	driver.get("https://flipkart.com/");
}
}
