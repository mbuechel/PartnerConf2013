package argos.saleslogix.selenium.test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Class that defines WebElements and methods for the Calendar views on the Mobile Client.
 * 
 * @author mike.llena@swiftpage.com
 * @version	1.0
 */
public class CalendarViewsElements extends BrowserSetup {
	
	private WebDriver driver;

	public CalendarViewsElements(WebDriver driver) {
		this.driver = driver;		
	}

	//Header Navigation elements
	@CacheLookup
	@FindBy(xpath = "//*[@id='calendar_daylist']/descendant::*[text() = 'Today']")
	WebElement calDayLstTodayHeaderLnk;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='calendar_daylist']/descendant::*[text() = 'Day']")
	WebElement calDayLstDayHeaderLnk;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='calendar_daylist']/descendant::*[text() = 'Week']")
	WebElement calDayLstWeekHeaderLnk;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='calendar_daylist']/descendant::*[text() = 'Month']")
	WebElement calDayLstMonthHeaderLnk;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='calendar_daylist']/descendant::*[@data-action='selectDate']")
	WebElement calDayLstSelectDateHeaderBtn;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='calendar_daylist']/descendant::*[@data-dojo-attach-point='dateNode']")
	WebElement calDayLstCurrentDateHeaderLbl;

	@CacheLookup
	@FindBy(xpath = "//*[@id='calendar_daylist']/descendant::*[@data-action='getPrevDay']")
	WebElement calDayLstPrevDayHeaderBtn;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='calendar_daylist']/descendant::*[@data-action='getNextDay']")
	WebElement calDayLstNextDayHeaderBtn;
		
	@CacheLookup
	@FindBy(xpath = "//*[@id='calendar_weeklist']/descendant::*[text() = 'Today']")
	WebElement calWeekLstTodayHeaderLnk;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='calendar_weeklist']/descendant::*[text() = 'Day']")
	WebElement calWeekLstDayHeaderLnk;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='calendar_weeklist']/descendant::*[text() = 'Week']")
	WebElement calWeekLstWeekHeaderLnk;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='calendar_weeklist']/descendant::*[text() = 'Month']")
	WebElement calWeekLstMonthHeaderLnk;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='calendar_weeklist']/descendant::*[@data-action='selectDate']")
	WebElement calWeekLstSelectDateHeaderBtn;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='calendar_weeklist']/descendant::*[@data-dojo-attach-point='dateNode']")
	WebElement calWeekLstCurrentDateHeaderLbl;

	@CacheLookup
	@FindBy(xpath = "//*[@id='calendar_weeklist']/descendant::*[@data-action='getPrevWeekActivities']")
	WebElement calWeekLstPrevDateHeaderBtn;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='calendar_weeklist']/descendant::*[@data-action='getNextWeekActivities']")
	WebElement calWeekLstNextDateHeaderBtn;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='calendar_monthlist']/descendant::*[text() = 'Today']")
	WebElement calMonthLstTodayHeaderLnk;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='calendar_monthlist']/descendant::*[text() = 'Day']")
	WebElement calMonthLstDayHeaderLnk;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='calendar_monthlist']/descendant::*[text() = 'Week']")
	WebElement calMonthLstWeekHeaderLnk;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='calendar_monthlist']/descendant::*[text() = 'Month']")
	WebElement calMonthLstMonthHeaderLnk;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='calendar_monthlist']/descendant::*[@data-action='selectDate']")
	WebElement calMonthLstSelectDateHeaderBtn;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='calendar_monthlist']/descendant::*[@data-dojo-attach-point='dateNode']")
	WebElement calMonthLstCurrentDateHeaderLbl;

	@CacheLookup
	@FindBy(xpath = "//*[@id='calendar_monthlist']/descendant::*[@data-action='goToPreviousMonth']")
	WebElement calMonthLstPrevMonthHeaderBtn;
	
	@CacheLookup
	@FindBy(xpath = "//*[@id='calendar_monthlist']/descendant::*[@data-action='goToNextMonth']")
	WebElement calMonthLstNextMonthHeaderBtn;
	
	@CacheLookup
	@FindBy(xpath = "/descendant::*[@data-dojo-attach-point='dateNode']")
	WebElement calCurrentDateHeaderLbl;
	
	@CacheLookup
	@FindBy(xpath = "//div[2]/button[2]")
	WebElement calSelectDateHeaderBtn;

	//Generic Calendar (Month, Date, Year selection)
	@CacheLookup
	@FindBy(id = "generic_calendar")
	WebElement genericCalendar;
	
	@CacheLookup
	@FindBy(id = "month-field")
	WebElement genericCalendarMonthFld;
	
	@CacheLookup
	@FindBy(id = "day-field")
	WebElement genericCalendarDayFld;
	
	@CacheLookup
	@FindBy(id = "year-field")
	WebElement genericCalendarYearFld;
	
	//Day View elements
	//TODO: complete Calendar Day WebElement definitions
	
	//Week View Elements
	//TODO: complete Calendar Week WebElement definitions
	
	//Month View Elements
	//TODO: complete Calendar Month WebElement definitions
		
	
	//Methods
	//-------
	/**
	 * This method will click a Calendar Header button/link.  The Calendar Date + button/link name should be specified.
	 * There is an assumption that the Calendar List view is currently displayed.
	 * 
	 * @version	1.0
	 * @param	calView  	calendar list view; specify Day (default), Week or Month
	 * @param	buttonName	name of Calendar header button to click
	 */
	public void clickCalendarNavButton(String calView, String buttonName) {
		String methodID = "clickCalendarNavButton";
		
		//determine Calendar view (day, week or month)
		String selCalListView = "";
		String calListViewXPath = "";
		switch (calView.toLowerCase()) {
		case "day":
			selCalListView = "calendar_daylist";
			calListViewXPath = "//div[2]/button[3]";
			break;
		case "week":
			selCalListView = "calendar_weeklist";
			calListViewXPath = "//div[2]/button[4]";
			break;
		case "month":
			selCalListView = "calendar_monthlist";
			calListViewXPath = "//div[2]/button[5]";
			break;
		default:	//default = Calendar Day list
			System.out.println(methodID + ": " + "invalid calView parameter value specified; please use 'Day', 'month' or 'week' for the calView parameter; default Calendar, Day list will be selected");
			selCalListView = "calendar_daylist";
			calListViewXPath = "//div[2]/button[3]";
			break;
		}
		
		//click the Calendar view header link
		try {
			driver.findElement(By.xpath(calListViewXPath)).click();
			Thread.sleep(1000);
			
			//determine the Calendar Header button
			String selButtonName = "";		
			switch (buttonName.toLowerCase()) {
			case "today":
				selButtonName = "text() = 'Today'";
				break;
			case "day":
				selButtonName = "text() = 'Day'";
				break;
			case "week":
				selButtonName = "text() = 'Week'";
				break;
			case "month":
				selButtonName = "text() = 'Month'";
				break;
			case "select date": case "calendar": case "date": case "calendar date":
				selButtonName = "@data-action='selectDate'";
				break;
			case "previous day": case "prev day": case "previous date":
				selButtonName = "@data-action='getPrevDay'";
				break;
			case "next day": case "next date":
				selButtonName = "@data-action='getNextDay'";
				break;
			case "previous week": case "prev week":
				selButtonName = "@data-action='getPrevWeekActivities'";
				break;
			case "next week":
				selButtonName = "@data-action='getNextWeekActivities'";
				break;
			case "previous month": case "prev month":
				selButtonName = "@data-action='goToPreviousMonth'";
				break;
			case "next month":
				selButtonName = "@data-action='goToNextMonth'";
				break;
			}
			
			//perform the Calendar List Header button click
			String calHeaderBtnXPath = "//*[@id='" + selCalListView + "']/descendant::*[" + selButtonName + "]";
			try {
				WebElement calHeaderButton = driver.findElement(By.xpath(calHeaderBtnXPath));
				calHeaderButton.click();
				Thread.sleep(2000);
				System.out.println(methodID + ": clicked the " + selCalListView + " - " + buttonName + " Calendar Header button");
			}
			catch (Exception e) {
				System.out.println(e.toString());
				System.out.println(methodID + ": unable to click the " + selCalListView + " - " + buttonName + " Calendar Header button");
			}
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	
	/**
	 * This method return a string that represents the current Calendar Header date label.  The same string value
	 * is logged in the console as well.  There is an assumption that the Calendar List view is displayed.
	 * 
	 * @version	1.0
	 */
	public String getCurrentHeaderDateLabel() {
		String methodID = "getCurrentHeaderDateLabel";
		
		String currentHeaderDateLbl = this.calCurrentDateHeaderLbl.getText();
		System.out.println(methodID + ": current Calendar Header Date Label - '" + currentHeaderDateLbl + "'");
		
		return currentHeaderDateLbl;
	}
	
	
	/**
	 * This method will navigate to a specific Calendar Day List view via the Generic Calendar date selection page.  The
	 * Month, Day & Year values will need to be specified.  There is an assumption that the Generic Calendar date
	 * selection page is displayed.  There is no validation on the date value set.
	 * 
	 * @version	1.0
	 * @param	mon		month to select; need to be 3-letter, abbreviated month format (e.g. Jan, Feb, Mar, etc.)
	 * @param	dd		date to select; need to be 2-letter format (valid values: 01 - 31)
	 * @param	yyyy	year to select; needs to be in 4-letter format (e.g. 2013)
	 * @throws InterruptedException 
	 */
	public void goToCalendarDate(String mon, String dd, String yyyy) throws InterruptedException {
		String methodID = "goToCalendarDate";
		
		CommonNavigation commNav = PageFactory.initElements(driver, CommonNavigation.class);
		HeaderButton headerButton = PageFactory.initElements(driver, HeaderButton.class);
		
		//conditionally navigate to the Calendar Generic date selection page
		if (!driver.findElement(By.id("generic_calendar")).isDisplayed()) {
			
			//navigate to Calendar view from the Global Menu
			commNav.clickGlobalMenuItem("Calendar");
			
			//navigate to Generic Calendar select date page
			calSelectDateHeaderBtn.click();
			commNav.waitForPage("Calendar");
		}
		
		//make month, date & year selections
		try {
			new Select(genericCalendarMonthFld).selectByVisibleText(mon);
			Thread.sleep(1000);
			new Select(genericCalendarDayFld).selectByVisibleText(dd);
			Thread.sleep(1000);
			new Select(genericCalendarYearFld).selectByVisibleText(yyyy);
			Thread.sleep(1000);
			
			//save the Calendar Date selection
			headerButton.clickHeaderButton("check");
			commNav.waitForPage("Calendar");
			
			System.out.println(methodID + ": selected '" + mon + ", " + dd + " " + yyyy + "' from the Generic Calendar date selection page");
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	
	/**
	 * This method will navigate to a specific Calendar Day List view via the Generic Calendar date selection page.
	 * From the Calendar Day list, the method will return a boolean value that indicates whether or not an activity 
	 * item that matches the Regarding value was found.
	 * 
	 * @version	1.0
	 * @param	mon		month to select; need to be 3-letter, abbreviated month format (e.g. Jan, Feb, Mar, etc.)
	 * @param	dd		date to select; need to be 2-letter format (valid values: 01 - 31)
	 * @param	yyyy	year to select; needs to be in 4-letter format (e.g. 2013)
	 * @param	actRegarding	the Regarding field of the Activity item to select and open
	 * @throws InterruptedException 
	 */
	public boolean findCalendarActivity(String mon, String dd, String yyyy, String actRegarding) throws InterruptedException {
		String methodID = "findCalendarActivity";
		
		CommonNavigation commNav = PageFactory.initElements(driver, CommonNavigation.class);
		
		boolean result = false;
		
		//navigate to the Calendar Day list of the target activity
		goToCalendarDate(mon, dd, yyyy);
		
		//search for the Activity on the date that matches the given Regarding value 
		String targetActivityItemXPath = "//*[@id='calendar_daylist']/descendant::*[text()[contains(., '" + actRegarding + "')]]";
		try {
			WebElement foundActivity = driver.findElement(By.xpath(targetActivityItemXPath));
			commNav.highlightElement(foundActivity);
			result = true;
		}
		catch (Error e) {
			System.out.println(e.toString());
			result = false;
		}
		
		return result;
	}
	

	/**
	 * This method will navigate to a specific Calendar Day List view via the Generic Calendar date selection page.
	 * From the Calendar Day list, the activity item that matches the target Regarding value will be clicked to
	 * open the associated Activity Detail view.
	 * 
	 * @version	1.0
	 * @param	mon		month to select; need to be 3-letter, abbreviated month format (e.g. Jan, Feb, Mar, etc.)
	 * @param	dd		date to select; need to be 2-letter format (valid values: 01 - 31)
	 * @param	yyyy	year to select; needs to be in 4-letter format (e.g. 2013)
	 * @param	actRegarding	the Regarding field of the Activity item to select and open
	 * @throws InterruptedException 
	 */
	public void findNOpenCalendarActivity(String mon, String dd, String yyyy, String actRegarding) throws InterruptedException {
		String methodID = "findNOpenCalendarActivity";
		
		CommonNavigation commNav = PageFactory.initElements(driver, CommonNavigation.class);
		
		//navigate to the Calendar Day list of the target activity
		goToCalendarDate(mon, dd, yyyy);
		
		//search for the Activity on the date that matches the given Regarding value 
		String targetActivityItemXPath = "//*[@id='calendar_daylist']/descendant::*[text()[contains(., '" + actRegarding + "')]]";
		try {
			WebElement foundActivity = driver.findElement(By.xpath(targetActivityItemXPath));
			commNav.highlightNClick(foundActivity);
			commNav.waitForPage(actRegarding);
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
