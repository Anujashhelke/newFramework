Feature: login verification

Scenario: unsuccessfull login

Given: user is on homepage
When user hovers on login
And clicks on Login
Then Login window popup
And Enters  fill invalid email ,password
And clicks on submit
Then error massage displayed
And try to click on submit with empty fields
Then displays fields are mandatory
And close the driver








	