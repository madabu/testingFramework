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

    @FindBy (xpath = "//*[@id=\"learn-selenium\"]/div/div/div[2]/img")
    private WebElement seleniumImage;
    public WebElement getSeleniumImage () {return seleniumImage;}

    @FindBy (css = "h2.text-center.mb-4")
    private WebElement frequentlyAskedQuestions;

    public WebElement getFrequentlyAskedQuestions () {return frequentlyAskedQuestions;}

//    @FindBy (id = "questions")
//    private WebElement frequentlyAskedQuestions;

//    public WebElement getFrequentlyAskedQuestions (){return frequentlyAskedQuestions;}

    @FindBy (xpath = "//button[@data-bs-target='#question-one']")
    private WebElement questionOneButton;
    public WebElement getQuestionOneButton () {return questionOneButton;}

    @FindBy (xpath = "//button[@data-bs-target='#question-two']")
    private WebElement questionTwoButton;
    public WebElement getQTwoButtonAccordionButton (){
        return questionTwoButton;
    }

    @FindBy (xpath = "//button[@data-bs-target='#question-three']")
    private WebElement questionThreeButton;
    public WebElement getQThreeAccordionButton (){
        return questionThreeButton;
    }

    @FindBy (xpath = "//button[@data-bs-target='#question-four']")
    private WebElement questionFourButton;
    public WebElement getQFourAccordionButton (){
        return questionFourButton;
    }

    @FindBy (xpath = "//button[@data-bs-target='#question-five']")
    private WebElement questionFiveButton;
    public WebElement getQFiveAccordionButton (){
        return questionFiveButton;
    }

    @FindBy (xpath = ".//div[@class='accordion-item']//following-sibling::div[@class='accordion-body']")
    private WebElement accordionSampleTextBody;

    public WebElement getAccordionSampleTextBody (WebElement button) {return accordionSampleTextBody;}

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

    public void clickOnQuestionOneButton () {this.questionOneButton.click();}
    public void clickOnQuestionTwoButton () {this.questionTwoButton.click();}
    public void clickOnQuestionThreeButton () {this.questionThreeButton.click();}
    public void clickOnQuestionFourButton () {this.questionFourButton.click();}
    public void clickOnQuestionFiveButton () {this.questionFiveButton.click();}





}
