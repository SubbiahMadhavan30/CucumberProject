Feature: To Validate Adactin Booking Functionality
@smoke
  Scenario: user check the login  using valid username and valid password
    Given user Launch the Browser
    And user Pass the valid username and Valid password
      | kanmaniM2923 | 123456 |
    And user click login button
    And user validate the navigation of next page
    And user select the location ,hotel,roomtype,noofrooms
      | Location | Hotels         | Room Type | Numbers of Rooms |
      | Brisbane | Hotel Cornice  | Standard  | 4 - Four         |
      | Sydney   | Hotel Sunshine | Double    | 2 - Two          |
    And user select the checkindate and checkoutdate
      | Check In Date  | 25/09/2023 |
      | Check Out Date | 26/09/2023 |
    And user select the adultperroom and childrenperroom
      | Adults per Room   | 3 - Three |
      | Children per Room | 2 - Two   |
    And click the search button
    And user select the hotel using radio button
    And click continue button
    When user enter the firstname,lastname,billingaddress,creditcardnumber
      | Subbiah | Madhavan | Tirunelveli | 1234567890123456 |
      | Selvi   | Meena    | Madurai     | 0987654321123456 |
    And user enter the creditcardtype and expirydate
      | American Express | March | 2026 |
    And user enter the cvv number
      | CVV | 444 |
    Then user click the booking button
