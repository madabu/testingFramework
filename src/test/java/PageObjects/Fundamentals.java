package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fundamentals {

    @FindBy (xpath = "/html/body/h1")
    private WebElement fundamentalsHeader;

    @FindBy (xpath = "/html/body/a")
    private WebElement fundamentalsReturnButton;


    public Fundamentals (WebDriver driver) {PageFactory.initElements(driver, this);}

    public String returnFundamentalsHeader () {
        return fundamentalsHeader.getText();
    }

    public void iClickOnFundamentalsReturnButton () {
        fundamentalsReturnButton.click();
    }
}
