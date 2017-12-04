package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class AppClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "G:\\AutomationGitHub\\TravelocityAutomation\\geckodriver\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions().addPreference("browser.startup.page", 1).addPreference("browser.startup.homepage", "https://www.travelocity.com/");
		
		WebDriver driver = new FirefoxDriver(options);
		//getWait().until(elementToBeClickable(searchButton));
		driver.get("https://www.travelocity.com/");		

	}

}
