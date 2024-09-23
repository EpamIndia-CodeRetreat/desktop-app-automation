@Regression @Functionality
Feature: Meeting Invite Creation and Sending

  As a user of the Outlook desktop application
  I want to create and send a meeting invite
  So that I can schedule meetings with participants

  Background:
    Given the user has a valid Outlook account configured on the desktop application
    And the Outlook application is open and the user is logged in

  @CreateMeeting
  Scenario: User creates and sends a meeting invite
    Given the user is on the Outlook Calendar view
    When the user clicks on the "More Options" icon beside to New Email
    And the user selects "Meeting" from the dropdown
    And the user enters "Test Meeting" in the "title" field
    And the user sets the start and end time for the meeting
    And the user enters email addresses in the "To" field
    And the user optionally enters "Conference Room 1" in the "Location" field
    And the user optionally enters a description for the meeting
    Then the user clicks the "Send" button
    And the meeting invite should be sent to all participants