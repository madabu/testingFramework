package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class EnrollmentContactInfo {

    //Section2
    @FindBy (className = "step-2")
    private WebElement secondSectionOfEnrollment;

    public WebElement returnSecondSectionOfEnrollment (){
        return secondSectionOfEnrollment;
    }


    //Email
    @FindBy (id = "email")
    private WebElement contactInformationEmailField;


    public WebElement returnContactInformationEmailField () {
        return contactInformationEmailField;
    }

    public void writeInContactInformationEmailField (String contactInformationEmailField){
        this.contactInformationEmailField.sendKeys(contactInformationEmailField);
    }

    //Phone
    @FindBy (id = "phone")
    private WebElement phoneField;
    public void writeInPhoneField (String phoneNumber){
        this.phoneField.sendKeys(phoneNumber);
    }

    //Country
    @FindBy (id = "country")
    private WebElement countryField;
    public void writeInCountryField (String country){
        this.countryField.sendKeys(country);
    }

    //City
    @FindBy (id = "city")
    private WebElement cityField;
    public void writeInCityField (String city){
        this.cityField.sendKeys(city);
    }

    //Post code
    @FindBy (id = "postCode")
    private WebElement postCodeField;
    public void writeInPostCodeField (String postCode){
        this.postCodeField.sendKeys(postCode);
    }

    //Next Button from Second Section
    @FindBy (xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement nextButtonSecondSection;
    public void clickOnSecondSectionNextButton (){
        this.nextButtonSecondSection.submit();
    }

    public EnrollmentContactInfo (WebDriver driver) {PageFactory.initElements(driver, this);}




}