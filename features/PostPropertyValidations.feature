Feature: Validating Post Property Sale PropertyType fields

@chrome @maja
Scenario: Agricultural Land fields validation
Given User Navigate to post Free Window
When User select Post Property and select Sale
And User Select Agricultural Land Property type
Then Agricultural Land fields are displayed

@chrome
Scenario: Apartment fields Validation
Given User Navigate to post Free Window
When User select Post Property and select Sale
And User Select Apartment Property type
Then Apartment Land fields are displayed

@chrome
Scenario: Commercial Plot fields Validation
Given User Navigate to post Free Window
When User select Post Property and select Sale
And User Select Commercial Plot Property type
Then Commercial Plot Land fields are displayed

@chrome
Scenario: Commercial Shop fields Validation
Given User Navigate to post Free Window
When User select Post Property and select Sale
And User Select Commercial Shop Property type
Then Commercial Shop Land fields are displayed

@chrome
Scenario: Industrial Land fields Validation
Given User Navigate to post Free Window
When User select Post Property and select Sale
And User Select Industrial Land Property type
Then Commercial Plot Land fields are displayed

@chrome
Scenario: Individual House fields Validation
Given User Navigate to post Free Window
When User select Post Property and select Sale
And User Select Individual House Property type
Then Individual House Land fields are displayed

@chrome
Scenario: Office Space fields Validation
Given User Navigate to post Free Window
When User select Post Property and select Sale
And User Select Office Space Property type
Then Office Space Land fields are displayed

@chrome
Scenario: Pent House fields Validation
Given User Navigate to post Free Window
When User select Post Property and select Sale
And User Select Pent House Property type
Then Pent House Land fields are displayed

@chrome
Scenario: Residential Plot fields Validation
Given User Navigate to post Free Window
When User select Post Property and select Sale
And User Select residential Plot Property type
Then Residential Plot Land fields are displayed

@chrome
Scenario: WareHouse fields Validation
Given User Navigate to post Free Window
When User select Post Property and select Sale
And User Select WareHouse Property type
Then WareHouse Land fields are displayed