Feature: Login Functionality

Background:
Given user opens browser and launches website

Scenario: Verify user login with valid credentials

When user clicks on My Account
And user clicks on Login
And user enters valid email and password
And user clicks on Login button
Then user should navigate to My Account page