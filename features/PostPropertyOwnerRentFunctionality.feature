Feature: Functionality of Post Property of Owner for Rent 

@chrome @PPORF
Scenario Outline: Verifying the functionality of Post Property of Owner for Rent 
Given User SignIn and Navigate to Post Free Window
When User select Post Property and Select Owner for Rent 
And User select <Propertytype> Property type of post property for Rent
And Enter All the Mandatory fields for <Propertytype> Property type of Post Property Rent
Then Post Property is created

Examples:
|Propertytype|
|Apartment|
#|Commercial Plot|
#|Commercial Shop|
#|Farm House|
#|Industrial Land|
#|Individual House|
#|Office Space|
#|Pent House|
#|Residential Plot|
#|Ware House|

