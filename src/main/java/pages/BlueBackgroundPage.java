package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BlueBackgroundPage {
	
	// blue background button
    @FindBy (how=How.CSS, using="#extra > button:nth-child(12)") WebElement BLUE_BUTTON_ELEMENT;
    // finding blue color under styles from dom
    @FindBy (how=How.TAG_NAME, using="button") WebElement BACKGROUBD_COLOR_ELEMENT;
    
    public void blueButton() {
    	BLUE_BUTTON_ELEMENT.isDisplayed();
    	if(BLUE_BUTTON_ELEMENT.isDisplayed()) {
    		System.out.println("SkyBlue Background button exists");
    	}
    	else {
    		System.out.println("SkyBlue Background button does not exists");	
    	}	
    
    }
    public void clickButton() {
    	BLUE_BUTTON_ELEMENT.click();
    }
    
    public void checkBackgroundColor() {
    	
    	String s = BACKGROUBD_COLOR_ELEMENT.getCssValue("color");
    	String c = Color.fromString(s).asHex();
    	System.out.println("Baackground Color is :" + s);
    	System.out.println("Hex code for color:" + c);
    }
}
