package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

//white background page - 
public class WhiteBackgroundPage {
	
	//white background button
	@FindBy(how=How.CSS, using="#extra > button:nth-child(13)") WebElement WHITE_BACKGROUND_ELEMENT;
	

	
	public void whiteButton() {
		//checking white
		WHITE_BACKGROUND_ELEMENT.isDisplayed();
    	if(WHITE_BACKGROUND_ELEMENT.isDisplayed()) {
    		System.out.println("White Background button exists");
    	}
    	else {
    		System.out.println("White Background button does not exists");	
    	}	
	}   	
   
	public void clickWhiteButton() {
		WHITE_BACKGROUND_ELEMENT.click();
	}

	
	
}
