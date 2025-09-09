Feature: Edit the account
Scenario: Search the account and update the details
Given launch the browser successfully
When Enter the username as 'bhuvanesh.moorthy@testleaf.com'
When Enter the password as 'Test@2025'
When click on the login button
And click the applauncher icon
And click the viewall button
And Scroll to element accounts and click that
And Search list enter the name and click that name
And click the dropdown button near the name and select edit option
And Give the phonenumber as '9940167129'
And Set type to technology partner and set industry to healthcare
And Enter the billing address as 'Perumbakkam'
And Enter the Shipping address as 'Chennai'
And Set customer priority as low and Set SLA to Silver
And Set Active to NO and Upsell Opportunity to No
And click save
Then Verify the phonenumber