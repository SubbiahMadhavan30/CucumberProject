Feature: To Validate Adactin Login Functionality

  #Scenario: user check the login  using valid username and valid password
    #Given user Launch the Browser
    #When user Pass the valid username and Valid password
    #And user click login button
    #Then user validate the navigation of next page

  Scenario Outline: To Validate Login Using different set of Credentials
    Given user launch Adactin application
    When user enter username "<username>" and password "<password>"
    And user click login button
    Then user see the results based on credential type "<credentialType>"

    Examples: 
      | username   | password    | credentialType |
     # | maddy      | subbiah     | negative       |
      | subbiah30 | 123456 | positive       |
