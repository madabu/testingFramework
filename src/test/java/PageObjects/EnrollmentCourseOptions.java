package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnrollmentCourseOptions {

    //Course options header

    @FindBy (css = ".step-3 .section-header")
    private WebElement courseOptionsHeader;

    public WebElement getCourseOptionsHeader () {
        return courseOptionsHeader;
    }


    //ST-Manual tester certificate radio button
    @FindBy (css = "input#flexRadioButton1")
    private WebElement radioButton1;
    public WebElement getRadioButton1 () {
        return radioButton1;
    }

    public void clickOnFirstRadioButton1 () {
        this.radioButton1.click();
    }

    //ST-Automation tester radio button
    @FindBy (css = "input#flexRadioButton2")
    private WebElement radioButton2;

    //ST - Automation&Manual tester certificate radio button
    @FindBy (css = "input#flexRadioButton3")
    private WebElement radioButton3;

    //ST - Automation & Manual tester certificate radio button
    @FindBy (css = "input#flexRadioButton4")
    private WebElement radioButton4;
    //ST - Security tester certificate radio button
    @FindBy (css = "input#flexRadioButton5")
    private WebElement radioButton5;

    //Next button from Third Section
    @FindBy (css = ".step-3 .next-btn")
    private WebElement nextButton;

    public WebElement getNextButton2 () {
        return nextButton;
    }
    public void clickOnNextButton3 () {this.nextButton.click();}


    public EnrollmentCourseOptions (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }





}
