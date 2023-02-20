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
    Given I am on the Virtual Page
    And I click on the Return button from the Virtual page
    Then I am taken back to the Home page

  Scenario: Positive #7
    Given I am on the Hybrid page
    And I click on the Return button from the Hybrid page
    Then I am taken back to the Home page






