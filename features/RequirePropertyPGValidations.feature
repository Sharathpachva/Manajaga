Feature: Validating Require Property PG PropertyType fields


@chrome
Scenario: Apartment fields Validation
Given User Navigate to post Free Window
When User select Require Property and select PG
And User Select Apartment Property type
Then Apartment fields are displayed

@chrome
Scenario: Residential House fields Validation
Given User Navigate to post Free Window
When User select Require Property and select PG
And User Select residential House Property type
Then Residential House fields are displayed