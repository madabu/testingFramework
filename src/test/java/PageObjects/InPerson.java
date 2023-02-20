package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InPerson {

    @FindBy (xpath = "/html/body/h1")
    private WebElement inPersonHeader;

    @FindBy (xpath = "/html/body/a")
    private WebElement inPersonReturnButton;

    public InPerson (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String returnInPersonHeaderText () {
        return inPersonHeader.getText();
    }

    public void IClickOnTheInPersonReturnButton () {
        inPersonReturnButton.click();
    }


}
