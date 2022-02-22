package com.vytrack.pages;

import com.vytrack.utils.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "prependedInput")
    private WebElement usernameElement;

    @FindBy(id = "prependedInput2")
    private WebElement passwordElement;


    public void login(String usernameValue, String passwordValue) {
        usernameElement.sendKeys(usernameValue);
        passwordElement.sendKeys(passwordValue + Keys.ENTER);

    }

    public void login() {
        String username = ConfigurationReader.getProperty("storeManagerUsername");
        String password = ConfigurationReader.getProperty("password");

        usernameElement.sendKeys(username);
        passwordElement.sendKeys(password + Keys.ENTER);


    }

    public void login(String role) {
        String usernameValue = "";
        String passwordValue = ConfigurationReader.getProperty("password");

        if (role.equalsIgnoreCase("sales manager")) {
            usernameValue = ConfigurationReader.getProperty("salesManagerUsername");
        } else if (role.equalsIgnoreCase("driver")) {
            usernameValue = ConfigurationReader.getProperty("driverUsername");
        } else {
            usernameValue = ConfigurationReader.getProperty("storeManagerUsername");
        }
        usernameElement.sendKeys(usernameValue);
        passwordElement.sendKeys(passwordValue + Keys.ENTER);

    }
}
