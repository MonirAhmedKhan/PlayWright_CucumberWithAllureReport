Feature: Login as Employee
  Drescription:
  
  As a Employee I want to loging in to the system
  So that I can view my home page

  # @Smoke
  Scenario: Verify Employee Login Functionality
    Given I am in landing page of MT App
    When I click on the login menu
    And I Enter the user Id as "testpilot@gmail.com"
    And I Enter the Password as "1234"
    And I click on Login button
    Then I validate the  employee Id
