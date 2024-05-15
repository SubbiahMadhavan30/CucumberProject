Feature: To Validate the Select hotel Functionality

  #Scenario: To check the select hotel page
  Scenario Outline: To Validate Login Using different set of Credentials
    Given user launch Adactin application
    And user enter username "<username>" and password "<password>"
    And user click login button
    And user see the results based on credential type "<credentialType>"
    And user select the location "<location>", Hotels "<hotels>" , RoomType "<RoomType>", NoofRooms "<NoofRooms>"
    And user enter checkindate "<checkindate>" and checkoutdate "<checkoutdate>"
    And user select AdultsPerRoom "<AdultsperRoom>" and ChildrenPerRoom "<childrenperRoom>"
    And user click search button
    When user select the hotel using radio button
    Then click continue button

    Examples: 
      | username   | password    | location | hotels       | RoomType | NoofRooms | checkindate | checkoutdate | AdultsperRoom | childrenperRoom | credentialType |
      #| maddy      | subbiah     | Sydney   | Hotel Hervey | Double   | 3 - Three | 16/09/2023  | 17/09/2023   | 2 - Two       | 1 - One         | negative       |
      | subbiah30 | 123456 | Sydney   | Hotel Hervey | Double   | 3 - Three | 16/09/2023  | 17/09/2023   | 2 - Two       | 1 - One         | positive       |
