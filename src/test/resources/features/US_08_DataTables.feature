Feature: US_08_DataTables.feature

  @dataTable
  Scenario Outline: TC_Create _And verify the test data creation
    Given user goes to "data_table_url"
    When user clicks on new button
    And user fills First Name box "<firstname>"
    And user fills Last Name box "<lastname>"
    And user fills position box "<position>"
    And user fills office box "<office>"
    And user fills extension box "<extension>"
    And user fills start date box "<start_date>"
    And user fills salary box "<salary>"
    Then user clicks create button
    And search for the first name "<firstname>"
    Then verify the name field contains the first name "<firstname>"
    And close the application

    Examples:
    |firstname|lastname|position|office|extension|start_date|salary|
    |Ali      |Can     |QA      |amazon|123      |2023-02-16|20000 |
    |Kerim    |Han     |Dev     |bestbuy|345     |2023-03-01|15000 |
