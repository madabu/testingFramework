package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class EnrollmentContactInfo {

    //Contact information header
    @FindBy (css = ".step-2 .section-header")
    private WebElement contactInformationHeader;

    public WebElement getContactInformationHeader () {
        return contactInformationHeader;
    }

    //Section2
    @FindBy (className = "step-2")
    private WebElement secondSectionOfEnrollment;

    public WebElement returnSecondSectionOfEnrollment (){
        return secondSectionOfEnrollment;
    }


    //Email
    @FindBy (xpath = "//*[@id=\"email\"]")
    private WebElement contactInformationEmailField;


    public WebElement returnContactInformationEmailField () {
        return contactInformationEmailField;
    }

    public void writeInContactInformationEmailField (String contactInformationEmailField){
        this.contactInformationEmailField.sendKeys(contactInformationEmailField);
    }

    //Phone
    @FindBy (xpath = "//*[@id=\"phone\"]")
    private WebElement phoneField;
    public void writeInPhoneField (String phoneNumber){
        this.phoneField.sendKeys(phoneNumber);
    }

    //Country
    @FindBy (xpath = "//*[@id=\"country\"]")
    private WebElement countryField;
    public void writeInCountryField (String country){
        this.countryField.sendKeys(country);
    }

    //City
    @FindBy (xpath = "//*[@id=\"city\"]")
    private WebElement cityField;
    public void writeInCityField (String city){
        this.cityField.sendKeys(city);
    }

    //Post code
    @FindBy (xpath = "//*[@id=\"postCode\"]")
    private WebElement postCodeField;
    public void writeInPostCodeField (String postCode){
        this.postCodeField.sendKeys(postCode);
    }

    //Next Button from Second Section
    @FindBy (css = ".step-2 .next-btn")
    private WebElement nextButton;
    public void clickOnNextButton2 () {
        this.nextButton.click();
    }

    public EnrollmentContactInfo (WebDriver driver) {PageFactory.initElements(driver, this);}




}