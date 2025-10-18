package pageobjectclasses;

import org.openqa.selenium.By;

public class DynamicControlsPage extends BasePage {
	
	By dynamic_controls_heading_ele= By.tagName("h4");
	
	public String verifyDynamicControlsPageHeading() {
		return pageaction.getText(dynamic_controls_heading_ele);
	}

}
