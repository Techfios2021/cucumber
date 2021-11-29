package steps;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BlueBackgroundPage;
import pages.TestBase;
import pages.WhiteBackgroundPage;

public class StepDefination extends TestBase {
	
	WebDriver driver;
	BlueBackgroundPage blueBackPage;
	WhiteBackgroundPage whiteBackPage;
	
	@Before
	public void beforeRun() {
		driver = initDriver();
		blueBackPage= PageFactory.initElements(driver, BlueBackgroundPage.class );
		whiteBackPage= PageFactory.initElements(driver, WhiteBackgroundPage.class);
	}
	
	@Given("^Set SkyBlue Background button exists$")
	public void set_SkyBlue_Background_button_exists() throws InterruptedException {
     
		blueBackPage.blueButton();
		Thread.sleep(2000);
	}
	

	@When("^I click on the \"([^\"]*)\"$")
	public void i_click_on_the(String button) throws Throwable {
	    switch (button) {
	    case "bluebutton":
		     blueBackPage.clickButton();
    	     Thread.sleep(2000);
    	     break;
	    case "whitebutton":
	    	whiteBackPage.clickWhiteButton();
	    	break;
	    default:
	    	System.out.println("unble");
	    	break;
		}	
    }
    @Then("^the background color will change to sky blue$")
    public void the_background_color_will_change_to_sky_blue()  {
    	blueBackPage.checkBackgroundColor();
       
    }
    @Given("^Set SkyWhite Background button exists$")
    public void set_SkyWhite_Background_button_exists() throws InterruptedException  {
    	blueBackPage.clickButton();
    	Thread.sleep(2000);
 
    }

    @Then("^the background color will change to white$")
    public void the_background_color_will_change_to_white()  {
    	whiteBackPage.clickWhiteButton();
    }

    @After
	public void tearDown() {
		driver.close();
		driver.quit();

	}
	

}
