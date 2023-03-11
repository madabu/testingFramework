package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnrollmentSuccess {

    @FindBy (css = ".step-5 .section-header")
    public WebElement successHeader;

    public WebElement getSuccessHeader () {return successHeader;}

    @FindBy (css = ".step-5 .btn-success")
    public WebElement returnToHomepageButtonFromEnrollment;
    public void clickOnReturnToHomepageButton () {this.returnToHomepageButtonFromEnrollment.click();}

    public EnrollmentSuccess (WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
}
