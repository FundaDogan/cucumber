@NegativeLogin
Feature: US_06 OpenSource Negative Login

  @NegativeLogin1 @parallel1
  Scenario: TC01 user should not be login with wrong username
    Given user goes to "open_source_URL"
    And user enters wrong username
    And user enters password
    And clicks on login
    Then verify login is not successful
    And close the application


    @NegativeLogin2
  Scenario: TC01 user should not be login with wrong username
    Given user goes to "open_source_URL"
    And user enters username
    And user enters wrong password
    And clicks on login
    Then verify login is not successful
    And close the application

  @NegativeLogin3 @parallel2
  Scenario: TC01 user should not be login with wrong username
    Given user goes to "open_source_URL"
    And user enters wrong username
    And user enters wrong password
    And clicks on login
    Then verify login is not successful
    And close the application
