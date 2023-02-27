package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    //make negative test case for selenium section
    //make then steps for each wrong email test
    @FindBy (xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement emailField;

    @FindBy(linkText = "Questions")
    private WebElement questionsFromNavBar;
    public WebElement getQuestionsFromNavBar () {
        return questionsFromNavBar;
    }

    public void clickOnQuestionsFromNavBar () {
        this.questionsFromNavBar.click();
    }


    public WebElement getEmailField() {
        return emailField;
    }

    @FindBy (xpath = "/html/body/section[1]/div/div/div/h1/span")
    private WebElement homePageHeader;


    @FindBy (xpath = "/html/body/section[2]/div/div/h3")
    private WebElement emailFieldHeader;

    public WebElement getEmailFieldHeader () {
        return emailFieldHeader;
    }

    @FindBy (xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement submitbutton;

    public WebElement getSubmitbutton () {
        return submitbutton;
    }

    @FindBy (xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement startTheEnrollmentButton;

    @FindBy (xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement virtualReadMoreButton;


    @FindBy (xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement hybridReadMoreButton;

    @FindBy (xpath = "/html/body/section[3]/div/div/div[3]/div/div/a")
    private WebElement inPersonReadMoreButton;

    @FindBy (xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/h2")
    private WebElement fundamentalsHeader;

    public WebElement getFundamentalsHeader () {
        return fundamentalsHeader;
    }

    @FindBy (xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/a")
    private WebElement fundamentalsReadMoreButton;


    public HomePage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String returnHomePageHeader () {
        return homePageHeader.getText();
    }

    public void writeEmailInEmailField (String email){
        this.emailField.sendKeys(email);
    }

    public void leaveEmailFieldEmpty () {this.emailField.sendKeys("");}

    public void clickOnSubmitButton (){
        this.submitbutton.click();
    }


    public void clickOnVirtualReadMoreButton () {
        this.virtualReadMoreButton.click();
    }

    public void clickOnHybridReadMoreButton () {
        this.hybridReadMoreButton.click();
    }

    public void clickOnInPersonReadMoreButton () { this.inPersonReadMoreButton.click();}

    public void clickOnTheStartTheEnrollmentButton () {
        this.startTheEnrollmentButton.click();
    }

    public void clickOnFundamentalsReadMoreButton () {this.fundamentalsReadMoreButton.click();}





}
