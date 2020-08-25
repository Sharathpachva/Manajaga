Feature: Functionality of Post Property of Owner for Sale 

@chrome @PPOSF
Scenario Outline: Verifying the functionality of Post Property of Owner for Sale 
Given User SignIn and Navigate to Post Free Window
When User select Post Property and Select Owner for Sale 
And User select <Propertytype> Property type of post property for sale
And Enter All the Mandatory fields for <Propertytype> Property type of post property for Sale
Then Post Property is created

Examples:
|Propertytype|
|Agriculture Land|
#|Apartment|
#|Commercial Plot|
#|Commercial Shop|
#|Industrial Land|
#|Individual House|
#|Office Space|
#|Pent House|
#|Residential Plot|
#|Ware House|
