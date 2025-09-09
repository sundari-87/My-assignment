Feature: login functionality of leaftaps


Scenario: checking the user credentials

When Enter the username as 'demosalesmanager'
When Enter the password as 'crmsfa'
When click on the login button
Then Display the message the page loaded as successfully

Scenario: checking the invalid user credentials

When Enter the username as 'demosalesmanager'
When Enter the password as 'crmsf'
When click on the login button
Then Error message displayed