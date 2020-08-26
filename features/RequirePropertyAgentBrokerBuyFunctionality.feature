Feature: Functionality of Require Property of AgentBroker for Buy 

@chrome 
Scenario Outline: Verifying the functionality of Require Property of AgentBroker for Buy 
Given User SignIn and Navigate to Post Free Window
When User select Require Property and Select AgentBroker for Buy
And User select <Propertytype> Property type of Require property for Buy or Rent
And Enter All the Mandatory fields for <Propertytype> Property type of Require property for Buy or Rent
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