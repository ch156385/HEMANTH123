package qspider.acttime.genricLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CommWebMethods {
	WebDriverWait wait=new WebDriverWait(DriverClass.driver, 20);
//	
	public void waitForPageToLode(){
		DriverClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void expcitlyWait(WebElement wb){
		wait.until(ExpectedConditions.visibilityOf(wb));
		
	}
void dismissAlert(){
	Alert alt=DriverClass.driver.switchTo().alert();
		alt.dismiss();
	}
	 void acceptAlert(){
	Alert alt=DriverClass.driver.switchTo().alert();
	alt.accept();
}
	String getTestAlert(){
	Alert alt=DriverClass.driver.switchTo().alert();
		return alt.getText();
	}

}
