package GoPadelTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import GoPadelPages.GoPadelAddPadelBranchPage;
import GoPadelPages.GoPadelAddPadelcourtPage;
import GoPadelPages.GoPadelDashboardPage;
import GoPadelPages.GoPadelLoginPage;
import GoPadelPages.GoPadelPadelBranchPage;
import GoPadelPages.GoPadelforgetpasswordpage;
import GoPadelPages.GoPadelpadellistpage;
import GoPadelPages.GopadelCreatecouppage;
import GoPadelPages.GopadelPadelCourts;
import GoPadelPages.addpadelclubePage;
import GoPadelPages.coupenList;
import TestScenario.GoPadelTestBase;

public class GoPadelTest extends GoPadelTestBase {

	GoPadelLoginPage loginPage;
	GoPadelPadelBranchPage padelBranchPage;
	GoPadelpadellistpage padellistPage;
	addpadelclubePage padelclubePage;
	GoPadelAddPadelBranchPage AddPadelBranchPage;
	GoPadelDashboardPage dashboardPage;
	GopadelPadelCourts PadelCourts;
	GoPadelAddPadelcourtPage AddPadelcourtPage;
	GoPadelDashboardPage DashboardPage;
	GoPadelforgetpasswordpage Password;
	WebDriverWait wait;
	GopadelCreatecouppage Createcouppage;
	coupenList createcoupenList;

	private static final Logger log = LogManager.getLogger(GoPadelTest.class);

	@Test(priority = 0)
	public void loginTest() {

		log.info("Verifying successful login.");

		loginPage = new GoPadelLoginPage(driver);

		String expectedSignLabel = "Log in";
		String actualSignLabel = loginPage.signinLabel();
		log.info(" expectedSignLabel-" + expectedSignLabel + " and actualSignLabel - " + actualSignLabel);
		Assert.assertEquals(expectedSignLabel, actualSignLabel);
		System.out.println("Login In is Displayed");

		loginPage.displayusername();
		loginPage.displayPassword();
		loginPage.displayForgotPassword();
		loginPage.clickSubmitButton();
		loginPage.displayAboutUs();
		loginPage.displayContactUs();
		loginPage.displayServices();
		loginPage.displayFAQ();
		loginPage.displaylinkedin();
		loginPage.displayTwitter();
		loginPage.displayfacebook();
		loginPage.displayGoogleplus();

	}

	@DataProvider(name = "loginCredentials")
	public Object[][] getData() {
		return new Object[][] {

				{ "gkg", "Admin@12345", "Wrong username or password." },
				{ "admin", "12345", "Wrong username or password.." },
				{ "kjfkdf", "23135", "Wrong username or password." },
				{ "admin", "  ", "Please fill out the field" },
				{ "admin", "Admin@12345", " " }, };
	};

	@Test(dataProvider = "loginCredentials")
	public void loginfunction(String UserName, String Password, String Errormessage) {

		WebElement username = driver
				.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div/form/div[1]/input"));
		username.clear();
		username.sendKeys(UserName);
		WebElement password = driver
				.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div/form/div[2]/input"));
		password.clear();
		password.sendKeys(Password);
		WebElement submit = driver.findElement(By.xpath("//*[text()='Submit']"));
		submit.click();
	}

	@Test(priority = 1)
	public void main() {
		DashboardPage = new GoPadelDashboardPage(driver);
		DashboardPage.Logout();
	}

	@Test(priority = 2)
	public void forgetPassword() {

		Password = new GoPadelforgetpasswordpage(driver);
		Password.Forgetdisplay();
		Password.email();
	}

	@Test(priority = 3)
	public void PadelBranchesTest() {

		log.info("Verifying successful login.");

		loginPage = new GoPadelLoginPage(driver);

		GoPadelDashboardPage dashboardPage = loginPage.login("admin", "Admin@12345");
		dashboardPage.clickOnpadellists();
		}

	@Test(priority = 4)
	public void padellistPageTest() {
		padellistPage = new GoPadelpadellistpage(driver);
		padellistPage.displayhomebutton();
		padellistPage.displayPreviousButton();
		padellistPage.displayNextButton();
		padellistPage.displaySearchBar();
		padellistPage.displayAddPadelclubes();
		padellistPage.searchBarFunctionality();
		padellistPage.clickAddPanellistButton();
	}

	@Test(priority = 5)
	public void addpadelpage() {
		padelclubePage = new addpadelclubePage(driver);
		padelclubePage.AddModifyPadel();
		padelclubePage.displayhome();
		padelclubePage.PersonNameField();
		padelclubePage.padelclubNameField();
		padelclubePage.padelclubphoneField();
		padelclubePage.padelclubmobileField();
		padelclubePage.padelclubEmailField();
		padelclubePage.padelclubwebField();
		padelclubePage.padelpasswordField();
		padelclubePage.padelconfirmpasswordField();
		padelclubePage.padelclubAddressField();
		padelclubePage.StatusDropdown();
		padelclubePage.padelclubDetailsField();
		padelclubePage.padelclubdescription();
		padelclubePage.SaveButton();
	}

