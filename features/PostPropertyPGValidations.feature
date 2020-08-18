Feature: Validating Post Property PG PropertyType fields

@chrome @PPPG
Scenario: Apartment fields for PG Validation
Given User Navigate to post Free Window
When User select Post Property and select PG
And User Select Apartment Property type
Then Apartment fields for PPPG are displayed

@chrome @PPPG
Scenario: Individual House fields for PG Validation
Given User Navigate to post Free Window
When User select Post Property and select PG
And User Select Individual House Property type
Then Individual House fields for PPPG are displayed
