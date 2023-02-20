package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy (xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement emailField;

    public WebElement getEmailField() {
        return emailField;
    }

    @FindBy (xpath = "/html/body/section[1]/div/div/div/h1/span")
    private WebElement homePageHeader;

    @FindBy (xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement submitbutton;

    @FindBy (xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement virtualReadMoreButton;


    @FindBy (xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement hybridReadMoreButton;

    @FindBy (xpath = "/html/body/section[3]/div/div/div[3]/div/div/a")
    private WebElement inPersonReadMoreButton;


    public HomePage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String returnHomePageHeader () {
        return homePageHeader.getText();
    }

    public void writeEmailInEmailField (String email){
        this.emailField.sendKeys(email);
    }

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





}
