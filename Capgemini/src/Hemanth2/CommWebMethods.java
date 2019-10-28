package Hemanth2;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;






public class CommWebMethods {
	WebDriverWait wait=new WebDriverWait(Hemanth2.DriverClass.driver, 20);
	public void waitForPageToLode(){
		Hemanth2.DriverClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void expcitlyWait(WebElement wb){
		wait.until(ExpectedConditions.visibilityOf(wb));
		
	}
void dismissAlert(){
	Alert alt=Hemanth2.DriverClass.driver.switchTo().alert();
	// doubt is 
		alt.dismiss();
	}
	 void acceptAlert(){
	Alert alt=Hemanth2.DriverClass.driver.switchTo().alert();
	alt.accept();
}
	String getTestAlert(){
	Alert alt=Hemanth2.DriverClass.driver.switchTo().alert();
		return alt.getText();
	}


}


