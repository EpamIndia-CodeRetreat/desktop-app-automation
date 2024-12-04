Feature: Teams Messaging

  Scenario: Send a message in a team channel
    Given I am on the Teams dashboard
    When I select a team
    And I open a channel
    And I type a message
    And I send the message
    Then the message should be displayed in the channel conversation area