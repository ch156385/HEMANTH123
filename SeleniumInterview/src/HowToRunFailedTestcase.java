import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class HowToRunFailedTestcase {
public static void main(String []arg){
	TestNG runner = new TestNG();
	List<String> list = new ArrayList<String>();
	list.add("C:\\Users\\Hemanth\\Desktop\\Selenium\\SeleniumInterview\\test-output\\testng-failed.xml");
	runner.setTestSuites(list);
	runner.run();
}
}
