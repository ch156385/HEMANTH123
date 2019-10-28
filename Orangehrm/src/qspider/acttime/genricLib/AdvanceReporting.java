package qspider.acttime.genricLib;

//import org.testng.ITestResult;

//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;

/*public class AdvanceReporting {
	public static ExtentReports ext;
	public static ITestResult itr;
	public static ExtentTest extTest;
	
	public static ExtentReports configAdvance(){
	ext=new  ExtentReports("H:\\Manali\\ActtimeFW\\log\\"+itr.getMethod().getMethodName()+".html");
	extTest=ext.startTest(itr.getMethod().getMethodName());
	return ext;
	}
	
	public static void extInfo(String info){
		extTest.log(LogStatus.INFO, info);
	}
	public static void extPass(String pass){
		extTest.log(LogStatus.PASS, pass);
	}
	public static void extFail(String fail){
		extTest.log(LogStatus.FAIL, fail);
	}
	public static void attactImage(String destinatonImagePath){
		String image=extTest.addScreenCapture(destinatonImagePath);
		extTest.log(LogStatus.FAIL, "Title is not verifyed",image);
		ext.endTest(extTest);
		ext.flush();
	}


}*/
