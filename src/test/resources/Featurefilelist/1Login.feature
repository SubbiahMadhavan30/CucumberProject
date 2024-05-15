Feature: To Validate Adactin Login Functionality

 Scenario: user check the login  using valid username and valid password
    Given user Launch the Browser
    When user Pass the valid username and Valid password
   |kanmaniM2923|123456|
   
   |vaithy2410|vaithy@2411|
   
    And user click login button
    Then user validate the navigation of next page
