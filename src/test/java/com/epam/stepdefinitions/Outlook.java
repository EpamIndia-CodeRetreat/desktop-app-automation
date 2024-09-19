package com.epam.stepdefinitions;

import com.epam.pageobjects.OutlookPOM;
import io.appium.java_client.windows.WindowsDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Outlook
{
    private static WindowsDriver OutlookSession = null;
    private OutlookPOM outlookPOM;

    @Before
    public void setup() {
        try {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("app", "C:\\Program Files\\Microsoft Office\\root\\Office16\\OUTLOOK.EXE");
            OutlookSession = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
            OutlookSession.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            outlookPOM = new OutlookPOM(OutlookSession);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @When("user enters the receipient ID")
    public void user_enters_the_receipient_id() throws InterruptedException {
        Thread.sleep(2000);  // Consider using WebDriverWait for better handling
        outlookPOM.clickNewMailButton();
        Thread.sleep(8000);  // Consider using WebDriverWait for better handling
        outlookPOM.enterRecipient("bharath_kandukuri@epam.com");
    }
    @When("user enters the subject")
    public void user_enters_the_subject() {
        outlookPOM.enterSubject("Request for Desktop Apps");
    }
    @When("user enters the body")
    public void user_enters_the_body() {
        outlookPOM.enterMessageBody("Hello Chandra deb, Welcome to Epam");
    }
    @Then("user clicks on send")
    public void user_clicks_on_send() {
        outlookPOM.clickSendButton();
    }

    @After
    public static void TearDown() {
        if (OutlookSession != null) {
            OutlookSession.quit();
        }
        OutlookSession = null;
    }

}
