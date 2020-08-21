Feature: Validating Require Property Buy PropertyType fields for buy

@chrome @RPBuy
Scenario: Agricultural Land fields for buy or rent validation
Given User Navigate to post Free Window
When User select Require Property and select Buy
And User Select Agricultural Land Property type for Require Property Buy
Then Agricultural Land fields for buy or rent are displayed

@chrome @RPBuy
Scenario: Apartment fields for buy or rent Validation
Given User Navigate to post Free Window
When User select Require Property and select Buy
And User Select Apartment Property type for Require Property Buy
Then Apartment fields for buy or rent are displayed

@chrome @RPBuy
Scenario: Commercial Plot fields for buy or rent Validation
Given User Navigate to post Free Window
When User select Require Property and select Buy
And User Select Commercial Plot Property type for Require Property Buy
Then Commercial Plot fields for buy or rent are displayed

@chrome @RPBuy
Scenario: Commercial Shop fields for buy or rent Validation
Given User Navigate to post Free Window
When User select Require Property and select Buy
And User Select Commercial Shop Property type for Require Property Buy
Then Commercial Shop fields for buy or rent are displayed

@chrome @RPBuy
Scenario: Pent House fields for buy or rent Validation
Given User Navigate to post Free Window
When User select Require Property and select Buy
And User Select PentHouse Property type for Require Property Buy
Then Pent House fields for buy or rent are displayed

@chrome @RPBuy
Scenario: Residential House fields for buy or rent Validation
Given User Navigate to post Free Window
When User select Require Property and select Buy
And User Select Residential House Property type for Require Property Buy
Then Residential House fields for buy or rent are displayed

@chrome @RPBuy
Scenario: Residential Plot fields for buy or rent Validation
Given User Navigate to post Free Window
When User select Require Property and select Buy
And User Select Residential Plot Property type for Require Property Buy
Then Residential Plot fields for buy or rent are displayed

@chrome @RPBuy
Scenario: WareHouse fields for buy or rent Validation
Given User Navigate to post Free Window
When User select Require Property and select Buy
And User Select WareHouse Property type for Require Property Buy
Then WareHouse fields for buy or rent are displayed
