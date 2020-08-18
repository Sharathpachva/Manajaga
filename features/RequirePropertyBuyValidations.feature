Feature: Validating Require Property Buy PropertyType fields

@chrome
Scenario: Agricultural Land fields validation
Given User Navigate to post Free Window
When User select Require Property and select Buy
And User Select Agricultural Land Property type
Then Agricultural Land fields are displayed

@chrome
Scenario: Apartment fields Validation
Given User Navigate to post Free Window
When User select Require Property and select Buy
And User Select Apartment Property type
Then Apartment fields are displayed

@chrome
Scenario: Commercial Plot fields Validation
Given User Navigate to post Free Window
When User select Require Property and select Buy
And User Select Commercial Plot Property type
Then Commercial Plot fields are displayed

@chrome
Scenario: Commercial Shop fields Validation
Given User Navigate to post Free Window
When User select Require Property and select Buy
And User Select Commercial Shop Property type
Then Commercial Shop fields are displayed

@chrome
Scenario: Pent House fields Validation
Given User Navigate to post Free Window
When User select Require Property and select Buy
And User Select Pent House Property type
Then Pent House fields are displayed

@chrome
Scenario: Residential House fields Validation
Given User Navigate to post Free Window
When User select Require Property and select Buy
And User Select residential House Property type
Then Residential House fields are displayed

@chrome
Scenario: Residential Plot fields Validation
Given User Navigate to post Free Window
When User select Require Property and select Buy
And User Select residential Plot Property type
Then Residential Plot fields are displayed

@chrome
Scenario: WareHouse fields Validation
Given User Navigate to post Free Window
When User select Post Property and select Buy
And User Select WareHouse Property type
Then WareHouse fields are displayed
