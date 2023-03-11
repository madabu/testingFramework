package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EnrollmentPaymentInformation {

    //Payment information header
    @FindBy (css = ".step-4 .section-header")
    private WebElement paymentInformationHeader;

    public WebElement getPaymentInformationHeader () {
        return paymentInformationHeader;
    }

    //Card holder name
    @FindBy (css = "input[name='card-name']")
    private WebElement cardHolderNameField;

    //Card number
    @FindBy (css = "input[name='card-number']")
    private WebElement cardNumberField;

    //CVC
    @FindBy (css = "input[name='card-cvc']")
    private WebElement cardCVCField;

    //Expiry date
    //Month Dropdown
    @FindBy (css = "select#month.list-dt[name='expmonth']")
    private WebElement cardExpirationMonth;
    public WebElement getCardExpirationMonth () {
        return cardExpirationMonth;
    }

    //Year Dropdown
    @FindBy (css = "select#year.list-dt[name='expyear']")
    private WebElement cardExpirationYear;
    public WebElement getCardExpirationYear () {
        return cardExpirationYear;
    }

    //Next Button from Fourth Section
    @FindBy(css = ".step-4 .next-btn")
    private WebElement nextButton;

    public void clickOnNextButton4 () {this.nextButton.click();}

    public void writeInCardHolderNameField (String cardHolderName) {this.cardHolderNameField.sendKeys(cardHolderName);}

    public void writeInCardNumberField (String cardNumber) {this.cardNumberField.sendKeys(cardNumber);}

    public void writeInCVCField (String CVCNumber) {this.cardCVCField.sendKeys(CVCNumber);}

    public void selectOptionFromDropdown (WebElement dropdown, String optionText) {
        Select select = new Select(dropdown);
        select.selectByVisibleText(optionText);
    }
    public void selectOptionFromDropdown2 (WebElement dropdown2, String optionText2) {
        Select select = new Select(dropdown2);
        select.selectByVisibleText(optionText2);
    }

    public EnrollmentPaymentInformation (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
