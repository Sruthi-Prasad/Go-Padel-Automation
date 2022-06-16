package GoPadelPages;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class GopadelPadelCourts {

	WebDriver driver;

	@FindBy(xpath = "//*[@class=\"breadcrumb-item\"]")
	WebElement breadcrumb;
	@FindBy(xpath = "//*[text()='Excel']")
	WebElement Excel;
	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/div/div/a")
	WebElement addnewcourt;
	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/div/div/h2")
	WebElement padelcourttitle;
	@FindBy(xpath = "//*[text()='Back to Branches']")
	WebElement backtobranches;
	@FindBy(xpath = "//*[@id='ddlPadels']")
	WebElement CourtsforPadel;
	@FindBy(id = "ddlBranches")
	WebElement andBranch;
	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/div/div/a")
	WebElement addPadelcourtButton;
	@FindBy(xpath = "")
	WebElement tableTitle;
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr")
	WebElement tableHeader;
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0_filter\"]/label/input")
	WebElement searchBar;
	@FindBy(xpath = "//*[text()='Next']")
	WebElement nextButton;
	@FindBy(xpath = "//*[text()='Previous']")
	WebElement previousButton;
	@FindBy(xpath = "//*[@class=\"table-responsive\"]")
	WebElement showEntriesTable;

	public GopadelPadelCourts(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void displayTitle() {
		String expectedTitle = "Padel Courts";
		String actualTitle = padelcourttitle.getText();
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("Title is displayed as Padel Courts");
		System.out.println("===========================================================");
	}

	public void breadcrumb() {
		Assert.assertEquals(true, breadcrumb.isDisplayed());
		System.out.println(" breadcrumb is displayed with " + breadcrumb.getText());
		System.out.println("===========================================================");
	}

	public void displayaddPadelcourtButton() {
		Assert.assertEquals(true, addPadelcourtButton.isDisplayed());
		System.out.println("addPadelcourtButton is displayed");
		System.out.println("===========================================================");
	}

	public void displayExcel() {
		Assert.assertEquals(true, Excel.isDisplayed());
		System.out.println(" Excel is displayed");
		System.out.println("===========================================================");
		Excel.click();
		System.out.println("excel sheet is downloded ");
	}

	public void displayTableHeaders() {
		String expectedTableHeader = "SL No. Court Name Court Type Padel Branch Status Picture Action";
		String actualTableHeader = tableHeader.getText();
		Assert.assertEquals(expectedTableHeader, actualTableHeader);
		System.out.println("Table contains the coloumn headers such as" + " " + actualTableHeader);
		System.out.println("===========================================================");
	}

	public void displaySearchBar() {
		Assert.assertEquals(true, searchBar.isDisplayed());
		System.out.println("Search Bar is displayed");
		System.out.println("===========================================================");
	}

	public void displayNextButton() {
		Assert.assertEquals(true, nextButton.isDisplayed());
		System.out.println("Next Button is displayed");
		System.out.println("===========================================================");
	}

	public void displaybranchesfor() {
		Assert.assertEquals(true, addnewcourt.isDisplayed());
		System.out.println("Next Button is displayed");
		System.out.println("===========================================================");
	}

	public void displayandBranch() {
		Assert.assertEquals(true, andBranch.isDisplayed());
		System.out.println("andBranch field is displayed");
		System.out.println("===========================================================");
		Select Branch = new Select(andBranch);
		List<WebElement> citydropdown = Branch.getOptions();
		for (WebElement cityDropdown : citydropdown) {
			System.out.println(cityDropdown.getText());
		}
		Branch.selectByVisibleText(null);

	}

	public void displayPreviousButton() {
		Assert.assertEquals(true, previousButton.isDisplayed());
		System.out.println("Previous Button is displayed");
		System.out.println("===========================================================");
	}

	public void searchBarFunctionality() {
		Scanner search = new Scanner(System.in);
		System.out.println("Enter the keyword to search : ");
		System.out.println("===========================================================");
		String keyword = "ABC";
		searchBar.sendKeys(keyword);
		System.out.println(showEntriesTable.getText());
	}

	public void clickaddPadelcourtButton() {
		Select padel = new Select(CourtsforPadel);
		padel.selectByVisibleText("Anandu Padel");

		Select branch = new Select(andBranch);
		branch.selectByVisibleText("Anandu branch");

		addPadelcourtButton.click();
		String expectedUrl = "https://staging.gopadel.ae/bookings/add-court?PadelId=75&BranchId=86";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
		System.out.println("Navigated to Add Padel Branch Page");
		System.out.println("===========================================================");
	}

	public void verifyPadelBranchAdded() {
		System.out.println(addPadelcourtButton.getText());
	}

	public void clickAddbranch() {

		addPadelcourtButton.click();
	}

}
