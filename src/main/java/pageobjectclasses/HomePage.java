package pageobjectclasses;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
	
	public void clickLink(String linkname) {		
		pageaction.click(By.linkText(linkname));
	}

}
