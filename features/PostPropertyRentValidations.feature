Feature: Validating Post Property Rent PropertyType fields

@chrome @Rent
Scenario: Apartment fields Validation
Given User Navigate to post Free Window
When User select Post Property and select Rent
And User Select Apartment Property type for Post Property Rent
Then Apartment fields for Rent are displayed

@chrome @Rent
Scenario: Commercial Plot fields Validation
Given User Navigate to post Free Window
When User select Post Property and select Rent
And User Select Commercial Plot Property type for Post Property Rent
Then Commercial Plot fields for Rent are displayed 

@chrome @Rent
Scenario: Commercial Shop fields Validation
Given User Navigate to post Free Window
When User select Post Property and select Rent
And User Select Commercial Shop Property type for Post Property Rent
Then Commercial Shop fields for Rent are displayed

@chrome @Rent
Scenario: Farm House fields Validation
Given User Navigate to post Free Window
When User select Post Property and select Rent
And User Select FarmHouse Property type for Post Property Rent
Then Farm House fields for Rent are displayed

@chrome @Rent
Scenario: Industrial Land fields Validation
Given User Navigate to post Free Window
When User select Post Property and select Rent
And User Select Industrial Land Property type for Post Property Rent
Then Industrial Land fields for Rent are displayed

@chrome @Rent
Scenario: Individual House fields Validation
Given User Navigate to post Free Window
When User select Post Property and select Rent
And User Select Individual House Property type for Post Property Rent
Then Individual House fields for Rent are displayed

@chrome @Rent
Scenario: Office Space fields Validation
Given User Navigate to post Free Window
When User select Post Property and select Rent
And User Select Office Space Property type for Post Property Rent
Then Office Space fields for Rent are displayed

@chrome @Rent
Scenario: Pent House fields Validation
Given User Navigate to post Free Window
When User select Post Property and select Rent
And User Select PentHouse Property type for Post Property Rent
Then Pent House fields for Rent are displayed

#@chrome @Rent
#Scenario: Residential Plot fields Validation
#Given User Navigate to post Free Window
#When User select Post Property and select Rent
#And User Select Residential Plot Property type for Post Property Rent
#Then Residential Plot fields for Rent are displayed
#
#@chrome @Rent
#Scenario: WareHouse fields Validation
#Given User Navigate to post Free Window
#When User select Post Property and select Rent
#And User Select WareHouse Property type for Post Property Rent
#Then WareHouse fields for Rent are displayed