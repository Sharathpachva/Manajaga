Feature: Validating Require Property Rent PropertyType fields

@chrome @RPRent
Scenario: Agricultural Land fields validation
Given User Navigate to post Free Window
When User select Require Property and select Rent
And User Select Agricultural Land Property type
Then Agricultural Land fields for buy or rent are displayed

@chrome @RPRent
Scenario: Apartment fields Validation
Given User Navigate to post Free Window
When User select Require Property and select Rent
And User Select Apartment Property type
Then Apartment fields for buy or rent are displayed

@chrome @RPRent
Scenario: Commercial Plot fields Validation
Given User Navigate to post Free Window
When User select Require Property and select Rent
And User Select Commercial Plot Property type
Then Commercial Plot fields for buy or rent are displayed

@chrome @RPRent
Scenario: Commercial Shop fields Validation
Given User Navigate to post Free Window
When User select Require Property and select Rent
And User Select Commercial Shop Property type
Then Commercial Shop fields for buy or rent are displayed

@chrome @RPRent
Scenario: Pent House fields Validation
Given User Navigate to post Free Window
When User select Require Property and select Rent
And User Select Pent House Property type
Then Pent House fields for buy or rent are displayed

@chrome @RPRent
Scenario: Residential House fields Validation
Given User Navigate to post Free Window
When User select Require Property and select Rent
And User Select residential House Property type
Then Residential House fields for buy or rent are displayed

@chrome @RPRent
Scenario: Residential Plot fields Validation
Given User Navigate to post Free Window
When User select Require Property and select Rent
And User Select residential Plot Property type
Then Residential Plot fields for buy or rent are displayed

@chrome @RPRent
Scenario: WareHouse fields Validation
Given User Navigate to post Free Window
When User select Require Property and select Rent
And User Select WareHouse Property type
Then WareHouse fields for buy or rent are displayed
