Feature: Software Testing Course

  Scenario: Positive #1 - Newsletter Email
    Given I am on the homepage
    When I write an email address such as "test@email.com"
    And I click the submit button
    Then The confirmation pop-up appears

  Scenario: Negative #1 - Newsletter Email
    Given I am on the homepage
    When I write an email address such as "test@tester.ro"
    And I click the submit button
    Then The confirmation pop-up appears

  Scenario: Negative #2 - Newsletter Email
    Given I am on the homepage
    When I write an email address such as "testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest@email.ro"
    And I click the submit button
    Then The confirmation pop-up appears

  Scenario: Positive #2 - Newsletter Email
    Given I am on the homepage
    When I write an email address such as ""
    And I click the submit button
    Then A red border lines the email field disabling the user from submitting an empty field

  Scenario: Positive #3 - Virtual
    Given I am on the homepage
    And I click on the Read More button from the Virtual section
    Then I am taken to the Virtual page

  Scenario: Positive #5 - Hybrid
    Given I am on the homepage
    And I click on the Read More button from the Hybrid section
    Then I am taken to the Hybrid page

  Scenario: Positive #6 - In Person
    Given I am on the homepage
    And I click on the Read More button from the In Person Section
    Then I am taken to the In Person page

  Scenario: Positive #7 - Fundamentals
    Given I am on the homepage
    And I scroll to click on the Read More button from the Learn The Fundamentals Section
    Then I am taken to the Fundamentals page

  Scenario: Positive #8 - Virtual/back
    Given I am on the Virtual Page
    And I click on the Return button from the Virtual page
    Then I am taken back to the Home page

  Scenario: Positive #9 - Hybrid/back
    Given I am on the Hybrid page
    And I click on the Return button from the Hybrid page
    Then I am taken back to the Home page

  Scenario: Positive #10 - In Person/back
    Given I am on the In Person page
    And I click on the Return button from the In Person page
    Then I am taken back to the Home page

  Scenario: Positive #11 - Fundamentals/back
    Given I am on the Fundamentals page
    And I click on the Return button from the Fundamentals page
    Then I am taken back to the Home page

  Scenario: Positive #14 - Questions
    Given I am on the homepage
    When I click on the Questions from the Nav Bar
    Then I am taken to the Frequently Asked Questions section from the Home page

  Scenario: Positive #12 - Start Enrollment from the Home page
    Given I am on the homepage
    And I click on the Start The Enrollment Button from the Home page
    Then I am taken to the Enrollment page

  Scenario: Positive #12 First Enrollment Section - Personal information
    Given I am on the First section of the Enrollment process
    When I write in the First Name field
    And I write in the Last Name field
    * I write in the Username field
    * I write in the Password field
    * I write in the Confirm Password field
    * I click on the Next Button from the First Enrollment section
    Then I am taken to the Contact Information section of the Enrollment page

  Scenario: Positive #13 Second Enrollment Section - Contact information
    Given I am on the Second section of the Enrollment process
    When I write in the Email field from the second section  of the Enrollment page
    And I write in the Phone field
    * I write in the Country field
    * I write in the City field
    * I write in the Post Code field
    * I click on the Next Button from the Second Enrollment section
    Then I am taken to the Course Options section of the Enrollment page

  Scenario: Positive #14 Third Enrollment Section - Course options
    Given I am on the Third section of the Enrollment process
    When I choose the first course option from the Course Options section of the Enrollment page
    And I click on the Next Button from the Third Enrollment section
    Then I am taken to the Payment Information section of the Enrollment page

  Scenario: Positive #15 Fourth Enrollment Section - Payment information
    Given I am on the Fourth section of the Enrollment process
    When I write in the Card Holder Name field from the Fourth Enrollment section
    And I write in the Card Number field from the Fourth Enrollment section
    * I write in the CVC field from the Fourth Enrollment section
    * I select the "March" Expiry Month from the Dropdown menu from the Fourth Enrollment section
    * I select the "2024" Expiry Year from the Dropdown menu from the Fourth Enrollment section
    * I click on the Next Button from the Fourth Enrollment Section
    Then I am taken to the confirmation section from the Enrollment page

  Scenario: Positive #16 Fifth Enrollment Section - Success!
    Given I am on the Fifth and last section of the Enrollment process
    And I click on the Return to homepage button from the last Enrollment section
    Then I am taken back to the Home page

  Scenario Outline:  FAQ section
    Given I am on the Frequently Asked Questions section of the Home page
    When I click on the '<question>' accordion button
    Then the '<question>' accordion body text should be '<sample_text>'

    Examples:
    |question                                                                       |sample_text                                             |
    | question-one                                                                  |Lorem ipsum dolor sit amet consectetur adipisicing elit |
    | question-two                                                                  |Lorem ipsum dolor sit amet consectetur adipisicing elit |
    | question-three                                                                |Lorem ipsum dolor sit amet consectetur adipisicing elit |
    | question-four                                                                 |Lorem ipsum dolor sit amet consectetur adipisicing elit |
    | question-five                                                                 |Lorem ipsum dolor sit amet consectetur adipisicing elit |














