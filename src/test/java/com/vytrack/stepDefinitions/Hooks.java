package com.vytrack.stepDefinitions;

import com.vytrack.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public void setup() {
        System.out.println("::: Starting Automation :::");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Before("@db")
    public void db() {
        System.out.println("::: Connecting to the Database :::");
    }

    @After("db")
    public void dbTearDown() {
        System.out.println("::: Disconnecting to the Database :::");


    }

    @After
    public void tearDown() {
        Driver.closeDriver();
        System.out.println("::: End Of The Test Execution :::");


    }
}
