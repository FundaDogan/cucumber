@wip3
Feature: US_03_Parameter

  @Parameter @parallel2
  Scenario: TC06 user should be able to search desk in amazon using parameter
    Given user goes to Amazon page
    When user search for "desk"
    Then verify results contains "desk"
    And close the application

  @Parameter1
   Scenario: TC07 user should be able to search tea in amazon using parameter
     Given user goes to Amazon page
     When user search for "tea"
     Then verify results contains "teabag"
     And close the application
