Feature: Remove Product
Scenario: Verify remove product from cart
Given user opens browser and launches website
When user adds product into cart
And user removes product from cart
Then cart should become empty