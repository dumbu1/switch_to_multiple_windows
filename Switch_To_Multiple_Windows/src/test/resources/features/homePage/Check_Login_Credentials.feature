Feature: check home page is opened or not

Background:
Given user is on home page with title "Web Examples - CrossBrowserTesting.com"
When user clicks on "Login Form" link
Then system should open "Login Form - CrossBrowserTesting.com" page

Scenario: check login credentials1
When user enters "tester@crossbrowsertesting.com" as username and "test123" as password and clicks on "Login" button

Then system should open "Login Form - CrossBrowserTesting.com" page

Scenario: check login credentials2
When user enters "tester@crossbrowsertesting.com" as username and "test123" as password and clicks on "Login" button

Then system should open "Login Form - CrossBrowserTesting.com1" page