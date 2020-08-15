package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver dr;

	public HomePage(WebDriver dr) {
		this.dr = dr;
	}

	By automoblie = By.id("nav_automobile");
	By truck = By.id("nav_truck");
	By motorcycle = By.id("nav_motorcycle");
	By camper = By.id("nav_camper");

	public boolean isAutomobileDisplayed() {
		dr.findElements(automoblie).size();
		if(size> 0) {
			return true;
		} else {
			return false;

		}
	}
}