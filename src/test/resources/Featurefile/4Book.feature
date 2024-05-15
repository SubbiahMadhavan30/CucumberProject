Feature: To Validate Book a hotel functionality

  Scenario: To check  book a hotel page by passing the required field

  Scenario Outline: To Validate Login Using different set of Credentials
    Given user launch Adactin application
    And user enter username "<username>" and password "<password>"
    And user click login button
    And user see the results based on credential type "<credentialType>"
    And user select the location "<location>", Hotels "<hotels>" , RoomType "<RoomType>", NoofRooms "<NoofRooms>"
    And user enter checkindate "<checkindate>" and checkoutdate "<checkoutdate>"
    And user select AdultsPerRoom "<AdultsperRoom>" and ChildrenPerRoom "<childrenperRoom>"
    And user click search button
    And user select the hotel using radio button
    And click continue button
    When user enter the FirstName "<firstname>",LastName "<lastname>" ,BillingAddress "<Billingaddress>" ,CreditCardNo "<creditcardno>"
    And user select the CreditCardType "<creditcardtype>",ExpiryDate "<month>" "<year>"
    And user enter the cvv number "<cvv num>"
    And click booknow button
    Then order id is generate

    Examples: 
      | username   | password    | location | hotels       | RoomType | NoofRooms | checkindate | checkoutdate | AdultsperRoom | childrenperRoom | firstname | lastname | Billingaddress | creditcardno     | creditcardtype | month   | year | cvv num | credentialType |
      | subbiah30| 123456 | Sydney   | Hotel Hervey | Double   | 3 - Three | 16/09/2023  | 17/09/2023   | 2 - Two       | 1 - One         | Subbiah   | Madhavan | Tirunelveli    | 1234567890123456 | VISA           | October | 2027 |     444 | positive       |
