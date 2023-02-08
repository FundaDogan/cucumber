
Feature: US_05 user should be able to login with right credentials

  @open_source
  Scenario: TC01 Pozitive Login Test
    Given user goes to "open_source_URL"
    And user enters username
    And user enters password
    And clicks on login
    Then verify url is "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"
    And close the application