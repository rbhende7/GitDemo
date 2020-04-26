Feature: Login into Application

Scenario Outline: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "http://qacickacademy.com" site
And Click on Login link in home page to land on Secure sign in Page
When User enters <username> and <password> and logs in
Then Verify that user is successfully logged in

Examples:
|username			|password	|
|test99@gmail.com	|123456gggyuggggukhk7yteddd88----ybkjjjjjjjjjjjjjj|
|test100@gmail.com	|000000|
|test101@gmail.com	|111111|
|test102@gmail.com	|222222|