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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GopadelCreatecouppage {
	WebDriver driver;

	WebDriverWait wait;
	String Titles, DiscountTypes, Descriptions, amount, Codes, Limit, PerPersonLimits, TotalUsables, StartDates,
			matches, EndDates;
	@FindBy(className = "breadcrumb-item")
	WebElement breadcrumb;

	@FindBy(xpath = "//*[@id='Title']")
	WebElement Title;

	@FindBy(xpath = "//*[@id='DiscountType']")
	WebElement DiscountType;

	@FindBy(xpath = "//*[@id='Description']")
	WebElement Description;

	@FindBy(xpath = "//*[@id='Amount']")
	WebElement Amounts;

	@FindBy(xpath = "//*[@id='StartDate']")
	WebElement StartDate;

	@FindBy(xpath = "//*[@id='NoOfLimit']")
	WebElement TotalUsable;

	@FindBy(xpath = "//*[@id='NoOfPersonLimit']")
	WebElement PerPersonLimit;

	@FindBy(xpath = "//*[@id='IsNoOfLimit']")
	WebElement NoLimit;

	@FindBy(xpath = "//*[text()='Per Person No Limit']")
	WebElement perperson;

	@FindBy(xpath = "//*[@id='NoOfDailyLimit']")
	WebElement NumberOfCode;

	@FindBy(xpath = "//*[@id='Code']")
	WebElement Code;

	@FindBy(xpath = "//*[@id='Status']")
	WebElement status;
	@FindBy(xpath = "//*[text()='Daily No Limit']")
	WebElement DailyNoLimit;

	@FindBy(xpath = "//*[text()='Random Code']")
	WebElement RandomCode;

	@FindBy(xpath = "//*[text()='Valid For All']")
	WebElement ValidForAll;

	@FindBy(xpath = "//*[text()='Is Alphanumeric']")
	WebElement IsAlphanumeric;

	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/section/div/div/div[1]/h2")
	WebElement CreateDiscountCoupons;

	@FindBy(xpath = "//*[@id='EndDate']")
	WebElement EndDate;

	@FindBy(xpath = "(//*[text()='Today'])[2]")
	WebElement Today;

	@FindBy(xpath = "(//*[text()='OK'])[2]")
	WebElement Startdateokbutton;
	@FindBy(name = "NoOfDailyLimit")
	WebElement DailyLimit;

	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/section/div/div/div[2]/form/div[9]/div/button")
	WebElement savebutton;

	@FindBy(xpath = "(//*[text()='OK'])[1]")
	WebElement enddateokbutton;

	@FindBy(xpath = "(//*[text()='31'])[1]")
	WebElement end31date;

	@FindBy(xpath = "//*[@id=\"NoOfCode\"]")
	WebElement SelectCustomers;

	@FindBy(xpath = "//*[@id='Status']")
	WebElement Status;

	public GopadelCreatecouppage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void breadcrumb() {
		Assert.assertEquals(true, breadcrumb.isDisplayed());
		System.out.println(" breadcrumb is displayed with " + breadcrumb.getText());
		System.out.println("===========================================================");
	}

	public void Title() {
		Assert.assertEquals(true, Title.isDisplayed());
		System.out.println("Title Field is displayed");
		System.out.println("===========================================================");
		Titles = "Meghaoffer";

		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy_mm_dd_hh:mm:ss:");
		long timeMilli = date.getTime();
		String strDate = dateFormat.format(date);
		String Name = Titles + strDate + timeMilli;
		Title.sendKeys(Name);
	}

	public void DiscountType() {
		Assert.assertEquals(true, DiscountType.isDisplayed());
		System.out.println("DiscountType Field is displayed");
		System.out.println("===========================================================");
		DiscountTypes = "30%";

		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy_mm_dd_hh:mm:ss:");
		long timeMilli = date.getTime();
		String strDate = dateFormat.format(date);
		String Name = DiscountTypes + strDate + timeMilli;
		DiscountType.sendKeys(Name);
	}

	public void Description() {
		Assert.assertEquals(true, Description.isDisplayed());
		System.out.println(" Description Field is displayed");
		System.out.println("===========================================================");
		Descriptions = "30%";

		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy_mm_dd_hh:mm:ss:");
		long timeMilli = date.getTime();
		String strDate = dateFormat.format(date);
		String Name = Descriptions + strDate + timeMilli;
		Description.sendKeys(Name);
	}

	public void Amounts() {
		wait = new WebDriverWait(driver, 20);
		Assert.assertEquals(true, Amounts.isDisplayed());
		System.out.println(" Amount Field is displayed");
		System.out.println("===========================================================");
		Amounts.click();
		Amounts.sendKeys("500");
	}

	public void NoLimit() {
		Assert.assertEquals(true, NoLimit.isDisplayed());
		System.out.println("NoLimit Field is displayed");
		System.out.println("===========================================================");
	}

	public void IsAlphanumeric() {
		Assert.assertEquals(true, IsAlphanumeric.isDisplayed());
		System.out.println("IsAlphanumericis displayed");
		System.out.println("===========================================================");
	}

	public void RandomCode() {
		Assert.assertEquals(true, RandomCode.isDisplayed());
		System.out.println("RandomCode displayed");
		System.out.println("===========================================================");

	}

	public void ValidForAll() {
		Assert.assertEquals(true, ValidForAll.isDisplayed());
		System.out.println("ValidForAll displayed");
		System.out.println("===========================================================");
		ValidForAll.click();
	}

	public void startdate() {
		Assert.assertEquals(true, StartDate.isDisplayed());
		System.out.println("StartDate displayed");
		System.out.println("===========================================================");
		StartDate.click();
		Today.click();
		Startdateokbutton.click();

	}

	public void EndDate() {
		Assert.assertEquals(true, EndDate.isDisplayed());
		System.out.println("EndDate displayed");
		System.out.println("===========================================================");
		EndDate.click();
		end31date.click();
		enddateokbutton.click();

	}

	public void Code() {
		Assert.assertEquals(true, Code.isDisplayed());
		System.out.println("Code displayed");
		System.out.println("===========================================================");
		IsAlphanumeric.click();

	}

	public void DailyNoLimit() {
		Assert.assertEquals(true, DailyLimit.isDisplayed());
		System.out.println("DailyNoLimit displayed");
		System.out.println("===========================================================");
	}

	public void DailyLimit() {
		Assert.assertEquals(true, DailyLimit.isDisplayed());
		System.out.println("DailyLimit displayed");
		System.out.println("===========================================================");
		DailyLimit.click();
		DailyLimit.sendKeys("10");
	}

	public void PerPersonLimit() {
		Assert.assertEquals(true, PerPersonLimit.isDisplayed());
		System.out.println("PerPersonLimit Field is displayed");
		System.out.println("===========================================================");
		PerPersonLimit.click();
		PerPersonLimit.sendKeys("5");
	}

	public void TotalUsable() {
		Assert.assertEquals(true, TotalUsable.isDisplayed());
		System.out.println("TotalUsable displayed");
		System.out.println("===========================================================");
		TotalUsable.click();
		TotalUsable.sendKeys("2");
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

	public void savebutton() {
		Assert.assertEquals(true, savebutton.isDisplayed());
		System.out.println("Save Button is displayed");
		System.out.println("=========================================================================");
		EndDates = EndDate.getText();
		StartDates = StartDate.getText();
		Codes = Code.getText();
		Titles = Title.getText();
		if (Descriptions.isEmpty() && amount.isEmpty() && Codes.isEmpty() && StartDates.isEmpty() && EndDates.isEmpty()
				&& Titles.isEmpty()) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", savebutton);
			System.out.println("Error message is displayed as Please fill out this field");
		}

		else {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", savebutton);

			System.out.println("Navigated to coupen list Page");
		}

	}
}
