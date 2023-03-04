package org.example;

import PageObjects.*;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.*;


public class StepDefinitions {

    private final WebDriver driver = new ChromeDriver();
    private HomePage homePage;
    private Virtual virtual;
    private Hybrid hybrid;
    private InPerson inPerson;

    private Fundamentals fundamentals;
    private Enrollment enrollment;
    private EnrollmentContactInfo enrollmentContactInfo;
    private EnrollmentCourseOptions enrollmentCourseOptions;

    public StepDefinitions () {
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        virtual = new Virtual(driver);
        hybrid = new Hybrid(driver);
        inPerson = new InPerson(driver);
        fundamentals = new Fundamentals(driver);
        enrollment = new Enrollment(driver);
        enrollmentContactInfo = new EnrollmentContactInfo(driver);
        enrollmentCourseOptions = new EnrollmentCourseOptions(driver);




    }

    //create then steps for each step
    //create negative test cases for red border

    @Given ("I am on the homepage")
    public void iAmOnTheHomePage () {
        driver.get("file:///C:/Users/Madalina/Desktop/Trello%20exercise/Testing-Env/index.html");
    }

    @Given("I am on the Virtual Page")
    public void iAmOnTheVirtualPage () {
        driver.get("file:///C:/Users/Madalina/Desktop/Trello%20exercise/Testing-Env/routes/virtual.html");
    }

    @Given("I am on the Hybrid page")
    public void iAmOnTheHybridPage () {
        driver.get("file:///C:/Users/Madalina/Desktop/Trello%20exercise/Testing-Env/routes/hybrid.html");
    }

    @Given("I am on the In Person page")
    public void iAmOnTheInPersonPage (){
        driver.get("file:///C:/Users/Madalina/Desktop/Trello%20exercise/Testing-Env/routes/in_person.html");
    }

    @Given("I am on the Fundamentals page")
    public void iAmOnTheFundamentalsPage (){
        driver.get("file:///C:/Users/Madalina/Desktop/Trello%20exercise/Testing-Env/routes/fundamentals.html");
    }

    @Given("I am on the Frequently Asked Questions section of the Home page")
    public void iAmOnTheFrequentlyAskedQuestionsSection () {
        driver.get("file:///C:/Users/Madalina/Desktop/Trello%20exercise/Testing-Env/index.html");
        homePage.clickOnQuestionsFromNavBar();

        String faqText = homePage.getFrequentlyAskedQuestions().getText();

        Assert.assertEquals("Frequently Asked Questions", faqText);
    }


    //??
    @Given("I am on the first section of the Enrollment process")
    public void iAmOnTheFirstSectionOfTheEnrollmentProccess () {
        driver.get("file:///C:/Users/Madalina/Desktop/Trello%20exercise/Testing-Env/routes/enrollment.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOf(enrollment.getPersonalInformationHeader()));
        Assert.assertEquals("Personal information", enrollment.getPersonalInformationHeader().getText());

    }
    @Given("I am on the second section of the Enrollment process")
    public void iAmOnTheSecondSectionOfTheEnrollmentProcess () {
        driver.get("file:///C:/Users/Madalina/Desktop/Trello%20exercise/Testing-Env/routes/enrollment.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        enrollment.writeInFirstNameField("Madalina");
        enrollment.writeInLastNameField("Albu");
        enrollment.writeInUsernameField("madaalbu");
        enrollment.writePassword("password1!");
        enrollment.writeToConfirmPassword("password1!");

        enrollment.clickOnNextButton();

        wait.until(ExpectedConditions.visibilityOf(enrollmentContactInfo.getContactInformationHeader()));

        Assert.assertEquals("Contact information",enrollmentContactInfo.getContactInformationHeader().getText());


//    @Given("I am on the second section of the Enrollment process")
//    public void iAmOnTheSecondSectionOfTheEnrollmentProcess () {
//        driver.get("file:///C:/Users/Madalina/Desktop/Trello%20exercise/Testing-Env/routes/enrollment.html?email=&phone-number=&country=&city=&post-code");
//        driver.findElement(By.cssSelector("body > div > div > section > div > form > div.step.step-1.active > button")).click();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        driver.findElement(By.xpath("//*[@id='email']"));
//       //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='email']")));
//        Assert.assertTrue(enrollmentContactInfo.returnContactInformationEmailField().getAttribute("id").contains("email"));
//
////       driver.get("file:///C:/Users/Madalina/Desktop/Trello%20exercise/Testing-Env/routes/enrollment.html");
//        enrollment.clickOnNextButton();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//
//        driver.findElement(By.id("email"));
//
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
//        Assert.assertTrue(enrollmentContactInfo.returnContactInformationEmailField().getAttribute("id").contains("email"));


//---------------------------------------------------------------------------------
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        Assert.assertTrue(enrollmentContactInfo.returnSecondSectionOfEnrollment().getAttribute("class").contains("active"));


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
    public void iClickOnTheAccordionButton (String question) {
        switch (question) {
            case "Where is your institution located?":
                homePage.clickOnQuestionOneButton();
                break;
            case "How much does it cost to attend?":
                homePage.clickOnQuestionTwoButton();
                break;
            case "What do I need to know before hand?":
                homePage.clickOnQuestionThreeButton();
                break;
            case "How do I sign up?":
                homePage.clickOnQuestionFourButton();
                break;
            case "Will your organization help me find a job?":
                homePage.clickOnQuestionFiveButton();
                break;
            default:
                throw new IllegalArgumentException("Invalid question: " + question);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(homePage.getAccordionSampleTextBody()));
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

    @When("I click on the Questions from the Nav Bar")
    public void iClickOnTheQuestionsFromTheNavBar () {homePage.clickOnQuestionsFromNavBar();}

    @Then("The confirmation pop-up appears")
    public void theConfirmationPopUpAppears () {
        driver.switchTo().alert().accept();
    }

    /* @Then("I am taken to the Virtual page")
    public void iAmTakenToTheVirtualPage (){
        Utils.scrollToElement(driver, homePage.getEmailField());
        homePage.getEmailField();

    }*/


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

    @Then("I am taken to the Contact Information page of the Enrollment section")
    public void iAmTakenToTheContactInformationPageOfEnrollment () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Assert.assertTrue(enrollmentContactInfo.returnContactInformationEmailField().getAttribute("id").contains("email"));

    }

    @Then("I am taken to the Course Options page of the Enrollment section")
    public void iAmTakenToTheCourseOptionsPageOfEnrollment () {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        Assert.assertTrue(enrollmentCourseOptions.getCourseOptionsHeader().getAttribute("class").contains("section-header"));



        //Assert.assertTrue(enrollmentCourseOptions.getCourseOptionsHeader().getAttribute("class").contains("section-header"));
    }

    @Then("I am taken to the Frequently Asked Questions section from the Home page")
    public void iAmTakenToTheFrequentlyAskedQuestionsSection () {
        String currentUrl = driver.getCurrentUrl();
        homePage.clickOnQuestionsFromNavBar();

        Assert.assertTrue(currentUrl.contains("#questions"));
        //assert currentUrl.contains("#questions");
    }

    @After
    public void cleanUp () {
        driver.quit();
    }

}
