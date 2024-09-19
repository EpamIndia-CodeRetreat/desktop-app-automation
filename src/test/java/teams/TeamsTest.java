package teams;

import io.appium.java_client.windows.WindowsDriver;
import org.junit.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TeamsTest {

    private static WindowsDriver TeamsSession = null;
    private TeamsPOM teamsPOM;

    @BeforeClass
    public static void setup() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("app", "C:\\Users\\chandradeb_pandey\\AppData\\Local\\Microsoft\\WindowsApps\\ms-teams.exe");
            TeamsSession = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
            TeamsSession.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            TeamsSession.manage().window().maximize();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Before
    public void init() {
        teamsPOM = new TeamsPOM(TeamsSession);
    }

    //@AfterClass
    public static void TearDown() {
        if (TeamsSession != null) {
            TeamsSession.quit();
        }
        TeamsSession = null;
    }

    @Test
    public void sendMessage() throws InterruptedException {
        teamsPOM.clickTeamsButton();
        teamsPOM.clickCreateAndJoinButton();
        teamsPOM.clickCreateTeamButton();
        teamsPOM.enterTeamName("FTE BATCH");
        teamsPOM.enterDescription("Hello Teams");
        teamsPOM.selectPrivateOption();
        teamsPOM.enterChannelName("25th April Batch");
        teamsPOM.clickCreateButton();

        TeamsSession.close();
    }
}

