package com.vytrack.pages;

import com.vytrack.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateCarPage extends BasePage {

    @FindBy(css = "#container > div.container-fluid.page-title > div > div > div.pull-right.title-buttons-container > a")
    private WebElement createCarButton;

    @FindBy(name = "custom_entity_type[LicensePlate]")
    private WebElement licencePlateInputBox;

    @FindBy(name = "custom_entity_type[ModelYear]")
    private WebElement modelYearInputBox;


    public void clickOnCreateCar() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(createCarButton)).click();

        System.out.println("Clicking on Create Car Button");
    }


    public void enterLicencePlate(String licencePlate) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(licencePlateInputBox));

        licencePlateInputBox.clear();
        licencePlateInputBox.sendKeys(licencePlate);


    }
}
