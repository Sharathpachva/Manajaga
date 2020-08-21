Feature: Validating Require Property PG PropertyType fields


@chrome @RPPG
Scenario: Apartment fields for PG Validation
Given User Navigate to Post Free Window
When User select Require Property and select PG
And User Select Apartment Property type for Require Property PG
Then Apartment fields for RPPG are displayed

@chrome @RPPG
Scenario: Residential House fields for PG Validation
Given User Navigate to Post Free Window
When User select Require Property and select PG
And User Select residential House Property type Require Property PG
Then Residential House fields for RPPG are displayed