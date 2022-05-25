Feature: check urban ladder location

Scenario: check location

Given user is on homepage
When user click on stores
And navigated to next page and check the page by verifying text
And clicks on location
Then location page successfully verified
And close the driver





