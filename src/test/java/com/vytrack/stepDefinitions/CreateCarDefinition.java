package com.vytrack.stepDefinitions;

import com.vytrack.pages.CreateCarPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.Map;

public class CreateCarDefinition {

    CreateCarPage createCarPage = new CreateCarPage();

    @Given("users click on crat car button")
    public void users_click_on_crat_car_button() {
        createCarPage.clickOnCreateCar();


        /*
         * When users add new vehicle infomation
         *
         *       | Licence Plate | SDET |
         *       | Model Year    | 2021 |
         *
         */

    }

    @When("users add new vehicle infomation")
    public void users_add_new_vehicle_infomation(Map<String, String> dataTable) {

    }
}
