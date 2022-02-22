package com.vytrack.stepDefinitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utils.ConfigurationReader;
import com.vytrack.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }

    @When("users logs in")
    public void users_logs_in() throws InterruptedException {
        loginPage.login();

        Thread.sleep(5000);

    }

    @Then("user should see dash board page")
    public void user_should_see_dash_board_page() {

        String expectedWebSiteTitle = "Dashboard";
        String actualWebSiteTitle = loginPage.getPageSubtitleText();

        System.out.println(actualWebSiteTitle);

        Assert.assertEquals("Title is not correct", expectedWebSiteTitle, actualWebSiteTitle);


        Driver.closeDriver();

    }

    @When("users log in as {string}")
    public void users_log_in_as(String string) {

        loginPage.login(string);
    }
}
