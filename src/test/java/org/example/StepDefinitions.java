package org.example;

import PageObjects.*;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.*;


public class StepDefinitions {

    private WebDriver driver;
    private HomePage homePage;
    private Virtual virtual;
    private Hybrid hybrid;
    private InPerson inPerson;

    private Fundamentals fundamentals;
    private Enrollment enrollment;
    private EnrollmentContactInfo enrollmentContactInfo;
    private EnrollmentCourseOptions enrollmentCourseOptions;
    private EnrollmentPaymentInformation enrollmentPaymentInformation;
    private EnrollmentSuccess enrollmentSuccess;

    public StepDefinitions () {
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        driver = new FirefoxDriver(options);
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        virtual = new Virtual(driver);
        hybrid = new Hybrid(driver);
        inPerson = new InPerson(driver);
        fundamentals = new Fundamentals(driver);
        enrollment = new Enrollment(driver);
        enrollmentContactInfo = new EnrollmentContactInfo(driver);
        enrollmentCourseOptions = new EnrollmentCourseOptions(driver);
        enrollmentPaymentInformation = new EnrollmentPaymentInformation(driver);
        enrollmentSuccess = new EnrollmentSuccess(driver);



    }

    @Given ("I am on the homepage")
    public void iAmOnTheHomePage () {
        driver.get("file:///C:/Users/Madalina/Desktop/Env/Testing-Env/index.html");
    }

    @Given("I am on the Virtual Page")
    public void iAmOnTheVirtualPage () {
        driver.get("file:///C:/Users/Madalina/Desktop/Env/Testing-Env/routes/virtual.html");
    }

    @Given("I am on the Hybrid page")
    public void iAmOnTheHybridPage () {
        driver.get("file:///C:/Users/Madalina/Desktop/Env/Testing-Env/routes/hybrid.html");
    }

    @Given("I am on the In Person page")
    public void iAmOnTheInPersonPage (){
        driver.get("file:///C:/Users/Madalina/Desktop/Env/Testing-Env/routes/in_person.html");
    }

    @Given("I am on the Fundamentals page")
    public void iAmOnTheFundamentalsPage (){
        driver.get("file:///C:/Users/Madalina/Desktop/Env/Testing-Env/routes/fundamentals.html");
    }

    @Given("I am on the Frequently Asked Questions section of the Home page")
    public void iAmOnTheFrequentlyAskedQuestionsSection () {
        driver.get("file:///C:/Users/Madalina/Desktop/Env/Testing-Env/index.html");
        homePage.clickOnQuestionsFromNavBar();

        Utils.scrollToElement(driver,homePage.getFrequentlyAskedQuestions());
        //Utils.scrollToElement(driver, homePage.getSeleniumImage());

        String faqText = homePage.getFrequentlyAskedQuestions().getText();

        Assert.assertEquals("Frequently Asked Questions", faqText);
    }


