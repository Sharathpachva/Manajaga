Feature: Validating Require Property Buy PropertyType fields for buy

@chrome @RPBuy
Scenario: Agricultural Land fields for buy or rent validation
Given User Navigate to post Free Window
When User select Require Property and select Buy
And User Select Agricultural Land Property type
Then Agricultural Land fields for buy or rent are displayed

@chrome @RPBuy
Scenario: Apartment fields for buy or rent Validation
Given User Navigate to post Free Window
When User select Require Property and select Buy
And User Select Apartment Property type
Then Apartment fields for buy or rent are displayed

@chrome @RPBuy
Scenario: Commercial Plot fields for buy or rent Validation
Given User Navigate to post Free Window
When User select Require Property and select Buy
And User Select Commercial Plot Property type
Then Commercial Plot fields for buy or rent are displayed

@chrome @RPBuy
Scenario: Commercial Shop fields for buy or rent Validation
Given User Navigate to post Free Window
When User select Require Property and select Buy
And User Select Commercial Shop Property type
Then Commercial Shop fields for buy or rent are displayed

@chrome @RPBuy
Scenario: Pent House fields for buy or rent Validation
Given User Navigate to post Free Window
When User select Require Property and select Buy
And User Select Pent House Property type
Then Pent House fields for buy or rent are displayed

@chrome @RPBuy
Scenario: Residential House fields for buy or rent Validation
Given User Navigate to post Free Window
When User select Require Property and select Buy
And User Select residential House Property type
Then Residential House fields for buy or rent are displayed

@chrome @RPBuy
Scenario: Residential Plot fields for buy or rent Validation
Given User Navigate to post Free Window
When User select Require Property and select Buy
And User Select residential Plot Property type
Then Residential Plot fields for buy or rent are displayed

@chrome @RPBuy
Scenario: WareHouse fields for buy or rent Validation
Given User Navigate to post Free Window
When User select Require Property and select Buy
And User Select WareHouse Property type
Then WareHouse fields for buy or rent are displayed
