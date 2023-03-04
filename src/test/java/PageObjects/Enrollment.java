package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Enrollment {

    @FindBy (xpath = "/html/body/div/div/h2/text()[1]")
    private WebElement enrollmentHeader;

    //Personal information header
    @FindBy (css = ".step-1 .section-header")
    private WebElement personalInformationHeader;
    public WebElement getPersonalInformationHeader () {
        return personalInformationHeader;
    }

    //First Name
    @FindBy (xpath = "//*[@id=\"firstName\"]")
    private WebElement firstName;
    public void writeInFirstNameField (String firstName){
        this.firstName.sendKeys(firstName);
    }

    //Last Name
    @FindBy (xpath = "//*[@id=\"lastName\"]")
    private WebElement lastName;
    public void writeInLastNameField (String lastName){
        this.lastName.sendKeys(lastName);
    }

    //Username
    @FindBy (xpath = "//*[@id=\"username\"]")
    private WebElement username;
    public void writeInUsernameField (String username){
        this.username.sendKeys(username);
    }

    //Password
    @FindBy (xpath = "//*[@id=\"password\"]")
    private WebElement password;
    public void writePassword (String password){
        this.password.sendKeys(password);
    }

    //Confirm password
    @FindBy (xpath = "//*[@id=\"cpassword\"]")
    private WebElement confirmPassword;
    public void writeToConfirmPassword (String confirmPassword){
        this.confirmPassword.sendKeys(confirmPassword);
    }

    //Submit with Next button
    @FindBy (css = ".step-1 .next-btn")
    private WebElement nextButton;
    public void clickOnNextButton () {
        this.nextButton.click();
    }

    public WebElement getEnrollmentHeader (){
        return enrollmentHeader;
    }


    public Enrollment (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
