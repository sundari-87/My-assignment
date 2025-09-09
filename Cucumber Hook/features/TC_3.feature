Feature: EditLead from Leaftaps application


#Background:
#Given launch the browser successfully

Scenario: EditLead  with multiple data

When Enter the username as 'demosalesmanager'
When Enter the password as 'crmsfa'
When click on the login button
When click on crmsfa link
When click on leads link
And click on findleads link
And click the phone link and enter the phone number as <phone number>
And click the findleads
And click the edit button and update companyname as <cname>
When click the edit button
Then Viewpage is displayed
Examples:
|phone number|cname|
|98|CTS|
|99|TCS|
