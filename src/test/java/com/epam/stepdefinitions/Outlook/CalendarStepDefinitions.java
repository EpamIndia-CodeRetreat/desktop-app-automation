public class CalendarStepDefinitions {
    private CalendarPage calendarPage;

    // Existing step definitions...

    // New step definitions based on the BDD scenario
    @When("User clicks on the \"More Options\" arrow in the navigation pane")
    public void userClicksMoreOptionsArrow() {
        calendarPage.moreOptionsArrow.click();
    }

    @When("User clicks on \"Meeting\" in the dropdown")
    public void userClicksMeetingInDropdown() {
        calendarPage.dropdownMeeting.click();
    }

    // More step definitions...
}