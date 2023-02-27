Feature: Software Testing Course

  Scenario: Positive #1
    Given I am on the homepage
    When I write an email address such as "test@email.com"
    And I click the submit button
    Then The confirmation pop-up appears

  Scenario: Negative #1
    Given I am on the homepage
    When I write an email address such as "test@tester.ro"
    And I click the submit button
    Then The confirmation pop-up appears

  Scenario: Negative #2
    Given I am on the homepage
    When I write an email address such as "testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest@email.ro"
    And I click the submit button

  Scenario: Positive #2
    Given I am on the homepage
    When I write an email address such as ""
    And I click the submit button
    Then A red border lines the email field disabling the user from submitting an empty field

  Scenario: Positive #3
    Given I am on the homepage
    And I click on the Read More button from the Virtual section
    Then I am taken to the Virtual page

  Scenario: Positive #5
    Given I am on the homepage
    And I click on the Read More button from the Hybrid section
    Then I am taken to the Hybrid page

  Scenario: Positive #6
    Given I am on the homepage
    And I click on the Read More button from the In Person Section
    Then I am taken to the In Person page

  Scenario: Positive #7
    Given I am on the homepage
    And I scroll to click on the Read More button from the Learn The Fundamentals Section
    Then I am taken to the Fundamentals page

  Scenario: Positive #8
    Given I am on the Virtual Page
    And I click on the Return button from the Virtual page
    Then I am taken back to the Home page

  Scenario: Positive #9
    Given I am on the Hybrid page
    And I click on the Return button from the Hybrid page
    Then I am taken back to the Home page

  Scenario: Positive #10
    Given I am on the In Person page
    And I click on the Return button from the In Person page
    Then I am taken back to the Home page

  Scenario: Positive #11
    Given I am on the Fundamentals page
    And I click on the Return button from the Fundamentals page
    Then I am taken back to the Home page

  Scenario: Positive #12
    Given I am on the homepage
    And I click on the Start The Enrollment Button from the Home page
    Then I am taken to the Enrollment page

  Scenario: Positive #12 First Enrollment Section
    Given I am on the first section of the Enrollment process
    When I write in the First Name field
    And I write in the Last Name field
    And I write in the Username field
    And I write in the Password field
    And I write in the Confirm Password field
    And I click on the Next Button from the First Enrollment section
    Then I am taken to the Contact Information page of the Enrollment section

  Scenario: Positive #13 Second Enrollment Section
    Given I am on the second section of the Enrollment process
    When I write in the Email field from the second section  of the Enrollment page
    And I write in the Phone field
    And I write in the Country field
    And I write in the City field
    And I write in the Post Code field
    And I click on the Next Button from the Second Enrollment section
    Then I am taken to the Course Options page of the Enrollment section

  Scenario: Questions
    Given I am on the homepage
    When I click on the Questions from the Nav Bar












