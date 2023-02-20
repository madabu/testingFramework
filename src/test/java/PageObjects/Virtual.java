package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Virtual {

    @FindBy (xpath = "/html/body/h1")
    private WebElement virtualHeader;

    @FindBy (xpath = "/html/body/a")
    private WebElement virtualReturnButton;

    public Virtual (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String returnVirtualHeaderText () {
        return virtualHeader.getText();
    }

    public void iClickOnTheVirtualReturnButton () {
        virtualReturnButton.click();
    }
}
