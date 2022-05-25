Feature: subscription verification

Scenario: successfull subscription

Given user is on homepage
When user clicks on TVunit
And close popup
And click on product tv
Then user navigated to next page
And page is verified
And user hover on material and check ckeckbox
Then verifies correct text
And enter email
Then subscription is successfully added





