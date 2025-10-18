package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import managers.ManageDriver;
import pageobjectclasses.DynamicControlsPage;
import pageobjectclasses.HomePage;
import utils.ReportUtils;

public class DynamicControlsTest extends BaseTest {

	@Test
	public void testDynamicControls() {
		
		HomePage home = new HomePage();
		DynamicControlsPage dynamic = new DynamicControlsPage();
		home.clickLink("Dynamic Controls");
		ReportUtils.getLog().info("User clicked on link: Dynamic Controls ");
		String actualDynamicControlsPageheading = dynamic.verifyDynamicControlsPageHeading();
		ReportUtils.getLog().info("Page heading: " + actualDynamicControlsPageheading);
		Assert.assertTrue(actualDynamicControlsPageheading.equals("Dynamic Controls"));
	}

}
