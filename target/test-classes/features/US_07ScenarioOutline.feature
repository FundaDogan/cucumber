Feature: US_07ScenarioOutline.feature

  @AmazonElement
  Scenario Outline: TC01 user search the elements in amazon
    Given user goes to "amazon_url"
    When user search for "<element>"
    Then verify results contains "<element>"
    And close the application

    Examples:
    |element|
    |gold   |
    |java   |
    |elma   |
    |silver |


    @negative
    Scenario Outline: TC02 negative login test
      Given user goes to "open_source_URL"
      And user enters wrong username "<username>"
      And user enters wrong password "<password>"
      And clicks on login
      Then verify login is not successful
      And close the application

      Examples:
      |username|password|
      |ayse    |123     |
      |ali     |12345   |
      |eda     |9084    |
    