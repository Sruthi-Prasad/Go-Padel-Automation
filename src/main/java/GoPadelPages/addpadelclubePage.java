package GoPadelPages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class addpadelclubePage {
	WebDriver driver;
	String ClubName, name, Mobilenumber, pnumber, email, webfield, address, confirmpassword, passwords, clubdetail,
			description, confirmpasswords;

	public addpadelclubePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/div/div/div/ul/li[1]/a/i")
	WebElement home;
	@FindBy(xpath = "//*[@id='divdynemicmenu']/div[3]/div/div/div/ul/li[2]/a")
	WebElement padels;
	@FindBy(xpath = "//*[@id='divdynemicmenu']/div[3]/div/div/div/ul/li[2]/a")
	WebElement AddModifyPadel;
	@FindBy(xpath = "//*[@id='divdynemicmenu']/div[3]/main/div/div/div/form/div[1]/div/div[1]/div/div/input")
	WebElement PersonalNamefield;
	@FindBy(xpath = "//*[@id=\"padel_name\"]")
	WebElement PadelClubName;
	@FindBy(xpath = "//*[@id='phone_number']")
	WebElement phone_number;
	@FindBy(xpath = "//*[@id=\"mobile_number\"]")
	WebElement mobilenumber;
	@FindBy(xpath = "//*[@id='email']")
	WebElement emailfield;
	@FindBy(xpath = "//*[@id='web']")
	WebElement web;
	@FindBy(xpath = "//*[@id='password']")
	WebElement password;
	@FindBy(xpath = "//*[@id='confirm_password']")
	WebElement confirmPassword;
	@FindBy(xpath = "//*[@id='address']")
	WebElement Addressfield;
	@FindBy(xpath = "//*[@id='Status']")
	WebElement status;
	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/div/div/div/form/div[1]/div/div[11]/div/textarea")
	WebElement padeldetails;
	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/div/div/div/form/div[1]/div/div[12]/div/textarea")
	WebElement padeldescription;
	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/div/div/div/form/div[1]/div/label")
	WebElement padellogo;
	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/div/div/div/form/div[2]/button")
	WebElement savebutton;

	public void displayhome() {
		Assert.assertEquals(true, home.isDisplayed());
		System.out.println("AddPadelclubes is displayed");
		System.out.println("===========================================================");
	}

	public void padels() {
		Assert.assertEquals(true, padels.isDisplayed());
		System.out.println(" padels is displayed");
		System.out.println("===========================================================");
	}

	public void AddModifyPadel() {
		Assert.assertEquals(true, padels.isDisplayed());
		System.out.println(" AddModifyPadel is displayed");
		System.out.println("===========================================================");
	}

	public void PersonNameField() {
		Assert.assertEquals(true, PersonalNamefield.isDisplayed());
		System.out.println("Person Name Field is displayed");
		System.out.println("===========================================================");
		name = "thomas";

		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy_mm_dd_hh:mm:ss:");
		long timeMilli = date.getTime();
		String strDate = dateFormat.format(date);
		String Name = name + strDate + timeMilli;
		PersonalNamefield.sendKeys(Name);

	}

	public void padelclubNameField() {
		Assert.assertEquals(true, PadelClubName.isDisplayed());
		System.out.println("PadelClub Name Field is displayed");
		System.out.println("===========================================================");
		ClubName = "ABCClub";

		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy_mm_dd_hh:mm:ss:");
		long timeMilli = date.getTime();
		String strDate = dateFormat.format(date);
		String Name = ClubName + strDate + timeMilli;
		PadelClubName.sendKeys(Name);
	}

	public void padelclubmobileField() {
		Assert.assertEquals(true, mobilenumber.isDisplayed());
		System.out.println("padelclub mobile Field is displayed");
		System.out.println("===========================================================");
		Mobilenumber = "9447555891";

		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy_mm_dd_hh:mm:ss:");
		long timeMilli = date.getTime();
		String strDate = dateFormat.format(date);
		String Name = Mobilenumber + strDate + timeMilli;
		mobilenumber.sendKeys(Name);
	}

	public void padelclubphoneField() {
		Assert.assertEquals(true, phone_number.isDisplayed());
		System.out.println("PadelClub Phone Field is displayed");
		System.out.println("===========================================================");
		pnumber = "7896543215";

		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy_mm_dd_hh:mm:ss:");
		long timeMilli = date.getTime();
		String strDate = dateFormat.format(date);
		String Name = pnumber + strDate + timeMilli;
		phone_number.sendKeys(Name);
	}

	public void padelclubEmailField() {
		Assert.assertEquals(true, emailfield.isDisplayed());
		System.out.println("PadelClub Email Field is displayed");
		System.out.println("===========================================================");
		 email = "thomas@gmail.com";
		emailfield.sendKeys(email);
	}

	public void padelclubwebField() {
		Assert.assertEquals(true, web.isDisplayed());
		System.out.println("PadelClub web Field is displayed");
		System.out.println("===========================================================");
		webfield = "https://www.tho.com";

		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy_mm_dd_hh:mm:ss:");
		long timeMilli = date.getTime();
		String strDate = dateFormat.format(date);
		String Name = webfield + strDate + timeMilli;
		web.sendKeys(Name);
	}

	public void padelpasswordField() {
		Assert.assertEquals(true, password.isDisplayed());
		System.out.println("Password  Field is displayed");
		System.out.println("===========================================================");
		passwords = "123456";

		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy_mm_dd_hh:mm:ss:");
		long timeMilli = date.getTime();
		String strDate = dateFormat.format(date);
		String Name = passwords + strDate + timeMilli;
		password.sendKeys(Name);
	}

	public void padelconfirmpasswordField() {
		Assert.assertEquals(true, confirmPassword.isDisplayed());
		System.out.println("confirmPassword Field is displayed");
		System.out.println("===========================================================");
		confirmpasswords = "123456";

		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy_mm_dd_hh:mm:ss:");
		long timeMilli = date.getTime();
		String strDate = dateFormat.format(date);
		String Name = confirmpasswords + strDate + timeMilli;
		confirmPassword.sendKeys(Name);
	}

	public void padelclubAddressField() {
		Assert.assertEquals(true, Addressfield.isDisplayed());
		System.out.println("PadelClub Address Field is displayed");
		System.out.println("===========================================================");
		address = "2 street,door2,ABC apartment,UAE";

		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy_mm_dd_hh:mm:ss:");
		long timeMilli = date.getTime();
		String strDate = dateFormat.format(date);
		String Name = address + strDate + timeMilli;
		Addressfield.sendKeys(Name);
	}

	public void StatusDropdown() {
		Assert.assertEquals(true, status.isDisplayed());
		System.out.println("Status Dropdown is displayed");
		System.out.println("===========================================================");
		Select Status = new Select(status);
		List<WebElement> statusdropdown = Status.getOptions();
		for (WebElement statusDropdown : statusdropdown) {
			System.out.println(statusDropdown.getText());
		}
		Status.selectByIndex(0);

	}

	public void padelclubDetailsField() {
		Assert.assertEquals(true, padeldetails.isDisplayed());
		System.out.println("PadelClub Details Field is displayed");
		System.out.println("===========================================================");
		clubdetail = "ABCclub ,UAE";

		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy_mm_dd_hh:mm:ss:");
		long timeMilli = date.getTime();
		String strDate = dateFormat.format(date);
		String Name = clubdetail + strDate + timeMilli;
		padeldetails.sendKeys(Name);
	}

	public void padelclubdescription() {
		Assert.assertEquals(true, padeldescription.isDisplayed());
		System.out.println("PadelClub Details Field is displayed");
		System.out.println("===========================================================");
		description = "ABC Description";

		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy_mm_dd_hh:mm:ss:");
		long timeMilli = date.getTime();
		String strDate = dateFormat.format(date);
		String Name = description + strDate + timeMilli;
		padeldescription.sendKeys(Name);   

	}

	public void SaveButton() {
		Assert.assertEquals(true, savebutton.isDisplayed());
		System.out.println("Save Button is displayed");
		if (name.isEmpty() && ClubName.isEmpty() && Mobilenumber.isEmpty() && pnumber.isEmpty() && email.isEmpty()
				&& passwords.isEmpty() && confirmpassword.isEmpty() && webfield.isEmpty()) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", savebutton);
			System.out.println("Error message is displayed as Please fill out this field");
			System.out.println("===========================================================");
		} else {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", savebutton);
			String expectedUrl = "https://staging.gopadel.ae/bookings/list-padels";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl, actualUrl);
			System.out.println("Navigated to Padel club Page");
			System.out.println("===========================================================");
		}
	}
}
