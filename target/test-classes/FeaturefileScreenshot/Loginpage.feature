Feature: To Validate the Login Functionality

  Background:
  Given user launch the Adactin application

  Scenario: user check the login using the valid username valid password
    When user enter the valid username and valid password
      | username | vaithy2410  |
      | password | vaithy@2410 |
    Then user click login button
    And user see the next page

  Scenario: user check the login using the valid username invalid password
    When user enter the valid username and invalid password
      | vaithy2410 | vaithy@2140 |
    Then user click login button
    And user see the error message

  Scenario: user check the login using the invalid username valid password
    When user enter the invalid username and valid password
      | vaithi2410 | vaithy@2410 |
      | maddy12    | vaithy@2410 |
    Then user click login button
    And user see the error message

  Scenario: user check the login using the invalid username invalid password
    When user enter the invalid username and invalid password
      | username   | password    |
      | vaithi2410 | vaithy@2041 |
      | madhavan   | maddy@123   |
    Then user click login button
    And user see the error message
