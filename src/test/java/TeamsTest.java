import io.appium.java_client.windows.WindowsDriver;
import org.junit.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TeamsTest {
    private static WindowsDriver TeamsSession = null;
    private static WebElement TeamsResult = null;

    @BeforeClass
    public static void setup() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("app", "C:\\Users\\bharath.kandukuri\\AppData\\Local\\Microsoft\\Teams\\current\\Teams.exe");
            TeamsSession = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
            TeamsSession.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            TeamsResult = TeamsSession.findElementByAccessibilityId("CalculatorResults");
            Assert.assertNotNull(TeamsResult);

        }catch(Exception e){
            e.printStackTrace();
        } finally {
        }
    }

    @Before
    public void Clear()
    {

    }

    @AfterClass
    public static void TearDown()
    {
        TeamsResult = null;
        if (TeamsSession != null) {
            TeamsSession.quit();
        }
        TeamsSession = null;
    }

    @Test
    public void sendMessage() throws InterruptedException {
        Thread.sleep(10);
        TeamsSession.close();
    }
}
