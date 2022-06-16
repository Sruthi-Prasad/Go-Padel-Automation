package GoPadelPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GoPadelBlockTimingsPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath = "//*[@id=\"leftsidebar\"]/div/ul/li[2]/a")
	WebElement Bookings;
	
	@FindBy(xpath = "(//*[text()='Block Timings'])[2]")
	WebElement BlockTimings;

	
	public GoPadelBlockTimingsPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToBlockTime() {
		
		Assert.assertEquals(true, Bookings.isDisplayed());

		System.out.println("------------------------------------------------");
		System.out.println(" > Calendar is displayed");
		
		Actions action = new Actions(driver);	
		action.moveToElement(Bookings).perform();
		
		Assert.assertEquals(true, BlockTimings.isDisplayed());

		System.out.println("------------------------------------------------");
		System.out.println(" > Block Timings is displayed");
	}

}
