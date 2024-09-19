package com.epam.stepdefinitions;

import io.appium.java_client.windows.WindowsDriver;
import org.junit.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.epam.pageobjects.OutlookPOM;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class OutlookTest {

    private static WindowsDriver OutlookSession = null;
    private OutlookPOM outlookPOM;

    @BeforeClass
    public static void setup() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("app", "C:\\Users\\chandradeb_pandey\\AppData\\Local\\Microsoft\\WindowsApps\\olk.exe");
            OutlookSession = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
            OutlookSession.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Before
    public void init() {
        outlookPOM = new OutlookPOM(OutlookSession);
    }

    @AfterClass
    public static void TearDown() {
        if (OutlookSession != null) {
            OutlookSession.quit();
        }
        OutlookSession = null;
    }

    @Test
    public void SendEmail() throws InterruptedException {
        Thread.sleep(2000);  // Consider using WebDriverWait for better handling
        outlookPOM.clickNewMailButton();
        Thread.sleep(2000);  // Consider using WebDriverWait for better handling
        outlookPOM.enterRecipient("bharath_kandukuri@epam.com");
        outlookPOM.enterSubject("Request for Desktop Apps");
        outlookPOM.enterMessageBody("Hello Chandra deb, Welcome to Epam");
        outlookPOM.clickSendButton();
    }
}
