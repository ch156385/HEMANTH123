package qspider.acttime.genricLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Lisner implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//AdvanceReporting.configAdvance();
		String methodname= result.getMethod().getMethodName();
		String destImagepath="H:\\Manali\\ActtimeFW\\ScreenShort\\"+methodname+".png";
		EventFiringWebDriver efw=new EventFiringWebDriver(DriverClass.driver);
		File scrFile=efw.getScreenshotAs(OutputType.FILE);
		File destFile=new File(destImagepath);
		try {
			FileUtils.copyFile(scrFile, destFile);
			//AdvanceReporting.attactImage(destImagepath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
