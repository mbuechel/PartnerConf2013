package argos.saleslogix.selenium.test;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.AssertJUnit;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import argos.saleslogix.selenium.test.CommonNavigation;
import argos.saleslogix.selenium.test.HeaderButton;
import argos.saleslogix.selenium.test.SLXMobileLogin;
import argos.saleslogix.selenium.test.BrowserSetup;

public class UnitTestX extends BrowserSetup {
	
	CommonNavigation commNav = PageFactory.initElements(driver, CommonNavigation.class);

	//Login & Logout
	//==============
	@Test(enabled = true)
	public void test00_MobileClient_Login() throws InterruptedException {
		String methodID = "test00_MobileClient_Login";
		
		System.out.println(STARTLINE + " " + methodID + " " + STARTLINE);
		
		doVerificationLogin();
		
		System.out.println(ENDLINE);	
	}
	

	@Test(enabled = false)
	public void test11_MobileDefect_MBL10172() throws Exception {
		//MBL-10172: Mobile - Ticket Activities : elapsed hours not displaying as it does in web client (16 dec positions versus 2) [DTS 13091638]
		String methodID = "test11_MobileDefect_MBL10172";
		
		CommonNavigation commNav = PageFactory.initElements(driver, CommonNavigation.class);	
			
		System.out.println(STARTLINE + " " + methodID + " " + STARTLINE);
					
	    //Step: open the Ticket Detail view
	    String entityType = "Tickets";
	    String tktItem = "001-00-000017";
	    String entityDetailViewLink = "Ticket Activities";
		commNav.entityRecordOpenDetailView(entityType, tktItem);
	    
	    //Step: open the Ticket Activities view
	    String tktDetVwActivitiesXPath = "//*[@id='ticket_detail']/descendant::*[text() = '" + entityDetailViewLink + "']";
	    driver.findElement(By.xpath(tktDetVwActivitiesXPath)).click();
	    commNav.waitForPage(entityDetailViewLink);
	    
	    //Step: perform a Ticket Activity search
	    String searchItem = "Customer follow up to check on new units";
	    WebElement searchFld = driver.findElement(By.name("query"));
	    WebElement lookupBtn = driver.findElement(By.xpath("//div[3]/button"));
	    searchFld.clear();
	    searchFld.sendKeys(searchItem);
	    lookupBtn.click();
	    Thread.sleep(2000);
	    
	    //Step: click to open the Ticket Activity record
	    WebElement tktListItem = driver.findElement(By.xpath("//*[@id='ticketactivity_related']/ul/li"));
	    tktListItem.click();
	    commNav.waitForNotPage(entityDetailViewLink);
	    
	    //Step: expand the More Details link
	    WebElement moreDetailsLnk = driver.findElement(By.xpath("//*[@id='ticketactivity_detail']/descendant::*[text() = 'More Details']"));
	    moreDetailsLnk.click();
	    
	    //VP: check to see that the Elapsed Hours field is not equal to 0.0333333333333333
	    String txt2Chk = "0.0333333333333333";
	    String resultsMsg = "VP: The Elapsed Hours field value is not equal to " + txt2Chk;
	    try {
		    WebElement elapsedHrsFld = driver.findElement(By.xpath("//*[@id='ticketactivity_detail']/div[2]/div[2]/div[2]"));
		    String elapsedHrsVal = elapsedHrsFld.getText();
	    	AssertJUnit.assertFalse(elapsedHrsVal.equals("elapsed hours" + txt2Chk));
	    	System.out.println(resultsMsg + " - Passed");
	    }
	    catch (Exception e) {
	    	System.out.println(e.toString());
	    	System.out.println(resultsMsg + " - Failed");
	    }
	    
		//END
	    commNav.clickGlobalMenuItem("My Activities");
		System.out.println(ENDLINE);
	}


	@Test(enabled = true)
	public void test99_Mobile_LogOut()  throws InterruptedException {				
		String methodID = "test99_Mobile_LogOut";
		
		System.out.println(STARTLINE + " " + methodID + " " + STARTLINE);
		
		doVerificationLogout();
		
		System.out.println(ENDLINE);
	}
	
}
