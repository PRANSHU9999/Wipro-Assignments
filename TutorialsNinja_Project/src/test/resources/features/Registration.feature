Feature: Registration Functionality
Scenario: Verify user registration
Given user opens browser and launches website
When user navigates to registration page
And user enters registration details
And user clicks on Continue button
Then account should be created successfully