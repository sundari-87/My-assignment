Feature: createLead from Leaftaps application


#Background:
#Given launch the browser successfully

Scenario Outline: CreateLead  with multiple data

When Enter the username as 'demosalesmanager'
When Enter the password as 'crmsfa'
When click on the login button
When click on crmsfa link
When click on leads link
And click on createleads link
And enter the company name as <company name>
And enter the firstname as <first name>
And enter the lastname as<last name>
When click on createLead
Then viewleadspage is displayed

Examples:
|company name|first name|last name|
|infosys|sundari|S|
|TCS|Murthi|s|
|CTS|Miruthula|S|