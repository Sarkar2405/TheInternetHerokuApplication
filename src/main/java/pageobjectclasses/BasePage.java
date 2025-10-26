package pageobjectclasses;

import org.openqa.selenium.WebDriver;
import managers.ManageDriver;
import utils.PageActions;

public class BasePage {

	WebDriver driver;
	PageActions pageaction;

	public BasePage() {
		this.driver= ManageDriver.getDriver();
		pageaction= new PageActions(driver); //creates an object of PageActions and passes the driver to it
	}
		
}
