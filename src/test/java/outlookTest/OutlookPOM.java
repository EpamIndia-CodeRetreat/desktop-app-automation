package outlookTest;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.By;

public class OutlookPOM {

    private WindowsDriver driver;

    private By newMailButton = By.name("New mail");
    private By toField = By.name("To");
    private By subjectField = By.name("Add a subject");
    private By messageBodyField = By.name("Message body, press Alt+F10 to exit");
    private By sendButton = By.name("Send");

    public OutlookPOM(WindowsDriver driver) {
        this.driver = driver;
    }

    public void clickNewMailButton() {
        driver.findElement(newMailButton).click();
    }

    public void enterRecipient(String recipient) {
        driver.findElement(toField).sendKeys(recipient);
    }

    public void enterSubject(String subject) {
        driver.findElement(subjectField).sendKeys(subject);
    }

    public void enterMessageBody(String message) {
        driver.findElement(messageBodyField).sendKeys(message);
    }

    public void clickSendButton() {
        driver.findElement(sendButton).click();
    }
}
