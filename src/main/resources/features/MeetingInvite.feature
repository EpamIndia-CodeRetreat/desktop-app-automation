@Regression @Functionality
Feature: Meeting Invite Creation and Sending

  Background:
    Given User has a valid Outlook account configured on the desktop application
    And Outlook application is open and the user is logged in

  Scenario: User creates and sends a meeting invite
    Given User is on the Outlook Calendar view
    When User clicks on the "More Options" icon beside to New Email
    And User selects "Meeting" from the drop down
    And User enters "Test Meeting" in the "title" field
    And User sets the start and end time for the meeting
    And User adds participants in the "To" field
    And User optionally adds "Conference Room 1" in the "Location" field
    And User optionally adds a description in the meeting description field
    Then User clicks the "Send" button
    And the meeting invite is sent successfully