Feature: US_09_HerOkuApp.feature

  @heroku
  Scenario: TC15 herokuapp'dan delete butonu calismali
    Given user goes to "herokuappUrl"
    And user clicks add element button
    And user waits for 3 seconds
    Then user waits till delete button is visible
    And verify delete button is visible
    Then user clicks Delete button
    And close the application

