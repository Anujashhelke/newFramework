Feature: Get user reponse

Scenario: check user stories

Given user is on homepage
When user click on link
And verifies the text "TERMS OF SHIPPING AND DELIVERY"
And clicks on stories
Then successfully got the response
And close the driver

