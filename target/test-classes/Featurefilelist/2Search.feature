Feature: To Validate Adactin Search Functionality

 Scenario: user check the login  using valid username and valid password
    Given user Launch the Browser
    And user Pass the valid username and Valid password
      | kanmaniM2923 | 123456 |
    And user click login button
   And user validate the navigation of next page
    When user select the location ,hotel,roomtype,noofrooms
      | Location | Hotels         | Room Type | Numbers of Rooms |
      | Brisbane | Hotel Cornice  | Standard  | 4 - Four         |
      | Sydney   | Hotel Sunshine | Double    | 2 - Two          |
    And user select the checkindate and checkoutdate
      | Check In Date  | 25/09/2023 |
      | Check Out Date | 26/09/2023 |
    And user select the adultperroom and childrenperroom
      | Children per Room | 2 - Two   |
    Then click the search button
