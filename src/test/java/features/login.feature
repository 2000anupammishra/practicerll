Feature: FirstCry Login Automation

  Scenario Outline: Login to FirstCry
   Given User is on the MainPage,get title of the page
    When User clicks on login link
    And User will enter login '<loginid>','<passwordid>'
    Then User will click login button

      Examples:
      | loginid                     | passwordid   |
      | 2000anupammishra@gmail.com  | password@123 |