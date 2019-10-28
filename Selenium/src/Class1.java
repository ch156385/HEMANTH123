import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("phone");
		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
	}

}
