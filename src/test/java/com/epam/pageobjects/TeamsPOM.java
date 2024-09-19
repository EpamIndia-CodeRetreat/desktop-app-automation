package com.epam.pageobjects;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.By;

public class TeamsPOM {

    private WindowsDriver driver;

    private By teamsButton = By.name("Teams");
    private By createAndJoinButton = By.name("Create and join teams and channels");
    private By createTeamButton = By.name("Create team");
    private By teamNameField = By.name("Team name");
    private By descriptionField = By.name("Description");
    private By privateOption = By.name("Private");
    private By permissionToJoinOption = By.name("Private People need permission to join");
    private By channelNameField = By.name("Name your channel");
    private By createButton = By.name("Create");

    public TeamsPOM(WindowsDriver driver) {
        this.driver = driver;
    }

    public void clickTeamsButton() {
        driver.findElement(teamsButton).click();
    }

    public void clickCreateAndJoinButton() {
        driver.findElement(createAndJoinButton).click();
    }

    public void clickCreateTeamButton() {
        driver.findElement(createTeamButton).click();
    }

    public void enterTeamName(String teamName) {
        driver.findElement(teamNameField).click();
        driver.findElement(teamNameField).sendKeys(teamName);
    }

    public void enterDescription(String description) {
        driver.findElement(descriptionField).click();
        driver.findElement(descriptionField).sendKeys(description);
    }

    public void selectPrivateOption() {
        driver.findElement(privateOption).click();
        driver.findElement(permissionToJoinOption).click();
    }

    public void enterChannelName(String channelName) {
        driver.findElement(channelNameField).click();
        driver.findElement(channelNameField).sendKeys(channelName);
    }

    public void clickCreateButton() {
        driver.findElement(createButton).click();
    }
}
