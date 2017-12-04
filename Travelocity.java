package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Travelocity extends BasePage {
	
	public Travelocity(WebDriver pDriver) {
		super(pDriver);
		pDriver.get("https://www.travelocity.com");
	}
	
	@FindBy(id="search-button-hp-package")
	private WebElement searchInput;
	

	public WebElement getSearchInput() {
		return searchInput;
	}
}
