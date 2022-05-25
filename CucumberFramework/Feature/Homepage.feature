Feature: Application Verification

	Scenario: verify availability product
	Given user is on home page
	When user clicked on search icon
	And sended the text
	Then user navigated to next page
	And popup closed if any
	And text is verified
	
		