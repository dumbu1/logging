Feature: feature1
Background:
Given user is on "The Internet" page
When user navigates to multiple windows page

Scenario: feature1_Scenario1
Given user is on "The Internet" page
When user clicks on Click Here link
Then system should shift the focus to new window
And system should open "New Window" page
And system should display the message "New Window"