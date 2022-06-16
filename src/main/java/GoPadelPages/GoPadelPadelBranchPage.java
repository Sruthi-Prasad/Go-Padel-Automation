package GoPadelPages;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class GoPadelPadelBranchPage {
	WebDriver driver;

	@FindBy(xpath = "//*[text()='Padels']")
	WebElement Padel;
	@FindBy(xpath ="//*[text()='Branches']")
	WebElement Branches;
	@FindBy(xpath ="//*[@id=\"divdynemicmenu\"]/div[3]/div/div/div/ul/li[1]/a/i")
	WebElement home;
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0_wrapper\"]/div[1]/a")
	WebElement Excel;
	@FindBy(xpath ="//*[@id=\"divdynemicmenu\"]/div[3]/div/div/div/ul/li[1]/a/i")
	WebElement addnewbranch;
	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/div/div/h2")
	WebElement padelbranchestitle;
	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/main/div/div/div/a")
	WebElement backtoclub;
	@FindBy(xpath ="//*[text()='Branches for :']")
	WebElement Branchesfor;
	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/div/div/a")
	WebElement addPadelBranchButton;
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead")
	WebElement tableTitle;
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr")
	WebElement tableHeader;
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0_filter\"]/label/input")
	WebElement searchBar;
	@FindBy(xpath = "//*[@id=\"ddlPadels\"]")
	WebElement showEntriesBranchesfor;
	@FindBy(xpath = "//*[text()='Next']")
	WebElement nextButton;
	@FindBy(xpath ="//*[text()='Previous']")
	WebElement previousButton;
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody")
	WebElement showEntriesTable;
	

	public GoPadelPadelBranchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void displayTitle() {
		String expectedTitle = "Padel Branches";
		String actualTitle = padelbranchestitle.getText();
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("Title is displayed as Padel Branch");
		System.out.println("============================================================================");
	}

	public void displayAddPadelBranchButton() {
		Assert.assertEquals(true, addPadelBranchButton.isDisplayed());
		System.out.println("Add Padel Branch Button is displayed");
		System.out.println("============================================================================");
	}
	public void displaypadels() {
		Assert.assertEquals(true, Padel.isDisplayed());
		System.out.println("Pade Button is displayed");
		System.out.println("============================================================================");
	}
	public void displayBranches() {
		Assert.assertEquals(true, Branches.isDisplayed());
		System.out.println("Branches Button is displayed");
		System.out.println("============================================================================");
	}
	
	public void displayhome() {
		Assert.assertEquals(true, home.isDisplayed());
		System.out.println(" home is displayed");
		System.out.println("============================================================================");
	}
	public void Excel() {
		Assert.assertEquals(true,Excel.isDisplayed());
		System.out.println(" home is displayed");
		System.out.println("============================================================================");
	}
		
	public void displayTableHeaders() {
		String expectedTableHeader = "SL No. Branch Name Phone/Email Timings Address Courts Status Action";
		String actualTableHeader = tableHeader.getText();
		Assert.assertEquals(expectedTableHeader, actualTableHeader);
		System.out.println("Table contains the coloumn headers such as" + " " + actualTableHeader);
		System.out.println("=============================================================================");
	}
	public void displaySearchBar() {
		Assert.assertEquals(true, searchBar.isDisplayed());
		System.out.println("Search Bar is displayed");
		System.out.println("============================================================================");
	}

	public void displayNextButton() {
		Assert.assertEquals(true, nextButton.isDisplayed());
		System.out.println("Next Button is displayed");
		System.out.println("============================================================================");
	}
	public void displaybranchesfor() {
		Assert.assertEquals(true, nextButton.isDisplayed());
		System.out.println("Next Button is displayed");
		System.out.println("============================================================================");
	}
	public void displayPreviousButton() {
		Assert.assertEquals(true, previousButton.isDisplayed());
		System.out.println("Previous Button is displayed");
		System.out.println("============================================================================");
	}

	public void selectFromShowEntriesDropdown() {
		Select entries = new Select(showEntriesBranchesfor);
		showEntriesBranchesfor.click();
		entries.selectByIndex(1);
		System.out.println(showEntriesTable.getText());
	}

	public void searchBarFunctionality() {
		Scanner search = new Scanner(System.in);
		System.out.println("Enter the keyword to search : ");
		System.out.println("============================================================================");
		String keyword = "thomas";
		searchBar.sendKeys(keyword);
		System.out.println(showEntriesTable.getText());
	}

	public void clickAddPanellButton() {
		addPadelBranchButton.click();
		String expectedUrl = "https://gpv2.cadvil.com/bookings/add-branch?PadelId=0";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
		System.out.println("Navigated to Add Padel Branch Page");
		System.out.println("============================================================================");
	}
	
	

	public void verifyPadelBranchAdded() {
		System.out.println(addPadelBranchButton.getText());
	}
	
	public void clickAddbranch() {
	addPadelBranchButton.click();
	}
	
}
