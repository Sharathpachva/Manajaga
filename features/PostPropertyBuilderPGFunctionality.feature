Feature: Functionality of Post Property of Builder for PG 

@chrome 
Scenario Outline: Verifying the functionality of Post Property of Builder for PG 
Given User SignIn and Navigate to Post Free Window
When User select Post Property and Select Builder for PG 
And User select <Propertytype> Property type of post property for PG
And Enter All the Mandatory fields for <Propertytype> Property type of Post Property PG
Then Post Property is created


Examples:
|Propertytype|
#|Apartment|
|Individual House|