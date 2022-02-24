package com.vytrack.stepDefinitions;

import com.vytrack.pages.LoginPage;
import io.cucumber.java.en.Given;

public class CommonStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("users navigates to {string} and {string}")
    public void users_navigates_to_and(String string, String string2) {

        loginPage.navigateTo(string, string2);

    }
}
