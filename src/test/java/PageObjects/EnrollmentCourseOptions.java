package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnrollmentCourseOptions {

    public EnrollmentCourseOptions (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/h3")
    private WebElement courseOptionsHeader;

    public WebElement getCourseOptionsHeader () {
        return courseOptionsHeader;
    }


}
