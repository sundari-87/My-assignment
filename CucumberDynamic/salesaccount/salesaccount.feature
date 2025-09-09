Feature: Create new account with name
Background:
Given launch the browser successfully

Scenario Outline: Salesdetail  with multiple data
When Enter the username as 'bhuvanesh.moorthy@testleaf.com'
When Enter the password as 'Test@2025'
When click on the login button
And click the applauncher icon
And click the viewall button
And click the sales button
And Click on Accounts tab 
And Click on New button 
And  Enter your name as account name <account name>
And  Select Ownership as Public
Then Click save and verify Account name

Examples:
|account name|
|Madhu|
|Venu|
|rani|