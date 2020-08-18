Feature: Validating Post Property PG PropertyType fields

@chrome
Scenario: Apartment fields Validation
Given User Navigate to post Free Window
When User select Post Property and select PG
And User Select Apartment Property type
Then Apartment fields are displayed

@chrome
Scenario: Individual House fields Validation
Given User Navigate to post Free Window
When User select Post Property and select PG
And User Select Individual House Property type
Then Individual House fields are displayed
