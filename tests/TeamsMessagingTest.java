import org.junit.Assert;
import org.junit.Test;

public class TeamsMessagingTest {

    @Test
    public void sendMessageInChannel() {
        // Jira Ticket ID: EA-1

        // Step 1: From the Teams dashboard, select a team from the left sidebar.
        TeamsDashboard teamsDashboard = new TeamsDashboard();
        teamsDashboard.selectTeam("Test Team");

        // Step 2: Click on a channel within the selected team where the user wants to send a message.
        TeamChannel teamChannel = teamsDashboard.openChannel("General");

        // Step 3: In the message input box at the bottom of the screen, type "Hello, this is a test message."
        String message = "Hello, this is a test message.";
        teamChannel.typeMessage(message);

        // Step 4: Click the 'Send' button (or press Enter).
        teamChannel.sendMessage();

        // Verification: The message "Hello, this is a test message" should appear in the channel conversation area.
        Assert.assertTrue(teamChannel.isMessageDisplayed(message));
    }
}