Feature: Functionality of Require Property of AgentBroker for PG 

@chrome 
Scenario Outline: Verifying the functionality of Require Property of AgentBroker for PG 
Given User SignIn and Navigate to Post Free Window
When User select Require Property and Select AgentBroker for PG 
And User select <Propertytype> Property type of Require property for PG
And Enter All the Mandatory fields for <Propertytype> Property type of Require property for PG
Then Require Property is created

Examples:
|Propertytype|
#|Apartment|
#|Residential House|
