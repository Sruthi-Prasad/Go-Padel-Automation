package GoPadelPages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GoPadelAddPadelBranchPage {
	WebDriver driver;
	String personName, branchName, branchPhone, branchEmail, branchAddress, branchDetails, branchLatitude,
			branchLongitude, TransectionFee, ServiceFees, Padelids, TaxPercentages;

	@FindBy(className = "breadcrumb")
	WebElement breadcrumb;

	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/div/div/div/form/div[1]/div[2]/div/div/input")
	WebElement branchNameField;

	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/div/div/div/form/div[1]/div[1]/div/div/input")
	WebElement personNameField;

	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/div/div/div/form/div[1]/div[3]/div/div/input")
	WebElement BranchPhone;

	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/div/div/div/form/div[1]/div[4]/div/div/input")
	WebElement branchEmailField;

	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/div/div/div/form/div[1]/div[5]/div/div/input")
	WebElement branchAddressField;

	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/div/div/div/form/div[1]/div[6]/div/div/input")
	WebElement branchDetailsField;

	@FindBy(xpath = "//*[@id='PadelId']")
	WebElement Padelid;

	@FindBy(xpath = "//*[@id='h-10']")
	WebElement H_starttime;

	@FindBy(xpath = "//*[@id=\"tm-15\"]")
	WebElement M_starttime;

	@FindBy(xpath = "//*[@class='dtp-btn-ok btn btn-flat']")
	WebElement starttimeokbutton;

	@FindBy(xpath = "//*[@id='th-1']")
	WebElement H_Endtime;

	@FindBy(xpath = "//*[@id='tm-30']")
	WebElement M_Endtime;

	@FindBy(xpath = "//*[@class='dtp-btn-ok btn btn-flat']")
	WebElement Endtimeokbutton;

	@FindBy(name = "StartTimeForMobile")
	WebElement BranchStartTimeMobileApp;

	@FindBy(xpath = "//*[@id=\"th-16\"]")
	WebElement H_starttimeMobile;

	@FindBy(xpath = "//*[@id='th-12']")
	WebElement M_starttimeMobile;

	@FindBy(id = "th-10")
	WebElement H_starttimeMobileapp;

	@FindBy(xpath = "//*[@id='th-11']")
	WebElement H_starttimemobile;

	@FindBy(xpath = "(//*[@id=\"th-11\"])[2]")
	WebElement M_Endtimemobile;

	@FindBy(css = "div[class='dtp'] .dtp-btn-ok")
	WebElement OkbuttonendBranchMobileApp;

	@FindBy(xpath = "//*[@id=\"dtp_Vazcd\"]/div/div[2]/button[3]")
	WebElement OkbuttonstartBranchMobileApp;

	@FindBy(name = "EndTimeForMobile")
	WebElement BranchendTimeMobileApp;

	@FindBy(xpath = "//*[@id=\"th-1\"]")
	WebElement H_startendtimemobile;

	@FindBy(xpath = " //*[@id='CityId']")
	WebElement cityDropdown;

	@FindBy(xpath = "//*[@id='ShowInMobileApp']")
	WebElement ShowInMobileApp;

	@FindBy(name = "ServiceFee")
	WebElement ServiceFee;

	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/div/div/div/form/div[1]/div[9]/div/div/input")
	WebElement branchLatitudeField;

	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/div/div/div/form/div[1]/div[10]/div/div/input")
	WebElement branchLongitudeField;

	@FindBy(xpath = "//*[@id='Status']")
	WebElement Status;

	@FindBy(name = "TransactionFeePercentage")
	WebElement TransectionFeePercentage;

	@FindBy(name = "StartTime")
	WebElement BranchStartTime;
	@FindBy(name = "TaxPercentage")
	WebElement TaxPercentage;

	@FindBy(name = "EndTime")
	WebElement BranchEndTime;

	@FindBy(xpath = "//*[@type='submit']")
	WebElement saveButton;

	@FindBy(xpath = "//*[@id=\"file\"]")
	WebElement BranchLogo;

	@FindBy(xpath = "//*[@id=\"example_filter\"]/label/input")
	WebElement searchBar;

	public GoPadelAddPadelBranchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void breadcrumb() {
		Assert.assertEquals(true, breadcrumb.isDisplayed());
		System.out.println(" breadcrumb is displayed with " + breadcrumb.getText());
		System.out.println("===========================================================");
	}

	public void PersonNameField() {
		Assert.assertEquals(true, personNameField.isDisplayed());
		System.out.println("Person Name Field is displayed");
		System.out.println("===========================================================");
		personName = "john";

		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy_mm_dd_hh:mm:ss:");
		long timeMilli = date.getTime();
		String strDate = dateFormat.format(date);
		String Name = personName + strDate + timeMilli;
		personNameField.sendKeys(Name);
	}

	public void BranchNameField() {
		Assert.assertEquals(true, branchNameField.isDisplayed());
		System.out.println("Branch Name Field is displayed");
		System.out.println("===========================================================");
		branchName = "xyz";

		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy_mm_dd_hh:mm:ss:");
		long timeMilli = date.getTime();
		String strDate = dateFormat.format(date);
		String Name = branchName + strDate + timeMilli;
		branchNameField.sendKeys(Name);
	}

	public void BranchPhoneField() {
		Assert.assertEquals(true, BranchPhone.isDisplayed());
		System.out.println("Branch Phone Field is displayed");
		System.out.println("===========================================================");
		branchPhone = "xyz";

		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy_mm_dd_hh:mm:ss:");
		long timeMilli = date.getTime();
		String strDate = dateFormat.format(date);
		String Name = branchPhone + strDate + timeMilli;
		BranchPhone.sendKeys(Name);
	}

	public void BranchEmailField() {
		Assert.assertEquals(true, branchEmailField.isDisplayed());
		System.out.println("Branch Email Field is displayed");
		System.out.println("===========================================================");
		branchEmail = "thomas@gmail.com";
		branchEmailField.sendKeys(branchEmail);
	}

	public void BranchAddressField() {
		Assert.assertEquals(true, branchAddressField.isDisplayed());
		System.out.println("Branch Address Field is displayed");
		System.out.println("===========================================================");
		branchAddress = "xyz,door2,xyz apartment,UAE";

		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy_mm_dd_hh:mm:ss:");
		long timeMilli = date.getTime();
		String strDate = dateFormat.format(date);
		String Name = branchAddress + strDate + timeMilli;
		branchAddressField.sendKeys(Name);
	}

	public void BranchDetailsField() {
		Assert.assertEquals(true, branchDetailsField.isDisplayed());
		System.out.println("Branch Details Field is displayed");
		System.out.println("===========================================================");
		branchDetails = "xyz,door2,xyz apartment,UAE";

		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy_mm_dd_hh:mm:ss:");
		long timeMilli = date.getTime();
		String strDate = dateFormat.format(date);
		String Name = branchDetails + strDate + timeMilli;
		branchDetailsField.sendKeys(Name);

	}

	public void PadelDropdown() {
		Assert.assertEquals(true, Padelid.isDisplayed());
		System.out.println("Padel Dropdown is displayed");
		System.out.println("===========================================================");
		Select padleName = new Select(Padelid);
		padleName.selectByIndex(1);

	}

	public void CityDropdown() {
		Assert.assertEquals(true, cityDropdown.isDisplayed());
		System.out.println("City Dropdown is displayed");
		System.out.println("===========================================================");
		Select city = new Select(cityDropdown);
		List<WebElement> citydropdown = city.getOptions();
		for (WebElement cityDropdown : citydropdown) {
			System.out.println(cityDropdown.getText());
		}
		city.selectByIndex(1);

	}

	public void BranchLatitudeField() {
		Assert.assertEquals(true, branchLatitudeField.isDisplayed());
		System.out.println("Branch Latitude Field is displayed");
		System.out.println("===========================================================");
		branchLatitude = "9.041100�N";
		branchLatitudeField.sendKeys(branchLatitude);
		;
	}

	public void TransectionFeePercentageField() {
		Assert.assertEquals(true, TransectionFeePercentage.isDisplayed());
		System.out.println("Branch Longitude Field is displayed");
		System.out.println("===========================================================");
		TransectionFee = "50";

		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy_mm_dd_hh:mm:ss:");
		long timeMilli = date.getTime();
		String strDate = dateFormat.format(date);
		String Name = TransectionFee + strDate + timeMilli;
		TransectionFeePercentage.sendKeys(Name);
		;

	}

	public void BranchLongitudeField() {
		Assert.assertEquals(true, branchLongitudeField.isDisplayed());
		System.out.println("Branch Longitude Field is displayed");
		System.out.println("===========================================================");
		branchLongitude = "76.602623�E";
		branchLongitudeField.sendKeys(branchLongitude);
		;

	}

	public void TaxPercentage() {
		Assert.assertEquals(true, TaxPercentage.isDisplayed());
		System.out.println("Branch Longitude Field is displayed");
		System.out.println("===========================================================");
		TaxPercentages = "20%";
		TaxPercentage.sendKeys(TaxPercentages);
		;

	}

	public void StatusDropdown() {
		Assert.assertEquals(true, Status.isDisplayed());
		System.out.println("Status Dropdown is displayed");
		Select status = new Select(Status);
		List<WebElement> statusdropdown = status.getOptions();
		for (WebElement statusDropdown : statusdropdown) {
			System.out.println(statusDropdown.getText());
		}
		status.selectByIndex(0);

	}

	public void BranchStartTime() {
		Assert.assertEquals(true, BranchStartTime.isDisplayed());
		System.out.println(" BranchStartTime field is displayed");
		BranchStartTime.click();
		starttimeokbutton.click();
		M_starttime.click();
		starttimeokbutton.click();

	}

	public void BranchEndTime() {
		Assert.assertEquals(true, BranchEndTime.isDisplayed());
		System.out.println(" BranchStartTime Field is displayed");
		BranchEndTime.click();
		Endtimeokbutton.click();
		M_Endtime.click();
		Endtimeokbutton.click();
	}

	public void BranchendstartTimeMobileApp() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Assert.assertEquals(true, BranchStartTimeMobileApp.isDisplayed());
		System.out.println(" BranchStartimeMobileApp Field is displayed");

		BranchStartTimeMobileApp.click();
		WebElement OkbuttonstartBranchMobileApp = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='dtp'] .dtp-btn-ok")));
		Actions acn = new Actions(driver);
		acn.moveToElement(OkbuttonstartBranchMobileApp).click().build().perform();
		acn.moveToElement(OkbuttonstartBranchMobileApp).click().build().perform();

	}

	public void BranchendendTimeMobileApp() {

		Assert.assertEquals(true, BranchendTimeMobileApp.isDisplayed());
		System.out.println(" BranchendimeMobileApp Field is displayed");
		BranchendTimeMobileApp.click();
		H_startendtimemobile.click();
		OkbuttonendBranchMobileApp.click();

		OkbuttonendBranchMobileApp.click();
	}

	public void ServicesFees() {
		Assert.assertEquals(true, ServiceFee.isDisplayed());
		System.out.println("ServiceFee Field is displayed");
		System.out.println("===========================================================");
		ServiceFees = "1000";

		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy_mm_dd_hh:mm:ss:");
		long timeMilli = date.getTime();
		String strDate = dateFormat.format(date);
		String Name = ServiceFees + strDate + timeMilli;
		ServiceFee.sendKeys(Name);
		;
	}

	public void Branchlogo() {
		Assert.assertEquals(true, BranchLogo.isDisplayed());
		System.out.println(" BranchLogo Field is displayed");

	}

	public void ShowInMobileApp() {
		Assert.assertEquals(true, ShowInMobileApp.isDisplayed());
		System.out.println("ShowInMobileApp Field is displayed");
		System.out.println("===========================================================");
		ShowInMobileApp.click();
		System.out.println("Toggle button is Enable   ");

	}

	public void SaveButton() {
		Assert.assertEquals(true, saveButton.isDisplayed());
		System.out.println("Save Button is displayed");
		System.out.println("=========================================================================");
		if (personName.isEmpty() && branchName.isEmpty() && branchPhone.isEmpty() && branchEmail.isEmpty()
				&& branchAddress.isEmpty() && branchDetails.isEmpty() && branchLatitude.isEmpty()
				&& branchLongitude.isEmpty()) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveButton);
			System.out.println("Error message is displayed as Please fill out this field");
		}

		else {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveButton);
			String expectedUrl = "https://staging.gopadel.ae/bookings/list-branches?PadelId=1";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl, actualUrl);
			System.out.println("Navigated to Padel Branch Page");
		}

	}

}
