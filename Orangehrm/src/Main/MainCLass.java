package Main;

import java.io.IOException;

import org.testng.annotations.Test;

import Testcases.LoginTestcase1;
import Testcases.LogoutTestcase2;

public class MainCLass {
@Test()
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		LoginTestcase1 l1 = new LoginTestcase1();
				l1.verfylogin();
				LogoutTestcase2 l2 = new LogoutTestcase2();
				l2.VerfyLogout();
	}

}
