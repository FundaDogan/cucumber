@wip4
Feature: US_04_ConfigUrl

  @parallel1
  Scenario: TC08 use parameter from config reader
    Given user goes to "amazon_url"
    Then user waits for 2 seconds
    Then verify url contains "amazon"
    And close the application

  @sirali
   Scenario: TC09 user should go https://www.bestbuy.com
     Given user goes to "bestbuy_url"
     Then user waits for 3 seconds
     Then verify url contains "bestbuy"
     And close the application

    Scenario: TC10 user should go editor.datatables.net
      Given user goes to "data_table_url"
      Then verify url contains "datatables"
      And close the application

