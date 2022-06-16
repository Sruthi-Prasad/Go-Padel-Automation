package GoPadelPages;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class GoPadelpadellistpage {
	WebDriver driver;

	@FindBy(xpath = "(//*[text()='Padel Branch'])[1]")
	WebElement title;

	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/div/div/div/ul/li[1]/a/i")
	WebElement homebutton;

	@FindBy(xpath = "//*[@id=\"divdynemicmenu\"]/div[3]/div/div/div/ul/li[2]/a")
	WebElement padellist;

	@FindBy(xpath = "//*[@id='divdynemicmenu']/div[3]/div/div/a")
	WebElement AddPadelclubes;

	@FindBy(xpath = "//*[@id=\"DataTables_Table_0_filter\"]/label/input")
	WebElement searchBar;

	@FindBy(xpath = "//*[@id=\"DataTables_Table_0_previous\"]")
	WebElement previousButton;

	@FindBy(xpath = "//*[@id=\"DataTables_Table_0_next\"]")
	WebElement nextButton;
	
	@FindBy(xpath ="//*[@id=\"DataTables_Table_0_wrapper\"]/div[1]/a")
	WebElement ExcelButton;
	
	@FindBy(xpath ="//*[@id=\"DataTables_Table_0\"]")
	WebElement showEntriesTable;
	
	@FindBy(xpath = "//*[@id='DataTables_Table_0']/tbody/tr[1]")
	WebElement addedPadellist;
	
public GoPadelpadellistpage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void displayhomebutton() {
	Assert.assertEquals(true, homebutton.isDisplayed());
	System.out.println("Search Bar is displayed");
	System.out.println("===========================================================");
}

public void displaySearchBar() {
	Assert.assertEquals(true, searchBar.isDisplayed());
	System.out.println("Search Bar is displayed");
	System.out.println("===========================================================");
}

public void displayAddPadelclubes() {
	Assert.assertEquals(true, AddPadelclubes.isDisplayed());
	System.out.println("AddPadelclubes is displayed");
	System.out.println("===========================================================");
}

public void displayNextButton() {
	Assert.assertEquals(true, nextButton.isDisplayed());
	System.out.println("Next Button is displayed");
	System.out.println("===========================================================");
}

public void displayPreviousButton() {
	Assert.assertEquals(true, previousButton.isDisplayed());
	System.out.println("Previous Button is displayed");
	System.out.println("===========================================================");
}

public void displayExcelButton() {
	Assert.assertEquals(true, ExcelButton.isDisplayed());
	System.out.println("Previous Button is displayed");
	System.out.println("===========================================================");
}

public void searchBarFunctionality() {
	System.out.println("Enter the keyword to search : ");
	System.out.println("===========================================================");
	String keyword = "james";
	searchBar.sendKeys(keyword);
	System.out.println(showEntriesTable.getText());

}
public void clickAddPanellistButton() {
	AddPadelclubes.click();
	String expectedUrl = "https://staging.gopadel.ae/bookings/add-modify-padels";
	String actualUrl = driver.getCurrentUrl();
	Assert.assertEquals(expectedUrl, actualUrl);
	System.out.println("Navigated to AddPadelclubes Page");
	System.out.println("===========================================================");
}

public void verifyPadellistAdded() {
	System.out.println(addedPadellist.getText());
	System.out.println("===========================================================");
}
}



