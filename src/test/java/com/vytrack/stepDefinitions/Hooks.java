package com.vytrack.stepDefinitions;

import com.vytrack.utils.Driver;
import io.cucumber.java.After;

public class Hooks {

    @After
    public void tearDown() {
        Driver.closeDriver();
        System.out.println("::: End Of The Test Execution :::");


    }
}
