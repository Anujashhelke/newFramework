Feature: Add product to cart

Scenario Outline: Succeccfull addition

Given User is on homePage
When user hover on "study"
And clicks on Laptop 
Then user navigated to next page and popup closed
And user click on Add product to cart
And enter quantity
Then user get price of product
And user clicks on Checkout
And user add the details "<username>" and "<phone>" , "<pin>" , "<fname>" , "<lname>" , "<address>"
Then product addedd successfully


Examples:
| username | phone | pin | fname | lname | address |
| anujashelke0499@gmail.com | 9527620877 | 444108 | Anuja | Shelke | changalwadi |