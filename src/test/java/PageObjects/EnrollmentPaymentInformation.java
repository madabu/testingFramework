package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnrollmentPaymentInformation {

    //Payment information header
    @FindBy (css = ".step-4 .section-header")
    private WebElement paymentInformationHeader;

    public WebElement getPaymentInformationHeader () {
        return paymentInformationHeader;
    }

    //Card holder name

    //Card number

    //CVC

    //Expiry date

    //Next Button from Fourth Section




    public EnrollmentPaymentInformation (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
