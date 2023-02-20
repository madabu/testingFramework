package org.example;

import PageObjects.HomePage;
import PageObjects.Hybrid;
import PageObjects.InPerson;
import PageObjects.Virtual;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class StepDefinitions {

    private final WebDriver driver = new ChromeDriver();
    private HomePage homePage;
    private Virtual virtual;
    private Hybrid hybrid;
    private InPerson inPerson;

    public StepDefinitions () {
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        virtual = new Virtual(driver);
        hybrid = new Hybrid(driver);
        inPerson = new InPerson(driver);



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

    @When("I write an email address such as {string}")
    public void iWriteAnEmailAddressSuchAs(String string) {
        homePage.writeEmailInEmailField(string);

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

    @Then("I am taken back to the Home page")
    public void iAmTakenBackToTheHomePage () {
        Assert.assertEquals("Certified Software Tester", homePage.returnHomePageHeader());
    }

    @After
    public void cleanUp () {
        driver.quit();
    }
}
