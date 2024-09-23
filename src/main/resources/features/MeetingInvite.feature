@Regression @Functionality
Feature: Meeting Invite Creation and Sending

  As a user of the Outlook desktop application
  I want to create and send a meeting invite
  So that I can schedule meetings with participants

  Background:
    Given User has a valid Outlook account configured on the desktop application
    And Outlook application is open and the user is logged in

  @CreateMeeting
  Scenario: User creates and sends a meeting invite
    Given User is on the Outlook Calendar view
    When User clicks on the "More Options" icon beside to New Email
    And User selects "Meeting" from the dropdown
    And User enters "Test Meeting" in the "title" field
    And User sets the start and end time for the meeting
    And User enters email addresses in the "To" field
    And User enters "Conference Room 1" in the "Location" field
    And User enters "This is a test meeting to verify the meeting creation process." in the meeting description
    And User clicks the "Send" button
    Then the meeting invite should be sent to all participants