	@Test(priority = 6)
	public void VerifyAddedPadelBranchTest() {
		padellistPage.verifyPadellistAdded();
	}

	@Test(priority = 7)
	public void clickOnPadelBranches() {
		dashboardPage = new GoPadelDashboardPage(driver);
		dashboardPage.clickOnPadelBranches();

	}

	@Test(priority = 8)
	public void PadelBranchPageTest() {
		padelBranchPage = new GoPadelPadelBranchPage(driver);
		padelBranchPage.displayTitle();
		padelBranchPage.searchBarFunctionality();
		padelBranchPage.displayAddPadelBranchButton();
		padelBranchPage.displaybranchesfor();
		padelBranchPage.displayTableHeaders();
		padelBranchPage.displaySearchBar();
		padelBranchPage.Excel();
		padelBranchPage.displayNextButton();
		padelBranchPage.displayPreviousButton();
		padelBranchPage.verifyPadelBranchAdded();
		padelBranchPage.displayhome();
		padelBranchPage.displayBranches();
		padelBranchPage.displaypadels();
		padelBranchPage.selectFromShowEntriesDropdown();
		padelBranchPage.clickAddbranch();
	}

	@Test(priority = 10)
	public void AddPadelBranchPage() {
		AddPadelBranchPage = new GoPadelAddPadelBranchPage(driver);
		AddPadelBranchPage.breadcrumb();
		AddPadelBranchPage.PersonNameField();
		AddPadelBranchPage.BranchNameField();
		AddPadelBranchPage.BranchPhoneField();
		AddPadelBranchPage.BranchEmailField();
		AddPadelBranchPage.BranchDetailsField();
		AddPadelBranchPage.BranchAddressField();
		AddPadelBranchPage.BranchLatitudeField();
		AddPadelBranchPage.BranchLongitudeField();
		AddPadelBranchPage.CityDropdown();
		AddPadelBranchPage.PadelDropdown();
		AddPadelBranchPage.StatusDropdown();
		AddPadelBranchPage.TransectionFeePercentageField();
		AddPadelBranchPage.ServicesFees();
		AddPadelBranchPage.TaxPercentage();
		AddPadelBranchPage.ShowInMobileApp();
		AddPadelBranchPage.BranchStartTime();
		AddPadelBranchPage.BranchStartTime();
		AddPadelBranchPage.BranchendstartTimeMobileApp();
		AddPadelBranchPage.BranchendendTimeMobileApp();
		AddPadelBranchPage.ShowInMobileApp();
		AddPadelBranchPage.SaveButton();
	}

	@Test(priority = 11)
	public void clickOnPadelcourt() {
		dashboardPage = new GoPadelDashboardPage(driver);
		dashboardPage.clickOnPadelcourt();
	}

	@Test(priority = 12)
	public void PadelCourtsPage() {
		PadelCourts = new GopadelPadelCourts(driver);

		PadelCourts.breadcrumb();
		PadelCourts.displayNextButton();
		PadelCourts.displayPreviousButton();
		PadelCourts.displayExcel();
		PadelCourts.displaySearchBar();
		PadelCourts.displayTableHeaders();
		PadelCourts.displayTitle();
		PadelCourts.clickAddbranch();
		PadelCourts.displaybranchesfor();
		PadelCourts.displayaddPadelcourtButton();
		PadelCourts.clickaddPadelcourtButton();
	}

	@Test(priority = 13)
	public void AddPadelCourtsPage() {
		AddPadelcourtPage = new GoPadelAddPadelcourtPage(driver);
		AddPadelcourtPage.breadcrumb();
		AddPadelcourtPage.PadelName();
		AddPadelcourtPage.CourtName();
		AddPadelcourtPage.CourtType();
		AddPadelcourtPage.AllowBookingFromMobileApp();
		AddPadelcourtPage.Status();
		AddPadelcourtPage.SaveButton();
	}

	@Test(priority = 14)
	public void DiscountCoupons() {
		dashboardPage = new GoPadelDashboardPage(driver);
		dashboardPage.DiscountCoupons();
	}

	@Test(priority = 15)
	public void clickcreatecoupns() {
		Createcouppage = new GopadelCreatecouppage(driver);
		Createcouppage.Title();
		Createcouppage.DiscountType();
		Createcouppage.Description();
		Createcouppage.Amounts();
		Createcouppage.breadcrumb();
		Createcouppage.DailyNoLimit();
		Createcouppage.IsAlphanumeric();
		Createcouppage.NoLimit();
		Createcouppage.RandomCode();
		Createcouppage.startdate();
		Createcouppage.EndDate();
		Createcouppage.Code();
		Createcouppage.DailyLimit();
		Createcouppage.StatusDropdown();
		Createcouppage.PerPersonLimit();
		Createcouppage.TotalUsable();
		Createcouppage.savebutton();
	}
	@Test(priority = 16)
	public void coupenList() {
		createcoupenList = new coupenList(driver);
		createcoupenList.searchbytittleorcode();
		createcoupenList.displayTableHeaders();
		createcoupenList.search();
	}
}
