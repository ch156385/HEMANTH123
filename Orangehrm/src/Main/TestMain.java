package Main;

import java.io.IOException;

import org.testng.annotations.Test;

import Testcases.LoginTestcase1;
import Testcases.LogoutTestcase2;
import Testcases.Testcase3;
import Testcases.Testcase4;

public class TestMain {
	@Test
public void verfy1() throws IOException, InterruptedException{
	LoginTestcase1  l1 = new LoginTestcase1 ();
	l1.verfylogin();
	LogoutTestcase2 l2 = new LogoutTestcase2();
	l2.VerfyLogout();
	Testcase3 l3 = new Testcase3();
	l3.verfy();
	Testcase4 l4 = new Testcase4();
	l4.verfy();
}
}
