package GoPadelPages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class GoPadelAddPadelcourtPage {
	WebDriver driver;

	String PadelNames, CourtNames, CourtTypes, status;

	@FindBy(className = "breadcrumb-item")
	WebElement breadcrumb;

	@FindBy(xpath = "//*[@id='ddPadel']")
	WebElement PadelName;

	@FindBy(name = "ddPadelBranch")
	WebElement PadelBranch;

	@FindBy(name = "CourtName")
	WebElement CourtName;

	@FindBy(name = "CourtType")
	WebElement CourtType;

	@FindBy(id = "Status")
	WebElement Status;

	@FindBy(xpath = "//*[text()='Allow Booking From Mobile App']")
	WebElement AllowBookingFromMobileApp;

	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/div/div/div/form/div/div[8]/button")
	WebElement saveButton;
	
	@FindBy(xpath ="//*[@id=\"divdynemicmenu\"]/div[3]/div/div/div/ul/li[1]/a/i")
	WebElement Home;

	public GoPadelAddPadelcourtPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void breadcrumb() {
		Assert.assertEquals(true, breadcrumb.isDisplayed());
		System.out.println(" breadcrumb is displayed with " + breadcrumb.getText());
		System.out.println("===========================================================");
	}

	public void PadelName() {
		Assert.assertEquals(true, PadelName.isDisplayed());
		System.out.println(" PadelName is displayed with " + PadelName.getText());
	}

	public void PadelBranch() {
		Assert.assertEquals(true, PadelBranch.isDisplayed());
		System.out.println(" PadelName is displayed with " + PadelBranch.getText());
	}

	public void CourtType(){
		Assert.assertEquals(true, CourtType.isDisplayed());
		System.out.println(" CourtName is displayed");
		System.out.println("============================================================================");
		CourtName.click();
		Select courtselect = new Select(CourtType);
		List<WebElement> courtdropdown = courtselect.getOptions();
		System.out.println("============================================================================");
		System.out.println("  court dropdown consist");
		for (WebElement court : courtdropdown) {
			System.out.println(CourtType.getText());
		}
		courtselect.selectByVisibleText("Indoor");
	}
	
	public void CourtName() {
		Assert.assertEquals(true, CourtName.isDisplayed());
		System.out.println("CourtType Button is displayed");
		System.out.println("============================================================================");
		CourtNames = "Court-";

		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy_mm_dd_hh:mm:ss:");
		long timeMilli = date.getTime();
		String strDate = dateFormat.format(date);
		String Name = CourtNames + strDate + timeMilli;
		 CourtName.sendKeys(Name);
	}

	public void Status() {
		Assert.assertEquals(true, Status.isDisplayed());
		System.out.println("Status Dropdown is displayed");
		Status.click();
		Select status = new Select(Status);
		List<WebElement> statusdropdown = status.getOptions();
		for (WebElement statusDropdown : statusdropdown) {
			System.out.println(statusDropdown.getText());
		}
		status.selectByIndex(0);

	}

	public void AllowBookingFromMobileApp() {
		Assert.assertEquals(true, AllowBookingFromMobileApp.isDisplayed());
		System.out.println("AllowBookingFromMobileApp is displayed");
		AllowBookingFromMobileApp.click();
	}
	
	

	public void SaveButton() {
		Assert.assertEquals(true, saveButton.isDisplayed());
		System.out.println("Save Button is displayed");
		System.out.println("=========================================================================");
		PadelNames = PadelName.getText();
		CourtNames = CourtName.getText();
		CourtTypes = CourtType.getText();
		if (PadelNames.isEmpty() && CourtNames.isEmpty() && CourtTypes.isEmpty()) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveButton);
			System.out.println("Error message is displayed as Please fill out this field");
		}

		else {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveButton);
			System.out.println("Navigated to Padel Branch Page");
		}
		
		Home.click();
		
		
	}
}
