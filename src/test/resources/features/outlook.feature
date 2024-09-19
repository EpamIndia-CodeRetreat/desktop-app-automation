Feature: Test Automation of Outlook


  Scenario: Send Email from Outlook
    When user enters the receipient ID
    And user enters the subject
    And user enters the body
    Then user clicks on send
