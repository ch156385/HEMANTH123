package qspider.acttime.userTest;

import org.testng.annotations.Test;
import org.w3c.dom.events.EventException;

import qspider.acttime.genricLib.Const;
import qspider.acttime.genricLib.DriverClass;
import qspider.acttime.genricLib.ExcelOperation;
import qspider.acttime.genricLib.Log;
import qspider.acttime.userRepo.EnterTimeTrackPage;
import qspider.acttime.userRepo.LoginPage;
import qspider.acttime.userRepo.UserList;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
//@Listeners(qspider.acttime.genricLib.Lisner.class)

public class NewTest {
	WebDriver driver;
	LoginPage loginpage;
	EnterTimeTrackPage enterTime;
	UserList userlist;
	ExcelOperation exl;
	@BeforeClass
	  public void beforeClass() {
		driver=DriverClass.getBrowser();
		WaitForPageToLoad();
		loginpage=PageFactory.initElements(driver, LoginPage.class);
		enterTime=PageFactory.initElements(driver, EnterTimeTrackPage.class);
		userlist=PageFactory.initElements(driver, UserList.class);
		exl=new ExcelOperation();
		driver.get(Const.url);
	  }
	
	private void WaitForPageToLoad() {
		// TODO Auto-generated method stub
		
	}

	@BeforeMethod
	  public void beforeMethod() {
		loginpage.loginOperation();
		
	  }
	
  @Test
  public void UserCreateTest() throws EventException, InvalidFormatException, IOException, InterruptedException {
	  Log.configur();
	  Log.startTestCase("UserCreateTest");
	  enterTime.expcitlyWait(enterTime.getUsersLink());
	  Log.info("UserLink clicked");
	  enterTime.getUsersLink().click();
	  Log.info("user button clicked");
	  
	  
	  userlist.getUserButton().click();
	  exl.readData("H:\\Manali\\ActtimeFW\\TestData\\ManliTestData.xlsx", "Sheet1", 1, 1);
	  
	  userlist.getFNameEditBox().sendKeys(exl.readData("H:\\Manali\\ActtimeFW\\TestData\\ManliTestData.xlsx", "Sheet1", 1, 1));
	  Log.info("firstName send");
	  userlist.getLNameEditBox().sendKeys(exl.readData("H:\\Manali\\ActtimeFW\\TestData\\ManliTestData.xlsx", "Sheet1", 1, 2));
	  userlist.getEmailEditBox().sendKeys(exl.readData("H:\\Manali\\ActtimeFW\\TestData\\ManliTestData.xlsx", "Sheet1", 1, 3));
	  userlist.getUseNameEditBox().sendKeys(exl.readData("H:\\Manali\\ActtimeFW\\TestData\\ManliTestData.xlsx", "Sheet1", 1, 4));
	  userlist.getPasswordEditBox().sendKeys(exl.readData("H:\\Manali\\ActtimeFW\\TestData\\ManliTestData.xlsx", "Sheet1", 1, 5));
	  userlist.getConformpassEditBox().sendKeys(exl.readData("H:\\Manali\\ActtimeFW\\TestData\\ManliTestData.xlsx", "Sheet1", 1, 5));
	  userlist.getCreateUserButton().click();
	  Log.info("user created");
	  Assert.assertTrue(false);

//	  List<WebElement> list=userlist.getListOfUsers();
//	  boolean flage=false;
//	  for(int i=0;i<list.size();i++){
//		  String userNames=list.get(i).getText();
//		  if(userNames.contains(exl.readData("H:\\Manali\\ActtimeFW\\TestData\\ManliTestData.xlsx", "Sheet1", 1, 4))){
//			  flage=true;
//		  }
//		  
//	  }
//	  Assert.assertFalse(flage);
	  
  }
  @Test
  public void deleteUser(){
	  
  }
  

  @AfterMethod
  public void afterMethod() {
  }

  

  @AfterClass
  public void afterClass() {
  }

}
