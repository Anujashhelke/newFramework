Feature: verifies gift collection

Scenario Outline: unsuccessful gift collection

Given user is on homepage
When user hover on gift
And Choose a gift
Then gets the price of gift
And user enter price
And insert date for which it is going to delivered
And submit
Then details form navigated
And user fill details "<recei_name>" ,"<customer_name>" ,"<Custmer_mail>" , "<receipnt_mail>" , "<cutomer_phone>"
And clicks on confirm
Then filled details successfully


Examples:
| recei_name | customer_name | Customer_mail | receipnt_mail | customer_phone |
| avni | anuja | avni@gmail.com | monu@gmail.com | 8790654367 |
| kajal | mibal | kajal@gmail.com | rupal@gmail.com | 1234567890 |








