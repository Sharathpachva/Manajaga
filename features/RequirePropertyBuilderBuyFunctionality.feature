Feature: Functionality of Require Property of Tenant for Sale 

@chrome 
Scenario Outline: Verifying the functionality of Require Property of Tenant for Buy 
Given User SignIn and Navigate to Post Free Window
When User select Require Property and Select Tenant for Buy 
And User select <Propertytype> Property type of Require property for Buy
And Enter All the Mandatory fields for <Propertytype> Property type of Require property for Buy
Then Require Property is created

Examples:
|Propertytype|
|Agriculture Land|
#|Apartment|
#|Commercial Plot|
#|Commercial Shop|
#|PentHouse|
#|Residential House|
#|Residential Plot|
#|Warehouse|