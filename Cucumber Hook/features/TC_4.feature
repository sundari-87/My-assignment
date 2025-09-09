Feature: DeleteLead from Leaftaps application


#Background:
#Given launch the browser successfully
@smoke
Scenario: DeleteLead successfully

When Enter the username as 'demosalesmanager'
When Enter the password as 'crmsfa'
When click on the login button
When click on crmsfa link
When click on leads link
And click on findleads link
And click the phone link and enter the phone number as <phone number>
And click the findleads
And click the matched id and store it an variable and click the delete button
And click the findleads button
And give that id number we stored
And click the find leads button again
Then check the message displayed.