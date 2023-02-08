@wip2
Feature: US_Background

  Background: mutual step
    Given user goes to Amazon page

   Scenario: TC04 search for desk in amazon
     When user search for desk
     Then verify results contains desk
     And close the application

     @sirali
   Scenario: TC05 search for shoe in Amazon
      When user search for shoe
      Then verify results contains shoe
      And close the application