    @Given("I am on the First section of the Enrollment process")
    public void iAmOnTheFirstSectionOfTheEnrollmentProccess () {
        driver.get("file:///C:/Users/Madalina/Desktop/Env/Testing-Env/routes/enrollment.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOf(enrollment.getPersonalInformationHeader()));
        Assert.assertEquals("Personal information", enrollment.getPersonalInformationHeader().getText());

    }
    @Given("I am on the Second section of the Enrollment process")
    public void iAmOnTheSecondSectionOfTheEnrollmentProcess () {
        driver.get("file:///C:/Users/Madalina/Desktop/Env/Testing-Env/routes/enrollment.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        enrollment.completePersonalInformationFields();
        enrollment.clickOnNextButton();

        wait.until(ExpectedConditions.visibilityOf(enrollmentContactInfo.getContactInformationHeader()));
        Assert.assertEquals("Contact information",enrollmentContactInfo.getContactInformationHeader().getText());
    }
    @Given("I am on the Third section of the Enrollment process")
    public void iAmOnTheThirdSectionOfTheEnrollmentProcess () {
        driver.get("file:///C:/Users/Madalina/Desktop/Env/Testing-Env/routes/enrollment.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        enrollment.completePersonalInformationFields();
        enrollment.clickOnNextButton();

        wait.until(ExpectedConditions.visibilityOf(enrollmentContactInfo.getContactInformationHeader()));
        enrollmentContactInfo.completeContactInformationFields();
        enrollmentContactInfo.clickOnNextButton2();

        wait.until(ExpectedConditions.visibilityOf(enrollmentCourseOptions.getCourseOptionsHeader()));
        Assert.assertEquals("Course options",enrollmentCourseOptions.getCourseOptionsHeader().getText());

    }

    @Given("I am on the Fourth section of the Enrollment process")
    public void iAmOnTheFourthSectionOfTheEnrollmentProcess () {
        driver.get("file:///C:/Users/Madalina/Desktop/Env/Testing-Env/routes/enrollment.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        enrollment.completePersonalInformationFields();
        enrollment.clickOnNextButton();

        wait.until(ExpectedConditions.visibilityOf(enrollmentContactInfo.getContactInformationHeader()));
        enrollmentContactInfo.completeContactInformationFields();
        enrollmentContactInfo.clickOnNextButton2();

        wait.until(ExpectedConditions.visibilityOf(enrollmentCourseOptions.getCourseOptionsHeader()));

        enrollmentCourseOptions.clickOnFirstRadioButton1();
        enrollmentCourseOptions.clickOnNextButton3();

        wait.until(ExpectedConditions.visibilityOf(enrollmentPaymentInformation.getPaymentInformationHeader()));
        Assert.assertEquals("Payment information",enrollmentPaymentInformation.getPaymentInformationHeader().getText());
    }

    @Given("I am on the Fifth and last section of the Enrollment process")
    public void iAmOnTheFifthSectionOfTheEnrollmentProcess () {
        driver.get("file:///C:/Users/Madalina/Desktop/Env/Testing-Env/routes/enrollment.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        enrollment.completePersonalInformationFields();
        enrollment.clickOnNextButton();

        wait.until(ExpectedConditions.visibilityOf(enrollmentContactInfo.getContactInformationHeader()));
        enrollmentContactInfo.completeContactInformationFields();
        enrollmentContactInfo.clickOnNextButton2();

        wait.until(ExpectedConditions.visibilityOf(enrollmentCourseOptions.getCourseOptionsHeader()));
        enrollmentCourseOptions.clickOnFirstRadioButton1();
        enrollmentCourseOptions.clickOnNextButton3();

        wait.until(ExpectedConditions.visibilityOf(enrollmentPaymentInformation.getPaymentInformationHeader()));
        enrollmentPaymentInformation.completePaymentInformationFields();
        Select select = new Select(driver.findElement(By.cssSelector("select#month.list-dt[name='expmonth']")));
        select.selectByVisibleText("March");

        Select select1 = new Select(driver.findElement(By.cssSelector("select#year.list-dt[name='expyear'")));
        select1.selectByVisibleText("2024");
        enrollmentPaymentInformation.clickOnNextButton4();

        wait.until(ExpectedConditions.visibilityOf(enrollmentSuccess.getSuccessHeader()));
        Assert.assertEquals("Success!",enrollmentSuccess.getSuccessHeader().getText());

    }

    @When("I click on the Start The Enrollment Button from the Home page")
    public void iClickOnTheStartTheEnrollmentButtonFromTheHomePage () {
        homePage.clickOnTheStartTheEnrollmentButton();
    }

    @When("I write an email address such as {string}")
    public void iWriteAnEmailAddressSuchAs(String string) {
        homePage.writeEmailInEmailField(string);

    }

    @When("I leave the email field empty")
    public void iLeaveTheEmailFieldEmpty () {
        homePage.leaveEmailFieldEmpty();
    }

    @When("I click the submit button")
    public void iClickOnTheSubmitButton() {
        homePage.clickOnSubmitButton();
    }


    @When("I click on the Read More button from the Virtual section")
    public void iClickOnTheVirtualReadMoreButton () {
        Utils.scrollToElement(driver, homePage.getEmailField());
        homePage.clickOnVirtualReadMoreButton();
    }

    @When("I click on the Read More button from the Hybrid section")
    public void iClickOnTheInHybridReadMoreButton (){
        Utils.scrollToElement(driver, homePage.getEmailField());
        homePage.clickOnHybridReadMoreButton();
    }

    @When("I click on the Read More button from the In Person Section")
    public void iClickOnTheInPersonReadMoreButton () {
        Utils.scrollToElement(driver, homePage.getEmailField());
        homePage.clickOnInPersonReadMoreButton();
    }

    @When("I scroll to click on the Read More button from the Learn The Fundamentals Section")
    public void iClickOnTheReadMoreButtonFromTheFundamentalsSection () {
        Utils.scrollToElement(driver, homePage.getFundamentalsHeader());
        homePage.clickOnFundamentalsReadMoreButton();
    }

   @When("I click on the Return button from the Virtual page")
   public void iClickOnTheVirtualReturnButton (){
        virtual.iClickOnTheVirtualReturnButton();
   }

   @When("I click on the Return button from the Hybrid page")
   public void iClickOnTheHybridReturnButton (){
        hybrid.iClickOnTheHybridReturnButton ();
   }

   @When("I click on the Return button from the In Person page")
   public void iClickOnTheInPersonReturnButton () {inPerson.IClickOnTheInPersonReturnButton();}

    @When("I click on the Return button from the Fundamentals page")
    public void iClickOnTheFundamentalsReturnButton () {fundamentals.iClickOnFundamentalsReturnButton();}



    @When("I click on the {string} accordion button")
    public void iClickOnTheQuestionAccordionButton(String question) {
        homePage.clickOnQuestionsFromNavBar();
        Utils.scrollToElement(driver,homePage.getFrequentlyAskedQuestions());


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        String buttonXpath = String.format("//button[@data-bs-target='#%s']", question);
        WebElement button = driver.findElement(By.xpath(buttonXpath));
        wait.until(ExpectedConditions.visibilityOf(button));
        button.click();


        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
        String bodyXpath = String.format("//div[@id='%s'][@class='accordion-collapse collapse show']", question);
        WebElement body = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(bodyXpath)));

        Assert.assertTrue(body.getAttribute("class").contains("show"));


    }

    @When("I write in the First Name field")
    public void writeInTheFirstNameField () {enrollment.writeInFirstNameField("Madalina");}

    @When("I write in the Last Name field")
    public void writeInTheLastNameField () {enrollment.writeInLastNameField("Albu");}

    @When("I write in the Username field")
    public void writeInTheUsernameField () {enrollment.writeInUsernameField("madaalbu27");}

    @When("I write in the Password field")
    public void writeInThePasswordField () {enrollment.writePassword("password123!");}

    @When("I write in the Confirm Password field")
    public void writeInTheConfirmPasswordField () {enrollment.writeToConfirmPassword("password123!");}

    @When("I click on the Next Button from the First Enrollment section")
    public void clickOnTheNextButtonFromTheFirstEnrollmentPage () {enrollment.clickOnNextButton();}

    @When("I write in the Email field from the second section  of the Enrollment page")
    public void writeInTheSecondSectionEmailField () {enrollmentContactInfo.writeInContactInformationEmailField("test@gmail.com");}

    @When("I write in the Phone field")
    public void writeInThePhoneField () {enrollmentContactInfo.writeInPhoneField("0723456789");}

    @When("I write in the Country field")
    public void writeInTheCountryField () {enrollmentContactInfo.writeInCountryField("Romania");}

    @When("I write in the City field")
    public void writeInTheCityField () {enrollmentContactInfo.writeInCityField("Brasov");}

    @When("I write in the Post Code field")
    public void writeInThePostCodeField () {enrollmentContactInfo.writeInPostCodeField("500000");}

    @When("I click on the Next Button from the Second Enrollment section")
    public void clickOnTheSecondSectionNextButton () {enrollmentContactInfo.clickOnNextButton2();}

    @When("I choose the first course option from the Course Options section of the Enrollment page")
    public void chooseFirstCourseOption () {enrollmentCourseOptions.clickOnFirstRadioButton1();}

    @When("I click on the Next Button from the Third Enrollment section")
    public void clickOnTheThirdSectionNextButton () {enrollmentCourseOptions.clickOnNextButton3();}

    @When("I write in the Card Holder Name field from the Fourth Enrollment section")
    public void writeInTheCardHolderNameField () {enrollmentPaymentInformation.writeInCardHolderNameField("Madalina Albu");}

    @When("I write in the Card Number field from the Fourth Enrollment section")
    public void writeInTheCardNumberField () {enrollmentPaymentInformation.writeInCardNumberField("1234-5678-9012-3456");}

    @When("I write in the CVC field from the Fourth Enrollment section")
    public void writeInTheCVCField () {enrollmentPaymentInformation.writeInCVCField("123");}

    @When("I select the {string} Expiry Month from the Dropdown menu from the Fourth Enrollment section")
    public void selectCardExpirationMonth (String month) {
        WebElement dropdown = enrollmentPaymentInformation.getCardExpirationMonth();
        enrollmentPaymentInformation.selectOptionFromDropdown(dropdown, month);
    }
    @When("I select the {string} Expiry Year from the Dropdown menu from the Fourth Enrollment section")
    public void selectCardExpirationYear (String year) {
        WebElement dropdown = enrollmentPaymentInformation.getCardExpirationYear();
        enrollmentPaymentInformation.selectOptionFromDropdown(dropdown, year);
    }
    @When("I click on the Next Button from the Fourth Enrollment Section")
    public void clickOnFourthSectionNextButton () {enrollmentPaymentInformation.clickOnNextButton4();}

    @When("I click on the Return to homepage button from the last Enrollment section")
    public void clickOnTheReturnToHomepageButtonFromTheEnrollmentPage () {
        enrollmentSuccess.clickOnReturnToHomepageButton();
    }

    @When("I click on the Questions from the Nav Bar")
    public void iClickOnTheQuestionsFromTheNavBar () {homePage.clickOnQuestionsFromNavBar();}

    @Then("The confirmation pop-up appears")
    public void theConfirmationPopUpAppears () {
        driver.switchTo().alert().accept();
    }


    @Then("I am taken to the Virtual page")
    public void iAmTakenToTheVirtualPage () {
        Assert.assertEquals("Virtual", virtual.returnVirtualHeaderText());
    }

    @Then("I am taken to the Hybrid page")
    public void iAmTakenToTheHybridPage (){
        Assert.assertEquals("Hybrid", hybrid.returnHybridHeaderText());
    }

    @Then("I am taken to the In Person page")
    public void iAmTakenToTheInPersonPage () {
        Assert.assertEquals("In Person", inPerson.returnInPersonHeaderText());
    }

    @Then("I am taken to the Fundamentals page")
    public void iAmTakenToTheFundamentalsPage () {Assert.assertEquals("Fundamentals page", fundamentals.returnFundamentalsHeader());}

    @Then("I am taken back to the Home page")
    public void iAmTakenBackToTheHomePage () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        Assert.assertEquals("Software Testing Course", driver.getTitle());

    }



    @Then("A red border lines the email field disabling the user from submitting an empty field")
    public void redBorderLinesEmptyEmailField () {
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div/button")).click();
        Assert.assertTrue(homePage.getEmailField().getAttribute("class").contains("error"));

    }
    @Then ("I am taken to the Enrollment page")
    public void iAmTakenToTheEnrollmentPage () { Assert.assertEquals("Software Testing | Enrollment", driver.getTitle());}

    @Then("I am taken to the Contact Information section of the Enrollment page")
    public void iAmTakenToTheContactInformationSectionOfEnrollment () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Assert.assertTrue(enrollmentContactInfo.returnContactInformationEmailField().getAttribute("id").contains("email"));

    }

    @Then("I am taken to the Course Options section of the Enrollment page")
    public void iAmTakenToTheCourseOptionsSectionOfEnrollment () {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

        Assert.assertEquals("Course options",enrollmentCourseOptions.getCourseOptionsHeader().getText());




    }

    @Then("I am taken to the Payment Information section of the Enrollment page")
    public void iAmTakenToThePaymentInformationSectionOfEnrollment () {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        Assert.assertEquals("Payment information",enrollmentPaymentInformation.getPaymentInformationHeader().getText());
    }

    @Then("I am taken to the confirmation section from the Enrollment page")
    public void iAmTakenToTheSuccessSectionOfEnrollment () {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        Assert.assertEquals("Success!",enrollmentSuccess.getSuccessHeader().getText());
    }

    @Then("I am taken to the Frequently Asked Questions section from the Home page")
    public void iAmTakenToTheFrequentlyAskedQuestionsSection () {
        String currentUrl = driver.getCurrentUrl();
        homePage.clickOnQuestionsFromNavBar();

        Assert.assertTrue(currentUrl.contains("#questions"));

    }

    @Then("the {string} accordion body should be displayed")
    public void theQuestionAccordionBodyShouldBeDisplayed(String question) {
        homePage.clickOnQuestionsFromNavBar();
        Utils.scrollToElement(driver,homePage.getFrequentlyAskedQuestions());

        WebElement button = driver.findElement(By.xpath("//button[@class='accordion-button collapsed' and starts-with(@data-bs-target, '" + question + "')]]"));
        button.click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

        String bodyXpath = String.format("//button[@class='accordion-button collapsed' and starts-with(@data-bs-target, '%s')]/following-sibling::div[@class='accordion-collapse collapse show']/div[@class='accordion-body']", question);

        WebElement body = driver.findElement(By.xpath(bodyXpath));

        Assert.assertTrue(body.getAttribute("class").contains("show"));




    }
    @Then("the {string} accordion body text should be {string}")
    public void theQuestionAccordionBodyTextShouldBeSample_text(String question, String sample_text) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        String bodyXpath = String.format("//div[@id='%s'][@class='accordion-collapse collapse show']", question);
        WebElement body = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(bodyXpath)));

        Assert.assertTrue(body.getText().contains(sample_text));


    }

    @After
    public void cleanUp () {
        driver.quit();
    }



}
