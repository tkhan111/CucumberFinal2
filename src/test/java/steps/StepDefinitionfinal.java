package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.SetColorPage;

public class StepDefinitionfinal extends BasePage {
	SetColorPage setColorPage;

	@Before
	public void beforeRun() {
		init();
		setColorPage = PageFactory.initElements(driver, SetColorPage.class);

	}

	@Given("^validate White Background button is displayed;$")
	public void validate_White_Background_button_is_displayed() {
	
		setColorPage.checkWhiteButtonIsVisible();

	}

	@When("^I click on the whitebackground button$")
	public void i_click_on_the_whitebackground_button() {
		setColorPage.clickWhiteBackground();

	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() {
		//validating the background color is white
		setColorPage.validateBackgroundIsWhite();
	}

	@After
	public void closing() {
	//	tearDown();

	}

}
