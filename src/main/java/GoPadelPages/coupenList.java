package GoPadelPages;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class coupenList {
	WebDriver driver;

	WebDriverWait wait;

	@FindBy(xpath = "//*[@class=\"breadcrumb-item\"]")
	WebElement breadcrumb;

	@FindBy(xpath = "//*[text()='Create']")
	WebElement create;

	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/section/div/div/div[2]/div[1]/div[6]/button")
	WebElement save;

	@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead")
	WebElement tableheader;

	@FindBy(xpath = "//*[@id='txtsearchtitle']")
	WebElement searchbytittleorcode;

	@FindBy(tagName = "tbody")
	WebElement showentier;

	@FindBy(id = "txtsearchtitle")
	WebElement Search;

	@FindBy(css = "div[class='dtp'] .dtp-btn-now")
	WebElement today;

	@FindBy(css = "div[class='dtp'] .dtp-btn-ok")
	WebElement startokbutton;

	@FindBy(xpath = "//*[@id=\"txtstartdate\"]")
	WebElement startdate;

	@FindBy(xpath = "//*[@id=\"txtenddate\"]")
	WebElement enddate;

	@FindBy(xpath = "(//td[@data-date='31'])[2]")
	WebElement enddateclick;

	@FindBy(xpath = "//*[@id=\"dtp_6WL2L\"]/div/div[1]/div[3]/div[1]/table/tbody/tr[6]/td[3]/a")
	WebElement enddate31click;

	@FindBy(css = "div[class='dtp'] .dtp-btn-ok")
	WebElement endokbutton;

	public coupenList(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void breadcrumb() {
		Assert.assertEquals(true, breadcrumb.isDisplayed());
		System.out.println(" breadcrumb is displayed with " + breadcrumb.getText());
		System.out.println("===========================================================");
	}

	public void displayTableHeaders() {
		String expectedTableHeader = "Code Title Type Amount(AED) Total Used StartDate EndDate Created By Created Date Status";
		String actualTableHeader = tableheader.getText();
		Assert.assertEquals(expectedTableHeader, actualTableHeader);
		System.out.println("Table contains the coloumn headers such as" + " " + actualTableHeader);
		System.out.println("=============================================================================");

	}

	public void create() {
		Assert.assertEquals(true, create.isDisplayed());
		System.out.println(" create is displayed ");
		System.out.println("===========================================================");
		create.click();
		String expectedUrl = "https://gpv2.cadvil.com/Coupons/CreateCoupons";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
		System.out.println("Navigated to CreateCoupons Page");

	}

	public void searchbytittleorcode() {
		Assert.assertEquals(true, searchbytittleorcode.isDisplayed());
		System.out.println(" searchbytittleorcode is displayed ");
		System.out.println("===========================================================");

	}

	public void search()  {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Assert.assertEquals(true, Search.isDisplayed());
		System.out.println(" Search button is displayed ");
		searchbytittleorcode.click();
		searchbytittleorcode.clear();
		String search = "offer";
		WebElement  searchs = wait .until(ExpectedConditions.visibilityOfElementLocated(By.id("txtsearchtitle")));

		searchs.sendKeys( search);

//		Search.sendKeys(search);
		Assert.assertEquals(true, startdate.isDisplayed());
		Assert.assertEquals(true, enddate.isDisplayed());
		startdate.click();
		today.click();
		startokbutton.click();
		enddate.click();
		enddateclick.click();
		endokbutton.click();
		Search.click();
		System.out.println(showentier.getText());
	}

}
