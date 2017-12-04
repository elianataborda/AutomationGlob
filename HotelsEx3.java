package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HotelsEx3 extends BasePage{
	
	public HotelsEx3(WebDriver value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="#section-hotel-tab-hp")
	private WebElement selectHotel;
	
	@FindBy(xpath="//*[@id=\"hotel-destination-hp-hotel\"]")
	private WebElement searchInput;
	
	@FindBy(xpath="//*[@id=\"gcw-hotel-form-hp-hotel\"]/div[7]/label/button")
	private WebElement searchButton;
	
	public WebElement getselectHotel() {
		return selectHotel;
	}
	public WebElement getSearchInput() {
		return searchInput;
	}
	public WebElement getSearchButton() {
		return searchButton;
	}
		
	public void HotelSearch(String busqueda){
		selectHotel.click();
		
		searchInput.sendKeys(busqueda);
		
		searchButton.click();
		return;

	}
	
	
}

