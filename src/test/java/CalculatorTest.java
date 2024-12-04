import org.junit.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class CalculatorTest {

    private WiniumDriver driver;

    @Before
    public void setUp() throws IOException {
        File driverPath = new File("C:\path\to\WinAppDriver.exe");
        WiniumDriverService service = new WiniumDriverService.Builder()
                .usingDriverExecutable(driverPath)
                .usingPort(9999)
                .withVerbose(true)
                .withSilent(false)
                .build();

        service.start();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "C:\path\to\MicrosoftTeams.exe");

        driver = new WiniumDriver(new URL("http://localhost:9999"), capabilities);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testSendMessageToChannel() throws InterruptedException {
        // Step 1: Select a team from the left sidebar
        // TODO: Implement code to select a team from the left sidebar

        // Step 2: Click on a channel within the selected team
        // TODO: Implement code to click on a channel within the selected team

        // Step 3: Type the message in the message input box
        // TODO: Implement code to type the message in the message input box
        String message = "Hello, this is a test message.";
        driver.findElementByClassName("MessageInput").sendKeys(message);

        // Step 4: Click the 'Send' button
        // TODO: Implement code to click the 'Send' button
        driver.findElementByAccessibilityId("SendMessageButton").click();

        // Verification: Verify if the message appears in the channel conversation area
        // TODO: Implement code to verify if the message appears in the channel conversation area
        String conversationArea = driver.findElementByClassName("ChannelConversationArea").getText();
        Assert.assertTrue(conversationArea.contains(message));
    }
}