Feature: Add To Cart

Background:
Given user opens browser and launches website

Scenario: Verify add to cart functionality

When user searches product
And user adds product to cart
Then success message should be displayed
And validate total amount
When user proceeds to checkout
Then checkout page should display