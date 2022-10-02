package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SetColorPage {

	WebDriver driver;
	String backgroundColor;

	public SetColorPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//button[contains(text(), 'Set SkyBlue Background')]")
	WebElement skyBlueBackground;

	@FindBy(how = How.XPATH, using = "//button[contains(text(), 'Set White Background')]")
	WebElement whiteBackground;
	
	@FindBy(how = How.TAG_NAME, using = "body") WebElement bodyColor;

	public void checkWhiteButtonIsVisible() {
		if (whiteBackground.isDisplayed()) {
			System.out.println("white background button is visible");

		}
	}

	public void clickWhiteBackground() {
		whiteBackground.click();
		
	}
	
	public boolean validateBackgroundIsWhite() {
		backgroundColor = bodyColor.getAttribute("style");
		System.out.println(backgroundColor);
		if(backgroundColor.equals("background-color: white;")) {
			System.out.println("Background color is changed to white");
			return true;
		}
		else
			return false;
	}
}
