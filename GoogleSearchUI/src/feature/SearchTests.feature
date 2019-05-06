Feature: Google Search
  
Scenario: User can search any string on Google search bar
Given User is on the Google home page
When User types a String into the search field
And User clicks the Enter key on the keyboard
Then User is able to see search results and quits

Scenario: User Search does not show any test results
Given User is on the Google home page
When User types an invalid String into the search field
Then User is not able to see any test results and quits the browser


