@wip1
Feature:US_01_AmazonSearch

    @desk @sirali
    Scenario: TC01 user search desk in amazon

     Given user goes to Amazon page
     When user search for desk
     Then verify results contains desk
     And close the application

    @shoe
    Scenario: TC02 user search shoe in amazon
      Given user goes to Amazon page
      When user search for shoe
      Then verify results contains shoe
      And close the application

      @Iphone
      Scenario: TC03 user search iphone in amazon
        Given user goes to Amazon page
        When user search for Iphone
        Then verify results contains Iphone
        And close the application

