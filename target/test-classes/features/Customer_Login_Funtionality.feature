Feature: Login as Customer
  Drescription:
  
  As a Customer I want to loging in to the system
  So that I can view customer home page

  #@Smoke
  Scenario: Verify Customer Login Functionality
    Given I am in landing page of MT App
    When I click on the login menu
    And I click on customer login button
    And I Enter the user Id as "david@gmail.com"
    And I Enter the Password as "1234"
    And I click on Login button
    Then I validate the  CustomerId
